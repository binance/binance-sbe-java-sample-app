/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class AccountCommissionResponseDecoder
{
    public static final int BLOCK_LENGTH = 76;
    public static final int TEMPLATE_ID = 405;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final AccountCommissionResponseDecoder parentMessage = this;
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

    public AccountCommissionResponseDecoder wrap(
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

    public AccountCommissionResponseDecoder wrapAndApplyHeader(
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

    public AccountCommissionResponseDecoder sbeRewind()
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


    public static int standardCommissionMakerId()
    {
        return 3;
    }

    public static int standardCommissionMakerSinceVersion()
    {
        return 0;
    }

    public static int standardCommissionMakerEncodingOffset()
    {
        return 2;
    }

    public static int standardCommissionMakerEncodingLength()
    {
        return 8;
    }

    public static String standardCommissionMakerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long standardCommissionMakerNullValue()
    {
        return -9223372036854775808L;
    }

    public static long standardCommissionMakerMinValue()
    {
        return -9223372036854775807L;
    }

    public static long standardCommissionMakerMaxValue()
    {
        return 9223372036854775807L;
    }

    public long standardCommissionMaker()
    {
        return buffer.getLong(offset + 2, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int standardCommissionTakerId()
    {
        return 4;
    }

    public static int standardCommissionTakerSinceVersion()
    {
        return 0;
    }

    public static int standardCommissionTakerEncodingOffset()
    {
        return 10;
    }

    public static int standardCommissionTakerEncodingLength()
    {
        return 8;
    }

    public static String standardCommissionTakerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long standardCommissionTakerNullValue()
    {
        return -9223372036854775808L;
    }

    public static long standardCommissionTakerMinValue()
    {
        return -9223372036854775807L;
    }

    public static long standardCommissionTakerMaxValue()
    {
        return 9223372036854775807L;
    }

    public long standardCommissionTaker()
    {
        return buffer.getLong(offset + 10, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int standardCommissionBuyerId()
    {
        return 5;
    }

    public static int standardCommissionBuyerSinceVersion()
    {
        return 0;
    }

    public static int standardCommissionBuyerEncodingOffset()
    {
        return 18;
    }

    public static int standardCommissionBuyerEncodingLength()
    {
        return 8;
    }

    public static String standardCommissionBuyerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long standardCommissionBuyerNullValue()
    {
        return -9223372036854775808L;
    }

    public static long standardCommissionBuyerMinValue()
    {
        return -9223372036854775807L;
    }

    public static long standardCommissionBuyerMaxValue()
    {
        return 9223372036854775807L;
    }

    public long standardCommissionBuyer()
    {
        return buffer.getLong(offset + 18, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int standardCommissionSellerId()
    {
        return 6;
    }

    public static int standardCommissionSellerSinceVersion()
    {
        return 0;
    }

    public static int standardCommissionSellerEncodingOffset()
    {
        return 26;
    }

    public static int standardCommissionSellerEncodingLength()
    {
        return 8;
    }

    public static String standardCommissionSellerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long standardCommissionSellerNullValue()
    {
        return -9223372036854775808L;
    }

    public static long standardCommissionSellerMinValue()
    {
        return -9223372036854775807L;
    }

    public static long standardCommissionSellerMaxValue()
    {
        return 9223372036854775807L;
    }

    public long standardCommissionSeller()
    {
        return buffer.getLong(offset + 26, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int taxCommissionMakerId()
    {
        return 7;
    }

    public static int taxCommissionMakerSinceVersion()
    {
        return 0;
    }

    public static int taxCommissionMakerEncodingOffset()
    {
        return 34;
    }

    public static int taxCommissionMakerEncodingLength()
    {
        return 8;
    }

    public static String taxCommissionMakerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long taxCommissionMakerNullValue()
    {
        return -9223372036854775808L;
    }

    public static long taxCommissionMakerMinValue()
    {
        return -9223372036854775807L;
    }

    public static long taxCommissionMakerMaxValue()
    {
        return 9223372036854775807L;
    }

    public long taxCommissionMaker()
    {
        return buffer.getLong(offset + 34, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int taxCommissionTakerId()
    {
        return 8;
    }

    public static int taxCommissionTakerSinceVersion()
    {
        return 0;
    }

    public static int taxCommissionTakerEncodingOffset()
    {
        return 42;
    }

    public static int taxCommissionTakerEncodingLength()
    {
        return 8;
    }

    public static String taxCommissionTakerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long taxCommissionTakerNullValue()
    {
        return -9223372036854775808L;
    }

    public static long taxCommissionTakerMinValue()
    {
        return -9223372036854775807L;
    }

    public static long taxCommissionTakerMaxValue()
    {
        return 9223372036854775807L;
    }

    public long taxCommissionTaker()
    {
        return buffer.getLong(offset + 42, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int taxCommissionBuyerId()
    {
        return 9;
    }

    public static int taxCommissionBuyerSinceVersion()
    {
        return 0;
    }

    public static int taxCommissionBuyerEncodingOffset()
    {
        return 50;
    }

    public static int taxCommissionBuyerEncodingLength()
    {
        return 8;
    }

    public static String taxCommissionBuyerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long taxCommissionBuyerNullValue()
    {
        return -9223372036854775808L;
    }

    public static long taxCommissionBuyerMinValue()
    {
        return -9223372036854775807L;
    }

    public static long taxCommissionBuyerMaxValue()
    {
        return 9223372036854775807L;
    }

    public long taxCommissionBuyer()
    {
        return buffer.getLong(offset + 50, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int taxCommissionSellerId()
    {
        return 10;
    }

    public static int taxCommissionSellerSinceVersion()
    {
        return 0;
    }

    public static int taxCommissionSellerEncodingOffset()
    {
        return 58;
    }

    public static int taxCommissionSellerEncodingLength()
    {
        return 8;
    }

    public static String taxCommissionSellerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long taxCommissionSellerNullValue()
    {
        return -9223372036854775808L;
    }

    public static long taxCommissionSellerMinValue()
    {
        return -9223372036854775807L;
    }

    public static long taxCommissionSellerMaxValue()
    {
        return 9223372036854775807L;
    }

    public long taxCommissionSeller()
    {
        return buffer.getLong(offset + 58, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int discountEnabledForAccountId()
    {
        return 11;
    }

    public static int discountEnabledForAccountSinceVersion()
    {
        return 0;
    }

    public static int discountEnabledForAccountEncodingOffset()
    {
        return 66;
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
        return ((short)(buffer.getByte(offset + 66) & 0xFF));
    }

    public BoolEnum discountEnabledForAccount()
    {
        return BoolEnum.get(((short)(buffer.getByte(offset + 66) & 0xFF)));
    }


    public static int discountEnabledForSymbolId()
    {
        return 12;
    }

    public static int discountEnabledForSymbolSinceVersion()
    {
        return 0;
    }

    public static int discountEnabledForSymbolEncodingOffset()
    {
        return 67;
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
        return ((short)(buffer.getByte(offset + 67) & 0xFF));
    }

    public BoolEnum discountEnabledForSymbol()
    {
        return BoolEnum.get(((short)(buffer.getByte(offset + 67) & 0xFF)));
    }


    public static int discountId()
    {
        return 13;
    }

    public static int discountSinceVersion()
    {
        return 0;
    }

    public static int discountEncodingOffset()
    {
        return 68;
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
        return buffer.getLong(offset + 68, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public static int discountAssetId()
    {
        return 201;
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

        final AccountCommissionResponseDecoder decoder = new AccountCommissionResponseDecoder();
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
        builder.append("[AccountCommissionResponse](sbeTemplateId=");
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
        builder.append("standardCommissionMaker=");
        builder.append(this.standardCommissionMaker());
        builder.append('|');
        builder.append("standardCommissionTaker=");
        builder.append(this.standardCommissionTaker());
        builder.append('|');
        builder.append("standardCommissionBuyer=");
        builder.append(this.standardCommissionBuyer());
        builder.append('|');
        builder.append("standardCommissionSeller=");
        builder.append(this.standardCommissionSeller());
        builder.append('|');
        builder.append("taxCommissionMaker=");
        builder.append(this.taxCommissionMaker());
        builder.append('|');
        builder.append("taxCommissionTaker=");
        builder.append(this.taxCommissionTaker());
        builder.append('|');
        builder.append("taxCommissionBuyer=");
        builder.append(this.taxCommissionBuyer());
        builder.append('|');
        builder.append("taxCommissionSeller=");
        builder.append(this.taxCommissionSeller());
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
        builder.append("symbol=");
        builder.append('\'').append(symbol()).append('\'');
        builder.append('|');
        builder.append("discountAsset=");
        builder.append('\'').append(discountAsset()).append('\'');

        limit(originalLimit);

        return builder;
    }
    
    public AccountCommissionResponseDecoder sbeSkip()
    {
        sbeRewind();
        skipSymbol();
        skipDiscountAsset();

        return this;
    }
}
