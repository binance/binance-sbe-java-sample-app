/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class MaxNumAlgoOrdersFilterDecoder
{
    public static final int BLOCK_LENGTH = 8;
    public static final int TEMPLATE_ID = 10;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final MaxNumAlgoOrdersFilterDecoder parentMessage = this;
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

    public MaxNumAlgoOrdersFilterDecoder wrap(
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

    public MaxNumAlgoOrdersFilterDecoder wrapAndApplyHeader(
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

    public MaxNumAlgoOrdersFilterDecoder sbeRewind()
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
        return FilterType.MaxNumAlgoOrders.value();
    }


    public FilterType filterType()
    {
        return FilterType.MaxNumAlgoOrders;
    }


    public static int maxNumAlgoOrdersId()
    {
        return 2;
    }

    public static int maxNumAlgoOrdersSinceVersion()
    {
        return 0;
    }

    public static int maxNumAlgoOrdersEncodingOffset()
    {
        return 0;
    }

    public static int maxNumAlgoOrdersEncodingLength()
    {
        return 8;
    }

    public static String maxNumAlgoOrdersMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long maxNumAlgoOrdersNullValue()
    {
        return -9223372036854775808L;
    }

    public static long maxNumAlgoOrdersMinValue()
    {
        return -9223372036854775807L;
    }

    public static long maxNumAlgoOrdersMaxValue()
    {
        return 9223372036854775807L;
    }

    public long maxNumAlgoOrders()
    {
        return buffer.getLong(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final MaxNumAlgoOrdersFilterDecoder decoder = new MaxNumAlgoOrdersFilterDecoder();
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
        builder.append("[MaxNumAlgoOrdersFilter](sbeTemplateId=");
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
        builder.append("maxNumAlgoOrders=");
        builder.append(this.maxNumAlgoOrders());

        limit(originalLimit);

        return builder;
    }
    
    public MaxNumAlgoOrdersFilterDecoder sbeSkip()
    {
        sbeRewind();

        return this;
    }
}
