/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class MaxNumOrdersFilterDecoder
{
    public static final int BLOCK_LENGTH = 8;
    public static final int TEMPLATE_ID = 9;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final MaxNumOrdersFilterDecoder parentMessage = this;
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

    public MaxNumOrdersFilterDecoder wrap(
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

    public MaxNumOrdersFilterDecoder wrapAndApplyHeader(
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

    public MaxNumOrdersFilterDecoder sbeRewind()
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
        return FilterType.MaxNumOrders.value();
    }


    public FilterType filterType()
    {
        return FilterType.MaxNumOrders;
    }


    public static int maxNumOrdersId()
    {
        return 2;
    }

    public static int maxNumOrdersSinceVersion()
    {
        return 0;
    }

    public static int maxNumOrdersEncodingOffset()
    {
        return 0;
    }

    public static int maxNumOrdersEncodingLength()
    {
        return 8;
    }

    public static String maxNumOrdersMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long maxNumOrdersNullValue()
    {
        return -9223372036854775808L;
    }

    public static long maxNumOrdersMinValue()
    {
        return -9223372036854775807L;
    }

    public static long maxNumOrdersMaxValue()
    {
        return 9223372036854775807L;
    }

    public long maxNumOrders()
    {
        return buffer.getLong(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final MaxNumOrdersFilterDecoder decoder = new MaxNumOrdersFilterDecoder();
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
        builder.append("[MaxNumOrdersFilter](sbeTemplateId=");
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
        builder.append("maxNumOrders=");
        builder.append(this.maxNumOrders());

        limit(originalLimit);

        return builder;
    }
    
    public MaxNumOrdersFilterDecoder sbeSkip()
    {
        sbeRewind();

        return this;
    }
}
