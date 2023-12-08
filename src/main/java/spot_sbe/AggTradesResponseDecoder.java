/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class AggTradesResponseDecoder
{
    public static final int BLOCK_LENGTH = 2;
    public static final int TEMPLATE_ID = 202;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final AggTradesResponseDecoder parentMessage = this;
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

    public AggTradesResponseDecoder wrap(
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

    public AggTradesResponseDecoder wrapAndApplyHeader(
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

    public AggTradesResponseDecoder sbeRewind()
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

    public static int priceExponentId()
    {
        return 1;
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
        return 1;
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
        return buffer.getByte(offset + 1);
    }


    private final AggTradesDecoder aggTrades = new AggTradesDecoder(this);

    public static long aggTradesDecoderId()
    {
        return 100;
    }

    public static int aggTradesDecoderSinceVersion()
    {
        return 0;
    }

    public AggTradesDecoder aggTrades()
    {
        aggTrades.wrap(buffer);
        return aggTrades;
    }

    public static final class AggTradesDecoder
        implements Iterable<AggTradesDecoder>, java.util.Iterator<AggTradesDecoder>
    {
        public static final int HEADER_SIZE = 6;
        private final AggTradesResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        AggTradesDecoder(final AggTradesResponseDecoder parentMessage)
        {
            this.parentMessage = parentMessage;
        }

        public void wrap(final DirectBuffer buffer)
        {
            if (buffer != this.buffer)
            {
                this.buffer = buffer;
            }

            index = 0;
            final int limit = parentMessage.limit();
            parentMessage.limit(limit + HEADER_SIZE);
            blockLength = (buffer.getShort(limit + 0, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
            count = (int)(buffer.getInt(limit + 2, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
        }

        public AggTradesDecoder next()
        {
            if (index >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + blockLength);
            ++index;

            return this;
        }

        public static long countMinValue()
        {
            return 0L;
        }

        public static long countMaxValue()
        {
            return 2147483647L;
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 50;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<AggTradesDecoder> iterator()
        {
            return this;
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext()
        {
            return index < count;
        }

        public static int aggTradeIdId()
        {
            return 1;
        }

        public static int aggTradeIdSinceVersion()
        {
            return 0;
        }

        public static int aggTradeIdEncodingOffset()
        {
            return 0;
        }

        public static int aggTradeIdEncodingLength()
        {
            return 8;
        }

        public static String aggTradeIdMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long aggTradeIdNullValue()
        {
            return -9223372036854775808L;
        }

        public static long aggTradeIdMinValue()
        {
            return -9223372036854775807L;
        }

        public static long aggTradeIdMaxValue()
        {
            return 9223372036854775807L;
        }

        public long aggTradeId()
        {
            return buffer.getLong(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int priceId()
        {
            return 2;
        }

        public static int priceSinceVersion()
        {
            return 0;
        }

        public static int priceEncodingOffset()
        {
            return 8;
        }

        public static int priceEncodingLength()
        {
            return 8;
        }

        public static String priceMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long priceNullValue()
        {
            return -9223372036854775808L;
        }

        public static long priceMinValue()
        {
            return -9223372036854775807L;
        }

        public static long priceMaxValue()
        {
            return 9223372036854775807L;
        }

        public long price()
        {
            return buffer.getLong(offset + 8, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int qtyId()
        {
            return 3;
        }

        public static int qtySinceVersion()
        {
            return 0;
        }

        public static int qtyEncodingOffset()
        {
            return 16;
        }

        public static int qtyEncodingLength()
        {
            return 8;
        }

        public static String qtyMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long qtyNullValue()
        {
            return -9223372036854775808L;
        }

        public static long qtyMinValue()
        {
            return -9223372036854775807L;
        }

        public static long qtyMaxValue()
        {
            return 9223372036854775807L;
        }

        public long qty()
        {
            return buffer.getLong(offset + 16, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int firstTradeIdId()
        {
            return 4;
        }

        public static int firstTradeIdSinceVersion()
        {
            return 0;
        }

        public static int firstTradeIdEncodingOffset()
        {
            return 24;
        }

        public static int firstTradeIdEncodingLength()
        {
            return 8;
        }

        public static String firstTradeIdMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long firstTradeIdNullValue()
        {
            return -9223372036854775808L;
        }

        public static long firstTradeIdMinValue()
        {
            return -9223372036854775807L;
        }

        public static long firstTradeIdMaxValue()
        {
            return 9223372036854775807L;
        }

        public long firstTradeId()
        {
            return buffer.getLong(offset + 24, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int lastTradeIdId()
        {
            return 5;
        }

        public static int lastTradeIdSinceVersion()
        {
            return 0;
        }

        public static int lastTradeIdEncodingOffset()
        {
            return 32;
        }

        public static int lastTradeIdEncodingLength()
        {
            return 8;
        }

        public static String lastTradeIdMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long lastTradeIdNullValue()
        {
            return -9223372036854775808L;
        }

        public static long lastTradeIdMinValue()
        {
            return -9223372036854775807L;
        }

        public static long lastTradeIdMaxValue()
        {
            return 9223372036854775807L;
        }

        public long lastTradeId()
        {
            return buffer.getLong(offset + 32, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int timeId()
        {
            return 7;
        }

        public static int timeSinceVersion()
        {
            return 0;
        }

        public static int timeEncodingOffset()
        {
            return 40;
        }

        public static int timeEncodingLength()
        {
            return 8;
        }

        public static String timeMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long timeNullValue()
        {
            return -9223372036854775808L;
        }

        public static long timeMinValue()
        {
            return -9223372036854775807L;
        }

        public static long timeMaxValue()
        {
            return 9223372036854775807L;
        }

        public long time()
        {
            return buffer.getLong(offset + 40, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int isBuyerMakerId()
        {
            return 8;
        }

        public static int isBuyerMakerSinceVersion()
        {
            return 0;
        }

        public static int isBuyerMakerEncodingOffset()
        {
            return 48;
        }

        public static int isBuyerMakerEncodingLength()
        {
            return 1;
        }

        public static String isBuyerMakerMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public short isBuyerMakerRaw()
        {
            return ((short)(buffer.getByte(offset + 48) & 0xFF));
        }

        public BoolEnum isBuyerMaker()
        {
            return BoolEnum.get(((short)(buffer.getByte(offset + 48) & 0xFF)));
        }


        public static int isBestMatchId()
        {
            return 9;
        }

        public static int isBestMatchSinceVersion()
        {
            return 0;
        }

        public static int isBestMatchEncodingOffset()
        {
            return 49;
        }

        public static int isBestMatchEncodingLength()
        {
            return 1;
        }

        public static String isBestMatchMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public short isBestMatchRaw()
        {
            return ((short)(buffer.getByte(offset + 49) & 0xFF));
        }

        public BoolEnum isBestMatch()
        {
            return BoolEnum.get(((short)(buffer.getByte(offset + 49) & 0xFF)));
        }


        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("aggTradeId=");
            builder.append(this.aggTradeId());
            builder.append('|');
            builder.append("price=");
            builder.append(this.price());
            builder.append('|');
            builder.append("qty=");
            builder.append(this.qty());
            builder.append('|');
            builder.append("firstTradeId=");
            builder.append(this.firstTradeId());
            builder.append('|');
            builder.append("lastTradeId=");
            builder.append(this.lastTradeId());
            builder.append('|');
            builder.append("time=");
            builder.append(this.time());
            builder.append('|');
            builder.append("isBuyerMaker=");
            builder.append(this.isBuyerMaker());
            builder.append('|');
            builder.append("isBestMatch=");
            builder.append(this.isBestMatch());
            builder.append(')');

            return builder;
        }
        
        public AggTradesDecoder sbeSkip()
        {

            return this;
        }
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final AggTradesResponseDecoder decoder = new AggTradesResponseDecoder();
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
        builder.append("[AggTradesResponse](sbeTemplateId=");
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
        builder.append("priceExponent=");
        builder.append(this.priceExponent());
        builder.append('|');
        builder.append("qtyExponent=");
        builder.append(this.qtyExponent());
        builder.append('|');
        builder.append("aggTrades=[");
        final int aggTradesOriginalOffset = aggTrades.offset;
        final int aggTradesOriginalIndex = aggTrades.index;
        final AggTradesDecoder aggTrades = this.aggTrades();
        if (aggTrades.count() > 0)
        {
            while (aggTrades.hasNext())
            {
                aggTrades.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        aggTrades.offset = aggTradesOriginalOffset;
        aggTrades.index = aggTradesOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public AggTradesResponseDecoder sbeSkip()
    {
        sbeRewind();
        AggTradesDecoder aggTrades = this.aggTrades();
        if (aggTrades.count() > 0)
        {
            while (aggTrades.hasNext())
            {
                aggTrades.next();
                aggTrades.sbeSkip();
            }
        }

        return this;
    }
}
