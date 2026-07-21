/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class ReferencePriceCalculationResponseDecoder
{
    public static final int BLOCK_LENGTH = 17;
    public static final int TEMPLATE_ID = 218;
    public static final int SCHEMA_ID = 3;
    public static final int SCHEMA_VERSION = 4;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final ReferencePriceCalculationResponseDecoder parentMessage = this;
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

    public ReferencePriceCalculationResponseDecoder wrap(
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

    public ReferencePriceCalculationResponseDecoder wrapAndApplyHeader(
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

    public ReferencePriceCalculationResponseDecoder sbeRewind()
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

    public static int calculationTypeId()
    {
        return 1;
    }

    public static int calculationTypeSinceVersion()
    {
        return 3;
    }

    public static int calculationTypeEncodingOffset()
    {
        return 0;
    }

    public static int calculationTypeEncodingLength()
    {
        return 1;
    }

    public static String calculationTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short calculationTypeRaw()
    {
        if (parentMessage.actingVersion < 3)
        {
            return (short)255;
        }

        return ((short)(buffer.getByte(offset + 0) & 0xFF));
    }

    public CalculationType calculationType()
    {
        if (parentMessage.actingVersion < 3)
        {
            return CalculationType.NULL_VAL;
        }

        return CalculationType.get(((short)(buffer.getByte(offset + 0) & 0xFF)));
    }


    public static int externalCalculationIdId()
    {
        return 2;
    }

    public static int externalCalculationIdSinceVersion()
    {
        return 0;
    }

    public static int externalCalculationIdEncodingOffset()
    {
        return 1;
    }

    public static int externalCalculationIdEncodingLength()
    {
        return 8;
    }

    public static String externalCalculationIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long externalCalculationIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long externalCalculationIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long externalCalculationIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long externalCalculationId()
    {
        return buffer.getLong(offset + 1, BYTE_ORDER);
    }


    public static int bucketCountId()
    {
        return 3;
    }

    public static int bucketCountSinceVersion()
    {
        return 0;
    }

    public static int bucketCountEncodingOffset()
    {
        return 9;
    }

    public static int bucketCountEncodingLength()
    {
        return 4;
    }

    public static String bucketCountMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long bucketCountNullValue()
    {
        return 4294967295L;
    }

    public static long bucketCountMinValue()
    {
        return 0L;
    }

    public static long bucketCountMaxValue()
    {
        return 4294967294L;
    }

    public long bucketCount()
    {
        return (buffer.getInt(offset + 9, BYTE_ORDER) & 0xFFFF_FFFFL);
    }


    public static int bucketWidthMsId()
    {
        return 4;
    }

    public static int bucketWidthMsSinceVersion()
    {
        return 0;
    }

    public static int bucketWidthMsEncodingOffset()
    {
        return 13;
    }

    public static int bucketWidthMsEncodingLength()
    {
        return 4;
    }

    public static String bucketWidthMsMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long bucketWidthMsNullValue()
    {
        return 4294967295L;
    }

    public static long bucketWidthMsMinValue()
    {
        return 0L;
    }

    public static long bucketWidthMsMaxValue()
    {
        return 4294967294L;
    }

    public long bucketWidthMs()
    {
        return (buffer.getInt(offset + 13, BYTE_ORDER) & 0xFFFF_FFFFL);
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

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final ReferencePriceCalculationResponseDecoder decoder = new ReferencePriceCalculationResponseDecoder();
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
        builder.append("[ReferencePriceCalculationResponse](sbeTemplateId=");
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
        builder.append("calculationType=");
        builder.append(this.calculationType());
        builder.append('|');
        builder.append("externalCalculationId=");
        builder.append(this.externalCalculationId());
        builder.append('|');
        builder.append("bucketCount=");
        builder.append(this.bucketCount());
        builder.append('|');
        builder.append("bucketWidthMs=");
        builder.append(this.bucketWidthMs());
        builder.append('|');
        builder.append("symbol=");
        builder.append('\'').append(symbol()).append('\'');

        limit(originalLimit);

        return builder;
    }
    
    public ReferencePriceCalculationResponseDecoder sbeSkip()
    {
        sbeRewind();
        skipSymbol();

        return this;
    }
}
