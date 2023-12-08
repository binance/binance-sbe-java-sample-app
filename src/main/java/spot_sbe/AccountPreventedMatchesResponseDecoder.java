/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class AccountPreventedMatchesResponseDecoder
{
    public static final int BLOCK_LENGTH = 0;
    public static final int TEMPLATE_ID = 403;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final AccountPreventedMatchesResponseDecoder parentMessage = this;
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

    public AccountPreventedMatchesResponseDecoder wrap(
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

    public AccountPreventedMatchesResponseDecoder wrapAndApplyHeader(
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

    public AccountPreventedMatchesResponseDecoder sbeRewind()
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

    private final PreventedMatchesDecoder preventedMatches = new PreventedMatchesDecoder(this);

    public static long preventedMatchesDecoderId()
    {
        return 100;
    }

    public static int preventedMatchesDecoderSinceVersion()
    {
        return 0;
    }

    public PreventedMatchesDecoder preventedMatches()
    {
        preventedMatches.wrap(buffer);
        return preventedMatches;
    }

    public static final class PreventedMatchesDecoder
        implements Iterable<PreventedMatchesDecoder>, java.util.Iterator<PreventedMatchesDecoder>
    {
        public static final int HEADER_SIZE = 6;
        private final AccountPreventedMatchesResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        PreventedMatchesDecoder(final AccountPreventedMatchesResponseDecoder parentMessage)
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

        public PreventedMatchesDecoder next()
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
            return 67;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<PreventedMatchesDecoder> iterator()
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


        public static int preventedMatchIdId()
        {
            return 3;
        }

        public static int preventedMatchIdSinceVersion()
        {
            return 0;
        }

        public static int preventedMatchIdEncodingOffset()
        {
            return 2;
        }

        public static int preventedMatchIdEncodingLength()
        {
            return 8;
        }

        public static String preventedMatchIdMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long preventedMatchIdNullValue()
        {
            return -9223372036854775808L;
        }

        public static long preventedMatchIdMinValue()
        {
            return -9223372036854775807L;
        }

        public static long preventedMatchIdMaxValue()
        {
            return 9223372036854775807L;
        }

        public long preventedMatchId()
        {
            return buffer.getLong(offset + 2, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int takerOrderIdId()
        {
            return 4;
        }

        public static int takerOrderIdSinceVersion()
        {
            return 0;
        }

        public static int takerOrderIdEncodingOffset()
        {
            return 10;
        }

        public static int takerOrderIdEncodingLength()
        {
            return 8;
        }

        public static String takerOrderIdMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long takerOrderIdNullValue()
        {
            return -9223372036854775808L;
        }

        public static long takerOrderIdMinValue()
        {
            return -9223372036854775807L;
        }

        public static long takerOrderIdMaxValue()
        {
            return 9223372036854775807L;
        }

        public long takerOrderId()
        {
            return buffer.getLong(offset + 10, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int makerOrderIdId()
        {
            return 5;
        }

        public static int makerOrderIdSinceVersion()
        {
            return 0;
        }

        public static int makerOrderIdEncodingOffset()
        {
            return 18;
        }

        public static int makerOrderIdEncodingLength()
        {
            return 8;
        }

        public static String makerOrderIdMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long makerOrderIdNullValue()
        {
            return -9223372036854775808L;
        }

        public static long makerOrderIdMinValue()
        {
            return -9223372036854775807L;
        }

        public static long makerOrderIdMaxValue()
        {
            return 9223372036854775807L;
        }

        public long makerOrderId()
        {
            return buffer.getLong(offset + 18, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int tradeGroupIdId()
        {
            return 6;
        }

        public static int tradeGroupIdSinceVersion()
        {
            return 0;
        }

        public static int tradeGroupIdEncodingOffset()
        {
            return 26;
        }

        public static int tradeGroupIdEncodingLength()
        {
            return 8;
        }

        public static String tradeGroupIdMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long tradeGroupIdNullValue()
        {
            return -9223372036854775808L;
        }

        public static long tradeGroupIdMinValue()
        {
            return -9223372036854775807L;
        }

        public static long tradeGroupIdMaxValue()
        {
            return 9223372036854775807L;
        }

        public long tradeGroupId()
        {
            return buffer.getLong(offset + 26, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int selfTradePreventionModeId()
        {
            return 7;
        }

        public static int selfTradePreventionModeSinceVersion()
        {
            return 0;
        }

        public static int selfTradePreventionModeEncodingOffset()
        {
            return 34;
        }

        public static int selfTradePreventionModeEncodingLength()
        {
            return 1;
        }

        public static String selfTradePreventionModeMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public short selfTradePreventionModeRaw()
        {
            return ((short)(buffer.getByte(offset + 34) & 0xFF));
        }

        public SelfTradePreventionMode selfTradePreventionMode()
        {
            return SelfTradePreventionMode.get(((short)(buffer.getByte(offset + 34) & 0xFF)));
        }


        public static int priceId()
        {
            return 8;
        }

        public static int priceSinceVersion()
        {
            return 0;
        }

        public static int priceEncodingOffset()
        {
            return 35;
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
            return buffer.getLong(offset + 35, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int takerPreventedQuantityId()
        {
            return 9;
        }

        public static int takerPreventedQuantitySinceVersion()
        {
            return 0;
        }

        public static int takerPreventedQuantityEncodingOffset()
        {
            return 43;
        }

        public static int takerPreventedQuantityEncodingLength()
        {
            return 8;
        }

        public static String takerPreventedQuantityMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "optional";
            }

            return "";
        }

        public static long takerPreventedQuantityNullValue()
        {
            return -9223372036854775808L;
        }

        public static long takerPreventedQuantityMinValue()
        {
            return -9223372036854775807L;
        }

        public static long takerPreventedQuantityMaxValue()
        {
            return 9223372036854775807L;
        }

        public long takerPreventedQuantity()
        {
            return buffer.getLong(offset + 43, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int makerPreventedQuantityId()
        {
            return 10;
        }

        public static int makerPreventedQuantitySinceVersion()
        {
            return 0;
        }

        public static int makerPreventedQuantityEncodingOffset()
        {
            return 51;
        }

        public static int makerPreventedQuantityEncodingLength()
        {
            return 8;
        }

        public static String makerPreventedQuantityMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "optional";
            }

            return "";
        }

        public static long makerPreventedQuantityNullValue()
        {
            return -9223372036854775808L;
        }

        public static long makerPreventedQuantityMinValue()
        {
            return -9223372036854775807L;
        }

        public static long makerPreventedQuantityMaxValue()
        {
            return 9223372036854775807L;
        }

        public long makerPreventedQuantity()
        {
            return buffer.getLong(offset + 51, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int transactTimeId()
        {
            return 11;
        }

        public static int transactTimeSinceVersion()
        {
            return 0;
        }

        public static int transactTimeEncodingOffset()
        {
            return 59;
        }

        public static int transactTimeEncodingLength()
        {
            return 8;
        }

        public static String transactTimeMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long transactTimeNullValue()
        {
            return -9223372036854775808L;
        }

        public static long transactTimeMinValue()
        {
            return -9223372036854775807L;
        }

        public static long transactTimeMaxValue()
        {
            return 9223372036854775807L;
        }

        public long transactTime()
        {
            return buffer.getLong(offset + 59, java.nio.ByteOrder.LITTLE_ENDIAN);
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

        public static int makerSymbolId()
        {
            return 201;
        }

        public static int makerSymbolSinceVersion()
        {
            return 0;
        }

        public static String makerSymbolCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.UTF_8.name();
        }

        public static String makerSymbolMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static int makerSymbolHeaderLength()
        {
            return 1;
        }

        public int makerSymbolLength()
        {
            final int limit = parentMessage.limit();
            return ((short)(buffer.getByte(limit) & 0xFF));
        }

        public int skipMakerSymbol()
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int dataOffset = limit + headerLength;
            parentMessage.limit(dataOffset + dataLength);

            return dataLength;
        }

        public int getMakerSymbol(final MutableDirectBuffer dst, final int dstOffset, final int length)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public int getMakerSymbol(final byte[] dst, final int dstOffset, final int length)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public void wrapMakerSymbol(final DirectBuffer wrapBuffer)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            parentMessage.limit(limit + headerLength + dataLength);
            wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
        }

        public String makerSymbol()
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
            builder.append("preventedMatchId=");
            builder.append(this.preventedMatchId());
            builder.append('|');
            builder.append("takerOrderId=");
            builder.append(this.takerOrderId());
            builder.append('|');
            builder.append("makerOrderId=");
            builder.append(this.makerOrderId());
            builder.append('|');
            builder.append("tradeGroupId=");
            builder.append(this.tradeGroupId());
            builder.append('|');
            builder.append("selfTradePreventionMode=");
            builder.append(this.selfTradePreventionMode());
            builder.append('|');
            builder.append("price=");
            builder.append(this.price());
            builder.append('|');
            builder.append("takerPreventedQuantity=");
            builder.append(this.takerPreventedQuantity());
            builder.append('|');
            builder.append("makerPreventedQuantity=");
            builder.append(this.makerPreventedQuantity());
            builder.append('|');
            builder.append("transactTime=");
            builder.append(this.transactTime());
            builder.append('|');
            builder.append("symbol=");
            builder.append('\'').append(symbol()).append('\'');
            builder.append('|');
            builder.append("makerSymbol=");
            builder.append('\'').append(makerSymbol()).append('\'');
            builder.append(')');

            return builder;
        }
        
        public PreventedMatchesDecoder sbeSkip()
        {
            skipSymbol();
            skipMakerSymbol();

            return this;
        }
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final AccountPreventedMatchesResponseDecoder decoder = new AccountPreventedMatchesResponseDecoder();
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
        builder.append("[AccountPreventedMatchesResponse](sbeTemplateId=");
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
        builder.append("preventedMatches=[");
        final int preventedMatchesOriginalOffset = preventedMatches.offset;
        final int preventedMatchesOriginalIndex = preventedMatches.index;
        final PreventedMatchesDecoder preventedMatches = this.preventedMatches();
        if (preventedMatches.count() > 0)
        {
            while (preventedMatches.hasNext())
            {
                preventedMatches.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        preventedMatches.offset = preventedMatchesOriginalOffset;
        preventedMatches.index = preventedMatchesOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public AccountPreventedMatchesResponseDecoder sbeSkip()
    {
        sbeRewind();
        PreventedMatchesDecoder preventedMatches = this.preventedMatches();
        if (preventedMatches.count() > 0)
        {
            while (preventedMatches.hasNext())
            {
                preventedMatches.next();
                preventedMatches.sbeSkip();
            }
        }

        return this;
    }
}
