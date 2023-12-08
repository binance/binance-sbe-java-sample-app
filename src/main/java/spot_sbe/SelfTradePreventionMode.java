/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

@SuppressWarnings("all")
public enum SelfTradePreventionMode
{
    None((short)1),

    ExpireTaker((short)2),

    ExpireMaker((short)3),

    ExpireBoth((short)4),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    SelfTradePreventionMode(final short value)
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
    public static SelfTradePreventionMode get(final short value)
    {
        switch (value)
        {
            case 1: return None;
            case 2: return ExpireTaker;
            case 3: return ExpireMaker;
            case 4: return ExpireBoth;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
