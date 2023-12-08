/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

@SuppressWarnings("all")
public enum OrderType
{
    Market((short)0),

    Limit((short)1),

    StopLoss((short)2),

    StopLossLimit((short)3),

    TakeProfit((short)4),

    TakeProfitLimit((short)5),

    LimitMaker((short)6),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    OrderType(final short value)
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
    public static OrderType get(final short value)
    {
        switch (value)
        {
            case 0: return Market;
            case 1: return Limit;
            case 2: return StopLoss;
            case 3: return StopLossLimit;
            case 4: return TakeProfit;
            case 5: return TakeProfitLimit;
            case 6: return LimitMaker;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
