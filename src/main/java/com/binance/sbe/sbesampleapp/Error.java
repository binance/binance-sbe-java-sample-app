package com.binance.sbe.sbesampleapp;

import spot_sbe.ErrorResponseDecoder;

import java.util.Optional;

public class Error {
    public short code;
    public Optional<Long> serverTime;
    public Optional<Long> retryAfter;
    public String msg;

    public Error(short code, long serverTime, long retryAfter, String msg) {
        this.code = code;
        this.serverTime = serverTime == ErrorResponseDecoder.serverTimeNullValue() ? Optional.empty() : Optional.of(serverTime);
        this.retryAfter = retryAfter == ErrorResponseDecoder.retryAfterNullValue() ? Optional.empty() : Optional.of(retryAfter);
        this.msg = msg;
    }
}
