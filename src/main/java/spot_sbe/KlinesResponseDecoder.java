/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class KlinesResponseDecoder
{
    public static final int BLOCK_LENGTH = 2;
    public static final int TEMPLATE_ID = 203;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final KlinesResponseDecoder parentMessage = this;
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

    public KlinesResponseDecoder wrap(
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

    public KlinesResponseDecoder wrapAndApplyHeader(
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

    public KlinesResponseDecoder sbeRewind()
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


    private final KlinesDecoder klines = new KlinesDecoder(this);

    public static long klinesDecoderId()
    {
        return 100;
    }

    public static int klinesDecoderSinceVersion()
    {
        return 0;
    }

    public KlinesDecoder klines()
    {
        klines.wrap(buffer);
        return klines;
    }

    public static final class KlinesDecoder
        implements Iterable<KlinesDecoder>, java.util.Iterator<KlinesDecoder>
    {
        public static final int HEADER_SIZE = 6;
        private final KlinesResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        KlinesDecoder(final KlinesResponseDecoder parentMessage)
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

        public KlinesDecoder next()
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
            return 120;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<KlinesDecoder> iterator()
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

        public static int openTimeId()
        {
            return 1;
        }

        public static int openTimeSinceVersion()
        {
            return 0;
        }

        public static int openTimeEncodingOffset()
        {
            return 0;
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
            return buffer.getLong(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int openPriceId()
        {
            return 2;
        }

        public static int openPriceSinceVersion()
        {
            return 0;
        }

        public static int openPriceEncodingOffset()
        {
            return 8;
        }

        public static int openPriceEncodingLength()
        {
            return 8;
        }

        public static String openPriceMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
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
            return buffer.getLong(offset + 8, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int highPriceId()
        {
            return 3;
        }

        public static int highPriceSinceVersion()
        {
            return 0;
        }

        public static int highPriceEncodingOffset()
        {
            return 16;
        }

        public static int highPriceEncodingLength()
        {
            return 8;
        }

        public static String highPriceMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
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
            return buffer.getLong(offset + 16, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int lowPriceId()
        {
            return 4;
        }

        public static int lowPriceSinceVersion()
        {
            return 0;
        }

        public static int lowPriceEncodingOffset()
        {
            return 24;
        }

        public static int lowPriceEncodingLength()
        {
            return 8;
        }

        public static String lowPriceMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
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
            return buffer.getLong(offset + 24, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int closePriceId()
        {
            return 5;
        }

        public static int closePriceSinceVersion()
        {
            return 0;
        }

        public static int closePriceEncodingOffset()
        {
            return 32;
        }

        public static int closePriceEncodingLength()
        {
            return 8;
        }

        public static String closePriceMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long closePriceNullValue()
        {
            return -9223372036854775808L;
        }

        public static long closePriceMinValue()
        {
            return -9223372036854775807L;
        }

        public static long closePriceMaxValue()
        {
            return 9223372036854775807L;
        }

        public long closePrice()
        {
            return buffer.getLong(offset + 32, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int volumeId()
        {
            return 6;
        }

        public static int volumeSinceVersion()
        {
            return 0;
        }

        public static int volumeEncodingOffset()
        {
            return 40;
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

            final int pos = offset + 40 + (index * 1);

            return ((short)(buffer.getByte(pos) & 0xFF));
        }


        public int getVolume(final byte[] dst, final int dstOffset, final int length)
        {
            final int bytesCopied = Math.min(length, 16);
            buffer.getBytes(offset + 40, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public int getVolume(final org.agrona.MutableDirectBuffer dst, final int dstOffset, final int length)
        {
            final int bytesCopied = Math.min(length, 16);
            buffer.getBytes(offset + 40, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public void wrapVolume(final DirectBuffer wrapBuffer)
        {
            wrapBuffer.wrap(buffer, offset + 40, 16);
        }

        public static int closeTimeId()
        {
            return 7;
        }

        public static int closeTimeSinceVersion()
        {
            return 0;
        }

        public static int closeTimeEncodingOffset()
        {
            return 56;
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
            return buffer.getLong(offset + 56, java.nio.ByteOrder.LITTLE_ENDIAN);
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
            return 64;
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

            final int pos = offset + 64 + (index * 1);

            return ((short)(buffer.getByte(pos) & 0xFF));
        }


        public int getQuoteVolume(final byte[] dst, final int dstOffset, final int length)
        {
            final int bytesCopied = Math.min(length, 16);
            buffer.getBytes(offset + 64, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public int getQuoteVolume(final org.agrona.MutableDirectBuffer dst, final int dstOffset, final int length)
        {
            final int bytesCopied = Math.min(length, 16);
            buffer.getBytes(offset + 64, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public void wrapQuoteVolume(final DirectBuffer wrapBuffer)
        {
            wrapBuffer.wrap(buffer, offset + 64, 16);
        }

        public static int numTradesId()
        {
            return 9;
        }

        public static int numTradesSinceVersion()
        {
            return 0;
        }

        public static int numTradesEncodingOffset()
        {
            return 80;
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
            return buffer.getLong(offset + 80, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int takerBuyBaseVolumeId()
        {
            return 10;
        }

        public static int takerBuyBaseVolumeSinceVersion()
        {
            return 0;
        }

        public static int takerBuyBaseVolumeEncodingOffset()
        {
            return 88;
        }

        public static int takerBuyBaseVolumeEncodingLength()
        {
            return 16;
        }

        public static String takerBuyBaseVolumeMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static short takerBuyBaseVolumeNullValue()
        {
            return (short)255;
        }

        public static short takerBuyBaseVolumeMinValue()
        {
            return (short)0;
        }

        public static short takerBuyBaseVolumeMaxValue()
        {
            return (short)254;
        }

        public static int takerBuyBaseVolumeLength()
        {
            return 16;
        }


        public short takerBuyBaseVolume(final int index)
        {
            if (index < 0 || index >= 16)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = offset + 88 + (index * 1);

            return ((short)(buffer.getByte(pos) & 0xFF));
        }


        public int getTakerBuyBaseVolume(final byte[] dst, final int dstOffset, final int length)
        {
            final int bytesCopied = Math.min(length, 16);
            buffer.getBytes(offset + 88, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public int getTakerBuyBaseVolume(final org.agrona.MutableDirectBuffer dst, final int dstOffset, final int length)
        {
            final int bytesCopied = Math.min(length, 16);
            buffer.getBytes(offset + 88, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public void wrapTakerBuyBaseVolume(final DirectBuffer wrapBuffer)
        {
            wrapBuffer.wrap(buffer, offset + 88, 16);
        }

        public static int takerBuyQuoteVolumeId()
        {
            return 11;
        }

        public static int takerBuyQuoteVolumeSinceVersion()
        {
            return 0;
        }

        public static int takerBuyQuoteVolumeEncodingOffset()
        {
            return 104;
        }

        public static int takerBuyQuoteVolumeEncodingLength()
        {
            return 16;
        }

        public static String takerBuyQuoteVolumeMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static short takerBuyQuoteVolumeNullValue()
        {
            return (short)255;
        }

        public static short takerBuyQuoteVolumeMinValue()
        {
            return (short)0;
        }

        public static short takerBuyQuoteVolumeMaxValue()
        {
            return (short)254;
        }

        public static int takerBuyQuoteVolumeLength()
        {
            return 16;
        }


        public short takerBuyQuoteVolume(final int index)
        {
            if (index < 0 || index >= 16)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = offset + 104 + (index * 1);

            return ((short)(buffer.getByte(pos) & 0xFF));
        }


        public int getTakerBuyQuoteVolume(final byte[] dst, final int dstOffset, final int length)
        {
            final int bytesCopied = Math.min(length, 16);
            buffer.getBytes(offset + 104, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public int getTakerBuyQuoteVolume(final org.agrona.MutableDirectBuffer dst, final int dstOffset, final int length)
        {
            final int bytesCopied = Math.min(length, 16);
            buffer.getBytes(offset + 104, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public void wrapTakerBuyQuoteVolume(final DirectBuffer wrapBuffer)
        {
            wrapBuffer.wrap(buffer, offset + 104, 16);
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("openTime=");
            builder.append(this.openTime());
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
            builder.append("closePrice=");
            builder.append(this.closePrice());
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
            builder.append("closeTime=");
            builder.append(this.closeTime());
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
            builder.append("numTrades=");
            builder.append(this.numTrades());
            builder.append('|');
            builder.append("takerBuyBaseVolume=");
            builder.append('[');
            if (takerBuyBaseVolumeLength() > 0)
            {
                for (int i = 0; i < takerBuyBaseVolumeLength(); i++)
                {
                    builder.append(this.takerBuyBaseVolume(i));
                    builder.append(',');
                }
                builder.setLength(builder.length() - 1);
            }
            builder.append(']');
            builder.append('|');
            builder.append("takerBuyQuoteVolume=");
            builder.append('[');
            if (takerBuyQuoteVolumeLength() > 0)
            {
                for (int i = 0; i < takerBuyQuoteVolumeLength(); i++)
                {
                    builder.append(this.takerBuyQuoteVolume(i));
                    builder.append(',');
                }
                builder.setLength(builder.length() - 1);
            }
            builder.append(']');
            builder.append(')');

            return builder;
        }
        
        public KlinesDecoder sbeSkip()
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

        final KlinesResponseDecoder decoder = new KlinesResponseDecoder();
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
        builder.append("[KlinesResponse](sbeTemplateId=");
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
        builder.append("klines=[");
        final int klinesOriginalOffset = klines.offset;
        final int klinesOriginalIndex = klines.index;
        final KlinesDecoder klines = this.klines();
        if (klines.count() > 0)
        {
            while (klines.hasNext())
            {
                klines.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        klines.offset = klinesOriginalOffset;
        klines.index = klinesOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public KlinesResponseDecoder sbeSkip()
    {
        sbeRewind();
        KlinesDecoder klines = this.klines();
        if (klines.count() > 0)
        {
            while (klines.hasNext())
            {
                klines.next();
                klines.sbeSkip();
            }
        }

        return this;
    }
}
