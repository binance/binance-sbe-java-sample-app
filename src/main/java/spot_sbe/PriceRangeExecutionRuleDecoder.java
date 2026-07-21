/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class PriceRangeExecutionRuleDecoder
{
    public static final int BLOCK_LENGTH = 33;
    public static final int TEMPLATE_ID = 22;
    public static final int SCHEMA_ID = 3;
    public static final int SCHEMA_VERSION = 4;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final PriceRangeExecutionRuleDecoder parentMessage = this;
    private DirectBuffer buffer;
    private int offset;
    private int limit;
    int actingBlockLength;
    int actingVersion;

    public int sbeBlockLength()
    {
        return BLOCK_LENGTH;
    }

    public int sbeTemplateId()
    {
        return TEMPLATE_ID;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public String sbeSemanticType()
    {
        return "";
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public PriceRangeExecutionRuleDecoder wrap(
        final DirectBuffer buffer,
        final int offset,
        final int actingBlockLength,
        final int actingVersion)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        this.actingBlockLength = actingBlockLength;
        this.actingVersion = actingVersion;
        limit(offset + actingBlockLength);

        return this;
    }

    public PriceRangeExecutionRuleDecoder wrapAndApplyHeader(
        final DirectBuffer buffer,
        final int offset,
        final MessageHeaderDecoder headerDecoder)
    {
        headerDecoder.wrap(buffer, offset);

        final int templateId = headerDecoder.templateId();
        if (TEMPLATE_ID != templateId)
        {
            throw new IllegalStateException("Invalid TEMPLATE_ID: " + templateId);
        }

        return wrap(
            buffer,
            offset + MessageHeaderDecoder.ENCODED_LENGTH,
            headerDecoder.blockLength(),
            headerDecoder.version());
    }

    public PriceRangeExecutionRuleDecoder sbeRewind()
    {
        return wrap(buffer, offset, actingBlockLength, actingVersion);
    }

    public int sbeDecodedLength()
    {
        final int currentLimit = limit();
        sbeSkip();
        final int decodedLength = encodedLength();
        limit(currentLimit);

        return decodedLength;
    }

    public int actingVersion()
    {
        return actingVersion;
    }

    public int encodedLength()
    {
        return limit - offset;
    }

    public int limit()
    {
        return limit;
    }

    public void limit(final int limit)
    {
        this.limit = limit;
    }

    public static int ruleTypeId()
    {
        return 1;
    }

    public static int ruleTypeSinceVersion()
    {
        return 3;
    }

    public static int ruleTypeEncodingOffset()
    {
        return 0;
    }

    public static int ruleTypeEncodingLength()
    {
        return 1;
    }

    public static String ruleTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "constant";
        }

        return "";
    }

    public short ruleTypeRaw()
    {
        return ExecutionRuleType.PriceRange.value();
    }


    public ExecutionRuleType ruleType()
    {
        return ExecutionRuleType.PriceRange;
    }


    public static int multiplierExponentId()
    {
        return 2;
    }

    public static int multiplierExponentSinceVersion()
    {
        return 0;
    }

    public static int multiplierExponentEncodingOffset()
    {
        return 0;
    }

    public static int multiplierExponentEncodingLength()
    {
        return 1;
    }

    public static String multiplierExponentMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static byte multiplierExponentNullValue()
    {
        return (byte)-128;
    }

    public static byte multiplierExponentMinValue()
    {
        return (byte)-127;
    }

    public static byte multiplierExponentMaxValue()
    {
        return (byte)127;
    }

    public byte multiplierExponent()
    {
        return buffer.getByte(offset + 0);
    }


    public static int bidLimitMultUpId()
    {
        return 3;
    }

    public static int bidLimitMultUpSinceVersion()
    {
        return 0;
    }

    public static int bidLimitMultUpEncodingOffset()
    {
        return 1;
    }

    public static int bidLimitMultUpEncodingLength()
    {
        return 8;
    }

    public static String bidLimitMultUpMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long bidLimitMultUpNullValue()
    {
        return -9223372036854775808L;
    }

    public static long bidLimitMultUpMinValue()
    {
        return -9223372036854775807L;
    }

    public static long bidLimitMultUpMaxValue()
    {
        return 9223372036854775807L;
    }

    public long bidLimitMultUp()
    {
        return buffer.getLong(offset + 1, BYTE_ORDER);
    }


    public static int bidLimitMultDownId()
    {
        return 4;
    }

    public static int bidLimitMultDownSinceVersion()
    {
        return 0;
    }

    public static int bidLimitMultDownEncodingOffset()
    {
        return 9;
    }

    public static int bidLimitMultDownEncodingLength()
    {
        return 8;
    }

    public static String bidLimitMultDownMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long bidLimitMultDownNullValue()
    {
        return -9223372036854775808L;
    }

    public static long bidLimitMultDownMinValue()
    {
        return -9223372036854775807L;
    }

    public static long bidLimitMultDownMaxValue()
    {
        return 9223372036854775807L;
    }

    public long bidLimitMultDown()
    {
        return buffer.getLong(offset + 9, BYTE_ORDER);
    }


    public static int askLimitMultUpId()
    {
        return 5;
    }

    public static int askLimitMultUpSinceVersion()
    {
        return 0;
    }

    public static int askLimitMultUpEncodingOffset()
    {
        return 17;
    }

    public static int askLimitMultUpEncodingLength()
    {
        return 8;
    }

    public static String askLimitMultUpMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long askLimitMultUpNullValue()
    {
        return -9223372036854775808L;
    }

    public static long askLimitMultUpMinValue()
    {
        return -9223372036854775807L;
    }

    public static long askLimitMultUpMaxValue()
    {
        return 9223372036854775807L;
    }

    public long askLimitMultUp()
    {
        return buffer.getLong(offset + 17, BYTE_ORDER);
    }


    public static int askLimitMultDownId()
    {
        return 6;
    }

    public static int askLimitMultDownSinceVersion()
    {
        return 0;
    }

    public static int askLimitMultDownEncodingOffset()
    {
        return 25;
    }

    public static int askLimitMultDownEncodingLength()
    {
        return 8;
    }

    public static String askLimitMultDownMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long askLimitMultDownNullValue()
    {
        return -9223372036854775808L;
    }

    public static long askLimitMultDownMinValue()
    {
        return -9223372036854775807L;
    }

    public static long askLimitMultDownMaxValue()
    {
        return 9223372036854775807L;
    }

    public long askLimitMultDown()
    {
        return buffer.getLong(offset + 25, BYTE_ORDER);
    }


    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final PriceRangeExecutionRuleDecoder decoder = new PriceRangeExecutionRuleDecoder();
        decoder.wrap(buffer, offset, actingBlockLength, actingVersion);

        return decoder.appendTo(new StringBuilder()).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        if (null == buffer)
        {
            return builder;
        }

        final int originalLimit = limit();
        limit(offset + actingBlockLength);
        builder.append("[PriceRangeExecutionRule](sbeTemplateId=");
        builder.append(TEMPLATE_ID);
        builder.append("|sbeSchemaId=");
        builder.append(SCHEMA_ID);
        builder.append("|sbeSchemaVersion=");
        if (parentMessage.actingVersion != SCHEMA_VERSION)
        {
            builder.append(parentMessage.actingVersion);
            builder.append('/');
        }
        builder.append(SCHEMA_VERSION);
        builder.append("|sbeBlockLength=");
        if (actingBlockLength != BLOCK_LENGTH)
        {
            builder.append(actingBlockLength);
            builder.append('/');
        }
        builder.append(BLOCK_LENGTH);
        builder.append("):");
        builder.append("ruleType=");
        builder.append(this.ruleType());
        builder.append('|');
        builder.append("multiplierExponent=");
        builder.append(this.multiplierExponent());
        builder.append('|');
        builder.append("bidLimitMultUp=");
        builder.append(this.bidLimitMultUp());
        builder.append('|');
        builder.append("bidLimitMultDown=");
        builder.append(this.bidLimitMultDown());
        builder.append('|');
        builder.append("askLimitMultUp=");
        builder.append(this.askLimitMultUp());
        builder.append('|');
        builder.append("askLimitMultDown=");
        builder.append(this.askLimitMultDown());

        limit(originalLimit);

        return builder;
    }
    
    public PriceRangeExecutionRuleDecoder sbeSkip()
    {
        sbeRewind();

        return this;
    }
}
