package com.binance.sbe.sbesampleapp;

import static spot_sbe.ExchangeInfoResponseDecoder.*;

import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import spot_sbe.*;
import org.agrona.concurrent.UnsafeBuffer;
import org.apache.commons.io.IOUtils;

public class App {
    private static void printResult(Object result, Optional<WebSocketResponse> webSocketResponse) throws IOException {
        Object output = result;
        if (webSocketResponse.isPresent()) {
            webSocketResponse.get().result = Optional.of(result);
            output = webSocketResponse.get();
        }
        System.out.println(serializeYaml(output));
    }

    private static String serializeYaml(Object object) throws IOException {
        StringWriter writer = new StringWriter();
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER));
        objectMapper.findAndRegisterModules();
        objectMapper.writeValue(writer, object);
        return writer.toString();
    }

    private static byte[] makeHttpRequest(URL url) throws IOException {
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.addRequestProperty("Accept", "application/sbe");
        conn.addRequestProperty("X-MBX-SBE", SCHEMA_ID + ":" + SCHEMA_VERSION);
        return IOUtils.toByteArray(conn.getInputStream());
    }

    private static void decodeExchangeFilter(
            MessageHeaderDecoder headerDecoder,
            UnsafeBuffer tempBuffer,
            ArrayList<Object> exchangeFilters) {
        switch (headerDecoder.templateId()) {
            case ExchangeMaxNumOrdersFilterDecoder.TEMPLATE_ID: {
                ExchangeMaxNumOrdersFilterDecoder dec = new ExchangeMaxNumOrdersFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                exchangeFilters.add(new ExchangeInfo.ExchangeFilter<>(dec.filterType(), dec.maxNumOrders()));
                break;
            }
            case ExchangeMaxNumAlgoOrdersFilterDecoder.TEMPLATE_ID: {
                ExchangeMaxNumAlgoOrdersFilterDecoder dec = new ExchangeMaxNumAlgoOrdersFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                exchangeFilters.add(new ExchangeInfo.ExchangeFilter<>(dec.filterType(), dec.maxNumAlgoOrders()));
                break;
            }
            case ExchangeMaxNumIcebergOrdersFilterDecoder.TEMPLATE_ID: {
                ExchangeMaxNumIcebergOrdersFilterDecoder dec =
                        new ExchangeMaxNumIcebergOrdersFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                exchangeFilters.add(new ExchangeInfo.ExchangeFilter<>(dec.filterType(), dec.maxNumIcebergOrders()));
                break;
            }
            default: {
                System.err.printf("Unexpected template ID: %d", headerDecoder.templateId());
                System.exit(1);
            }
        }
    }

    private static void decodeSymbolFilter(
            MessageHeaderDecoder headerDecoder,
            UnsafeBuffer tempBuffer,
            ArrayList<Object> filters) {
        switch (headerDecoder.templateId()) {
            case PriceFilterDecoder.TEMPLATE_ID: {
                PriceFilterDecoder dec = new PriceFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                filters.add(
                        new SymbolFilters.PriceFilter(
                                dec.filterType(),
                                dec.priceExponent(),
                                dec.minPrice(),
                                dec.maxPrice(),
                                dec.tickSize()));
                break;
            }
            case PercentPriceFilterDecoder.TEMPLATE_ID: {
                PercentPriceFilterDecoder dec = new PercentPriceFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                filters.add(
                        new SymbolFilters.PercentPriceFilter(
                                dec.filterType(),
                                dec.multiplierExponent(),
                                dec.multiplierUp(),
                                dec.multiplierDown(),
                                dec.avgPriceMins()));
                break;
            }
            case PercentPriceBySideFilterDecoder.TEMPLATE_ID: {
                PercentPriceBySideFilterDecoder dec = new PercentPriceBySideFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                filters.add(
                        new SymbolFilters.PercentPriceBySideFilter(
                                dec.filterType(),
                                dec.multiplierExponent(),
                                dec.bidMultiplierUp(),
                                dec.bidMultiplierDown(),
                                dec.askMultiplierUp(),
                                dec.askMultiplierDown(),
                                dec.avgPriceMins()));
                break;
            }
            case LotSizeFilterDecoder.TEMPLATE_ID: {
                LotSizeFilterDecoder dec = new LotSizeFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                filters.add(
                        new SymbolFilters.LotSizeFilter(
                                dec.filterType(), dec.qtyExponent(), dec.minQty(), dec.maxQty(), dec.stepSize()));
                break;
            }
            case MinNotionalFilterDecoder.TEMPLATE_ID: {
                MinNotionalFilterDecoder dec = new MinNotionalFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                filters.add(
                        new SymbolFilters.MinNotionalFilter(
                                dec.filterType(),
                                dec.priceExponent(),
                                dec.minNotional(),
                                dec.applyToMarket(),
                                dec.avgPriceMins()));
                break;
            }
            case NotionalFilterDecoder.TEMPLATE_ID: {
                NotionalFilterDecoder dec = new NotionalFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                filters.add(
                        new SymbolFilters.NotionalFilter(
                                dec.filterType(),
                                dec.priceExponent(),
                                dec.minNotional(),
                                dec.applyMinToMarket(),
                                dec.maxNotional(),
                                dec.applyMaxToMarket(),
                                dec.avgPriceMins()));
                break;
            }
            case IcebergPartsFilterDecoder.TEMPLATE_ID: {
                IcebergPartsFilterDecoder dec = new IcebergPartsFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                filters.add(new SymbolFilters.IcebergPartsFilter(dec.filterType(), dec.filterLimit()));
                break;
            }
            case MarketLotSizeFilterDecoder.TEMPLATE_ID: {
                MarketLotSizeFilterDecoder dec = new MarketLotSizeFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                filters.add(
                        new SymbolFilters.MarketLotSizeFilter(
                                dec.filterType(), dec.qtyExponent(), dec.minQty(), dec.maxQty(), dec.stepSize()));
                break;
            }
            case MaxNumOrdersFilterDecoder.TEMPLATE_ID: {
                MaxNumOrdersFilterDecoder dec = new MaxNumOrdersFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                filters.add(new SymbolFilters.MaxNumOrdersFilter(dec.filterType(), dec.maxNumOrders()));
                break;
            }
            case MaxNumAlgoOrdersFilterDecoder.TEMPLATE_ID: {
                MaxNumAlgoOrdersFilterDecoder dec = new MaxNumAlgoOrdersFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                filters.add(
                        new SymbolFilters.MaxNumAlgoOrdersFilter(dec.filterType(), dec.maxNumAlgoOrders()));
                break;
            }
            case MaxNumIcebergOrdersFilterDecoder.TEMPLATE_ID: {
                MaxNumIcebergOrdersFilterDecoder dec = new MaxNumIcebergOrdersFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                filters.add(
                        new SymbolFilters.MaxNumIcebergOrdersFilter(
                                dec.filterType(), dec.maxNumIcebergOrders()));
                break;
            }
            case MaxPositionFilterDecoder.TEMPLATE_ID: {
                MaxPositionFilterDecoder dec = new MaxPositionFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                filters.add(
                        new SymbolFilters.MaxPositionFilter(
                                dec.filterType(), dec.qtyExponent(), dec.maxPosition()));
                break;
            }
            case TrailingDeltaFilterDecoder.TEMPLATE_ID: {
                TrailingDeltaFilterDecoder dec = new TrailingDeltaFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                filters.add(
                        new SymbolFilters.TrailingDeltaFilter(
                                dec.filterType(),
                                dec.minTrailingAboveDelta(),
                                dec.maxTrailingAboveDelta(),
                                dec.minTrailingBelowDelta(),
                                dec.maxTrailingBelowDelta()));
                break;
            }
            case TPlusSellFilterDecoder.TEMPLATE_ID: {
                TPlusSellFilterDecoder dec = new TPlusSellFilterDecoder();
                dec.wrapAndApplyHeader(tempBuffer, 0, headerDecoder);
                filters.add(new SymbolFilters.TPlusSellFilter(dec.filterType(), dec.endTime()));
                break;
            }
            default: {
                System.err.printf("Unexpected template ID: %d", headerDecoder.templateId());
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println(
                    "Expected '-' for stdin or exchangeInfo URL, e.g."
                            + " https://api.binance.com/api/v3/exchangeInfo");
            System.exit(1);
        }
        byte[] content;
        if (args[0].equals("-")) {
            content = IOUtils.toByteArray(System.in);
        } else {
            URL url = new URL(args[0]);
            content = App.makeHttpRequest(url);
        }
        UnsafeBuffer buffer = new UnsafeBuffer(content);
        MessageHeaderDecoder headerDecoder = new MessageHeaderDecoder();
        headerDecoder.wrap(buffer, 0);

        Optional<WebSocketResponse> webSocketResponse = Optional.empty();
        if (headerDecoder.templateId() == WebSocketResponseDecoder.TEMPLATE_ID) {
            int schemaId = headerDecoder.schemaId();
            if (schemaId != WebSocketResponseDecoder.SCHEMA_ID) {
                System.err.printf("Unexpected schema ID %d\n", schemaId);
                System.exit(1);
            }
            WebSocketResponseDecoder decoder = new WebSocketResponseDecoder();
            decoder.wrapAndApplyHeader(buffer, 0, headerDecoder);
            if (decoder.sbeSchemaIdVersionDeprecated() == BoolEnum.True) {
                System.out.println("Warning: sbe-sample-app is using a deprecated schema");
            }
            int status = decoder.status();
            ArrayList<WebSocketResponse.RateLimit> rateLimits = new ArrayList<>();
            WebSocketResponseDecoder.RateLimitsDecoder rateLimitsDecoder = decoder.rateLimits();
            rateLimits.ensureCapacity(rateLimitsDecoder.count());
            for (WebSocketResponseDecoder.RateLimitsDecoder dec : rateLimitsDecoder) {
                rateLimits.add(new WebSocketResponse.RateLimit(
                        dec.rateLimitType(), dec.interval(), dec.intervalNum(), dec.rateLimit(), dec.current()));
            }
            String id = decoder.id();
            buffer = new UnsafeBuffer();
            decoder.wrapResult(buffer);
            headerDecoder = new MessageHeaderDecoder();
            headerDecoder.wrap(buffer, 0);
            webSocketResponse = Optional.of(new WebSocketResponse(status, rateLimits, id));
        }

        if (headerDecoder.templateId() == ErrorResponseDecoder.TEMPLATE_ID) {
            // A separate "ErrorResponse" message is returned for errors and its format is expected to be backwards
            // compatible across all schema IDs.
            ErrorResponseDecoder decoder = new ErrorResponseDecoder();
            decoder.wrapAndApplyHeader(buffer, 0, headerDecoder);
            Error error = new Error(decoder.code(), decoder.serverTime(), decoder.retryAfter(), decoder.msg());
            decoder.skipData();
            printResult(error, webSocketResponse);
            return;
        }
        if (!webSocketResponse.isPresent()) {
            int schemaId = headerDecoder.schemaId();
            if (schemaId != ExchangeInfoResponseDecoder.SCHEMA_ID) {
                System.err.printf("Unexpected schema ID %d\n", schemaId);
                System.exit(1);
            }
            int version = headerDecoder.version();
            if (version != ExchangeInfoResponseDecoder.SCHEMA_VERSION) {
                System.out.printf("Warning: Unexpected version %d\n", version);
                // Schemas with the same ID are expected to be backwards compatible.
            }
        }
        ExchangeInfoResponseDecoder decoder = new ExchangeInfoResponseDecoder();
        // Note that the following checks the template ID.
        decoder.wrapAndApplyHeader(buffer, 0, headerDecoder);

        ArrayList<RateLimit> rateLimits = new ArrayList<>();
        RateLimitsDecoder rateLimitsDecoder = decoder.rateLimits();
        rateLimits.ensureCapacity(rateLimitsDecoder.count());
        for (RateLimitsDecoder dec : rateLimitsDecoder) {
            rateLimits.add(new RateLimit(dec.rateLimitType(), dec.interval(), dec.intervalNum(), dec.rateLimit()));
        }
        ArrayList<Object> exchangeFilters = new ArrayList<>();
        ExchangeFiltersDecoder exchangeFiltersDecoder = decoder.exchangeFilters();
        exchangeFilters.ensureCapacity(exchangeFiltersDecoder.count());
        for (ExchangeFiltersDecoder filterDecoder : exchangeFiltersDecoder) {
            UnsafeBuffer tempBuffer = new UnsafeBuffer();
            filterDecoder.wrapFilter(tempBuffer);
            headerDecoder.wrap(tempBuffer, 0);
            decodeExchangeFilter(headerDecoder, tempBuffer, exchangeFilters);
        }

        ArrayList<SymbolInfo> symbolsInfo = new ArrayList<>();
        SymbolsDecoder symbolsDecoder = decoder.symbols();
        symbolsInfo.ensureCapacity(symbolsDecoder.count());
        for (SymbolsDecoder dec : symbolsDecoder) {
            SymbolInfo symbolInfo =
                    new SymbolInfo(
                            dec.status(),
                            dec.baseAssetPrecision(),
                            dec.quoteAssetPrecision(),
                            dec.baseCommissionPrecision(),
                            dec.quoteCommissionPrecision(),
                            dec.orderTypes(),
                            dec.icebergAllowed(),
                            dec.ocoAllowed(),
                            dec.quoteOrderQtyMarketAllowed(),
                            dec.allowTrailingStop(),
                            dec.cancelReplaceAllowed(),
                            dec.isSpotTradingAllowed(),
                            dec.isMarginTradingAllowed(),
                            dec.defaultSelfTradePreventionMode(),
                            dec.allowedSelfTradePreventionModes());
            SymbolsDecoder.FiltersDecoder filtersDecoder = symbolsDecoder.filters();
            symbolInfo.filters.ensureCapacity(filtersDecoder.count());
            for (SymbolsDecoder.FiltersDecoder filterDec : filtersDecoder) {
                UnsafeBuffer tempBuffer = new UnsafeBuffer();
                filterDec.wrapFilter(tempBuffer);
                headerDecoder.wrap(tempBuffer, 0);
                decodeSymbolFilter(headerDecoder, tempBuffer, symbolInfo.filters);
            }
            symbolsInfo.add(symbolInfo);

            SymbolsDecoder.PermissionsDecoder permissionsDecoder = symbolsDecoder.permissions();
            symbolInfo.permissions.ensureCapacity(permissionsDecoder.count());
            for (SymbolsDecoder.PermissionsDecoder permissionDec : permissionsDecoder) {
                symbolInfo.permissions.add(permissionDec.permission());
            }
            symbolInfo.symbol = symbolsDecoder.symbol();
            symbolInfo.baseAsset = symbolsDecoder.baseAsset();
            symbolInfo.quoteAsset = symbolsDecoder.quoteAsset();
        }

        ArrayList<ExchangeInfo.Sor> sors = new ArrayList<>();
        SorsDecoder sorsDecoder = decoder.sors();
        sors.ensureCapacity(sorsDecoder.count());
        for (SorsDecoder dec : sorsDecoder) {
            ArrayList<String> symbols = new ArrayList<>();
            SorsDecoder.SorSymbolsDecoder sorSymbolsDecoder = dec.sorSymbols();
            symbols.ensureCapacity(sorSymbolsDecoder.count());
            for (SorsDecoder.SorSymbolsDecoder symbolDec : sorSymbolsDecoder) {
                symbols.add(symbolDec.symbol());
            }
            sors.add(new ExchangeInfo.Sor(symbols, sorsDecoder.baseAsset()));
        }
        ExchangeInfo exchangeInfo = new ExchangeInfo(rateLimits, exchangeFilters, symbolsInfo, sors);
        printResult(exchangeInfo, webSocketResponse);
    }
}
