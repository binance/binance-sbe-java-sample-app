/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class CancelOpenOrdersResponseDecoder
{
    public static final int BLOCK_LENGTH = 0;
    public static final int TEMPLATE_ID = 306;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final CancelOpenOrdersResponseDecoder parentMessage = this;
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

    public CancelOpenOrdersResponseDecoder wrap(
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

    public CancelOpenOrdersResponseDecoder wrapAndApplyHeader(
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

    public CancelOpenOrdersResponseDecoder sbeRewind()
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

    private final ResponsesDecoder responses = new ResponsesDecoder(this);

    public static long responsesDecoderId()
    {
        return 100;
    }

    public static int responsesDecoderSinceVersion()
    {
        return 0;
    }

    public ResponsesDecoder responses()
    {
        responses.wrap(buffer);
        return responses;
    }

    public static final class ResponsesDecoder
        implements Iterable<ResponsesDecoder>, java.util.Iterator<ResponsesDecoder>
    {
        public static final int HEADER_SIZE = 6;
        private final CancelOpenOrdersResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        ResponsesDecoder(final CancelOpenOrdersResponseDecoder parentMessage)
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

        public ResponsesDecoder next()
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

        public java.util.Iterator<ResponsesDecoder> iterator()
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

        public static int responseId()
        {
            return 200;
        }

        public static int responseSinceVersion()
        {
            return 0;
        }

        public static String responseMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static int responseHeaderLength()
        {
            return 2;
        }

        public int responseLength()
        {
            final int limit = parentMessage.limit();
            return (buffer.getShort(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        }

        public int skipResponse()
        {
            final int headerLength = 2;
            final int limit = parentMessage.limit();
            final int dataLength = (buffer.getShort(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
            final int dataOffset = limit + headerLength;
            parentMessage.limit(dataOffset + dataLength);

            return dataLength;
        }

        public int getResponse(final MutableDirectBuffer dst, final int dstOffset, final int length)
        {
            final int headerLength = 2;
            final int limit = parentMessage.limit();
            final int dataLength = (buffer.getShort(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public int getResponse(final byte[] dst, final int dstOffset, final int length)
        {
            final int headerLength = 2;
            final int limit = parentMessage.limit();
            final int dataLength = (buffer.getShort(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public void wrapResponse(final DirectBuffer wrapBuffer)
        {
            final int headerLength = 2;
            final int limit = parentMessage.limit();
            final int dataLength = (buffer.getShort(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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
            builder.append("response=");
            builder.append(skipResponse()).append(" bytes of raw data");
            builder.append(')');

            return builder;
        }
        
        public ResponsesDecoder sbeSkip()
        {
            skipResponse();

            return this;
        }
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final CancelOpenOrdersResponseDecoder decoder = new CancelOpenOrdersResponseDecoder();
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
        builder.append("[CancelOpenOrdersResponse](sbeTemplateId=");
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
        builder.append("responses=[");
        final int responsesOriginalOffset = responses.offset;
        final int responsesOriginalIndex = responses.index;
        final ResponsesDecoder responses = this.responses();
        if (responses.count() > 0)
        {
            while (responses.hasNext())
            {
                responses.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        responses.offset = responsesOriginalOffset;
        responses.index = responsesOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public CancelOpenOrdersResponseDecoder sbeSkip()
    {
        sbeRewind();
        ResponsesDecoder responses = this.responses();
        if (responses.count() > 0)
        {
            while (responses.hasNext())
            {
                responses.next();
                responses.sbeSkip();
            }
        }

        return this;
    }
}
