/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

@SuppressWarnings("all")
public enum SymbolStatus
{
    PreTrading((short)0),

    Trading((short)1),

    PostTrading((short)2),

    EndOfDay((short)3),

    Halt((short)4),

    AuctionMatch((short)5),

    Break((short)7),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    SymbolStatus(final short value)
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
    public static SymbolStatus get(final short value)
    {
        switch (value)
        {
            case 0: return PreTrading;
            case 1: return Trading;
            case 2: return PostTrading;
            case 3: return EndOfDay;
            case 4: return Halt;
            case 5: return AuctionMatch;
            case 7: return Break;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
