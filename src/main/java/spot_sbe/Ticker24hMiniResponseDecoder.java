/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class Ticker24hMiniResponseDecoder
{
    public static final int BLOCK_LENGTH = 0;
    public static final int TEMPLATE_ID = 208;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final Ticker24hMiniResponseDecoder parentMessage = this;
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

    public Ticker24hMiniResponseDecoder wrap(
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

    public Ticker24hMiniResponseDecoder wrapAndApplyHeader(
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

    public Ticker24hMiniResponseDecoder sbeRewind()
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
        private final Ticker24hMiniResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        TickersDecoder(final Ticker24hMiniResponseDecoder parentMessage)
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
            return 106;
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


        public static int openPriceId()
        {
            return 3;
        }

        public static int openPriceSinceVersion()
        {
            return 0;
        }

        public static int openPriceEncodingOffset()
        {
            return 2;
        }

        public static int openPriceEncodingLength()
        {
            return 8;
        }

        public static String openPriceMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "optional";
            }

            return "";
        }

        public static long openPriceNullValue()
        {
            return -9223372036854775808L;
        }

        public static long openPriceMinValue()
        {
            return -9223372036854775807L;
        }

        public static long openPriceMaxValue()
        {
            return 9223372036854775807L;
        }

        public long openPrice()
        {
            return buffer.getLong(offset + 2, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int highPriceId()
        {
            return 4;
        }

        public static int highPriceSinceVersion()
        {
            return 0;
        }

        public static int highPriceEncodingOffset()
        {
            return 10;
        }

        public static int highPriceEncodingLength()
        {
            return 8;
        }

        public static String highPriceMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "optional";
            }

            return "";
        }

        public static long highPriceNullValue()
        {
            return -9223372036854775808L;
        }

        public static long highPriceMinValue()
        {
            return -9223372036854775807L;
        }

        public static long highPriceMaxValue()
        {
            return 9223372036854775807L;
        }

        public long highPrice()
        {
            return buffer.getLong(offset + 10, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int lowPriceId()
        {
            return 5;
        }

        public static int lowPriceSinceVersion()
        {
            return 0;
        }

        public static int lowPriceEncodingOffset()
        {
            return 18;
        }

        public static int lowPriceEncodingLength()
        {
            return 8;
        }

        public static String lowPriceMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "optional";
            }

            return "";
        }

        public static long lowPriceNullValue()
        {
            return -9223372036854775808L;
        }

        public static long lowPriceMinValue()
        {
            return -9223372036854775807L;
        }

        public static long lowPriceMaxValue()
        {
            return 9223372036854775807L;
        }

        public long lowPrice()
        {
            return buffer.getLong(offset + 18, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int lastPriceId()
        {
            return 6;
        }

        public static int lastPriceSinceVersion()
        {
            return 0;
        }

        public static int lastPriceEncodingOffset()
        {
            return 26;
        }

        public static int lastPriceEncodingLength()
        {
            return 8;
        }

        public static String lastPriceMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "optional";
            }

            return "";
        }

        public static long lastPriceNullValue()
        {
            return -9223372036854775808L;
        }

        public static long lastPriceMinValue()
        {
            return -9223372036854775807L;
        }

        public static long lastPriceMaxValue()
        {
            return 9223372036854775807L;
        }

        public long lastPrice()
        {
            return buffer.getLong(offset + 26, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int volumeId()
        {
            return 7;
        }

        public static int volumeSinceVersion()
        {
            return 0;
        }

        public static int volumeEncodingOffset()
        {
            return 34;
        }

        public static int volumeEncodingLength()
        {
            return 16;
        }

        public static String volumeMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static short volumeNullValue()
        {
            return (short)255;
        }

        public static short volumeMinValue()
        {
            return (short)0;
        }

        public static short volumeMaxValue()
        {
            return (short)254;
        }

        public static int volumeLength()
        {
            return 16;
        }


        public short volume(final int index)
        {
            if (index < 0 || index >= 16)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = offset + 34 + (index * 1);

            return ((short)(buffer.getByte(pos) & 0xFF));
        }


        public int getVolume(final byte[] dst, final int dstOffset, final int length)
        {
            final int bytesCopied = Math.min(length, 16);
            buffer.getBytes(offset + 34, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public int getVolume(final org.agrona.MutableDirectBuffer dst, final int dstOffset, final int length)
        {
            final int bytesCopied = Math.min(length, 16);
            buffer.getBytes(offset + 34, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public void wrapVolume(final DirectBuffer wrapBuffer)
        {
            wrapBuffer.wrap(buffer, offset + 34, 16);
        }

        public static int quoteVolumeId()
        {
            return 8;
        }

        public static int quoteVolumeSinceVersion()
        {
            return 0;
        }

        public static int quoteVolumeEncodingOffset()
        {
            return 50;
        }

        public static int quoteVolumeEncodingLength()
        {
            return 16;
        }

        public static String quoteVolumeMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static short quoteVolumeNullValue()
        {
            return (short)255;
        }

        public static short quoteVolumeMinValue()
        {
            return (short)0;
        }

        public static short quoteVolumeMaxValue()
        {
            return (short)254;
        }

        public static int quoteVolumeLength()
        {
            return 16;
        }


        public short quoteVolume(final int index)
        {
            if (index < 0 || index >= 16)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = offset + 50 + (index * 1);

            return ((short)(buffer.getByte(pos) & 0xFF));
        }


        public int getQuoteVolume(final byte[] dst, final int dstOffset, final int length)
        {
            final int bytesCopied = Math.min(length, 16);
            buffer.getBytes(offset + 50, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public int getQuoteVolume(final org.agrona.MutableDirectBuffer dst, final int dstOffset, final int length)
        {
            final int bytesCopied = Math.min(length, 16);
            buffer.getBytes(offset + 50, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public void wrapQuoteVolume(final DirectBuffer wrapBuffer)
        {
            wrapBuffer.wrap(buffer, offset + 50, 16);
        }

        public static int openTimeId()
        {
            return 9;
        }

        public static int openTimeSinceVersion()
        {
            return 0;
        }

        public static int openTimeEncodingOffset()
        {
            return 66;
        }

        public static int openTimeEncodingLength()
        {
            return 8;
        }

        public static String openTimeMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long openTimeNullValue()
        {
            return -9223372036854775808L;
        }

        public static long openTimeMinValue()
        {
            return -9223372036854775807L;
        }

        public static long openTimeMaxValue()
        {
            return 9223372036854775807L;
        }

        public long openTime()
        {
            return buffer.getLong(offset + 66, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int closeTimeId()
        {
            return 10;
        }

        public static int closeTimeSinceVersion()
        {
            return 0;
        }

        public static int closeTimeEncodingOffset()
        {
            return 74;
        }

        public static int closeTimeEncodingLength()
        {
            return 8;
        }

        public static String closeTimeMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long closeTimeNullValue()
        {
            return -9223372036854775808L;
        }

        public static long closeTimeMinValue()
        {
            return -9223372036854775807L;
        }

        public static long closeTimeMaxValue()
        {
            return 9223372036854775807L;
        }

        public long closeTime()
        {
            return buffer.getLong(offset + 74, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int firstIdId()
        {
            return 11;
        }

        public static int firstIdSinceVersion()
        {
            return 0;
        }

        public static int firstIdEncodingOffset()
        {
            return 82;
        }

        public static int firstIdEncodingLength()
        {
            return 8;
        }

        public static String firstIdMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "optional";
            }

            return "";
        }

        public static long firstIdNullValue()
        {
            return -9223372036854775808L;
        }

        public static long firstIdMinValue()
        {
            return -9223372036854775807L;
        }

        public static long firstIdMaxValue()
        {
            return 9223372036854775807L;
        }

        public long firstId()
        {
            return buffer.getLong(offset + 82, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int lastIdId()
        {
            return 12;
        }

        public static int lastIdSinceVersion()
        {
            return 0;
        }

        public static int lastIdEncodingOffset()
        {
            return 90;
        }

        public static int lastIdEncodingLength()
        {
            return 8;
        }

        public static String lastIdMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "optional";
            }

            return "";
        }

        public static long lastIdNullValue()
        {
            return -9223372036854775808L;
        }

        public static long lastIdMinValue()
        {
            return -9223372036854775807L;
        }

        public static long lastIdMaxValue()
        {
            return 9223372036854775807L;
        }

        public long lastId()
        {
            return buffer.getLong(offset + 90, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int numTradesId()
        {
            return 13;
        }

        public static int numTradesSinceVersion()
        {
            return 0;
        }

        public static int numTradesEncodingOffset()
        {
            return 98;
        }

        public static int numTradesEncodingLength()
        {
            return 8;
        }

        public static String numTradesMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long numTradesNullValue()
        {
            return -9223372036854775808L;
        }

        public static long numTradesMinValue()
        {
            return -9223372036854775807L;
        }

        public static long numTradesMaxValue()
        {
            return 9223372036854775807L;
        }

        public long numTrades()
        {
            return buffer.getLong(offset + 98, java.nio.ByteOrder.LITTLE_ENDIAN);
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
            builder.append("openPrice=");
            builder.append(this.openPrice());
            builder.append('|');
            builder.append("highPrice=");
            builder.append(this.highPrice());
            builder.append('|');
            builder.append("lowPrice=");
            builder.append(this.lowPrice());
            builder.append('|');
            builder.append("lastPrice=");
            builder.append(this.lastPrice());
            builder.append('|');
            builder.append("volume=");
            builder.append('[');
            if (volumeLength() > 0)
            {
                for (int i = 0; i < volumeLength(); i++)
                {
                    builder.append(this.volume(i));
                    builder.append(',');
                }
                builder.setLength(builder.length() - 1);
            }
            builder.append(']');
            builder.append('|');
            builder.append("quoteVolume=");
            builder.append('[');
            if (quoteVolumeLength() > 0)
            {
                for (int i = 0; i < quoteVolumeLength(); i++)
                {
                    builder.append(this.quoteVolume(i));
                    builder.append(',');
                }
                builder.setLength(builder.length() - 1);
            }
            builder.append(']');
            builder.append('|');
            builder.append("openTime=");
            builder.append(this.openTime());
            builder.append('|');
            builder.append("closeTime=");
            builder.append(this.closeTime());
            builder.append('|');
            builder.append("firstId=");
            builder.append(this.firstId());
            builder.append('|');
            builder.append("lastId=");
            builder.append(this.lastId());
            builder.append('|');
            builder.append("numTrades=");
            builder.append(this.numTrades());
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

        final Ticker24hMiniResponseDecoder decoder = new Ticker24hMiniResponseDecoder();
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
        builder.append("[Ticker24hMiniResponse](sbeTemplateId=");
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
    
    public Ticker24hMiniResponseDecoder sbeSkip()
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
