package com.binance.sbe.sbesampleapp;

import spot_sbe.RateLimitInterval;
import spot_sbe.RateLimitType;

import java.util.ArrayList;
import java.util.Optional;

public class WebSocketResponse {

    public static class RateLimit {
        public final RateLimitType rateLimitType;
        public final RateLimitInterval interval;
        public final short intervalNum;
        public final long limitValue;
        public final long count;

        public RateLimit(
                RateLimitType rateLimitType, RateLimitInterval interval, short intervalNum, long limitValue, long count) {
            this.rateLimitType = rateLimitType;
            this.interval = interval;
            this.intervalNum = intervalNum;
            this.limitValue = limitValue;
            this.count = count;
        }
    }

    public final int status;
    public final ArrayList<RateLimit> rateLimits;
    public final String id;
    public Optional<Object> result;

    public WebSocketResponse(int status, ArrayList<RateLimit> rateLimits, String id) {
        this.status = status;
        this.rateLimits = rateLimits;
        this.id = id;
        this.result = Optional.empty();
    }
}
