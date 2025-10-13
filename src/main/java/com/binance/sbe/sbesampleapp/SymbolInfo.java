package com.binance.sbe.sbesampleapp;

import static com.binance.sbe.sbesampleapp.Util.asBool;

import java.util.ArrayList;

import spot_sbe.*;

public class SymbolInfo {
    public final SymbolStatus status;
    public final short baseAssetPrecision;
    public final short quoteAssetPrecision;
    public final short baseCommissionPrecision;
    public final short quoteCommissionPrecision;
    public final ArrayList<OrderType> orderTypes = new ArrayList<>();

    public final boolean icebergAllowed;
    public final boolean ocoAllowed;
    public final boolean otoAllowed;
    public final boolean quoteOrderQtyMarketAllowed;
    public final boolean allowTrailingStop;
    public final boolean cancelReplaceAllowed;
    public final boolean amendAllowed;
    public final boolean pegInstructionsAllowed;
    public final boolean spotTradingAllowed;
    public final boolean marginTradingAllowed;

    public final SelfTradePreventionMode selfTradePreventionMode;

    public final ArrayList<SelfTradePreventionMode> allowedSelfTradePreventionModes =
            new ArrayList<>();

    public final ArrayList<Object> filters = new ArrayList<>();
    public final ArrayList<ArrayList<String>> permissionSets = new ArrayList<>();
    public String symbol = "";
    public String baseAsset = "";
    public String quoteAsset = "";

    public SymbolInfo(
            SymbolStatus status,
            short baseAssetPrecision,
            short quoteAssetPrecision,
            short baseCommissionPrecision,
            short quoteCommissionPrecision,
            OrderTypesDecoder orderTypesDecoder,
            BoolEnum icebergAllowed,
            BoolEnum ocoAllowed,
            BoolEnum otoAllowed,
            BoolEnum quoteOrderQtyMarketAllowed,
            BoolEnum allowTrailingStop,
            BoolEnum cancelReplaceAllowed,
            BoolEnum amendAllowed,
            BoolEnum spotTradingAllowed,
            BoolEnum marginTradingAllowed,
            SelfTradePreventionMode selfTradePreventionMode,
            AllowedSelfTradePreventionModesDecoder allowedSelfTradePreventionModesDecoder,
            BoolEnum pegInstructionsAllowed) {
        this.status = status;
        this.baseAssetPrecision = baseAssetPrecision;
        this.quoteAssetPrecision = quoteAssetPrecision;
        this.baseCommissionPrecision = baseCommissionPrecision;
        this.quoteCommissionPrecision = quoteCommissionPrecision;
        this.orderTypes.ensureCapacity(8);
        if (orderTypesDecoder.limit()) {
            this.orderTypes.add(OrderType.Limit);
        }
        if (orderTypesDecoder.limitMaker()) {
            this.orderTypes.add(OrderType.LimitMaker);
        }
        if (orderTypesDecoder.market()) {
            this.orderTypes.add(OrderType.Market);
        }
        if (orderTypesDecoder.stopLoss()) {
            this.orderTypes.add(OrderType.StopLoss);
        }
        if (orderTypesDecoder.stopLossLimit()) {
            this.orderTypes.add(OrderType.StopLossLimit);
        }
        if (orderTypesDecoder.takeProfit()) {
            this.orderTypes.add(OrderType.TakeProfit);
        }
        if (orderTypesDecoder.takeProfitLimit()) {
            this.orderTypes.add(OrderType.TakeProfitLimit);
        }
        this.icebergAllowed = asBool(icebergAllowed);
        this.ocoAllowed = asBool(ocoAllowed);
        this.otoAllowed = asBool(otoAllowed);
        this.quoteOrderQtyMarketAllowed = asBool(quoteOrderQtyMarketAllowed);
        this.allowTrailingStop = asBool(allowTrailingStop);
        this.cancelReplaceAllowed = asBool(cancelReplaceAllowed);
        this.amendAllowed = asBool(amendAllowed);
        this.spotTradingAllowed = asBool(spotTradingAllowed);
        this.marginTradingAllowed = asBool(marginTradingAllowed);
        this.selfTradePreventionMode = selfTradePreventionMode;
        this.allowedSelfTradePreventionModes.ensureCapacity(4);
        if (allowedSelfTradePreventionModesDecoder.none()) {
            this.allowedSelfTradePreventionModes.add(SelfTradePreventionMode.None);
        }
        if (allowedSelfTradePreventionModesDecoder.expireTaker()) {
            this.allowedSelfTradePreventionModes.add(SelfTradePreventionMode.ExpireTaker);
        }
        if (allowedSelfTradePreventionModesDecoder.expireMaker()) {
            this.allowedSelfTradePreventionModes.add(SelfTradePreventionMode.ExpireMaker);
        }
        if (allowedSelfTradePreventionModesDecoder.expireBoth()) {
            this.allowedSelfTradePreventionModes.add(SelfTradePreventionMode.ExpireBoth);
        }
        if (allowedSelfTradePreventionModesDecoder.decrement()) {
            this.allowedSelfTradePreventionModes.add(SelfTradePreventionMode.Decrement);
        }
        if (allowedSelfTradePreventionModesDecoder.nonRepresentable()) {
            this.allowedSelfTradePreventionModes.add(SelfTradePreventionMode.NonRepresentable);
        }
        this.pegInstructionsAllowed = asBool(pegInstructionsAllowed);
    }
}
