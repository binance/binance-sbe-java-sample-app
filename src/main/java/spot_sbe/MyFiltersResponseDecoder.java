/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class MyFiltersResponseDecoder
{
    public static final int BLOCK_LENGTH = 0;
    public static final int TEMPLATE_ID = 105;
    public static final int SCHEMA_ID = 3;
    public static final int SCHEMA_VERSION = 1;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final MyFiltersResponseDecoder parentMessage = this;
    private DirectBuffer buffer;
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

    public int offset()
    {
        return offset;
    }

    public MyFiltersResponseDecoder wrap(
        final DirectBuffer buffer,
        final int offset,
        final int actingBlockLength,
        final int actingVersion)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        this.actingBlockLength = actingBlockLength;
        this.actingVersion = actingVersion;
        limit(offset + actingBlockLength);

        return this;
    }

    public MyFiltersResponseDecoder wrapAndApplyHeader(
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

    public MyFiltersResponseDecoder sbeRewind()
    {
        return wrap(buffer, offset, actingBlockLength, actingVersion);
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

    private final ExchangeFiltersDecoder exchangeFilters = new ExchangeFiltersDecoder(this);

    public static long exchangeFiltersDecoderId()
    {
        return 100;
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
        private final MyFiltersResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        ExchangeFiltersDecoder(final MyFiltersResponseDecoder parentMessage)
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
            blockLength = (buffer.getShort(limit + 0, BYTE_ORDER) & 0xFFFF);
            count = (int)(buffer.getInt(limit + 2, BYTE_ORDER) & 0xFFFF_FFFFL);
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

        public int actingVersion()
        {
            return parentMessage.actingVersion;
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

    private final SymbolFiltersDecoder symbolFilters = new SymbolFiltersDecoder(this);

    public static long symbolFiltersDecoderId()
    {
        return 101;
    }

    public static int symbolFiltersDecoderSinceVersion()
    {
        return 0;
    }

    public SymbolFiltersDecoder symbolFilters()
    {
        symbolFilters.wrap(buffer);
        return symbolFilters;
    }

    public static final class SymbolFiltersDecoder
        implements Iterable<SymbolFiltersDecoder>, java.util.Iterator<SymbolFiltersDecoder>
    {
        public static final int HEADER_SIZE = 6;
        private final MyFiltersResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        SymbolFiltersDecoder(final MyFiltersResponseDecoder parentMessage)
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
            blockLength = (buffer.getShort(limit + 0, BYTE_ORDER) & 0xFFFF);
            count = (int)(buffer.getInt(limit + 2, BYTE_ORDER) & 0xFFFF_FFFFL);
        }

        public SymbolFiltersDecoder next()
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

        public int actingVersion()
        {
            return parentMessage.actingVersion;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<SymbolFiltersDecoder> iterator()
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
        
        public SymbolFiltersDecoder sbeSkip()
        {
            skipFilter();

            return this;
        }
    }

    private final AssetFiltersDecoder assetFilters = new AssetFiltersDecoder(this);

    public static long assetFiltersDecoderId()
    {
        return 102;
    }

    public static int assetFiltersDecoderSinceVersion()
    {
        return 0;
    }

    public AssetFiltersDecoder assetFilters()
    {
        assetFilters.wrap(buffer);
        return assetFilters;
    }

    public static final class AssetFiltersDecoder
        implements Iterable<AssetFiltersDecoder>, java.util.Iterator<AssetFiltersDecoder>
    {
        public static final int HEADER_SIZE = 6;
        private final MyFiltersResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        AssetFiltersDecoder(final MyFiltersResponseDecoder parentMessage)
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
            blockLength = (buffer.getShort(limit + 0, BYTE_ORDER) & 0xFFFF);
            count = (int)(buffer.getInt(limit + 2, BYTE_ORDER) & 0xFFFF_FFFFL);
        }

        public AssetFiltersDecoder next()
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

        public int actingVersion()
        {
            return parentMessage.actingVersion;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<AssetFiltersDecoder> iterator()
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
        
        public AssetFiltersDecoder sbeSkip()
        {
            skipFilter();

            return this;
        }
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final MyFiltersResponseDecoder decoder = new MyFiltersResponseDecoder();
        decoder.wrap(buffer, offset, actingBlockLength, actingVersion);

        return decoder.appendTo(new StringBuilder()).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        if (null == buffer)
        {
            return builder;
        }

        final int originalLimit = limit();
        limit(offset + actingBlockLength);
        builder.append("[MyFiltersResponse](sbeTemplateId=");
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
        builder.append("symbolFilters=[");
        final int symbolFiltersOriginalOffset = symbolFilters.offset;
        final int symbolFiltersOriginalIndex = symbolFilters.index;
        final SymbolFiltersDecoder symbolFilters = this.symbolFilters();
        if (symbolFilters.count() > 0)
        {
            while (symbolFilters.hasNext())
            {
                symbolFilters.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        symbolFilters.offset = symbolFiltersOriginalOffset;
        symbolFilters.index = symbolFiltersOriginalIndex;
        builder.append(']');
        builder.append('|');
        builder.append("assetFilters=[");
        final int assetFiltersOriginalOffset = assetFilters.offset;
        final int assetFiltersOriginalIndex = assetFilters.index;
        final AssetFiltersDecoder assetFilters = this.assetFilters();
        if (assetFilters.count() > 0)
        {
            while (assetFilters.hasNext())
            {
                assetFilters.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        assetFilters.offset = assetFiltersOriginalOffset;
        assetFilters.index = assetFiltersOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public MyFiltersResponseDecoder sbeSkip()
    {
        sbeRewind();
        ExchangeFiltersDecoder exchangeFilters = this.exchangeFilters();
        if (exchangeFilters.count() > 0)
        {
            while (exchangeFilters.hasNext())
            {
                exchangeFilters.next();
                exchangeFilters.sbeSkip();
            }
        }
        SymbolFiltersDecoder symbolFilters = this.symbolFilters();
        if (symbolFilters.count() > 0)
        {
            while (symbolFilters.hasNext())
            {
                symbolFilters.next();
                symbolFilters.sbeSkip();
            }
        }
        AssetFiltersDecoder assetFilters = this.assetFilters();
        if (assetFilters.count() > 0)
        {
            while (assetFilters.hasNext())
            {
                assetFilters.next();
                assetFilters.sbeSkip();
            }
        }

        return this;
    }
}
