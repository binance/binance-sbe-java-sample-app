package com.binance.sbe.sbesampleapp;

public class Decimal {
    public final long mantissa;
    public final byte exponent;

    public Decimal(long mantissa, byte exponent) {
        this.mantissa = mantissa;
        this.exponent = exponent;
    }
}
