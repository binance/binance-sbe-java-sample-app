/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

@SuppressWarnings("all")
public enum CancelReplaceStatus
{
    Success((short)0),

    Failure((short)1),

    NotAttempted((short)2),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    CancelReplaceStatus(final short value)
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
    public static CancelReplaceStatus get(final short value)
    {
        switch (value)
        {
            case 0: return Success;
            case 1: return Failure;
            case 2: return NotAttempted;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
