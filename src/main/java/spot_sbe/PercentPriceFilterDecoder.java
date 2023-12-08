/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class PercentPriceFilterDecoder
{
    public static final int BLOCK_LENGTH = 21;
    public static final int TEMPLATE_ID = 2;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final PercentPriceFilterDecoder parentMessage = this;
    private DirectBuffer buffer;
    private int initialOffset;
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

    public int initialOffset()
    {
        return initialOffset;
    }

    public int offset()
    {
        return offset;
    }

    public PercentPriceFilterDecoder wrap(
        final DirectBuffer buffer,
        final int offset,
        final int actingBlockLength,
        final int actingVersion)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.initialOffset = offset;
        this.offset = offset;
        this.actingBlockLength = actingBlockLength;
        this.actingVersion = actingVersion;
        limit(offset + actingBlockLength);

        return this;
    }

    public PercentPriceFilterDecoder wrapAndApplyHeader(
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

    public PercentPriceFilterDecoder sbeRewind()
    {
        return wrap(buffer, initialOffset, actingBlockLength, actingVersion);
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

    public static int filterTypeId()
    {
        return 1;
    }

    public static int filterTypeSinceVersion()
    {
        return 0;
    }

    public static int filterTypeEncodingOffset()
    {
        return 0;
    }

    public static int filterTypeEncodingLength()
    {
        return 1;
    }

    public static String filterTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "constant";
        }

        return "";
    }

    public short filterTypeRaw()
    {
        return FilterType.PercentPrice.value();
    }


    public FilterType filterType()
    {
        return FilterType.PercentPrice;
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


    public static int multiplierUpId()
    {
        return 3;
    }

    public static int multiplierUpSinceVersion()
    {
        return 0;
    }

    public static int multiplierUpEncodingOffset()
    {
        return 1;
    }

    public static int multiplierUpEncodingLength()
    {
        return 8;
    }

    public static String multiplierUpMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long multiplierUpNullValue()
    {
        return -9223372036854775808L;
    }

    public static long multiplierUpMinValue()
    {
        return -9223372036854775807L;
    }

    public static long multiplierUpMaxValue()
    {
        return 9223372036854775807L;
    }

    public long multiplierUp()
    {
        return buffer.getLong(offset + 1, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int multiplierDownId()
    {
        return 4;
    }

    public static int multiplierDownSinceVersion()
    {
        return 0;
    }

    public static int multiplierDownEncodingOffset()
    {
        return 9;
    }

    public static int multiplierDownEncodingLength()
    {
        return 8;
    }

    public static String multiplierDownMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long multiplierDownNullValue()
    {
        return -9223372036854775808L;
    }

    public static long multiplierDownMinValue()
    {
        return -9223372036854775807L;
    }

    public static long multiplierDownMaxValue()
    {
        return 9223372036854775807L;
    }

    public long multiplierDown()
    {
        return buffer.getLong(offset + 9, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int avgPriceMinsId()
    {
        return 5;
    }

    public static int avgPriceMinsSinceVersion()
    {
        return 0;
    }

    public static int avgPriceMinsEncodingOffset()
    {
        return 17;
    }

    public static int avgPriceMinsEncodingLength()
    {
        return 4;
    }

    public static String avgPriceMinsMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static int avgPriceMinsNullValue()
    {
        return -2147483648;
    }

    public static int avgPriceMinsMinValue()
    {
        return -2147483647;
    }

    public static int avgPriceMinsMaxValue()
    {
        return 2147483647;
    }

    public int avgPriceMins()
    {
        return buffer.getInt(offset + 17, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final PercentPriceFilterDecoder decoder = new PercentPriceFilterDecoder();
        decoder.wrap(buffer, initialOffset, actingBlockLength, actingVersion);

        return decoder.appendTo(new StringBuilder()).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        if (null == buffer)
        {
            return builder;
        }

        final int originalLimit = limit();
        limit(initialOffset + actingBlockLength);
        builder.append("[PercentPriceFilter](sbeTemplateId=");
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
        builder.append("filterType=");
        builder.append(this.filterType());
        builder.append('|');
        builder.append("multiplierExponent=");
        builder.append(this.multiplierExponent());
        builder.append('|');
        builder.append("multiplierUp=");
        builder.append(this.multiplierUp());
        builder.append('|');
        builder.append("multiplierDown=");
        builder.append(this.multiplierDown());
        builder.append('|');
        builder.append("avgPriceMins=");
        builder.append(this.avgPriceMins());

        limit(originalLimit);

        return builder;
    }
    
    public PercentPriceFilterDecoder sbeSkip()
    {
        sbeRewind();

        return this;
    }
}
