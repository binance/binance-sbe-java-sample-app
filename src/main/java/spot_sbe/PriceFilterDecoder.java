/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class PriceFilterDecoder
{
    public static final int BLOCK_LENGTH = 25;
    public static final int TEMPLATE_ID = 1;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final PriceFilterDecoder parentMessage = this;
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

    public PriceFilterDecoder wrap(
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

    public PriceFilterDecoder wrapAndApplyHeader(
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

    public PriceFilterDecoder sbeRewind()
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
        return FilterType.PriceFilter.value();
    }


    public FilterType filterType()
    {
        return FilterType.PriceFilter;
    }


    public static int priceExponentId()
    {
        return 2;
    }

    public static int priceExponentSinceVersion()
    {
        return 0;
    }

    public static int priceExponentEncodingOffset()
    {
        return 0;
    }

    public static int priceExponentEncodingLength()
    {
        return 1;
    }

    public static String priceExponentMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static byte priceExponentNullValue()
    {
        return (byte)-128;
    }

    public static byte priceExponentMinValue()
    {
        return (byte)-127;
    }

    public static byte priceExponentMaxValue()
    {
        return (byte)127;
    }

    public byte priceExponent()
    {
        return buffer.getByte(offset + 0);
    }


    public static int minPriceId()
    {
        return 3;
    }

    public static int minPriceSinceVersion()
    {
        return 0;
    }

    public static int minPriceEncodingOffset()
    {
        return 1;
    }

    public static int minPriceEncodingLength()
    {
        return 8;
    }

    public static String minPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long minPriceNullValue()
    {
        return -9223372036854775808L;
    }

    public static long minPriceMinValue()
    {
        return -9223372036854775807L;
    }

    public static long minPriceMaxValue()
    {
        return 9223372036854775807L;
    }

    public long minPrice()
    {
        return buffer.getLong(offset + 1, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int maxPriceId()
    {
        return 4;
    }

    public static int maxPriceSinceVersion()
    {
        return 0;
    }

    public static int maxPriceEncodingOffset()
    {
        return 9;
    }

    public static int maxPriceEncodingLength()
    {
        return 8;
    }

    public static String maxPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long maxPriceNullValue()
    {
        return -9223372036854775808L;
    }

    public static long maxPriceMinValue()
    {
        return -9223372036854775807L;
    }

    public static long maxPriceMaxValue()
    {
        return 9223372036854775807L;
    }

    public long maxPrice()
    {
        return buffer.getLong(offset + 9, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int tickSizeId()
    {
        return 5;
    }

    public static int tickSizeSinceVersion()
    {
        return 0;
    }

    public static int tickSizeEncodingOffset()
    {
        return 17;
    }

    public static int tickSizeEncodingLength()
    {
        return 8;
    }

    public static String tickSizeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long tickSizeNullValue()
    {
        return -9223372036854775808L;
    }

    public static long tickSizeMinValue()
    {
        return -9223372036854775807L;
    }

    public static long tickSizeMaxValue()
    {
        return 9223372036854775807L;
    }

    public long tickSize()
    {
        return buffer.getLong(offset + 17, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final PriceFilterDecoder decoder = new PriceFilterDecoder();
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
        builder.append("[PriceFilter](sbeTemplateId=");
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
        builder.append("priceExponent=");
        builder.append(this.priceExponent());
        builder.append('|');
        builder.append("minPrice=");
        builder.append(this.minPrice());
        builder.append('|');
        builder.append("maxPrice=");
        builder.append(this.maxPrice());
        builder.append('|');
        builder.append("tickSize=");
        builder.append(this.tickSize());

        limit(originalLimit);

        return builder;
    }
    
    public PriceFilterDecoder sbeSkip()
    {
        sbeRewind();

        return this;
    }
}
