/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

@SuppressWarnings("all")
public enum FilterType
{
    MaxPosition((short)0),

    PriceFilter((short)1),

    TPlusSell((short)2),

    LotSize((short)3),

    MaxNumOrders((short)4),

    MinNotional((short)5),

    MaxNumAlgoOrders((short)6),

    ExchangeMaxNumOrders((short)7),

    ExchangeMaxNumAlgoOrders((short)8),

    IcebergParts((short)9),

    MarketLotSize((short)10),

    PercentPrice((short)11),

    MaxNumIcebergOrders((short)12),

    ExchangeMaxNumIcebergOrders((short)13),

    TrailingDelta((short)14),

    PercentPriceBySide((short)15),

    Notional((short)16),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    FilterType(final short value)
    {
        this.value = value;
    }

    /**
     * The raw encoded value in the Java type representation.
     *
     * @return the raw value encoded.
     */
    public short value()
    {
        return value;
    }

    /**
     * Lookup the enum value representing the value.
     *
     * @param value encoded to be looked up.
     * @return the enum value representing the value.
     */
    public static FilterType get(final short value)
    {
        switch (value)
        {
            case 0: return MaxPosition;
            case 1: return PriceFilter;
            case 2: return TPlusSell;
            case 3: return LotSize;
            case 4: return MaxNumOrders;
            case 5: return MinNotional;
            case 6: return MaxNumAlgoOrders;
            case 7: return ExchangeMaxNumOrders;
            case 8: return ExchangeMaxNumAlgoOrders;
            case 9: return IcebergParts;
            case 10: return MarketLotSize;
            case 11: return PercentPrice;
            case 12: return MaxNumIcebergOrders;
            case 13: return ExchangeMaxNumIcebergOrders;
            case 14: return TrailingDelta;
            case 15: return PercentPriceBySide;
            case 16: return Notional;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
