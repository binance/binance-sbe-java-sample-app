/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class WebSocketSessionStatusResponseDecoder
{
    public static final int BLOCK_LENGTH = 25;
    public static final int TEMPLATE_ID = 52;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final WebSocketSessionStatusResponseDecoder parentMessage = this;
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

    public WebSocketSessionStatusResponseDecoder wrap(
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

    public WebSocketSessionStatusResponseDecoder wrapAndApplyHeader(
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

    public WebSocketSessionStatusResponseDecoder sbeRewind()
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

    public static int authorizedSinceId()
    {
        return 1;
    }

    public static int authorizedSinceSinceVersion()
    {
        return 0;
    }

    public static int authorizedSinceEncodingOffset()
    {
        return 0;
    }

    public static int authorizedSinceEncodingLength()
    {
        return 8;
    }

    public static String authorizedSinceMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long authorizedSinceNullValue()
    {
        return -9223372036854775808L;
    }

    public static long authorizedSinceMinValue()
    {
        return -9223372036854775807L;
    }

    public static long authorizedSinceMaxValue()
    {
        return 9223372036854775807L;
    }

    public long authorizedSince()
    {
        return buffer.getLong(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int connectedSinceId()
    {
        return 2;
    }

    public static int connectedSinceSinceVersion()
    {
        return 0;
    }

    public static int connectedSinceEncodingOffset()
    {
        return 8;
    }

    public static int connectedSinceEncodingLength()
    {
        return 8;
    }

    public static String connectedSinceMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long connectedSinceNullValue()
    {
        return -9223372036854775808L;
    }

    public static long connectedSinceMinValue()
    {
        return -9223372036854775807L;
    }

    public static long connectedSinceMaxValue()
    {
        return 9223372036854775807L;
    }

    public long connectedSince()
    {
        return buffer.getLong(offset + 8, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int returnRateLimitsId()
    {
        return 3;
    }

    public static int returnRateLimitsSinceVersion()
    {
        return 0;
    }

    public static int returnRateLimitsEncodingOffset()
    {
        return 16;
    }

    public static int returnRateLimitsEncodingLength()
    {
        return 1;
    }

    public static String returnRateLimitsMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short returnRateLimitsRaw()
    {
        return ((short)(buffer.getByte(offset + 16) & 0xFF));
    }

    public BoolEnum returnRateLimits()
    {
        return BoolEnum.get(((short)(buffer.getByte(offset + 16) & 0xFF)));
    }


    public static int serverTimeId()
    {
        return 4;
    }

    public static int serverTimeSinceVersion()
    {
        return 0;
    }

    public static int serverTimeEncodingOffset()
    {
        return 17;
    }

    public static int serverTimeEncodingLength()
    {
        return 8;
    }

    public static String serverTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long serverTimeNullValue()
    {
        return -9223372036854775808L;
    }

    public static long serverTimeMinValue()
    {
        return -9223372036854775807L;
    }

    public static long serverTimeMaxValue()
    {
        return 9223372036854775807L;
    }

    public long serverTime()
    {
        return buffer.getLong(offset + 17, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int apiKeyId()
    {
        return 200;
    }

    public static int apiKeySinceVersion()
    {
        return 0;
    }

    public static String apiKeyCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.UTF_8.name();
    }

    public static String apiKeyMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static int apiKeyHeaderLength()
    {
        return 2;
    }

    public int apiKeyLength()
    {
        final int limit = parentMessage.limit();
        return (buffer.getShort(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
    }

    public int skipApiKey()
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        final int dataOffset = limit + headerLength;
        parentMessage.limit(dataOffset + dataLength);

        return dataLength;
    }

    public int getApiKey(final MutableDirectBuffer dst, final int dstOffset, final int length)
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public int getApiKey(final byte[] dst, final int dstOffset, final int length)
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public void wrapApiKey(final DirectBuffer wrapBuffer)
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        parentMessage.limit(limit + headerLength + dataLength);
        wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
    }

    public String apiKey()
    {
        final int headerLength = 2;
        final int limit = parentMessage.limit();
        final int dataLength = (buffer.getShort(limit, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        parentMessage.limit(limit + headerLength + dataLength);

        if (0 == dataLength)
        {
            return "";
        }

        final byte[] tmp = new byte[dataLength];
        buffer.getBytes(limit + headerLength, tmp, 0, dataLength);

        return new String(tmp, java.nio.charset.StandardCharsets.UTF_8);
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final WebSocketSessionStatusResponseDecoder decoder = new WebSocketSessionStatusResponseDecoder();
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
        builder.append("[WebSocketSessionStatusResponse](sbeTemplateId=");
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
        builder.append("authorizedSince=");
        builder.append(this.authorizedSince());
        builder.append('|');
        builder.append("connectedSince=");
        builder.append(this.connectedSince());
        builder.append('|');
        builder.append("returnRateLimits=");
        builder.append(this.returnRateLimits());
        builder.append('|');
        builder.append("serverTime=");
        builder.append(this.serverTime());
        builder.append('|');
        builder.append("apiKey=");
        builder.append('\'').append(apiKey()).append('\'');

        limit(originalLimit);

        return builder;
    }
    
    public WebSocketSessionStatusResponseDecoder sbeSkip()
    {
        sbeRewind();
        skipApiKey();

        return this;
    }
}
