/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class ExchangeInfoResponseDecoder
{
    public static final int BLOCK_LENGTH = 0;
    public static final int TEMPLATE_ID = 103;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final ExchangeInfoResponseDecoder parentMessage = this;
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

    public ExchangeInfoResponseDecoder wrap(
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

    public ExchangeInfoResponseDecoder wrapAndApplyHeader(
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

    public ExchangeInfoResponseDecoder sbeRewind()
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

    private final RateLimitsDecoder rateLimits = new RateLimitsDecoder(this);

    public static long rateLimitsDecoderId()
    {
        return 100;
    }

    public static int rateLimitsDecoderSinceVersion()
    {
        return 0;
    }

    public RateLimitsDecoder rateLimits()
    {
        rateLimits.wrap(buffer);
        return rateLimits;
    }

    public static final class RateLimitsDecoder
        implements Iterable<RateLimitsDecoder>, java.util.Iterator<RateLimitsDecoder>
    {
        public static final int HEADER_SIZE = 6;
        private final ExchangeInfoResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        RateLimitsDecoder(final ExchangeInfoResponseDecoder parentMessage)
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

        public RateLimitsDecoder next()
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
            return 11;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<RateLimitsDecoder> iterator()
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

        public static int rateLimitTypeId()
        {
            return 1;
        }

        public static int rateLimitTypeSinceVersion()
        {
            return 0;
        }

        public static int rateLimitTypeEncodingOffset()
        {
            return 0;
        }

        public static int rateLimitTypeEncodingLength()
        {
            return 1;
        }

        public static String rateLimitTypeMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public short rateLimitTypeRaw()
        {
            return ((short)(buffer.getByte(offset + 0) & 0xFF));
        }

        public RateLimitType rateLimitType()
        {
            return RateLimitType.get(((short)(buffer.getByte(offset + 0) & 0xFF)));
        }


        public static int intervalId()
        {
            return 2;
        }

        public static int intervalSinceVersion()
        {
            return 0;
        }

        public static int intervalEncodingOffset()
        {
            return 1;
        }

        public static int intervalEncodingLength()
        {
            return 1;
        }

        public static String intervalMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public short intervalRaw()
        {
            return ((short)(buffer.getByte(offset + 1) & 0xFF));
        }

        public RateLimitInterval interval()
        {
            return RateLimitInterval.get(((short)(buffer.getByte(offset + 1) & 0xFF)));
        }


        public static int intervalNumId()
        {
            return 3;
        }

        public static int intervalNumSinceVersion()
        {
            return 0;
        }

        public static int intervalNumEncodingOffset()
        {
            return 2;
        }

        public static int intervalNumEncodingLength()
        {
            return 1;
        }

        public static String intervalNumMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static short intervalNumNullValue()
        {
            return (short)255;
        }

        public static short intervalNumMinValue()
        {
            return (short)0;
        }

        public static short intervalNumMaxValue()
        {
            return (short)254;
        }

        public short intervalNum()
        {
            return ((short)(buffer.getByte(offset + 2) & 0xFF));
        }


        public static int rateLimitId()
        {
            return 4;
        }

        public static int rateLimitSinceVersion()
        {
            return 0;
        }

        public static int rateLimitEncodingOffset()
        {
            return 3;
        }

        public static int rateLimitEncodingLength()
        {
            return 8;
        }

        public static String rateLimitMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long rateLimitNullValue()
        {
            return -9223372036854775808L;
        }

        public static long rateLimitMinValue()
        {
            return -9223372036854775807L;
        }

        public static long rateLimitMaxValue()
        {
            return 9223372036854775807L;
        }

        public long rateLimit()
        {
            return buffer.getLong(offset + 3, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("rateLimitType=");
            builder.append(this.rateLimitType());
            builder.append('|');
            builder.append("interval=");
            builder.append(this.interval());
            builder.append('|');
            builder.append("intervalNum=");
            builder.append(this.intervalNum());
            builder.append('|');
            builder.append("rateLimit=");
            builder.append(this.rateLimit());
            builder.append(')');

            return builder;
        }
        
        public RateLimitsDecoder sbeSkip()
        {

            return this;
        }
    }

    private final ExchangeFiltersDecoder exchangeFilters = new ExchangeFiltersDecoder(this);

    public static long exchangeFiltersDecoderId()
    {
        return 101;
    }

    public static int exchangeFiltersDecoderSinceVersion()
    {
        return 0;
    }

    public ExchangeFiltersDecoder exchangeFilters()
    {
        exchangeFilters.wrap(buffer);
        return exchangeFilters;
    }

    public static final class ExchangeFiltersDecoder
        implements Iterable<ExchangeFiltersDecoder>, java.util.Iterator<ExchangeFiltersDecoder>
    {
        public static final int HEADER_SIZE = 6;
        private final ExchangeInfoResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        ExchangeFiltersDecoder(final ExchangeInfoResponseDecoder parentMessage)
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

        public ExchangeFiltersDecoder next()
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
            return 0;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<ExchangeFiltersDecoder> iterator()
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

        public static int filterId()
        {
            return 200;
        }

        public static int filterSinceVersion()
        {
            return 0;
        }

        public static String filterMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static int filterHeaderLength()
        {
            return 1;
        }

        public int filterLength()
        {
            final int limit = parentMessage.limit();
            return ((short)(buffer.getByte(limit) & 0xFF));
        }

        public int skipFilter()
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int dataOffset = limit + headerLength;
            parentMessage.limit(dataOffset + dataLength);

            return dataLength;
        }

        public int getFilter(final MutableDirectBuffer dst, final int dstOffset, final int length)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public int getFilter(final byte[] dst, final int dstOffset, final int length)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public void wrapFilter(final DirectBuffer wrapBuffer)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            parentMessage.limit(limit + headerLength + dataLength);
            wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("filter=");
            builder.append(skipFilter()).append(" bytes of raw data");
            builder.append(')');

            return builder;
        }
        
        public ExchangeFiltersDecoder sbeSkip()
        {
            skipFilter();

            return this;
        }
    }

    private final SymbolsDecoder symbols = new SymbolsDecoder(this);

    public static long symbolsDecoderId()
    {
        return 102;
    }

    public static int symbolsDecoderSinceVersion()
    {
        return 0;
    }

    public SymbolsDecoder symbols()
    {
        symbols.wrap(buffer);
        return symbols;
    }

    public static final class SymbolsDecoder
        implements Iterable<SymbolsDecoder>, java.util.Iterator<SymbolsDecoder>
    {
        public static final int HEADER_SIZE = 6;
        private final ExchangeInfoResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;
        private final FiltersDecoder filters;
        private final PermissionsDecoder permissions;

        SymbolsDecoder(final ExchangeInfoResponseDecoder parentMessage)
        {
            this.parentMessage = parentMessage;
            filters = new FiltersDecoder(parentMessage);
            permissions = new PermissionsDecoder(parentMessage);
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

        public SymbolsDecoder next()
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
            return 16;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<SymbolsDecoder> iterator()
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

        public static int statusId()
        {
            return 1;
        }

        public static int statusSinceVersion()
        {
            return 0;
        }

        public static int statusEncodingOffset()
        {
            return 0;
        }

        public static int statusEncodingLength()
        {
            return 1;
        }

        public static String statusMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public short statusRaw()
        {
            return ((short)(buffer.getByte(offset + 0) & 0xFF));
        }

        public SymbolStatus status()
        {
            return SymbolStatus.get(((short)(buffer.getByte(offset + 0) & 0xFF)));
        }


        public static int baseAssetPrecisionId()
        {
            return 2;
        }

        public static int baseAssetPrecisionSinceVersion()
        {
            return 0;
        }

        public static int baseAssetPrecisionEncodingOffset()
        {
            return 1;
        }

        public static int baseAssetPrecisionEncodingLength()
        {
            return 1;
        }

        public static String baseAssetPrecisionMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static short baseAssetPrecisionNullValue()
        {
            return (short)255;
        }

        public static short baseAssetPrecisionMinValue()
        {
            return (short)0;
        }

        public static short baseAssetPrecisionMaxValue()
        {
            return (short)254;
        }

        public short baseAssetPrecision()
        {
            return ((short)(buffer.getByte(offset + 1) & 0xFF));
        }


        public static int quoteAssetPrecisionId()
        {
            return 3;
        }

        public static int quoteAssetPrecisionSinceVersion()
        {
            return 0;
        }

        public static int quoteAssetPrecisionEncodingOffset()
        {
            return 2;
        }

        public static int quoteAssetPrecisionEncodingLength()
        {
            return 1;
        }

        public static String quoteAssetPrecisionMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static short quoteAssetPrecisionNullValue()
        {
            return (short)255;
        }

        public static short quoteAssetPrecisionMinValue()
        {
            return (short)0;
        }

        public static short quoteAssetPrecisionMaxValue()
        {
            return (short)254;
        }

        public short quoteAssetPrecision()
        {
            return ((short)(buffer.getByte(offset + 2) & 0xFF));
        }


        public static int baseCommissionPrecisionId()
        {
            return 4;
        }

        public static int baseCommissionPrecisionSinceVersion()
        {
            return 0;
        }

        public static int baseCommissionPrecisionEncodingOffset()
        {
            return 3;
        }

        public static int baseCommissionPrecisionEncodingLength()
        {
            return 1;
        }

        public static String baseCommissionPrecisionMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static short baseCommissionPrecisionNullValue()
        {
            return (short)255;
        }

        public static short baseCommissionPrecisionMinValue()
        {
            return (short)0;
        }

        public static short baseCommissionPrecisionMaxValue()
        {
            return (short)254;
        }

        public short baseCommissionPrecision()
        {
            return ((short)(buffer.getByte(offset + 3) & 0xFF));
        }


        public static int quoteCommissionPrecisionId()
        {
            return 5;
        }

        public static int quoteCommissionPrecisionSinceVersion()
        {
            return 0;
        }

        public static int quoteCommissionPrecisionEncodingOffset()
        {
            return 4;
        }

        public static int quoteCommissionPrecisionEncodingLength()
        {
            return 1;
        }

        public static String quoteCommissionPrecisionMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static short quoteCommissionPrecisionNullValue()
        {
            return (short)255;
        }

        public static short quoteCommissionPrecisionMinValue()
        {
            return (short)0;
        }

        public static short quoteCommissionPrecisionMaxValue()
        {
            return (short)254;
        }

        public short quoteCommissionPrecision()
        {
            return ((short)(buffer.getByte(offset + 4) & 0xFF));
        }


        public static int orderTypesId()
        {
            return 6;
        }

        public static int orderTypesSinceVersion()
        {
            return 0;
        }

        public static int orderTypesEncodingOffset()
        {
            return 5;
        }

        public static int orderTypesEncodingLength()
        {
            return 2;
        }

        public static String orderTypesMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        private final OrderTypesDecoder orderTypes = new OrderTypesDecoder();

        public OrderTypesDecoder orderTypes()
        {
            orderTypes.wrap(buffer, offset + 5);
            return orderTypes;
        }

        public static int icebergAllowedId()
        {
            return 7;
        }

        public static int icebergAllowedSinceVersion()
        {
            return 0;
        }

        public static int icebergAllowedEncodingOffset()
        {
            return 7;
        }

        public static int icebergAllowedEncodingLength()
        {
            return 1;
        }

        public static String icebergAllowedMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public short icebergAllowedRaw()
        {
            return ((short)(buffer.getByte(offset + 7) & 0xFF));
        }

        public BoolEnum icebergAllowed()
        {
            return BoolEnum.get(((short)(buffer.getByte(offset + 7) & 0xFF)));
        }


        public static int ocoAllowedId()
        {
            return 8;
        }

        public static int ocoAllowedSinceVersion()
        {
            return 0;
        }

        public static int ocoAllowedEncodingOffset()
        {
            return 8;
        }

        public static int ocoAllowedEncodingLength()
        {
            return 1;
        }

        public static String ocoAllowedMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public short ocoAllowedRaw()
        {
            return ((short)(buffer.getByte(offset + 8) & 0xFF));
        }

        public BoolEnum ocoAllowed()
        {
            return BoolEnum.get(((short)(buffer.getByte(offset + 8) & 0xFF)));
        }


        public static int quoteOrderQtyMarketAllowedId()
        {
            return 9;
        }

        public static int quoteOrderQtyMarketAllowedSinceVersion()
        {
            return 0;
        }

        public static int quoteOrderQtyMarketAllowedEncodingOffset()
        {
            return 9;
        }

        public static int quoteOrderQtyMarketAllowedEncodingLength()
        {
            return 1;
        }

        public static String quoteOrderQtyMarketAllowedMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public short quoteOrderQtyMarketAllowedRaw()
        {
            return ((short)(buffer.getByte(offset + 9) & 0xFF));
        }

        public BoolEnum quoteOrderQtyMarketAllowed()
        {
            return BoolEnum.get(((short)(buffer.getByte(offset + 9) & 0xFF)));
        }


        public static int allowTrailingStopId()
        {
            return 10;
        }

        public static int allowTrailingStopSinceVersion()
        {
            return 0;
        }

        public static int allowTrailingStopEncodingOffset()
        {
            return 10;
        }

        public static int allowTrailingStopEncodingLength()
        {
            return 1;
        }

        public static String allowTrailingStopMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public short allowTrailingStopRaw()
        {
            return ((short)(buffer.getByte(offset + 10) & 0xFF));
        }

        public BoolEnum allowTrailingStop()
        {
            return BoolEnum.get(((short)(buffer.getByte(offset + 10) & 0xFF)));
        }


        public static int cancelReplaceAllowedId()
        {
            return 11;
        }

        public static int cancelReplaceAllowedSinceVersion()
        {
            return 0;
        }

        public static int cancelReplaceAllowedEncodingOffset()
        {
            return 11;
        }

        public static int cancelReplaceAllowedEncodingLength()
        {
            return 1;
        }

        public static String cancelReplaceAllowedMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public short cancelReplaceAllowedRaw()
        {
            return ((short)(buffer.getByte(offset + 11) & 0xFF));
        }

        public BoolEnum cancelReplaceAllowed()
        {
            return BoolEnum.get(((short)(buffer.getByte(offset + 11) & 0xFF)));
        }


        public static int isSpotTradingAllowedId()
        {
            return 12;
        }

        public static int isSpotTradingAllowedSinceVersion()
        {
            return 0;
        }

        public static int isSpotTradingAllowedEncodingOffset()
        {
            return 12;
        }

        public static int isSpotTradingAllowedEncodingLength()
        {
            return 1;
        }

        public static String isSpotTradingAllowedMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public short isSpotTradingAllowedRaw()
        {
            return ((short)(buffer.getByte(offset + 12) & 0xFF));
        }

        public BoolEnum isSpotTradingAllowed()
        {
            return BoolEnum.get(((short)(buffer.getByte(offset + 12) & 0xFF)));
        }


        public static int isMarginTradingAllowedId()
        {
            return 13;
        }

        public static int isMarginTradingAllowedSinceVersion()
        {
            return 0;
        }

        public static int isMarginTradingAllowedEncodingOffset()
        {
            return 13;
        }

        public static int isMarginTradingAllowedEncodingLength()
        {
            return 1;
        }

        public static String isMarginTradingAllowedMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public short isMarginTradingAllowedRaw()
        {
            return ((short)(buffer.getByte(offset + 13) & 0xFF));
        }

        public BoolEnum isMarginTradingAllowed()
        {
            return BoolEnum.get(((short)(buffer.getByte(offset + 13) & 0xFF)));
        }


        public static int defaultSelfTradePreventionModeId()
        {
            return 14;
        }

        public static int defaultSelfTradePreventionModeSinceVersion()
        {
            return 0;
        }

        public static int defaultSelfTradePreventionModeEncodingOffset()
        {
            return 14;
        }

        public static int defaultSelfTradePreventionModeEncodingLength()
        {
            return 1;
        }

        public static String defaultSelfTradePreventionModeMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public short defaultSelfTradePreventionModeRaw()
        {
            return ((short)(buffer.getByte(offset + 14) & 0xFF));
        }

        public SelfTradePreventionMode defaultSelfTradePreventionMode()
        {
            return SelfTradePreventionMode.get(((short)(buffer.getByte(offset + 14) & 0xFF)));
        }


        public static int allowedSelfTradePreventionModesId()
        {
            return 15;
        }

        public static int allowedSelfTradePreventionModesSinceVersion()
        {
            return 0;
        }

        public static int allowedSelfTradePreventionModesEncodingOffset()
        {
            return 15;
        }

        public static int allowedSelfTradePreventionModesEncodingLength()
        {
            return 1;
        }

        public static String allowedSelfTradePreventionModesMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        private final AllowedSelfTradePreventionModesDecoder allowedSelfTradePreventionModes = new AllowedSelfTradePreventionModesDecoder();

        public AllowedSelfTradePreventionModesDecoder allowedSelfTradePreventionModes()
        {
            allowedSelfTradePreventionModes.wrap(buffer, offset + 15);
            return allowedSelfTradePreventionModes;
        }

        public static long filtersDecoderId()
        {
            return 100;
        }

        public static int filtersDecoderSinceVersion()
        {
            return 0;
        }

        public FiltersDecoder filters()
        {
            filters.wrap(buffer);
            return filters;
        }

        public static final class FiltersDecoder
            implements Iterable<FiltersDecoder>, java.util.Iterator<FiltersDecoder>
        {
            public static final int HEADER_SIZE = 6;
            private final ExchangeInfoResponseDecoder parentMessage;
            private DirectBuffer buffer;
            private int count;
            private int index;
            private int offset;
            private int blockLength;

            FiltersDecoder(final ExchangeInfoResponseDecoder parentMessage)
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

            public FiltersDecoder next()
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
                return 0;
            }

            public int actingBlockLength()
            {
                return blockLength;
            }

            public int count()
            {
                return count;
            }

            public java.util.Iterator<FiltersDecoder> iterator()
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

            public static int filterId()
            {
                return 200;
            }

            public static int filterSinceVersion()
            {
                return 0;
            }

            public static String filterMetaAttribute(final MetaAttribute metaAttribute)
            {
                if (MetaAttribute.PRESENCE == metaAttribute)
                {
                    return "required";
                }

                return "";
            }

            public static int filterHeaderLength()
            {
                return 1;
            }

            public int filterLength()
            {
                final int limit = parentMessage.limit();
                return ((short)(buffer.getByte(limit) & 0xFF));
            }

            public int skipFilter()
            {
                final int headerLength = 1;
                final int limit = parentMessage.limit();
                final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
                final int dataOffset = limit + headerLength;
                parentMessage.limit(dataOffset + dataLength);

                return dataLength;
            }

            public int getFilter(final MutableDirectBuffer dst, final int dstOffset, final int length)
            {
                final int headerLength = 1;
                final int limit = parentMessage.limit();
                final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
                final int bytesCopied = Math.min(length, dataLength);
                parentMessage.limit(limit + headerLength + dataLength);
                buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

                return bytesCopied;
            }

            public int getFilter(final byte[] dst, final int dstOffset, final int length)
            {
                final int headerLength = 1;
                final int limit = parentMessage.limit();
                final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
                final int bytesCopied = Math.min(length, dataLength);
                parentMessage.limit(limit + headerLength + dataLength);
                buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

                return bytesCopied;
            }

            public void wrapFilter(final DirectBuffer wrapBuffer)
            {
                final int headerLength = 1;
                final int limit = parentMessage.limit();
                final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
                parentMessage.limit(limit + headerLength + dataLength);
                wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
            }

            public StringBuilder appendTo(final StringBuilder builder)
            {
                if (null == buffer)
                {
                    return builder;
                }

                builder.append('(');
                builder.append("filter=");
                builder.append(skipFilter()).append(" bytes of raw data");
                builder.append(')');

                return builder;
            }
            
            public FiltersDecoder sbeSkip()
            {
                skipFilter();

                return this;
            }
        }

        public static long permissionsDecoderId()
        {
            return 101;
        }

        public static int permissionsDecoderSinceVersion()
        {
            return 0;
        }

        public PermissionsDecoder permissions()
        {
            permissions.wrap(buffer);
            return permissions;
        }

        public static final class PermissionsDecoder
            implements Iterable<PermissionsDecoder>, java.util.Iterator<PermissionsDecoder>
        {
            public static final int HEADER_SIZE = 6;
            private final ExchangeInfoResponseDecoder parentMessage;
            private DirectBuffer buffer;
            private int count;
            private int index;
            private int offset;
            private int blockLength;

            PermissionsDecoder(final ExchangeInfoResponseDecoder parentMessage)
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

            public PermissionsDecoder next()
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
                return 0;
            }

            public int actingBlockLength()
            {
                return blockLength;
            }

            public int count()
            {
                return count;
            }

            public java.util.Iterator<PermissionsDecoder> iterator()
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

            public static int permissionId()
            {
                return 200;
            }

            public static int permissionSinceVersion()
            {
                return 0;
            }

            public static String permissionCharacterEncoding()
            {
                return java.nio.charset.StandardCharsets.UTF_8.name();
            }

            public static String permissionMetaAttribute(final MetaAttribute metaAttribute)
            {
                if (MetaAttribute.PRESENCE == metaAttribute)
                {
                    return "required";
                }

                return "";
            }

            public static int permissionHeaderLength()
            {
                return 1;
            }

            public int permissionLength()
            {
                final int limit = parentMessage.limit();
                return ((short)(buffer.getByte(limit) & 0xFF));
            }

            public int skipPermission()
            {
                final int headerLength = 1;
                final int limit = parentMessage.limit();
                final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
                final int dataOffset = limit + headerLength;
                parentMessage.limit(dataOffset + dataLength);

                return dataLength;
            }

            public int getPermission(final MutableDirectBuffer dst, final int dstOffset, final int length)
            {
                final int headerLength = 1;
                final int limit = parentMessage.limit();
                final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
                final int bytesCopied = Math.min(length, dataLength);
                parentMessage.limit(limit + headerLength + dataLength);
                buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

                return bytesCopied;
            }

            public int getPermission(final byte[] dst, final int dstOffset, final int length)
            {
                final int headerLength = 1;
                final int limit = parentMessage.limit();
                final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
                final int bytesCopied = Math.min(length, dataLength);
                parentMessage.limit(limit + headerLength + dataLength);
                buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

                return bytesCopied;
            }

            public void wrapPermission(final DirectBuffer wrapBuffer)
            {
                final int headerLength = 1;
                final int limit = parentMessage.limit();
                final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
                parentMessage.limit(limit + headerLength + dataLength);
                wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
            }

            public String permission()
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
                builder.append("permission=");
                builder.append('\'').append(permission()).append('\'');
                builder.append(')');

                return builder;
            }
            
            public PermissionsDecoder sbeSkip()
            {
                skipPermission();

                return this;
            }
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

        public static int baseAssetId()
        {
            return 201;
        }

        public static int baseAssetSinceVersion()
        {
            return 0;
        }

        public static String baseAssetCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.UTF_8.name();
        }

        public static String baseAssetMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static int baseAssetHeaderLength()
        {
            return 1;
        }

        public int baseAssetLength()
        {
            final int limit = parentMessage.limit();
            return ((short)(buffer.getByte(limit) & 0xFF));
        }

        public int skipBaseAsset()
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int dataOffset = limit + headerLength;
            parentMessage.limit(dataOffset + dataLength);

            return dataLength;
        }

        public int getBaseAsset(final MutableDirectBuffer dst, final int dstOffset, final int length)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public int getBaseAsset(final byte[] dst, final int dstOffset, final int length)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public void wrapBaseAsset(final DirectBuffer wrapBuffer)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            parentMessage.limit(limit + headerLength + dataLength);
            wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
        }

        public String baseAsset()
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

        public static int quoteAssetId()
        {
            return 202;
        }

        public static int quoteAssetSinceVersion()
        {
            return 0;
        }

        public static String quoteAssetCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.UTF_8.name();
        }

        public static String quoteAssetMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static int quoteAssetHeaderLength()
        {
            return 1;
        }

        public int quoteAssetLength()
        {
            final int limit = parentMessage.limit();
            return ((short)(buffer.getByte(limit) & 0xFF));
        }

        public int skipQuoteAsset()
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int dataOffset = limit + headerLength;
            parentMessage.limit(dataOffset + dataLength);

            return dataLength;
        }

        public int getQuoteAsset(final MutableDirectBuffer dst, final int dstOffset, final int length)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public int getQuoteAsset(final byte[] dst, final int dstOffset, final int length)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public void wrapQuoteAsset(final DirectBuffer wrapBuffer)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            parentMessage.limit(limit + headerLength + dataLength);
            wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
        }

        public String quoteAsset()
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
            builder.append("status=");
            builder.append(this.status());
            builder.append('|');
            builder.append("baseAssetPrecision=");
            builder.append(this.baseAssetPrecision());
            builder.append('|');
            builder.append("quoteAssetPrecision=");
            builder.append(this.quoteAssetPrecision());
            builder.append('|');
            builder.append("baseCommissionPrecision=");
            builder.append(this.baseCommissionPrecision());
            builder.append('|');
            builder.append("quoteCommissionPrecision=");
            builder.append(this.quoteCommissionPrecision());
            builder.append('|');
            builder.append("orderTypes=");
            this.orderTypes().appendTo(builder);
            builder.append('|');
            builder.append("icebergAllowed=");
            builder.append(this.icebergAllowed());
            builder.append('|');
            builder.append("ocoAllowed=");
            builder.append(this.ocoAllowed());
            builder.append('|');
            builder.append("quoteOrderQtyMarketAllowed=");
            builder.append(this.quoteOrderQtyMarketAllowed());
            builder.append('|');
            builder.append("allowTrailingStop=");
            builder.append(this.allowTrailingStop());
            builder.append('|');
            builder.append("cancelReplaceAllowed=");
            builder.append(this.cancelReplaceAllowed());
            builder.append('|');
            builder.append("isSpotTradingAllowed=");
            builder.append(this.isSpotTradingAllowed());
            builder.append('|');
            builder.append("isMarginTradingAllowed=");
            builder.append(this.isMarginTradingAllowed());
            builder.append('|');
            builder.append("defaultSelfTradePreventionMode=");
            builder.append(this.defaultSelfTradePreventionMode());
            builder.append('|');
            builder.append("allowedSelfTradePreventionModes=");
            this.allowedSelfTradePreventionModes().appendTo(builder);
            builder.append('|');
            builder.append("filters=[");
            final int filtersOriginalOffset = filters.offset;
            final int filtersOriginalIndex = filters.index;
            final FiltersDecoder filters = this.filters();
            if (filters.count() > 0)
            {
                while (filters.hasNext())
                {
                    filters.next().appendTo(builder);
                    builder.append(',');
                }
                builder.setLength(builder.length() - 1);
            }
            filters.offset = filtersOriginalOffset;
            filters.index = filtersOriginalIndex;
            builder.append(']');
            builder.append('|');
            builder.append("permissions=[");
            final int permissionsOriginalOffset = permissions.offset;
            final int permissionsOriginalIndex = permissions.index;
            final PermissionsDecoder permissions = this.permissions();
            if (permissions.count() > 0)
            {
                while (permissions.hasNext())
                {
                    permissions.next().appendTo(builder);
                    builder.append(',');
                }
                builder.setLength(builder.length() - 1);
            }
            permissions.offset = permissionsOriginalOffset;
            permissions.index = permissionsOriginalIndex;
            builder.append(']');
            builder.append('|');
            builder.append("symbol=");
            builder.append('\'').append(symbol()).append('\'');
            builder.append('|');
            builder.append("baseAsset=");
            builder.append('\'').append(baseAsset()).append('\'');
            builder.append('|');
            builder.append("quoteAsset=");
            builder.append('\'').append(quoteAsset()).append('\'');
            builder.append(')');

            return builder;
        }
        
        public SymbolsDecoder sbeSkip()
        {
            FiltersDecoder filters = this.filters();
            if (filters.count() > 0)
            {
                while (filters.hasNext())
                {
                    filters.next();
                    filters.sbeSkip();
                }
            }
            PermissionsDecoder permissions = this.permissions();
            if (permissions.count() > 0)
            {
                while (permissions.hasNext())
                {
                    permissions.next();
                    permissions.sbeSkip();
                }
            }
            skipSymbol();
            skipBaseAsset();
            skipQuoteAsset();

            return this;
        }
    }

    private final SorsDecoder sors = new SorsDecoder(this);

    public static long sorsDecoderId()
    {
        return 103;
    }

    public static int sorsDecoderSinceVersion()
    {
        return 0;
    }

    public SorsDecoder sors()
    {
        sors.wrap(buffer);
        return sors;
    }

    public static final class SorsDecoder
        implements Iterable<SorsDecoder>, java.util.Iterator<SorsDecoder>
    {
        public static final int HEADER_SIZE = 6;
        private final ExchangeInfoResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;
        private final SorSymbolsDecoder sorSymbols;

        SorsDecoder(final ExchangeInfoResponseDecoder parentMessage)
        {
            this.parentMessage = parentMessage;
            sorSymbols = new SorSymbolsDecoder(parentMessage);
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

        public SorsDecoder next()
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
            return 0;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<SorsDecoder> iterator()
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

        public static long sorSymbolsDecoderId()
        {
            return 1;
        }

        public static int sorSymbolsDecoderSinceVersion()
        {
            return 0;
        }

        public SorSymbolsDecoder sorSymbols()
        {
            sorSymbols.wrap(buffer);
            return sorSymbols;
        }

        public static final class SorSymbolsDecoder
            implements Iterable<SorSymbolsDecoder>, java.util.Iterator<SorSymbolsDecoder>
        {
            public static final int HEADER_SIZE = 6;
            private final ExchangeInfoResponseDecoder parentMessage;
            private DirectBuffer buffer;
            private int count;
            private int index;
            private int offset;
            private int blockLength;

            SorSymbolsDecoder(final ExchangeInfoResponseDecoder parentMessage)
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

            public SorSymbolsDecoder next()
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
                return 0;
            }

            public int actingBlockLength()
            {
                return blockLength;
            }

            public int count()
            {
                return count;
            }

            public java.util.Iterator<SorSymbolsDecoder> iterator()
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
                builder.append("symbol=");
                builder.append('\'').append(symbol()).append('\'');
                builder.append(')');

                return builder;
            }
            
            public SorSymbolsDecoder sbeSkip()
            {
                skipSymbol();

                return this;
            }
        }

        public static int baseAssetId()
        {
            return 200;
        }

        public static int baseAssetSinceVersion()
        {
            return 0;
        }

        public static String baseAssetCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.UTF_8.name();
        }

        public static String baseAssetMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static int baseAssetHeaderLength()
        {
            return 1;
        }

        public int baseAssetLength()
        {
            final int limit = parentMessage.limit();
            return ((short)(buffer.getByte(limit) & 0xFF));
        }

        public int skipBaseAsset()
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int dataOffset = limit + headerLength;
            parentMessage.limit(dataOffset + dataLength);

            return dataLength;
        }

        public int getBaseAsset(final MutableDirectBuffer dst, final int dstOffset, final int length)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public int getBaseAsset(final byte[] dst, final int dstOffset, final int length)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public void wrapBaseAsset(final DirectBuffer wrapBuffer)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            parentMessage.limit(limit + headerLength + dataLength);
            wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
        }

        public String baseAsset()
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
            builder.append("sorSymbols=[");
            final int sorSymbolsOriginalOffset = sorSymbols.offset;
            final int sorSymbolsOriginalIndex = sorSymbols.index;
            final SorSymbolsDecoder sorSymbols = this.sorSymbols();
            if (sorSymbols.count() > 0)
            {
                while (sorSymbols.hasNext())
                {
                    sorSymbols.next().appendTo(builder);
                    builder.append(',');
                }
                builder.setLength(builder.length() - 1);
            }
            sorSymbols.offset = sorSymbolsOriginalOffset;
            sorSymbols.index = sorSymbolsOriginalIndex;
            builder.append(']');
            builder.append('|');
            builder.append("baseAsset=");
            builder.append('\'').append(baseAsset()).append('\'');
            builder.append(')');

            return builder;
        }
        
        public SorsDecoder sbeSkip()
        {
            SorSymbolsDecoder sorSymbols = this.sorSymbols();
            if (sorSymbols.count() > 0)
            {
                while (sorSymbols.hasNext())
                {
                    sorSymbols.next();
                    sorSymbols.sbeSkip();
                }
            }
            skipBaseAsset();

            return this;
        }
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final ExchangeInfoResponseDecoder decoder = new ExchangeInfoResponseDecoder();
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
        builder.append("[ExchangeInfoResponse](sbeTemplateId=");
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
        builder.append("rateLimits=[");
        final int rateLimitsOriginalOffset = rateLimits.offset;
        final int rateLimitsOriginalIndex = rateLimits.index;
        final RateLimitsDecoder rateLimits = this.rateLimits();
        if (rateLimits.count() > 0)
        {
            while (rateLimits.hasNext())
            {
                rateLimits.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        rateLimits.offset = rateLimitsOriginalOffset;
        rateLimits.index = rateLimitsOriginalIndex;
        builder.append(']');
        builder.append('|');
        builder.append("exchangeFilters=[");
        final int exchangeFiltersOriginalOffset = exchangeFilters.offset;
        final int exchangeFiltersOriginalIndex = exchangeFilters.index;
        final ExchangeFiltersDecoder exchangeFilters = this.exchangeFilters();
        if (exchangeFilters.count() > 0)
        {
            while (exchangeFilters.hasNext())
            {
                exchangeFilters.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        exchangeFilters.offset = exchangeFiltersOriginalOffset;
        exchangeFilters.index = exchangeFiltersOriginalIndex;
        builder.append(']');
        builder.append('|');
        builder.append("symbols=[");
        final int symbolsOriginalOffset = symbols.offset;
        final int symbolsOriginalIndex = symbols.index;
        final SymbolsDecoder symbols = this.symbols();
        if (symbols.count() > 0)
        {
            while (symbols.hasNext())
            {
                symbols.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        symbols.offset = symbolsOriginalOffset;
        symbols.index = symbolsOriginalIndex;
        builder.append(']');
        builder.append('|');
        builder.append("sors=[");
        final int sorsOriginalOffset = sors.offset;
        final int sorsOriginalIndex = sors.index;
        final SorsDecoder sors = this.sors();
        if (sors.count() > 0)
        {
            while (sors.hasNext())
            {
                sors.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        sors.offset = sorsOriginalOffset;
        sors.index = sorsOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public ExchangeInfoResponseDecoder sbeSkip()
    {
        sbeRewind();
        RateLimitsDecoder rateLimits = this.rateLimits();
        if (rateLimits.count() > 0)
        {
            while (rateLimits.hasNext())
            {
                rateLimits.next();
                rateLimits.sbeSkip();
            }
        }
        ExchangeFiltersDecoder exchangeFilters = this.exchangeFilters();
        if (exchangeFilters.count() > 0)
        {
            while (exchangeFilters.hasNext())
            {
                exchangeFilters.next();
                exchangeFilters.sbeSkip();
            }
        }
        SymbolsDecoder symbols = this.symbols();
        if (symbols.count() > 0)
        {
            while (symbols.hasNext())
            {
                symbols.next();
                symbols.sbeSkip();
            }
        }
        SorsDecoder sors = this.sors();
        if (sors.count() > 0)
        {
            while (sors.hasNext())
            {
                sors.next();
                sors.sbeSkip();
            }
        }

        return this;
    }
}
