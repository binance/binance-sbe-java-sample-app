/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class AllocationReportEventDecoder
{
    public static final int BLOCK_LENGTH = 122;
    public static final int TEMPLATE_ID = 600;
    public static final int SCHEMA_ID = 3;
    public static final int SCHEMA_VERSION = 4;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final AllocationReportEventDecoder parentMessage = this;
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

    public AllocationReportEventDecoder wrap(
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

    public AllocationReportEventDecoder wrapAndApplyHeader(
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

    public AllocationReportEventDecoder sbeRewind()
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


    public static int transactTimeId()
    {
        return 2;
    }

    public static int transactTimeSinceVersion()
    {
        return 0;
    }

    public static int transactTimeEncodingOffset()
    {
        return 8;
    }

    public static int transactTimeEncodingLength()
    {
        return 8;
    }

    public static String transactTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long transactTimeNullValue()
    {
        return -9223372036854775808L;
    }

    public static long transactTimeMinValue()
    {
        return -9223372036854775807L;
    }

    public static long transactTimeMaxValue()
    {
        return 9223372036854775807L;
    }

    public long transactTime()
    {
        return buffer.getLong(offset + 8, BYTE_ORDER);
    }


    public static int priceExponentId()
    {
        return 3;
    }

    public static int priceExponentSinceVersion()
    {
        return 0;
    }

    public static int priceExponentEncodingOffset()
    {
        return 16;
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
        return buffer.getByte(offset + 16);
    }


    public static int qtyExponentId()
    {
        return 4;
    }

    public static int qtyExponentSinceVersion()
    {
        return 0;
    }

    public static int qtyExponentEncodingOffset()
    {
        return 17;
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
        return buffer.getByte(offset + 17);
    }


    public static int commissionExponentId()
    {
        return 5;
    }

    public static int commissionExponentSinceVersion()
    {
        return 0;
    }

    public static int commissionExponentEncodingOffset()
    {
        return 18;
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
        return buffer.getByte(offset + 18);
    }


    public static int allocationTransactionTypeId()
    {
        return 6;
    }

    public static int allocationTransactionTypeSinceVersion()
    {
        return 0;
    }

    public static int allocationTransactionTypeEncodingOffset()
    {
        return 19;
    }

    public static int allocationTransactionTypeEncodingLength()
    {
        return 1;
    }

    public static String allocationTransactionTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short allocationTransactionTypeRaw()
    {
        return ((short)(buffer.getByte(offset + 19) & 0xFF));
    }

    public AllocationTransactionType allocationTransactionType()
    {
        return AllocationTransactionType.get(((short)(buffer.getByte(offset + 19) & 0xFF)));
    }


    public static int allocationReportTypeId()
    {
        return 7;
    }

    public static int allocationReportTypeSinceVersion()
    {
        return 0;
    }

    public static int allocationReportTypeEncodingOffset()
    {
        return 20;
    }

    public static int allocationReportTypeEncodingLength()
    {
        return 1;
    }

    public static String allocationReportTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short allocationReportTypeRaw()
    {
        return ((short)(buffer.getByte(offset + 20) & 0xFF));
    }

    public AllocationReportType allocationReportType()
    {
        return AllocationReportType.get(((short)(buffer.getByte(offset + 20) & 0xFF)));
    }


    public static int allocationStatusId()
    {
        return 8;
    }

    public static int allocationStatusSinceVersion()
    {
        return 0;
    }

    public static int allocationStatusEncodingOffset()
    {
        return 21;
    }

    public static int allocationStatusEncodingLength()
    {
        return 1;
    }

    public static String allocationStatusMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short allocationStatusRaw()
    {
        return ((short)(buffer.getByte(offset + 21) & 0xFF));
    }

    public AllocationStatus allocationStatus()
    {
        return AllocationStatus.get(((short)(buffer.getByte(offset + 21) & 0xFF)));
    }


    public static int sideId()
    {
        return 9;
    }

    public static int sideSinceVersion()
    {
        return 0;
    }

    public static int sideEncodingOffset()
    {
        return 22;
    }

    public static int sideEncodingLength()
    {
        return 1;
    }

    public static String sideMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short sideRaw()
    {
        return ((short)(buffer.getByte(offset + 22) & 0xFF));
    }

    public OrderSide side()
    {
        return OrderSide.get(((short)(buffer.getByte(offset + 22) & 0xFF)));
    }


    public static int counterPartyRoleId()
    {
        return 10;
    }

    public static int counterPartyRoleSinceVersion()
    {
        return 0;
    }

    public static int counterPartyRoleEncodingOffset()
    {
        return 23;
    }

    public static int counterPartyRoleEncodingLength()
    {
        return 1;
    }

    public static String counterPartyRoleMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short counterPartyRoleRaw()
    {
        return ((short)(buffer.getByte(offset + 23) & 0xFF));
    }

    public CounterPartyRole counterPartyRole()
    {
        return CounterPartyRole.get(((short)(buffer.getByte(offset + 23) & 0xFF)));
    }


    public static int counterPartyExternalAccountIdId()
    {
        return 11;
    }

    public static int counterPartyExternalAccountIdSinceVersion()
    {
        return 0;
    }

    public static int counterPartyExternalAccountIdEncodingOffset()
    {
        return 24;
    }

    public static int counterPartyExternalAccountIdEncodingLength()
    {
        return 8;
    }

    public static String counterPartyExternalAccountIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long counterPartyExternalAccountIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long counterPartyExternalAccountIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long counterPartyExternalAccountIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long counterPartyExternalAccountId()
    {
        return buffer.getLong(offset + 24, BYTE_ORDER);
    }


    public static int counterPartyOrderIdId()
    {
        return 12;
    }

    public static int counterPartyOrderIdSinceVersion()
    {
        return 0;
    }

    public static int counterPartyOrderIdEncodingOffset()
    {
        return 32;
    }

    public static int counterPartyOrderIdEncodingLength()
    {
        return 8;
    }

    public static String counterPartyOrderIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long counterPartyOrderIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long counterPartyOrderIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long counterPartyOrderIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long counterPartyOrderId()
    {
        return buffer.getLong(offset + 32, BYTE_ORDER);
    }


    public static int allocationReportIdId()
    {
        return 13;
    }

    public static int allocationReportIdSinceVersion()
    {
        return 0;
    }

    public static int allocationReportIdEncodingOffset()
    {
        return 40;
    }

    public static int allocationReportIdEncodingLength()
    {
        return 8;
    }

    public static String allocationReportIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long allocationReportIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long allocationReportIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long allocationReportIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long allocationReportId()
    {
        return buffer.getLong(offset + 40, BYTE_ORDER);
    }


    public static int allocationIdId()
    {
        return 14;
    }

    public static int allocationIdSinceVersion()
    {
        return 0;
    }

    public static int allocationIdEncodingOffset()
    {
        return 48;
    }

    public static int allocationIdEncodingLength()
    {
        return 8;
    }

    public static String allocationIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long allocationIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long allocationIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long allocationIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long allocationId()
    {
        return buffer.getLong(offset + 48, BYTE_ORDER);
    }


    public static int sourceOrderIdId()
    {
        return 15;
    }

    public static int sourceOrderIdSinceVersion()
    {
        return 0;
    }

    public static int sourceOrderIdEncodingOffset()
    {
        return 56;
    }

    public static int sourceOrderIdEncodingLength()
    {
        return 8;
    }

    public static String sourceOrderIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long sourceOrderIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long sourceOrderIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long sourceOrderIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long sourceOrderId()
    {
        return buffer.getLong(offset + 56, BYTE_ORDER);
    }


    public static int sourceOrderListIdId()
    {
        return 16;
    }

    public static int sourceOrderListIdSinceVersion()
    {
        return 0;
    }

    public static int sourceOrderListIdEncodingOffset()
    {
        return 64;
    }

    public static int sourceOrderListIdEncodingLength()
    {
        return 8;
    }

    public static String sourceOrderListIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long sourceOrderListIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long sourceOrderListIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long sourceOrderListIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long sourceOrderListId()
    {
        return buffer.getLong(offset + 64, BYTE_ORDER);
    }


    public static int sourceTradeIdId()
    {
        return 17;
    }

    public static int sourceTradeIdSinceVersion()
    {
        return 0;
    }

    public static int sourceTradeIdEncodingOffset()
    {
        return 72;
    }

    public static int sourceTradeIdEncodingLength()
    {
        return 8;
    }

    public static String sourceTradeIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long sourceTradeIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long sourceTradeIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long sourceTradeIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long sourceTradeId()
    {
        return buffer.getLong(offset + 72, BYTE_ORDER);
    }


    public static int sourceAllocationIdId()
    {
        return 18;
    }

    public static int sourceAllocationIdSinceVersion()
    {
        return 0;
    }

    public static int sourceAllocationIdEncodingOffset()
    {
        return 80;
    }

    public static int sourceAllocationIdEncodingLength()
    {
        return 8;
    }

    public static String sourceAllocationIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long sourceAllocationIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long sourceAllocationIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long sourceAllocationIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long sourceAllocationId()
    {
        return buffer.getLong(offset + 80, BYTE_ORDER);
    }


    public static int priceId()
    {
        return 19;
    }

    public static int priceSinceVersion()
    {
        return 0;
    }

    public static int priceEncodingOffset()
    {
        return 88;
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
        return buffer.getLong(offset + 88, BYTE_ORDER);
    }


    public static int qtyId()
    {
        return 20;
    }

    public static int qtySinceVersion()
    {
        return 0;
    }

    public static int qtyEncodingOffset()
    {
        return 96;
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
        return buffer.getLong(offset + 96, BYTE_ORDER);
    }


    public static int quoteQtyId()
    {
        return 21;
    }

    public static int quoteQtySinceVersion()
    {
        return 0;
    }

    public static int quoteQtyEncodingOffset()
    {
        return 104;
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
        return buffer.getLong(offset + 104, BYTE_ORDER);
    }


    public static int commissionId()
    {
        return 22;
    }

    public static int commissionSinceVersion()
    {
        return 0;
    }

    public static int commissionEncodingOffset()
    {
        return 112;
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
        return buffer.getLong(offset + 112, BYTE_ORDER);
    }


    public static int subscriptionIdId()
    {
        return 23;
    }

    public static int subscriptionIdSinceVersion()
    {
        return 1;
    }

    public static int subscriptionIdEncodingOffset()
    {
        return 120;
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

        return (buffer.getShort(offset + 120, BYTE_ORDER) & 0xFFFF);
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

    public static int sourceSymbolId()
    {
        return 202;
    }

    public static int sourceSymbolSinceVersion()
    {
        return 0;
    }

    public static String sourceSymbolCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.UTF_8.name();
    }

    public static String sourceSymbolMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static int sourceSymbolHeaderLength()
    {
        return 1;
    }

    public int sourceSymbolLength()
    {
        final int limit = parentMessage.limit();
        return ((short)(buffer.getByte(limit) & 0xFF));
    }

    public int skipSourceSymbol()
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int dataOffset = limit + headerLength;
        parentMessage.limit(dataOffset + dataLength);

        return dataLength;
    }

    public int getSourceSymbol(final MutableDirectBuffer dst, final int dstOffset, final int length)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public int getSourceSymbol(final byte[] dst, final int dstOffset, final int length)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public void wrapSourceSymbol(final DirectBuffer wrapBuffer)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        parentMessage.limit(limit + headerLength + dataLength);
        wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
    }

    public String sourceSymbol()
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

        final AllocationReportEventDecoder decoder = new AllocationReportEventDecoder();
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
        builder.append("[AllocationReportEvent](sbeTemplateId=");
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
        builder.append("transactTime=");
        builder.append(this.transactTime());
        builder.append('|');
        builder.append("priceExponent=");
        builder.append(this.priceExponent());
        builder.append('|');
        builder.append("qtyExponent=");
        builder.append(this.qtyExponent());
        builder.append('|');
        builder.append("commissionExponent=");
        builder.append(this.commissionExponent());
        builder.append('|');
        builder.append("allocationTransactionType=");
        builder.append(this.allocationTransactionType());
        builder.append('|');
        builder.append("allocationReportType=");
        builder.append(this.allocationReportType());
        builder.append('|');
        builder.append("allocationStatus=");
        builder.append(this.allocationStatus());
        builder.append('|');
        builder.append("side=");
        builder.append(this.side());
        builder.append('|');
        builder.append("counterPartyRole=");
        builder.append(this.counterPartyRole());
        builder.append('|');
        builder.append("counterPartyExternalAccountId=");
        builder.append(this.counterPartyExternalAccountId());
        builder.append('|');
        builder.append("counterPartyOrderId=");
        builder.append(this.counterPartyOrderId());
        builder.append('|');
        builder.append("allocationReportId=");
        builder.append(this.allocationReportId());
        builder.append('|');
        builder.append("allocationId=");
        builder.append(this.allocationId());
        builder.append('|');
        builder.append("sourceOrderId=");
        builder.append(this.sourceOrderId());
        builder.append('|');
        builder.append("sourceOrderListId=");
        builder.append(this.sourceOrderListId());
        builder.append('|');
        builder.append("sourceTradeId=");
        builder.append(this.sourceTradeId());
        builder.append('|');
        builder.append("sourceAllocationId=");
        builder.append(this.sourceAllocationId());
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
        builder.append("subscriptionId=");
        builder.append(this.subscriptionId());
        builder.append('|');
        builder.append("symbol=");
        builder.append('\'').append(symbol()).append('\'');
        builder.append('|');
        builder.append("commissionAsset=");
        builder.append('\'').append(commissionAsset()).append('\'');
        builder.append('|');
        builder.append("sourceSymbol=");
        builder.append('\'').append(sourceSymbol()).append('\'');

        limit(originalLimit);

        return builder;
    }
    
    public AllocationReportEventDecoder sbeSkip()
    {
        sbeRewind();
        skipSymbol();
        skipCommissionAsset();
        skipSourceSymbol();

        return this;
    }
}
