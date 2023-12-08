package com.binance.sbe.sbesampleapp;

import spot_sbe.BoolEnum;

public class Util {
    public static boolean asBool(BoolEnum value) {
        switch (value) {
            case True:
                return true;
            case False:
                return false;
            case NULL_VAL: {
                System.err.println("Unexpectedly got `NULL_VAL` for BoolEnum");
                System.exit(1);
            }
        }
        return false;
    }
}
