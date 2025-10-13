/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

@SuppressWarnings("all")
public enum ExecutionType
{
    New((short)0),

    Canceled((short)1),

    Replaced((short)2),

    Rejected((short)3),

    Trade((short)4),

    Expired((short)5),

    TradePrevention((short)8),

    Unknown((short)253),

    NonRepresentable((short)254),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    ExecutionType(final short value)
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
    public static ExecutionType get(final short value)
    {
        switch (value)
        {
            case 0: return New;
            case 1: return Canceled;
            case 2: return Replaced;
            case 3: return Rejected;
            case 4: return Trade;
            case 5: return Expired;
            case 8: return TradePrevention;
            case 253: return Unknown;
            case 254: return NonRepresentable;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
