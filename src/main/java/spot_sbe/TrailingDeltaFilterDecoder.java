/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class TrailingDeltaFilterDecoder
{
    public static final int BLOCK_LENGTH = 32;
    public static final int TEMPLATE_ID = 13;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final TrailingDeltaFilterDecoder parentMessage = this;
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

    public TrailingDeltaFilterDecoder wrap(
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

    public TrailingDeltaFilterDecoder wrapAndApplyHeader(
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

    public TrailingDeltaFilterDecoder sbeRewind()
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
        return FilterType.TrailingDelta.value();
    }


    public FilterType filterType()
    {
        return FilterType.TrailingDelta;
    }


    public static int minTrailingAboveDeltaId()
    {
        return 2;
    }

    public static int minTrailingAboveDeltaSinceVersion()
    {
        return 0;
    }

    public static int minTrailingAboveDeltaEncodingOffset()
    {
        return 0;
    }

    public static int minTrailingAboveDeltaEncodingLength()
    {
        return 8;
    }

    public static String minTrailingAboveDeltaMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long minTrailingAboveDeltaNullValue()
    {
        return -9223372036854775808L;
    }

    public static long minTrailingAboveDeltaMinValue()
    {
        return -9223372036854775807L;
    }

    public static long minTrailingAboveDeltaMaxValue()
    {
        return 9223372036854775807L;
    }

    public long minTrailingAboveDelta()
    {
        return buffer.getLong(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int maxTrailingAboveDeltaId()
    {
        return 3;
    }

    public static int maxTrailingAboveDeltaSinceVersion()
    {
        return 0;
    }

    public static int maxTrailingAboveDeltaEncodingOffset()
    {
        return 8;
    }

    public static int maxTrailingAboveDeltaEncodingLength()
    {
        return 8;
    }

    public static String maxTrailingAboveDeltaMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long maxTrailingAboveDeltaNullValue()
    {
        return -9223372036854775808L;
    }

    public static long maxTrailingAboveDeltaMinValue()
    {
        return -9223372036854775807L;
    }

    public static long maxTrailingAboveDeltaMaxValue()
    {
        return 9223372036854775807L;
    }

    public long maxTrailingAboveDelta()
    {
        return buffer.getLong(offset + 8, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int minTrailingBelowDeltaId()
    {
        return 4;
    }

    public static int minTrailingBelowDeltaSinceVersion()
    {
        return 0;
    }

    public static int minTrailingBelowDeltaEncodingOffset()
    {
        return 16;
    }

    public static int minTrailingBelowDeltaEncodingLength()
    {
        return 8;
    }

    public static String minTrailingBelowDeltaMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long minTrailingBelowDeltaNullValue()
    {
        return -9223372036854775808L;
    }

    public static long minTrailingBelowDeltaMinValue()
    {
        return -9223372036854775807L;
    }

    public static long minTrailingBelowDeltaMaxValue()
    {
        return 9223372036854775807L;
    }

    public long minTrailingBelowDelta()
    {
        return buffer.getLong(offset + 16, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int maxTrailingBelowDeltaId()
    {
        return 5;
    }

    public static int maxTrailingBelowDeltaSinceVersion()
    {
        return 0;
    }

    public static int maxTrailingBelowDeltaEncodingOffset()
    {
        return 24;
    }

    public static int maxTrailingBelowDeltaEncodingLength()
    {
        return 8;
    }

    public static String maxTrailingBelowDeltaMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long maxTrailingBelowDeltaNullValue()
    {
        return -9223372036854775808L;
    }

    public static long maxTrailingBelowDeltaMinValue()
    {
        return -9223372036854775807L;
    }

    public static long maxTrailingBelowDeltaMaxValue()
    {
        return 9223372036854775807L;
    }

    public long maxTrailingBelowDelta()
    {
        return buffer.getLong(offset + 24, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final TrailingDeltaFilterDecoder decoder = new TrailingDeltaFilterDecoder();
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
        builder.append("[TrailingDeltaFilter](sbeTemplateId=");
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
        builder.append("minTrailingAboveDelta=");
        builder.append(this.minTrailingAboveDelta());
        builder.append('|');
        builder.append("maxTrailingAboveDelta=");
        builder.append(this.maxTrailingAboveDelta());
        builder.append('|');
        builder.append("minTrailingBelowDelta=");
        builder.append(this.minTrailingBelowDelta());
        builder.append('|');
        builder.append("maxTrailingBelowDelta=");
        builder.append(this.maxTrailingBelowDelta());

        limit(originalLimit);

        return builder;
    }
    
    public TrailingDeltaFilterDecoder sbeSkip()
    {
        sbeRewind();

        return this;
    }
}
