/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

@SuppressWarnings("all")
public enum ExpiryReason
{
    Rejected((short)1),

    ExchangeCanceled((short)2),

    OcoTrigger((short)3),

    OtoPhaseOneExpired((short)4),

    UnfilledIocQuantityExpired((short)5),

    UnfilledFokOrderExpired((short)6),

    InsufficientLiquidity((short)7),

    ExecutionRulePriceRangeExceeded((short)8),

    NonRepresentable((short)254),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    ExpiryReason(final short value)
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
    public static ExpiryReason get(final short value)
    {
        switch (value)
        {
            case 1: return Rejected;
            case 2: return ExchangeCanceled;
            case 3: return OcoTrigger;
            case 4: return OtoPhaseOneExpired;
            case 5: return UnfilledIocQuantityExpired;
            case 6: return UnfilledFokOrderExpired;
            case 7: return InsufficientLiquidity;
            case 8: return ExecutionRulePriceRangeExceeded;
            case 254: return NonRepresentable;
            case 255: return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
