/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class MarketLotSizeFilterDecoder
{
    public static final int BLOCK_LENGTH = 25;
    public static final int TEMPLATE_ID = 8;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final MarketLotSizeFilterDecoder parentMessage = this;
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

    public MarketLotSizeFilterDecoder wrap(
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

    public MarketLotSizeFilterDecoder wrapAndApplyHeader(
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

    public MarketLotSizeFilterDecoder sbeRewind()
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
        return FilterType.MarketLotSize.value();
    }


    public FilterType filterType()
    {
        return FilterType.MarketLotSize;
    }


    public static int qtyExponentId()
    {
        return 2;
    }

    public static int qtyExponentSinceVersion()
    {
        return 0;
    }

    public static int qtyExponentEncodingOffset()
    {
        return 0;
    }

    public static int qtyExponentEncodingLength()
    {
        return 1;
    }

    public static String qtyExponentMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static byte qtyExponentNullValue()
    {
        return (byte)-128;
    }

    public static byte qtyExponentMinValue()
    {
        return (byte)-127;
    }

    public static byte qtyExponentMaxValue()
    {
        return (byte)127;
    }

    public byte qtyExponent()
    {
        return buffer.getByte(offset + 0);
    }


    public static int minQtyId()
    {
        return 3;
    }

    public static int minQtySinceVersion()
    {
        return 0;
    }

    public static int minQtyEncodingOffset()
    {
        return 1;
    }

    public static int minQtyEncodingLength()
    {
        return 8;
    }

    public static String minQtyMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long minQtyNullValue()
    {
        return -9223372036854775808L;
    }

    public static long minQtyMinValue()
    {
        return -9223372036854775807L;
    }

    public static long minQtyMaxValue()
    {
        return 9223372036854775807L;
    }

    public long minQty()
    {
        return buffer.getLong(offset + 1, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int maxQtyId()
    {
        return 4;
    }

    public static int maxQtySinceVersion()
    {
        return 0;
    }

    public static int maxQtyEncodingOffset()
    {
        return 9;
    }

    public static int maxQtyEncodingLength()
    {
        return 8;
    }

    public static String maxQtyMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long maxQtyNullValue()
    {
        return -9223372036854775808L;
    }

    public static long maxQtyMinValue()
    {
        return -9223372036854775807L;
    }

    public static long maxQtyMaxValue()
    {
        return 9223372036854775807L;
    }

    public long maxQty()
    {
        return buffer.getLong(offset + 9, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int stepSizeId()
    {
        return 5;
    }

    public static int stepSizeSinceVersion()
    {
        return 0;
    }

    public static int stepSizeEncodingOffset()
    {
        return 17;
    }

    public static int stepSizeEncodingLength()
    {
        return 8;
    }

    public static String stepSizeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long stepSizeNullValue()
    {
        return -9223372036854775808L;
    }

    public static long stepSizeMinValue()
    {
        return -9223372036854775807L;
    }

    public static long stepSizeMaxValue()
    {
        return 9223372036854775807L;
    }

    public long stepSize()
    {
        return buffer.getLong(offset + 17, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final MarketLotSizeFilterDecoder decoder = new MarketLotSizeFilterDecoder();
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
        builder.append("[MarketLotSizeFilter](sbeTemplateId=");
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
        builder.append("qtyExponent=");
        builder.append(this.qtyExponent());
        builder.append('|');
        builder.append("minQty=");
        builder.append(this.minQty());
        builder.append('|');
        builder.append("maxQty=");
        builder.append(this.maxQty());
        builder.append('|');
        builder.append("stepSize=");
        builder.append(this.stepSize());

        limit(originalLimit);

        return builder;
    }
    
    public MarketLotSizeFilterDecoder sbeSkip()
    {
        sbeRewind();

        return this;
    }
}
