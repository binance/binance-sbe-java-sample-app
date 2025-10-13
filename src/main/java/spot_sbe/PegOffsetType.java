/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

@SuppressWarnings("all")
public enum PegOffsetType
{
    PriceLevel((short)1),

    NonRepresentable((short)254),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    PegOffsetType(final short value)
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
    public static PegOffsetType get(final short value)
    {
        switch (value)
        {
            case 1: return PriceLevel;
            case 254: return NonRepresentable;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
