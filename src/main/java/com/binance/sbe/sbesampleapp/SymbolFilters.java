package com.binance.sbe.sbesampleapp;

import java.util.Optional;

import static com.binance.sbe.sbesampleapp.Util.asBool;

import spot_sbe.BoolEnum;
import spot_sbe.FilterType;
import spot_sbe.TPlusSellFilterDecoder;

public class SymbolFilters {
    public static class PriceFilter {
        public final FilterType filterType;
        public final Decimal minPrice;
        public final Decimal maxPrice;
        public final Decimal tickSize;

        public PriceFilter(
                FilterType filterType, byte exponent, long minPrice, long maxPrice, long tickSize) {
            this.filterType = filterType;
            this.minPrice = new Decimal(minPrice, exponent);
            this.maxPrice = new Decimal(maxPrice, exponent);
            this.tickSize = new Decimal(tickSize, exponent);
        }
    }

    public static class PercentPriceFilter {
        public final FilterType filterType;
        public final Decimal multiplierUp;
        public final Decimal multiplierDown;
        public final int avgPriceMins;

        PercentPriceFilter(
                FilterType filterType,
                byte exponent,
                long multiplierUp,
                long multiplierDown,
                int avgPriceMins) {
            this.filterType = filterType;
            this.multiplierUp = new Decimal(multiplierUp, exponent);
            this.multiplierDown = new Decimal(multiplierDown, exponent);
            this.avgPriceMins = avgPriceMins;
        }
    }

    public static class PercentPriceBySideFilter {
        public final FilterType filterType;
        public final Decimal bidMultiplierUp;
        public final Decimal bidMultiplierDown;
        public final Decimal askMultiplierUp;
        public final Decimal askMultiplierDown;
        public final int avgPriceMins;

        PercentPriceBySideFilter(
                FilterType filterType,
                byte exponent,
                long bidMultiplierUp,
                long bidMultiplierDown,
                long askMultiplierUp,
                long askMultiplierDown,
                int avgPriceMins) {
            this.filterType = filterType;
            this.bidMultiplierUp = new Decimal(bidMultiplierUp, exponent);
            this.bidMultiplierDown = new Decimal(bidMultiplierDown, exponent);
            this.askMultiplierUp = new Decimal(askMultiplierUp, exponent);
            this.askMultiplierDown = new Decimal(askMultiplierDown, exponent);
            this.avgPriceMins = avgPriceMins;
        }
    }

    public static class LotSizeFilter {
        public final FilterType filterType;
        public final Decimal minQty;
        public final Decimal maxQty;
        public final Decimal stepSize;

        LotSizeFilter(FilterType filterType, byte exponent, long minQty, long maxQty, long stepSize) {
            this.filterType = filterType;
            this.minQty = new Decimal(minQty, exponent);
            this.maxQty = new Decimal(maxQty, exponent);
            this.stepSize = new Decimal(stepSize, exponent);
        }
    }

    public static class MinNotionalFilter {
        public final FilterType filterType;
        public final Decimal minNotional;
        public final boolean applyToMarket;
        public final int avgPriceMins;

        MinNotionalFilter(
                FilterType filterType,
                byte exponent,
                long minNotional,
                BoolEnum applyToMarket,
                int avgPriceMins) {
            this.filterType = filterType;
            this.minNotional = new Decimal(minNotional, exponent);
            this.applyToMarket = asBool(applyToMarket);
            this.avgPriceMins = avgPriceMins;
        }
    }

    public static class NotionalFilter {
        public final FilterType filterType;
        public final Decimal minNotional;
        public final boolean applyMinToMarket;
        public final Decimal maxNotional;
        public final boolean applyMaxToMarket;
        public final int avgPriceMins;

        NotionalFilter(
                FilterType filterType,
                byte exponent,
                long minNotional,
                BoolEnum applyMinToMarket,
                long maxNotional,
                BoolEnum applyMaxToMarket,
                int avgPriceMins) {
            this.filterType = filterType;
            this.minNotional = new Decimal(minNotional, exponent);
            this.applyMinToMarket = asBool(applyMinToMarket);
            this.maxNotional = new Decimal(maxNotional, exponent);
            this.applyMaxToMarket = asBool(applyMaxToMarket);
            this.avgPriceMins = avgPriceMins;
        }
    }

    public static class IcebergPartsFilter {
        public final FilterType filterType;
        public final long filterLimit;

        IcebergPartsFilter(FilterType filterType, long filterLimit) {
            this.filterType = filterType;
            this.filterLimit = filterLimit;
        }
    }

    public static class MarketLotSizeFilter {
        public final FilterType filterType;
        public final Decimal minQty;
        public final Decimal maxQty;
        public final Decimal stepSize;

        MarketLotSizeFilter(
                FilterType filterType, byte exponent, long minQty, long maxQty, long stepSize) {
            this.filterType = filterType;
            this.minQty = new Decimal(minQty, exponent);
            this.maxQty = new Decimal(maxQty, exponent);
            this.stepSize = new Decimal(stepSize, exponent);
        }
    }

    public static class MaxNumOrdersFilter {
        public final FilterType filterType;
        public final long maxNumOrders;

        MaxNumOrdersFilter(FilterType filterType, long maxNumOrders) {
            this.filterType = filterType;
            this.maxNumOrders = maxNumOrders;
        }
    }

    public static class MaxNumAlgoOrdersFilter {
        public final FilterType filterType;
        public final long maxNumAlgoOrders;

        MaxNumAlgoOrdersFilter(FilterType filterType, long maxNumAlgoOrders) {
            this.filterType = filterType;
            this.maxNumAlgoOrders = maxNumAlgoOrders;
        }
    }

    public static class MaxNumIcebergOrdersFilter {
        public final FilterType filterType;
        public final long maxNumIcebergOrders;

        MaxNumIcebergOrdersFilter(FilterType filterType, long maxNumIcebergOrders) {
            this.filterType = filterType;
            this.maxNumIcebergOrders = maxNumIcebergOrders;
        }
    }

    public static class MaxPositionFilter {
        public final FilterType filterType;
        public final Decimal maxPosition;

        MaxPositionFilter(FilterType filterType, byte exponent, long maxPosition) {
            this.filterType = filterType;
            this.maxPosition = new Decimal(maxPosition, exponent);
        }
    }

    public static class TrailingDeltaFilter {
        public final FilterType filterType;
        public final long minTrailingAboveDelta;
        public final long maxTrailingAboveDelta;
        public final long minTrailingBelowDelta;
        public final long maxTrailingBelowDelta;

        TrailingDeltaFilter(
                FilterType filterType,
                long minTrailingAboveDelta,
                long maxTrailingAboveDelta,
                long minTrailingBelowDelta,
                long maxTrailingBelowDelta) {
            this.filterType = filterType;
            this.minTrailingAboveDelta = minTrailingAboveDelta;
            this.maxTrailingAboveDelta = maxTrailingAboveDelta;
            this.minTrailingBelowDelta = minTrailingBelowDelta;
            this.maxTrailingBelowDelta = maxTrailingBelowDelta;
        }
    }

    public static class TPlusSellFilter {
        public final FilterType filterType;
        public final Optional<Long> endTime;

        TPlusSellFilter(FilterType filterType, long endTime) {
            this.filterType = filterType;
            if (endTime == TPlusSellFilterDecoder.endTimeNullValue()) {
                this.endTime = Optional.empty();
            } else {
                this.endTime = Optional.of(endTime);
            }
        }
    }
}
