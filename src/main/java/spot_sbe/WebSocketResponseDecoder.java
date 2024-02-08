/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;


/**
 * Message wrapper for WebSocket API.
 */
@SuppressWarnings("all")
public final class WebSocketResponseDecoder
{
    public static final int BLOCK_LENGTH = 3;
    public static final int TEMPLATE_ID = 50;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final WebSocketResponseDecoder parentMessage = this;
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

    public WebSocketResponseDecoder wrap(
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

    public WebSocketResponseDecoder wrapAndApplyHeader(
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

    public WebSocketResponseDecoder sbeRewind()
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

    public static int sbeSchemaIdVersionDeprecatedId()
    {
        return 1;
    }

    public static int sbeSchemaIdVersionDeprecatedSinceVersion()
    {
        return 0;
    }

    public static int sbeSchemaIdVersionDeprecatedEncodingOffset()
    {
        return 0;
    }

    public static int sbeSchemaIdVersionDeprecatedEncodingLength()
    {
        return 1;
    }

    public static String sbeSchemaIdVersionDeprecatedMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short sbeSchemaIdVersionDeprecatedRaw()
    {
        return ((short)(buffer.getByte(offset + 0) & 0xFF));
    }

    public BoolEnum sbeSchemaIdVersionDeprecated()
    {
        return BoolEnum.get(((short)(buffer.getByte(offset + 0) & 0xFF)));
    }


    public static int statusId()
    {
        return 2;
    }

    public static int statusSinceVersion()
    {
        return 0;
    }

    public static int statusEncodingOffset()
    {
        return 1;
    }

    public static int statusEncodingLength()
    {
        return 2;
    }

    public static String statusMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static int statusNullValue()
    {
        return 65535;
    }

    public static int statusMinValue()
    {
        return 0;
    }

    public static int statusMaxValue()
    {
        return 65534;
    }

    public int status()
    {
        return (buffer.getShort(offset + 1, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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
        public static final int HEADER_SIZE = 4;
        private final WebSocketResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        RateLimitsDecoder(final WebSocketResponseDecoder parentMessage)
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
            count = (buffer.getShort(limit + 2, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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

        public static int countMinValue()
        {
            return 0;
        }

        public static int countMaxValue()
        {
            return 65534;
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 19;
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


        public static int currentId()
        {
            return 5;
        }

        public static int currentSinceVersion()
        {
            return 0;
        }

        public static int currentEncodingOffset()
        {
            return 11;
        }

        public static int currentEncodingLength()
        {
            return 8;
        }

        public static String currentMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long currentNullValue()
        {
            return -9223372036854775808L;
        }

        public static long currentMinValue()
        {
            return -9223372036854775807L;
        }

        public static long currentMaxValue()
        {
            return 9223372036854775807L;
        }

        public long current()
        {
            return buffer.getLong(offset + 11, java.nio.ByteOrder.LITTLE_ENDIAN);
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
            builder.append('|');
            builder.append("current=");
            builder.append(this.current());
            builder.append(')');

            return builder;
        }
        
        public RateLimitsDecoder sbeSkip()
        {

            return this;
        }
    }

    public static int idId()
    {
        return 200;
    }

    public static int idSinceVersion()
    {
        return 0;
    }

    public static String idCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.UTF_8.name();
    }

    public static String idMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static int idHeaderLength()
    {
        return 1;
    }

    public int idLength()
    {
        final int limit = parentMessage.limit();
        return ((short)(buffer.getByte(limit) & 0xFF));
    }

    public int skipId()
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int dataOffset = limit + headerLength;
        parentMessage.limit(dataOffset + dataLength);

        return dataLength;
    }

    public int getId(final MutableDirectBuffer dst, final int dstOffset, final int length)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public int getId(final byte[] dst, final int dstOffset, final int length)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public void wrapId(final DirectBuffer wrapBuffer)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        parentMessage.limit(limit + headerLength + dataLength);
        wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
    }

    public String id()
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

    public static int resultId()
    {
        return 201;
    }

    public static int resultSinceVersion()
    {
        return 0;
    }

    public static String resultMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static int resultHeaderLength()
    {
        return 4;
    }

    public int resultLength()
    {
        final int limit = parentMessage.limit();
        return (int)(buffer.getInt(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
    }

    public int skipResult()
    {
        final int headerLength = 4;
        final int limit = parentMessage.limit();
        final int dataLength = (int)(buffer.getInt(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
        final int dataOffset = limit + headerLength;
        parentMessage.limit(dataOffset + dataLength);

        return dataLength;
    }

    public int getResult(final MutableDirectBuffer dst, final int dstOffset, final int length)
    {
        final int headerLength = 4;
        final int limit = parentMessage.limit();
        final int dataLength = (int)(buffer.getInt(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public int getResult(final byte[] dst, final int dstOffset, final int length)
    {
        final int headerLength = 4;
        final int limit = parentMessage.limit();
        final int dataLength = (int)(buffer.getInt(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public void wrapResult(final DirectBuffer wrapBuffer)
    {
        final int headerLength = 4;
        final int limit = parentMessage.limit();
        final int dataLength = (int)(buffer.getInt(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
        parentMessage.limit(limit + headerLength + dataLength);
        wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final WebSocketResponseDecoder decoder = new WebSocketResponseDecoder();
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
        builder.append("[WebSocketResponse](sbeTemplateId=");
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
        builder.append("sbeSchemaIdVersionDeprecated=");
        builder.append(this.sbeSchemaIdVersionDeprecated());
        builder.append('|');
        builder.append("status=");
        builder.append(this.status());
        builder.append('|');
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
        builder.append("id=");
        builder.append('\'').append(id()).append('\'');
        builder.append('|');
        builder.append("result=");
        builder.append(skipResult()).append(" bytes of raw data");

        limit(originalLimit);

        return builder;
    }
    
    public WebSocketResponseDecoder sbeSkip()
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
        skipId();
        skipResult();

        return this;
    }
}
