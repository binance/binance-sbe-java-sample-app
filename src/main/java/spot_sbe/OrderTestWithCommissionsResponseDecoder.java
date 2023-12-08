/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class OrderTestWithCommissionsResponseDecoder
{
    public static final int BLOCK_LENGTH = 44;
    public static final int TEMPLATE_ID = 315;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final OrderTestWithCommissionsResponseDecoder parentMessage = this;
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

    public OrderTestWithCommissionsResponseDecoder wrap(
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

    public OrderTestWithCommissionsResponseDecoder wrapAndApplyHeader(
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

    public OrderTestWithCommissionsResponseDecoder sbeRewind()
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

    public static int commissionExponentId()
    {
        return 1;
    }

    public static int commissionExponentSinceVersion()
    {
        return 0;
    }

    public static int commissionExponentEncodingOffset()
    {
        return 0;
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
        return buffer.getByte(offset + 0);
    }


    public static int discountExponentId()
    {
        return 2;
    }

    public static int discountExponentSinceVersion()
    {
        return 0;
    }

    public static int discountExponentEncodingOffset()
    {
        return 1;
    }

    public static int discountExponentEncodingLength()
    {
        return 1;
    }

    public static String discountExponentMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static byte discountExponentNullValue()
    {
        return (byte)-128;
    }

    public static byte discountExponentMinValue()
    {
        return (byte)-127;
    }

    public static byte discountExponentMaxValue()
    {
        return (byte)127;
    }

    public byte discountExponent()
    {
        return buffer.getByte(offset + 1);
    }


    public static int standardCommissionForOrderMakerId()
    {
        return 3;
    }

    public static int standardCommissionForOrderMakerSinceVersion()
    {
        return 0;
    }

    public static int standardCommissionForOrderMakerEncodingOffset()
    {
        return 2;
    }

    public static int standardCommissionForOrderMakerEncodingLength()
    {
        return 8;
    }

    public static String standardCommissionForOrderMakerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long standardCommissionForOrderMakerNullValue()
    {
        return -9223372036854775808L;
    }

    public static long standardCommissionForOrderMakerMinValue()
    {
        return -9223372036854775807L;
    }

    public static long standardCommissionForOrderMakerMaxValue()
    {
        return 9223372036854775807L;
    }

    public long standardCommissionForOrderMaker()
    {
        return buffer.getLong(offset + 2, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int standardCommissionForOrderTakerId()
    {
        return 4;
    }

    public static int standardCommissionForOrderTakerSinceVersion()
    {
        return 0;
    }

    public static int standardCommissionForOrderTakerEncodingOffset()
    {
        return 10;
    }

    public static int standardCommissionForOrderTakerEncodingLength()
    {
        return 8;
    }

    public static String standardCommissionForOrderTakerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long standardCommissionForOrderTakerNullValue()
    {
        return -9223372036854775808L;
    }

    public static long standardCommissionForOrderTakerMinValue()
    {
        return -9223372036854775807L;
    }

    public static long standardCommissionForOrderTakerMaxValue()
    {
        return 9223372036854775807L;
    }

    public long standardCommissionForOrderTaker()
    {
        return buffer.getLong(offset + 10, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int taxCommissionForOrderMakerId()
    {
        return 5;
    }

    public static int taxCommissionForOrderMakerSinceVersion()
    {
        return 0;
    }

    public static int taxCommissionForOrderMakerEncodingOffset()
    {
        return 18;
    }

    public static int taxCommissionForOrderMakerEncodingLength()
    {
        return 8;
    }

    public static String taxCommissionForOrderMakerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long taxCommissionForOrderMakerNullValue()
    {
        return -9223372036854775808L;
    }

    public static long taxCommissionForOrderMakerMinValue()
    {
        return -9223372036854775807L;
    }

    public static long taxCommissionForOrderMakerMaxValue()
    {
        return 9223372036854775807L;
    }

    public long taxCommissionForOrderMaker()
    {
        return buffer.getLong(offset + 18, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int taxCommissionForOrderTakerId()
    {
        return 6;
    }

    public static int taxCommissionForOrderTakerSinceVersion()
    {
        return 0;
    }

    public static int taxCommissionForOrderTakerEncodingOffset()
    {
        return 26;
    }

    public static int taxCommissionForOrderTakerEncodingLength()
    {
        return 8;
    }

    public static String taxCommissionForOrderTakerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long taxCommissionForOrderTakerNullValue()
    {
        return -9223372036854775808L;
    }

    public static long taxCommissionForOrderTakerMinValue()
    {
        return -9223372036854775807L;
    }

    public static long taxCommissionForOrderTakerMaxValue()
    {
        return 9223372036854775807L;
    }

    public long taxCommissionForOrderTaker()
    {
        return buffer.getLong(offset + 26, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int discountEnabledForAccountId()
    {
        return 7;
    }

    public static int discountEnabledForAccountSinceVersion()
    {
        return 0;
    }

    public static int discountEnabledForAccountEncodingOffset()
    {
        return 34;
    }

    public static int discountEnabledForAccountEncodingLength()
    {
        return 1;
    }

    public static String discountEnabledForAccountMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short discountEnabledForAccountRaw()
    {
        return ((short)(buffer.getByte(offset + 34) & 0xFF));
    }

    public BoolEnum discountEnabledForAccount()
    {
        return BoolEnum.get(((short)(buffer.getByte(offset + 34) & 0xFF)));
    }


    public static int discountEnabledForSymbolId()
    {
        return 8;
    }

    public static int discountEnabledForSymbolSinceVersion()
    {
        return 0;
    }

    public static int discountEnabledForSymbolEncodingOffset()
    {
        return 35;
    }

    public static int discountEnabledForSymbolEncodingLength()
    {
        return 1;
    }

    public static String discountEnabledForSymbolMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short discountEnabledForSymbolRaw()
    {
        return ((short)(buffer.getByte(offset + 35) & 0xFF));
    }

    public BoolEnum discountEnabledForSymbol()
    {
        return BoolEnum.get(((short)(buffer.getByte(offset + 35) & 0xFF)));
    }


    public static int discountId()
    {
        return 9;
    }

    public static int discountSinceVersion()
    {
        return 0;
    }

    public static int discountEncodingOffset()
    {
        return 36;
    }

    public static int discountEncodingLength()
    {
        return 8;
    }

    public static String discountMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long discountNullValue()
    {
        return -9223372036854775808L;
    }

    public static long discountMinValue()
    {
        return -9223372036854775807L;
    }

    public static long discountMaxValue()
    {
        return 9223372036854775807L;
    }

    public long discount()
    {
        return buffer.getLong(offset + 36, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int discountAssetId()
    {
        return 200;
    }

    public static int discountAssetSinceVersion()
    {
        return 0;
    }

    public static String discountAssetCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.UTF_8.name();
    }

    public static String discountAssetMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static int discountAssetHeaderLength()
    {
        return 1;
    }

    public int discountAssetLength()
    {
        final int limit = parentMessage.limit();
        return ((short)(buffer.getByte(limit) & 0xFF));
    }

    public int skipDiscountAsset()
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int dataOffset = limit + headerLength;
        parentMessage.limit(dataOffset + dataLength);

        return dataLength;
    }

    public int getDiscountAsset(final MutableDirectBuffer dst, final int dstOffset, final int length)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public int getDiscountAsset(final byte[] dst, final int dstOffset, final int length)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public void wrapDiscountAsset(final DirectBuffer wrapBuffer)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        parentMessage.limit(limit + headerLength + dataLength);
        wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
    }

    public String discountAsset()
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

        final OrderTestWithCommissionsResponseDecoder decoder = new OrderTestWithCommissionsResponseDecoder();
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
        builder.append("[OrderTestWithCommissionsResponse](sbeTemplateId=");
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
        builder.append("commissionExponent=");
        builder.append(this.commissionExponent());
        builder.append('|');
        builder.append("discountExponent=");
        builder.append(this.discountExponent());
        builder.append('|');
        builder.append("standardCommissionForOrderMaker=");
        builder.append(this.standardCommissionForOrderMaker());
        builder.append('|');
        builder.append("standardCommissionForOrderTaker=");
        builder.append(this.standardCommissionForOrderTaker());
        builder.append('|');
        builder.append("taxCommissionForOrderMaker=");
        builder.append(this.taxCommissionForOrderMaker());
        builder.append('|');
        builder.append("taxCommissionForOrderTaker=");
        builder.append(this.taxCommissionForOrderTaker());
        builder.append('|');
        builder.append("discountEnabledForAccount=");
        builder.append(this.discountEnabledForAccount());
        builder.append('|');
        builder.append("discountEnabledForSymbol=");
        builder.append(this.discountEnabledForSymbol());
        builder.append('|');
        builder.append("discount=");
        builder.append(this.discount());
        builder.append('|');
        builder.append("discountAsset=");
        builder.append('\'').append(discountAsset()).append('\'');

        limit(originalLimit);

        return builder;
    }
    
    public OrderTestWithCommissionsResponseDecoder sbeSkip()
    {
        sbeRewind();
        skipDiscountAsset();

        return this;
    }
}
