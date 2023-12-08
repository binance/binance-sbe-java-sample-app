package com.binance.sbe.sbesampleapp;

import spot_sbe.RateLimitInterval;
import spot_sbe.RateLimitType;

public class RateLimit {
    public final RateLimitType rateLimitType;
    public final RateLimitInterval interval;
    public final short intervalNum;
    public final long limitValue;

    public RateLimit(
            RateLimitType rateLimitType, RateLimitInterval interval, short intervalNum, long limitValue) {
        this.rateLimitType = rateLimitType;
        this.interval = interval;
        this.intervalNum = intervalNum;
        this.limitValue = limitValue;
    }
}
