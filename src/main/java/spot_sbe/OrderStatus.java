/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

@SuppressWarnings("all")
public enum OrderStatus
{
    New((short)0),

    PartiallyFilled((short)1),

    Filled((short)2),

    Canceled((short)3),

    PendingCancel((short)4),

    Rejected((short)5),

    Expired((short)6),

    ExpiredInMatch((short)9),

    Unknown((short)254),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    OrderStatus(final short value)
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
    public static OrderStatus get(final short value)
    {
        switch (value)
        {
            case 0: return New;
            case 1: return PartiallyFilled;
            case 2: return Filled;
            case 3: return Canceled;
            case 4: return PendingCancel;
            case 5: return Rejected;
            case 6: return Expired;
            case 9: return ExpiredInMatch;
            case 254: return Unknown;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
