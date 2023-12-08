/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class AccountTradesResponseDecoder
{
    public static final int BLOCK_LENGTH = 0;
    public static final int TEMPLATE_ID = 401;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final AccountTradesResponseDecoder parentMessage = this;
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

    public AccountTradesResponseDecoder wrap(
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

    public AccountTradesResponseDecoder wrapAndApplyHeader(
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

    public AccountTradesResponseDecoder sbeRewind()
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

    private final TradesDecoder trades = new TradesDecoder(this);

    public static long tradesDecoderId()
    {
        return 100;
    }

    public static int tradesDecoderSinceVersion()
    {
        return 0;
    }

    public TradesDecoder trades()
    {
        trades.wrap(buffer);
        return trades;
    }

    public static final class TradesDecoder
        implements Iterable<TradesDecoder>, java.util.Iterator<TradesDecoder>
    {
        public static final int HEADER_SIZE = 6;
        private final AccountTradesResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        TradesDecoder(final AccountTradesResponseDecoder parentMessage)
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

        public TradesDecoder next()
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
            return 70;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<TradesDecoder> iterator()
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


        public static int commissionExponentId()
        {
            return 3;
        }

        public static int commissionExponentSinceVersion()
        {
            return 0;
        }

        public static int commissionExponentEncodingOffset()
        {
            return 2;
        }

        public static int commissionExponentEncodingLength()
        {
            return 1;
        }

        public static String commissionExponentMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static byte commissionExponentNullValue()
        {
            return (byte)-128;
        }

        public static byte commissionExponentMinValue()
        {
            return (byte)-127;
        }

        public static byte commissionExponentMaxValue()
        {
            return (byte)127;
        }

        public byte commissionExponent()
        {
            return buffer.getByte(offset + 2);
        }


        public static int idId()
        {
            return 4;
        }

        public static int idSinceVersion()
        {
            return 0;
        }

        public static int idEncodingOffset()
        {
            return 3;
        }

        public static int idEncodingLength()
        {
            return 8;
        }

        public static String idMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long idNullValue()
        {
            return -9223372036854775808L;
        }

        public static long idMinValue()
        {
            return -9223372036854775807L;
        }

        public static long idMaxValue()
        {
            return 9223372036854775807L;
        }

        public long id()
        {
            return buffer.getLong(offset + 3, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int orderIdId()
        {
            return 5;
        }

        public static int orderIdSinceVersion()
        {
            return 0;
        }

        public static int orderIdEncodingOffset()
        {
            return 11;
        }

        public static int orderIdEncodingLength()
        {
            return 8;
        }

        public static String orderIdMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long orderIdNullValue()
        {
            return -9223372036854775808L;
        }

        public static long orderIdMinValue()
        {
            return -9223372036854775807L;
        }

        public static long orderIdMaxValue()
        {
            return 9223372036854775807L;
        }

        public long orderId()
        {
            return buffer.getLong(offset + 11, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int orderListIdId()
        {
            return 6;
        }

        public static int orderListIdSinceVersion()
        {
            return 0;
        }

        public static int orderListIdEncodingOffset()
        {
            return 19;
        }

        public static int orderListIdEncodingLength()
        {
            return 8;
        }

        public static String orderListIdMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "optional";
            }

            return "";
        }

        public static long orderListIdNullValue()
        {
            return -9223372036854775808L;
        }

        public static long orderListIdMinValue()
        {
            return -9223372036854775807L;
        }

        public static long orderListIdMaxValue()
        {
            return 9223372036854775807L;
        }

        public long orderListId()
        {
            return buffer.getLong(offset + 19, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int priceId()
        {
            return 7;
        }

        public static int priceSinceVersion()
        {
            return 0;
        }

        public static int priceEncodingOffset()
        {
            return 27;
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
            return buffer.getLong(offset + 27, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int qtyId()
        {
            return 8;
        }

        public static int qtySinceVersion()
        {
            return 0;
        }

        public static int qtyEncodingOffset()
        {
            return 35;
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
            return buffer.getLong(offset + 35, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int quoteQtyId()
        {
            return 9;
        }

        public static int quoteQtySinceVersion()
        {
            return 0;
        }

        public static int quoteQtyEncodingOffset()
        {
            return 43;
        }

        public static int quoteQtyEncodingLength()
        {
            return 8;
        }

        public static String quoteQtyMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long quoteQtyNullValue()
        {
            return -9223372036854775808L;
        }

        public static long quoteQtyMinValue()
        {
            return -9223372036854775807L;
        }

        public static long quoteQtyMaxValue()
        {
            return 9223372036854775807L;
        }

        public long quoteQty()
        {
            return buffer.getLong(offset + 43, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int commissionId()
        {
            return 10;
        }

        public static int commissionSinceVersion()
        {
            return 0;
        }

        public static int commissionEncodingOffset()
        {
            return 51;
        }

        public static int commissionEncodingLength()
        {
            return 8;
        }

        public static String commissionMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long commissionNullValue()
        {
            return -9223372036854775808L;
        }

        public static long commissionMinValue()
        {
            return -9223372036854775807L;
        }

        public static long commissionMaxValue()
        {
            return 9223372036854775807L;
        }

        public long commission()
        {
            return buffer.getLong(offset + 51, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int timeId()
        {
            return 11;
        }

        public static int timeSinceVersion()
        {
            return 0;
        }

        public static int timeEncodingOffset()
        {
            return 59;
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
            return buffer.getLong(offset + 59, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int isBuyerId()
        {
            return 12;
        }

        public static int isBuyerSinceVersion()
        {
            return 0;
        }

        public static int isBuyerEncodingOffset()
        {
            return 67;
        }

        public static int isBuyerEncodingLength()
        {
            return 1;
        }

        public static String isBuyerMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public short isBuyerRaw()
        {
            return ((short)(buffer.getByte(offset + 67) & 0xFF));
        }

        public BoolEnum isBuyer()
        {
            return BoolEnum.get(((short)(buffer.getByte(offset + 67) & 0xFF)));
        }


        public static int isMakerId()
        {
            return 13;
        }

        public static int isMakerSinceVersion()
        {
            return 0;
        }

        public static int isMakerEncodingOffset()
        {
            return 68;
        }

        public static int isMakerEncodingLength()
        {
            return 1;
        }

        public static String isMakerMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public short isMakerRaw()
        {
            return ((short)(buffer.getByte(offset + 68) & 0xFF));
        }

        public BoolEnum isMaker()
        {
            return BoolEnum.get(((short)(buffer.getByte(offset + 68) & 0xFF)));
        }


        public static int isBestMatchId()
        {
            return 14;
        }

        public static int isBestMatchSinceVersion()
        {
            return 0;
        }

        public static int isBestMatchEncodingOffset()
        {
            return 69;
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
            return ((short)(buffer.getByte(offset + 69) & 0xFF));
        }

        public BoolEnum isBestMatch()
        {
            return BoolEnum.get(((short)(buffer.getByte(offset + 69) & 0xFF)));
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

        public static int commissionAssetId()
        {
            return 201;
        }

        public static int commissionAssetSinceVersion()
        {
            return 0;
        }

        public static String commissionAssetCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.UTF_8.name();
        }

        public static String commissionAssetMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static int commissionAssetHeaderLength()
        {
            return 1;
        }

        public int commissionAssetLength()
        {
            final int limit = parentMessage.limit();
            return ((short)(buffer.getByte(limit) & 0xFF));
        }

        public int skipCommissionAsset()
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int dataOffset = limit + headerLength;
            parentMessage.limit(dataOffset + dataLength);

            return dataLength;
        }

        public int getCommissionAsset(final MutableDirectBuffer dst, final int dstOffset, final int length)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public int getCommissionAsset(final byte[] dst, final int dstOffset, final int length)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public void wrapCommissionAsset(final DirectBuffer wrapBuffer)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            parentMessage.limit(limit + headerLength + dataLength);
            wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
        }

        public String commissionAsset()
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
            builder.append("commissionExponent=");
            builder.append(this.commissionExponent());
            builder.append('|');
            builder.append("id=");
            builder.append(this.id());
            builder.append('|');
            builder.append("orderId=");
            builder.append(this.orderId());
            builder.append('|');
            builder.append("orderListId=");
            builder.append(this.orderListId());
            builder.append('|');
            builder.append("price=");
            builder.append(this.price());
            builder.append('|');
            builder.append("qty=");
            builder.append(this.qty());
            builder.append('|');
            builder.append("quoteQty=");
            builder.append(this.quoteQty());
            builder.append('|');
            builder.append("commission=");
            builder.append(this.commission());
            builder.append('|');
            builder.append("time=");
            builder.append(this.time());
            builder.append('|');
            builder.append("isBuyer=");
            builder.append(this.isBuyer());
            builder.append('|');
            builder.append("isMaker=");
            builder.append(this.isMaker());
            builder.append('|');
            builder.append("isBestMatch=");
            builder.append(this.isBestMatch());
            builder.append('|');
            builder.append("symbol=");
            builder.append('\'').append(symbol()).append('\'');
            builder.append('|');
            builder.append("commissionAsset=");
            builder.append('\'').append(commissionAsset()).append('\'');
            builder.append(')');

            return builder;
        }
        
        public TradesDecoder sbeSkip()
        {
            skipSymbol();
            skipCommissionAsset();

            return this;
        }
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final AccountTradesResponseDecoder decoder = new AccountTradesResponseDecoder();
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
        builder.append("[AccountTradesResponse](sbeTemplateId=");
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
        builder.append("trades=[");
        final int tradesOriginalOffset = trades.offset;
        final int tradesOriginalIndex = trades.index;
        final TradesDecoder trades = this.trades();
        if (trades.count() > 0)
        {
            while (trades.hasNext())
            {
                trades.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        trades.offset = tradesOriginalOffset;
        trades.index = tradesOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public AccountTradesResponseDecoder sbeSkip()
    {
        sbeRewind();
        TradesDecoder trades = this.trades();
        if (trades.count() > 0)
        {
            while (trades.hasNext())
            {
                trades.next();
                trades.sbeSkip();
            }
        }

        return this;
    }
}
