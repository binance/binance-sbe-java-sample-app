package com.binance.sbe.sbesampleapp;

import spot_sbe.FilterType;

import java.util.ArrayList;

public class ExchangeInfo {
    public final ArrayList<RateLimit> rateLimits;
    public final ArrayList<Object> exchangeFilters;
    public final ArrayList<SymbolInfo> symbols;
    public final ArrayList<Sor> sors;

    public static class ExchangeFilter<T> {
        public final FilterType filterType;
        public final T filterValue;

        public ExchangeFilter(FilterType filterType, T filterValue) {
            this.filterType = filterType;
            this.filterValue = filterValue;
        }
    }

    public static class Sor {
        public final ArrayList<String> symbols;
        public final String baseAsset;

        public Sor(ArrayList<String> symbols, String baseAsset) {
            this.symbols = symbols;
            this.baseAsset = baseAsset;
        }
    }

    public ExchangeInfo(
            ArrayList<RateLimit> rateLimits,
            ArrayList<Object> exchangeFilters,
            ArrayList<SymbolInfo> symbols,
            ArrayList<Sor> sors) {
        this.rateLimits = rateLimits;
        this.exchangeFilters = exchangeFilters;
        this.symbols = symbols;
        this.sors = sors;
    }
}
