/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class BookTickerResponseDecoder
{
    public static final int BLOCK_LENGTH = 0;
    public static final int TEMPLATE_ID = 212;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final BookTickerResponseDecoder parentMessage = this;
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

    public BookTickerResponseDecoder wrap(
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

    public BookTickerResponseDecoder wrapAndApplyHeader(
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

    public BookTickerResponseDecoder sbeRewind()
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

    private final TickersDecoder tickers = new TickersDecoder(this);

    public static long tickersDecoderId()
    {
        return 100;
    }

    public static int tickersDecoderSinceVersion()
    {
        return 0;
    }

    public TickersDecoder tickers()
    {
        tickers.wrap(buffer);
        return tickers;
    }

    public static final class TickersDecoder
        implements Iterable<TickersDecoder>, java.util.Iterator<TickersDecoder>
    {
        public static final int HEADER_SIZE = 6;
        private final BookTickerResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        TickersDecoder(final BookTickerResponseDecoder parentMessage)
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

        public TickersDecoder next()
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
            return 34;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<TickersDecoder> iterator()
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


        public static int bidPriceId()
        {
            return 3;
        }

        public static int bidPriceSinceVersion()
        {
            return 0;
        }

        public static int bidPriceEncodingOffset()
        {
            return 2;
        }

        public static int bidPriceEncodingLength()
        {
            return 8;
        }

        public static String bidPriceMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "optional";
            }

            return "";
        }

        public static long bidPriceNullValue()
        {
            return -9223372036854775808L;
        }

        public static long bidPriceMinValue()
        {
            return -9223372036854775807L;
        }

        public static long bidPriceMaxValue()
        {
            return 9223372036854775807L;
        }

        public long bidPrice()
        {
            return buffer.getLong(offset + 2, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int bidQtyId()
        {
            return 4;
        }

        public static int bidQtySinceVersion()
        {
            return 0;
        }

        public static int bidQtyEncodingOffset()
        {
            return 10;
        }

        public static int bidQtyEncodingLength()
        {
            return 8;
        }

        public static String bidQtyMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long bidQtyNullValue()
        {
            return -9223372036854775808L;
        }

        public static long bidQtyMinValue()
        {
            return -9223372036854775807L;
        }

        public static long bidQtyMaxValue()
        {
            return 9223372036854775807L;
        }

        public long bidQty()
        {
            return buffer.getLong(offset + 10, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int askPriceId()
        {
            return 5;
        }

        public static int askPriceSinceVersion()
        {
            return 0;
        }

        public static int askPriceEncodingOffset()
        {
            return 18;
        }

        public static int askPriceEncodingLength()
        {
            return 8;
        }

        public static String askPriceMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "optional";
            }

            return "";
        }

        public static long askPriceNullValue()
        {
            return -9223372036854775808L;
        }

        public static long askPriceMinValue()
        {
            return -9223372036854775807L;
        }

        public static long askPriceMaxValue()
        {
            return 9223372036854775807L;
        }

        public long askPrice()
        {
            return buffer.getLong(offset + 18, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int askQtyId()
        {
            return 6;
        }

        public static int askQtySinceVersion()
        {
            return 0;
        }

        public static int askQtyEncodingOffset()
        {
            return 26;
        }

        public static int askQtyEncodingLength()
        {
            return 8;
        }

        public static String askQtyMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long askQtyNullValue()
        {
            return -9223372036854775808L;
        }

        public static long askQtyMinValue()
        {
            return -9223372036854775807L;
        }

        public static long askQtyMaxValue()
        {
            return 9223372036854775807L;
        }

        public long askQty()
        {
            return buffer.getLong(offset + 26, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int symbolId()
        {
            return 200;
        }

        public static int symbolSinceVersion()
        {
            return 0;
        }

        public static String symbolCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.UTF_8.name();
        }

        public static String symbolMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static int symbolHeaderLength()
        {
            return 1;
        }

        public int symbolLength()
        {
            final int limit = parentMessage.limit();
            return ((short)(buffer.getByte(limit) & 0xFF));
        }

        public int skipSymbol()
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int dataOffset = limit + headerLength;
            parentMessage.limit(dataOffset + dataLength);

            return dataLength;
        }

        public int getSymbol(final MutableDirectBuffer dst, final int dstOffset, final int length)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public int getSymbol(final byte[] dst, final int dstOffset, final int length)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public void wrapSymbol(final DirectBuffer wrapBuffer)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            parentMessage.limit(limit + headerLength + dataLength);
            wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
        }

        public String symbol()
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            parentMessage.limit(limit + headerLength + dataLength);

            if (0 == dataLength)
            {
                return "";
            }

            final byte[] tmp = new byte[dataLength];
            buffer.getBytes(limit + headerLength, tmp, 0, dataLength);

            return new String(tmp, java.nio.charset.StandardCharsets.UTF_8);
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("priceExponent=");
            builder.append(this.priceExponent());
            builder.append('|');
            builder.append("qtyExponent=");
            builder.append(this.qtyExponent());
            builder.append('|');
            builder.append("bidPrice=");
            builder.append(this.bidPrice());
            builder.append('|');
            builder.append("bidQty=");
            builder.append(this.bidQty());
            builder.append('|');
            builder.append("askPrice=");
            builder.append(this.askPrice());
            builder.append('|');
            builder.append("askQty=");
            builder.append(this.askQty());
            builder.append('|');
            builder.append("symbol=");
            builder.append('\'').append(symbol()).append('\'');
            builder.append(')');

            return builder;
        }
        
        public TickersDecoder sbeSkip()
        {
            skipSymbol();

            return this;
        }
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final BookTickerResponseDecoder decoder = new BookTickerResponseDecoder();
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
        builder.append("[BookTickerResponse](sbeTemplateId=");
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
        builder.append("tickers=[");
        final int tickersOriginalOffset = tickers.offset;
        final int tickersOriginalIndex = tickers.index;
        final TickersDecoder tickers = this.tickers();
        if (tickers.count() > 0)
        {
            while (tickers.hasNext())
            {
                tickers.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        tickers.offset = tickersOriginalOffset;
        tickers.index = tickersOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public BookTickerResponseDecoder sbeSkip()
    {
        sbeRewind();
        TickersDecoder tickers = this.tickers();
        if (tickers.count() > 0)
        {
            while (tickers.hasNext())
            {
                tickers.next();
                tickers.sbeSkip();
            }
        }

        return this;
    }
}
