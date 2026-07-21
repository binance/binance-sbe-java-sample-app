/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class ExternalLockUpdateEventDecoder
{
    public static final int BLOCK_LENGTH = 27;
    public static final int TEMPLATE_ID = 604;
    public static final int SCHEMA_ID = 3;
    public static final int SCHEMA_VERSION = 4;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final ExternalLockUpdateEventDecoder parentMessage = this;
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

    public ExternalLockUpdateEventDecoder wrap(
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

    public ExternalLockUpdateEventDecoder wrapAndApplyHeader(
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

    public ExternalLockUpdateEventDecoder sbeRewind()
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

    public static int eventTimeId()
    {
        return 1;
    }

    public static int eventTimeSinceVersion()
    {
        return 0;
    }

    public static int eventTimeEncodingOffset()
    {
        return 0;
    }

    public static int eventTimeEncodingLength()
    {
        return 8;
    }

    public static String eventTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long eventTimeNullValue()
    {
        return -9223372036854775808L;
    }

    public static long eventTimeMinValue()
    {
        return -9223372036854775807L;
    }

    public static long eventTimeMaxValue()
    {
        return 9223372036854775807L;
    }

    public long eventTime()
    {
        return buffer.getLong(offset + 0, BYTE_ORDER);
    }


    public static int clearTimeId()
    {
        return 2;
    }

    public static int clearTimeSinceVersion()
    {
        return 0;
    }

    public static int clearTimeEncodingOffset()
    {
        return 8;
    }

    public static int clearTimeEncodingLength()
    {
        return 8;
    }

    public static String clearTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long clearTimeNullValue()
    {
        return -9223372036854775808L;
    }

    public static long clearTimeMinValue()
    {
        return -9223372036854775807L;
    }

    public static long clearTimeMaxValue()
    {
        return 9223372036854775807L;
    }

    public long clearTime()
    {
        return buffer.getLong(offset + 8, BYTE_ORDER);
    }


    public static int qtyExponentId()
    {
        return 3;
    }

    public static int qtyExponentSinceVersion()
    {
        return 0;
    }

    public static int qtyExponentEncodingOffset()
    {
        return 16;
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
        return buffer.getByte(offset + 16);
    }


    public static int lockedQtyDeltaId()
    {
        return 4;
    }

    public static int lockedQtyDeltaSinceVersion()
    {
        return 0;
    }

    public static int lockedQtyDeltaEncodingOffset()
    {
        return 17;
    }

    public static int lockedQtyDeltaEncodingLength()
    {
        return 8;
    }

    public static String lockedQtyDeltaMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long lockedQtyDeltaNullValue()
    {
        return -9223372036854775808L;
    }

    public static long lockedQtyDeltaMinValue()
    {
        return -9223372036854775807L;
    }

    public static long lockedQtyDeltaMaxValue()
    {
        return 9223372036854775807L;
    }

    public long lockedQtyDelta()
    {
        return buffer.getLong(offset + 17, BYTE_ORDER);
    }


    public static int subscriptionIdId()
    {
        return 5;
    }

    public static int subscriptionIdSinceVersion()
    {
        return 1;
    }

    public static int subscriptionIdEncodingOffset()
    {
        return 25;
    }

    public static int subscriptionIdEncodingLength()
    {
        return 2;
    }

    public static String subscriptionIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static int subscriptionIdNullValue()
    {
        return 65535;
    }

    public static int subscriptionIdMinValue()
    {
        return 0;
    }

    public static int subscriptionIdMaxValue()
    {
        return 65534;
    }

    public int subscriptionId()
    {
        if (parentMessage.actingVersion < 1)
        {
            return 65535;
        }

        return (buffer.getShort(offset + 25, BYTE_ORDER) & 0xFFFF);
    }


    public static int assetId()
    {
        return 200;
    }

    public static int assetSinceVersion()
    {
        return 0;
    }

    public static String assetCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.UTF_8.name();
    }

    public static String assetMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static int assetHeaderLength()
    {
        return 1;
    }

    public int assetLength()
    {
        final int limit = parentMessage.limit();
        return ((short)(buffer.getByte(limit) & 0xFF));
    }

    public int skipAsset()
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int dataOffset = limit + headerLength;
        parentMessage.limit(dataOffset + dataLength);

        return dataLength;
    }

    public int getAsset(final MutableDirectBuffer dst, final int dstOffset, final int length)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public int getAsset(final byte[] dst, final int dstOffset, final int length)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public void wrapAsset(final DirectBuffer wrapBuffer)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        parentMessage.limit(limit + headerLength + dataLength);
        wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
    }

    public String asset()
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

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final ExternalLockUpdateEventDecoder decoder = new ExternalLockUpdateEventDecoder();
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
        builder.append("[ExternalLockUpdateEvent](sbeTemplateId=");
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
        builder.append("eventTime=");
        builder.append(this.eventTime());
        builder.append('|');
        builder.append("clearTime=");
        builder.append(this.clearTime());
        builder.append('|');
        builder.append("qtyExponent=");
        builder.append(this.qtyExponent());
        builder.append('|');
        builder.append("lockedQtyDelta=");
        builder.append(this.lockedQtyDelta());
        builder.append('|');
        builder.append("subscriptionId=");
        builder.append(this.subscriptionId());
        builder.append('|');
        builder.append("asset=");
        builder.append('\'').append(asset()).append('\'');

        limit(originalLimit);

        return builder;
    }
    
    public ExternalLockUpdateEventDecoder sbeSkip()
    {
        sbeRewind();
        skipAsset();

        return this;
    }
}
