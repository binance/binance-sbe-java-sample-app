/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class ExecutionReportEventDecoder
{
    public static final int BLOCK_LENGTH = 282;
    public static final int TEMPLATE_ID = 603;
    public static final int SCHEMA_ID = 3;
    public static final int SCHEMA_VERSION = 5;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final ExecutionReportEventDecoder parentMessage = this;
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

    public ExecutionReportEventDecoder wrap(
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

    public ExecutionReportEventDecoder wrapAndApplyHeader(
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

    public ExecutionReportEventDecoder sbeRewind()
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


    public static int orderCreationTimeId()
    {
        return 6;
    }

    public static int orderCreationTimeSinceVersion()
    {
        return 0;
    }

    public static int orderCreationTimeEncodingOffset()
    {
        return 19;
    }

    public static int orderCreationTimeEncodingLength()
    {
        return 8;
    }

    public static String orderCreationTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long orderCreationTimeNullValue()
    {
        return -9223372036854775808L;
    }

    public static long orderCreationTimeMinValue()
    {
        return -9223372036854775807L;
    }

    public static long orderCreationTimeMaxValue()
    {
        return 9223372036854775807L;
    }

    public long orderCreationTime()
    {
        return buffer.getLong(offset + 19, BYTE_ORDER);
    }


    public static int workingTimeId()
    {
        return 7;
    }

    public static int workingTimeSinceVersion()
    {
        return 0;
    }

    public static int workingTimeEncodingOffset()
    {
        return 27;
    }

    public static int workingTimeEncodingLength()
    {
        return 8;
    }

    public static String workingTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long workingTimeNullValue()
    {
        return -9223372036854775808L;
    }

    public static long workingTimeMinValue()
    {
        return -9223372036854775807L;
    }

    public static long workingTimeMaxValue()
    {
        return 9223372036854775807L;
    }

    public long workingTime()
    {
        return buffer.getLong(offset + 27, BYTE_ORDER);
    }


    public static int orderIdId()
    {
        return 8;
    }

    public static int orderIdSinceVersion()
    {
        return 0;
    }

    public static int orderIdEncodingOffset()
    {
        return 35;
    }

    public static int orderIdEncodingLength()
    {
        return 8;
    }

    public static String orderIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long orderIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long orderIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long orderIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long orderId()
    {
        return buffer.getLong(offset + 35, BYTE_ORDER);
    }


    public static int orderListIdId()
    {
        return 9;
    }

    public static int orderListIdSinceVersion()
    {
        return 0;
    }

    public static int orderListIdEncodingOffset()
    {
        return 43;
    }

    public static int orderListIdEncodingLength()
    {
        return 8;
    }

    public static String orderListIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long orderListIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long orderListIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long orderListIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long orderListId()
    {
        return buffer.getLong(offset + 43, BYTE_ORDER);
    }


    public static int origQtyId()
    {
        return 10;
    }

    public static int origQtySinceVersion()
    {
        return 0;
    }

    public static int origQtyEncodingOffset()
    {
        return 51;
    }

    public static int origQtyEncodingLength()
    {
        return 8;
    }

    public static String origQtyMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long origQtyNullValue()
    {
        return -9223372036854775808L;
    }

    public static long origQtyMinValue()
    {
        return -9223372036854775807L;
    }

    public static long origQtyMaxValue()
    {
        return 9223372036854775807L;
    }

    public long origQty()
    {
        return buffer.getLong(offset + 51, BYTE_ORDER);
    }


    public static int priceId()
    {
        return 11;
    }

    public static int priceSinceVersion()
    {
        return 0;
    }

    public static int priceEncodingOffset()
    {
        return 59;
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
        return buffer.getLong(offset + 59, BYTE_ORDER);
    }


    public static int origQuoteOrderQtyId()
    {
        return 12;
    }

    public static int origQuoteOrderQtySinceVersion()
    {
        return 0;
    }

    public static int origQuoteOrderQtyEncodingOffset()
    {
        return 67;
    }

    public static int origQuoteOrderQtyEncodingLength()
    {
        return 8;
    }

    public static String origQuoteOrderQtyMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long origQuoteOrderQtyNullValue()
    {
        return -9223372036854775808L;
    }

    public static long origQuoteOrderQtyMinValue()
    {
        return -9223372036854775807L;
    }

    public static long origQuoteOrderQtyMaxValue()
    {
        return 9223372036854775807L;
    }

    public long origQuoteOrderQty()
    {
        return buffer.getLong(offset + 67, BYTE_ORDER);
    }


    public static int icebergQtyId()
    {
        return 13;
    }

    public static int icebergQtySinceVersion()
    {
        return 0;
    }

    public static int icebergQtyEncodingOffset()
    {
        return 75;
    }

    public static int icebergQtyEncodingLength()
    {
        return 8;
    }

    public static String icebergQtyMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long icebergQtyNullValue()
    {
        return -9223372036854775808L;
    }

    public static long icebergQtyMinValue()
    {
        return -9223372036854775807L;
    }

    public static long icebergQtyMaxValue()
    {
        return 9223372036854775807L;
    }

    public long icebergQty()
    {
        return buffer.getLong(offset + 75, BYTE_ORDER);
    }


    public static int stopPriceId()
    {
        return 14;
    }

    public static int stopPriceSinceVersion()
    {
        return 0;
    }

    public static int stopPriceEncodingOffset()
    {
        return 83;
    }

    public static int stopPriceEncodingLength()
    {
        return 8;
    }

    public static String stopPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long stopPriceNullValue()
    {
        return -9223372036854775808L;
    }

    public static long stopPriceMinValue()
    {
        return -9223372036854775807L;
    }

    public static long stopPriceMaxValue()
    {
        return 9223372036854775807L;
    }

    public long stopPrice()
    {
        return buffer.getLong(offset + 83, BYTE_ORDER);
    }


    public static int orderTypeId()
    {
        return 15;
    }

    public static int orderTypeSinceVersion()
    {
        return 0;
    }

    public static int orderTypeEncodingOffset()
    {
        return 91;
    }

    public static int orderTypeEncodingLength()
    {
        return 1;
    }

    public static String orderTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short orderTypeRaw()
    {
        return ((short)(buffer.getByte(offset + 91) & 0xFF));
    }

    public OrderType orderType()
    {
        return OrderType.get(((short)(buffer.getByte(offset + 91) & 0xFF)));
    }


    public static int sideId()
    {
        return 16;
    }

    public static int sideSinceVersion()
    {
        return 0;
    }

    public static int sideEncodingOffset()
    {
        return 92;
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
        return ((short)(buffer.getByte(offset + 92) & 0xFF));
    }

    public OrderSide side()
    {
        return OrderSide.get(((short)(buffer.getByte(offset + 92) & 0xFF)));
    }


    public static int timeInForceId()
    {
        return 17;
    }

    public static int timeInForceSinceVersion()
    {
        return 0;
    }

    public static int timeInForceEncodingOffset()
    {
        return 93;
    }

    public static int timeInForceEncodingLength()
    {
        return 1;
    }

    public static String timeInForceMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short timeInForceRaw()
    {
        return ((short)(buffer.getByte(offset + 93) & 0xFF));
    }

    public TimeInForce timeInForce()
    {
        return TimeInForce.get(((short)(buffer.getByte(offset + 93) & 0xFF)));
    }


    public static int executionTypeId()
    {
        return 18;
    }

    public static int executionTypeSinceVersion()
    {
        return 0;
    }

    public static int executionTypeEncodingOffset()
    {
        return 94;
    }

    public static int executionTypeEncodingLength()
    {
        return 1;
    }

    public static String executionTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short executionTypeRaw()
    {
        return ((short)(buffer.getByte(offset + 94) & 0xFF));
    }

    public ExecutionType executionType()
    {
        return ExecutionType.get(((short)(buffer.getByte(offset + 94) & 0xFF)));
    }


    public static int orderStatusId()
    {
        return 19;
    }

    public static int orderStatusSinceVersion()
    {
        return 0;
    }

    public static int orderStatusEncodingOffset()
    {
        return 95;
    }

    public static int orderStatusEncodingLength()
    {
        return 1;
    }

    public static String orderStatusMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short orderStatusRaw()
    {
        return ((short)(buffer.getByte(offset + 95) & 0xFF));
    }

    public OrderStatus orderStatus()
    {
        return OrderStatus.get(((short)(buffer.getByte(offset + 95) & 0xFF)));
    }


    public static int tradeIdId()
    {
        return 20;
    }

    public static int tradeIdSinceVersion()
    {
        return 0;
    }

    public static int tradeIdEncodingOffset()
    {
        return 96;
    }

    public static int tradeIdEncodingLength()
    {
        return 8;
    }

    public static String tradeIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long tradeIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long tradeIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long tradeIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long tradeId()
    {
        return buffer.getLong(offset + 96, BYTE_ORDER);
    }


    public static int executionIdId()
    {
        return 21;
    }

    public static int executionIdSinceVersion()
    {
        return 0;
    }

    public static int executionIdEncodingOffset()
    {
        return 104;
    }

    public static int executionIdEncodingLength()
    {
        return 8;
    }

    public static String executionIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long executionIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long executionIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long executionIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long executionId()
    {
        return buffer.getLong(offset + 104, BYTE_ORDER);
    }


    public static int executedQtyId()
    {
        return 22;
    }

    public static int executedQtySinceVersion()
    {
        return 0;
    }

    public static int executedQtyEncodingOffset()
    {
        return 112;
    }

    public static int executedQtyEncodingLength()
    {
        return 8;
    }

    public static String executedQtyMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long executedQtyNullValue()
    {
        return -9223372036854775808L;
    }

    public static long executedQtyMinValue()
    {
        return -9223372036854775807L;
    }

    public static long executedQtyMaxValue()
    {
        return 9223372036854775807L;
    }

    public long executedQty()
    {
        return buffer.getLong(offset + 112, BYTE_ORDER);
    }


    public static int cummulativeQuoteQtyId()
    {
        return 23;
    }

    public static int cummulativeQuoteQtySinceVersion()
    {
        return 0;
    }

    public static int cummulativeQuoteQtyEncodingOffset()
    {
        return 120;
    }

    public static int cummulativeQuoteQtyEncodingLength()
    {
        return 8;
    }

    public static String cummulativeQuoteQtyMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long cummulativeQuoteQtyNullValue()
    {
        return -9223372036854775808L;
    }

    public static long cummulativeQuoteQtyMinValue()
    {
        return -9223372036854775807L;
    }

    public static long cummulativeQuoteQtyMaxValue()
    {
        return 9223372036854775807L;
    }

    public long cummulativeQuoteQty()
    {
        return buffer.getLong(offset + 120, BYTE_ORDER);
    }


    public static int lastQtyId()
    {
        return 24;
    }

    public static int lastQtySinceVersion()
    {
        return 0;
    }

    public static int lastQtyEncodingOffset()
    {
        return 128;
    }

    public static int lastQtyEncodingLength()
    {
        return 8;
    }

    public static String lastQtyMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long lastQtyNullValue()
    {
        return -9223372036854775808L;
    }

    public static long lastQtyMinValue()
    {
        return -9223372036854775807L;
    }

    public static long lastQtyMaxValue()
    {
        return 9223372036854775807L;
    }

    public long lastQty()
    {
        return buffer.getLong(offset + 128, BYTE_ORDER);
    }


    public static int lastPriceId()
    {
        return 25;
    }

    public static int lastPriceSinceVersion()
    {
        return 0;
    }

    public static int lastPriceEncodingOffset()
    {
        return 136;
    }

    public static int lastPriceEncodingLength()
    {
        return 8;
    }

    public static String lastPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long lastPriceNullValue()
    {
        return -9223372036854775808L;
    }

    public static long lastPriceMinValue()
    {
        return -9223372036854775807L;
    }

    public static long lastPriceMaxValue()
    {
        return 9223372036854775807L;
    }

    public long lastPrice()
    {
        return buffer.getLong(offset + 136, BYTE_ORDER);
    }


    public static int quoteQtyId()
    {
        return 26;
    }

    public static int quoteQtySinceVersion()
    {
        return 0;
    }

    public static int quoteQtyEncodingOffset()
    {
        return 144;
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
        return buffer.getLong(offset + 144, BYTE_ORDER);
    }


    public static int commissionId()
    {
        return 27;
    }

    public static int commissionSinceVersion()
    {
        return 0;
    }

    public static int commissionEncodingOffset()
    {
        return 152;
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
        return buffer.getLong(offset + 152, BYTE_ORDER);
    }


    public static int isWorkingId()
    {
        return 28;
    }

    public static int isWorkingSinceVersion()
    {
        return 0;
    }

    public static int isWorkingEncodingOffset()
    {
        return 160;
    }

    public static int isWorkingEncodingLength()
    {
        return 1;
    }

    public static String isWorkingMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short isWorkingRaw()
    {
        return ((short)(buffer.getByte(offset + 160) & 0xFF));
    }

    public BoolEnum isWorking()
    {
        return BoolEnum.get(((short)(buffer.getByte(offset + 160) & 0xFF)));
    }


    public static int isMakerId()
    {
        return 29;
    }

    public static int isMakerSinceVersion()
    {
        return 0;
    }

    public static int isMakerEncodingOffset()
    {
        return 161;
    }

    public static int isMakerEncodingLength()
    {
        return 1;
    }

    public static String isMakerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short isMakerRaw()
    {
        return ((short)(buffer.getByte(offset + 161) & 0xFF));
    }

    public BoolEnum isMaker()
    {
        return BoolEnum.get(((short)(buffer.getByte(offset + 161) & 0xFF)));
    }


    public static int isBestMatchId()
    {
        return 30;
    }

    public static int isBestMatchSinceVersion()
    {
        return 0;
    }

    public static int isBestMatchEncodingOffset()
    {
        return 162;
    }

    public static int isBestMatchEncodingLength()
    {
        return 1;
    }

    public static String isBestMatchMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short isBestMatchRaw()
    {
        return ((short)(buffer.getByte(offset + 162) & 0xFF));
    }

    public BoolEnum isBestMatch()
    {
        return BoolEnum.get(((short)(buffer.getByte(offset + 162) & 0xFF)));
    }


    public static int matchTypeId()
    {
        return 31;
    }

    public static int matchTypeSinceVersion()
    {
        return 0;
    }

    public static int matchTypeEncodingOffset()
    {
        return 163;
    }

    public static int matchTypeEncodingLength()
    {
        return 1;
    }

    public static String matchTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short matchTypeRaw()
    {
        return ((short)(buffer.getByte(offset + 163) & 0xFF));
    }

    public MatchType matchType()
    {
        return MatchType.get(((short)(buffer.getByte(offset + 163) & 0xFF)));
    }


    public static int selfTradePreventionModeId()
    {
        return 32;
    }

    public static int selfTradePreventionModeSinceVersion()
    {
        return 0;
    }

    public static int selfTradePreventionModeEncodingOffset()
    {
        return 164;
    }

    public static int selfTradePreventionModeEncodingLength()
    {
        return 1;
    }

    public static String selfTradePreventionModeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short selfTradePreventionModeRaw()
    {
        return ((short)(buffer.getByte(offset + 164) & 0xFF));
    }

    public SelfTradePreventionMode selfTradePreventionMode()
    {
        return SelfTradePreventionMode.get(((short)(buffer.getByte(offset + 164) & 0xFF)));
    }


    public static int orderCapacityId()
    {
        return 33;
    }

    public static int orderCapacitySinceVersion()
    {
        return 0;
    }

    public static int orderCapacityEncodingOffset()
    {
        return 165;
    }

    public static int orderCapacityEncodingLength()
    {
        return 1;
    }

    public static String orderCapacityMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short orderCapacityRaw()
    {
        return ((short)(buffer.getByte(offset + 165) & 0xFF));
    }

    public OrderCapacity orderCapacity()
    {
        return OrderCapacity.get(((short)(buffer.getByte(offset + 165) & 0xFF)));
    }


    public static int workingFloorId()
    {
        return 34;
    }

    public static int workingFloorSinceVersion()
    {
        return 0;
    }

    public static int workingFloorEncodingOffset()
    {
        return 166;
    }

    public static int workingFloorEncodingLength()
    {
        return 1;
    }

    public static String workingFloorMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short workingFloorRaw()
    {
        return ((short)(buffer.getByte(offset + 166) & 0xFF));
    }

    public Floor workingFloor()
    {
        return Floor.get(((short)(buffer.getByte(offset + 166) & 0xFF)));
    }


    public static int usedSorId()
    {
        return 35;
    }

    public static int usedSorSinceVersion()
    {
        return 0;
    }

    public static int usedSorEncodingOffset()
    {
        return 167;
    }

    public static int usedSorEncodingLength()
    {
        return 1;
    }

    public static String usedSorMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short usedSorRaw()
    {
        return ((short)(buffer.getByte(offset + 167) & 0xFF));
    }

    public BoolEnum usedSor()
    {
        return BoolEnum.get(((short)(buffer.getByte(offset + 167) & 0xFF)));
    }


    public static int allocIdId()
    {
        return 36;
    }

    public static int allocIdSinceVersion()
    {
        return 0;
    }

    public static int allocIdEncodingOffset()
    {
        return 168;
    }

    public static int allocIdEncodingLength()
    {
        return 8;
    }

    public static String allocIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long allocIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long allocIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long allocIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long allocId()
    {
        return buffer.getLong(offset + 168, BYTE_ORDER);
    }


    public static int trailingDeltaId()
    {
        return 37;
    }

    public static int trailingDeltaSinceVersion()
    {
        return 0;
    }

    public static int trailingDeltaEncodingOffset()
    {
        return 176;
    }

    public static int trailingDeltaEncodingLength()
    {
        return 8;
    }

    public static String trailingDeltaMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long trailingDeltaNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long trailingDeltaMinValue()
    {
        return 0x0L;
    }

    public static long trailingDeltaMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public long trailingDelta()
    {
        return buffer.getLong(offset + 176, BYTE_ORDER);
    }


    public static int trailingTimeId()
    {
        return 38;
    }

    public static int trailingTimeSinceVersion()
    {
        return 0;
    }

    public static int trailingTimeEncodingOffset()
    {
        return 184;
    }

    public static int trailingTimeEncodingLength()
    {
        return 8;
    }

    public static String trailingTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long trailingTimeNullValue()
    {
        return -9223372036854775808L;
    }

    public static long trailingTimeMinValue()
    {
        return -9223372036854775807L;
    }

    public static long trailingTimeMaxValue()
    {
        return 9223372036854775807L;
    }

    public long trailingTime()
    {
        return buffer.getLong(offset + 184, BYTE_ORDER);
    }


    public static int tradeGroupIdId()
    {
        return 39;
    }

    public static int tradeGroupIdSinceVersion()
    {
        return 0;
    }

    public static int tradeGroupIdEncodingOffset()
    {
        return 192;
    }

    public static int tradeGroupIdEncodingLength()
    {
        return 8;
    }

    public static String tradeGroupIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long tradeGroupIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long tradeGroupIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long tradeGroupIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long tradeGroupId()
    {
        return buffer.getLong(offset + 192, BYTE_ORDER);
    }


    public static int preventedQtyId()
    {
        return 40;
    }

    public static int preventedQtySinceVersion()
    {
        return 0;
    }

    public static int preventedQtyEncodingOffset()
    {
        return 200;
    }

    public static int preventedQtyEncodingLength()
    {
        return 8;
    }

    public static String preventedQtyMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long preventedQtyNullValue()
    {
        return -9223372036854775808L;
    }

    public static long preventedQtyMinValue()
    {
        return -9223372036854775807L;
    }

    public static long preventedQtyMaxValue()
    {
        return 9223372036854775807L;
    }

    public long preventedQty()
    {
        return buffer.getLong(offset + 200, BYTE_ORDER);
    }


    public static int lastPreventedQtyId()
    {
        return 41;
    }

    public static int lastPreventedQtySinceVersion()
    {
        return 0;
    }

    public static int lastPreventedQtyEncodingOffset()
    {
        return 208;
    }

    public static int lastPreventedQtyEncodingLength()
    {
        return 8;
    }

    public static String lastPreventedQtyMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long lastPreventedQtyNullValue()
    {
        return -9223372036854775808L;
    }

    public static long lastPreventedQtyMinValue()
    {
        return -9223372036854775807L;
    }

    public static long lastPreventedQtyMaxValue()
    {
        return 9223372036854775807L;
    }

    public long lastPreventedQty()
    {
        return buffer.getLong(offset + 208, BYTE_ORDER);
    }


    public static int preventedMatchIdId()
    {
        return 42;
    }

    public static int preventedMatchIdSinceVersion()
    {
        return 0;
    }

    public static int preventedMatchIdEncodingOffset()
    {
        return 216;
    }

    public static int preventedMatchIdEncodingLength()
    {
        return 8;
    }

    public static String preventedMatchIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long preventedMatchIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long preventedMatchIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long preventedMatchIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long preventedMatchId()
    {
        return buffer.getLong(offset + 216, BYTE_ORDER);
    }


    public static int preventedExecutionQtyId()
    {
        return 43;
    }

    public static int preventedExecutionQtySinceVersion()
    {
        return 0;
    }

    public static int preventedExecutionQtyEncodingOffset()
    {
        return 224;
    }

    public static int preventedExecutionQtyEncodingLength()
    {
        return 8;
    }

    public static String preventedExecutionQtyMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long preventedExecutionQtyNullValue()
    {
        return -9223372036854775808L;
    }

    public static long preventedExecutionQtyMinValue()
    {
        return -9223372036854775807L;
    }

    public static long preventedExecutionQtyMaxValue()
    {
        return 9223372036854775807L;
    }

    public long preventedExecutionQty()
    {
        return buffer.getLong(offset + 224, BYTE_ORDER);
    }


    public static int preventedExecutionPriceId()
    {
        return 44;
    }

    public static int preventedExecutionPriceSinceVersion()
    {
        return 0;
    }

    public static int preventedExecutionPriceEncodingOffset()
    {
        return 232;
    }

    public static int preventedExecutionPriceEncodingLength()
    {
        return 8;
    }

    public static String preventedExecutionPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long preventedExecutionPriceNullValue()
    {
        return -9223372036854775808L;
    }

    public static long preventedExecutionPriceMinValue()
    {
        return -9223372036854775807L;
    }

    public static long preventedExecutionPriceMaxValue()
    {
        return 9223372036854775807L;
    }

    public long preventedExecutionPrice()
    {
        return buffer.getLong(offset + 232, BYTE_ORDER);
    }


    public static int preventedExecutionQuoteQtyId()
    {
        return 45;
    }

    public static int preventedExecutionQuoteQtySinceVersion()
    {
        return 0;
    }

    public static int preventedExecutionQuoteQtyEncodingOffset()
    {
        return 240;
    }

    public static int preventedExecutionQuoteQtyEncodingLength()
    {
        return 8;
    }

    public static String preventedExecutionQuoteQtyMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long preventedExecutionQuoteQtyNullValue()
    {
        return -9223372036854775808L;
    }

    public static long preventedExecutionQuoteQtyMinValue()
    {
        return -9223372036854775807L;
    }

    public static long preventedExecutionQuoteQtyMaxValue()
    {
        return 9223372036854775807L;
    }

    public long preventedExecutionQuoteQty()
    {
        return buffer.getLong(offset + 240, BYTE_ORDER);
    }


    public static int strategyTypeId()
    {
        return 46;
    }

    public static int strategyTypeSinceVersion()
    {
        return 0;
    }

    public static int strategyTypeEncodingOffset()
    {
        return 248;
    }

    public static int strategyTypeEncodingLength()
    {
        return 4;
    }

    public static String strategyTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static int strategyTypeNullValue()
    {
        return -2147483648;
    }

    public static int strategyTypeMinValue()
    {
        return -2147483647;
    }

    public static int strategyTypeMaxValue()
    {
        return 2147483647;
    }

    public int strategyType()
    {
        return buffer.getInt(offset + 248, BYTE_ORDER);
    }


    public static int strategyIdId()
    {
        return 47;
    }

    public static int strategyIdSinceVersion()
    {
        return 0;
    }

    public static int strategyIdEncodingOffset()
    {
        return 252;
    }

    public static int strategyIdEncodingLength()
    {
        return 8;
    }

    public static String strategyIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long strategyIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long strategyIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long strategyIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long strategyId()
    {
        return buffer.getLong(offset + 252, BYTE_ORDER);
    }


    public static int counterOrderIdId()
    {
        return 48;
    }

    public static int counterOrderIdSinceVersion()
    {
        return 0;
    }

    public static int counterOrderIdEncodingOffset()
    {
        return 260;
    }

    public static int counterOrderIdEncodingLength()
    {
        return 8;
    }

    public static String counterOrderIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long counterOrderIdNullValue()
    {
        return -9223372036854775808L;
    }

    public static long counterOrderIdMinValue()
    {
        return -9223372036854775807L;
    }

    public static long counterOrderIdMaxValue()
    {
        return 9223372036854775807L;
    }

    public long counterOrderId()
    {
        return buffer.getLong(offset + 260, BYTE_ORDER);
    }


    public static int subscriptionIdId()
    {
        return 49;
    }

    public static int subscriptionIdSinceVersion()
    {
        return 1;
    }

    public static int subscriptionIdEncodingOffset()
    {
        return 268;
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

        return (buffer.getShort(offset + 268, BYTE_ORDER) & 0xFFFF);
    }


    public static int pegPriceTypeId()
    {
        return 50;
    }

    public static int pegPriceTypeSinceVersion()
    {
        return 1;
    }

    public static int pegPriceTypeEncodingOffset()
    {
        return 270;
    }

    public static int pegPriceTypeEncodingLength()
    {
        return 1;
    }

    public static String pegPriceTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public short pegPriceTypeRaw()
    {
        if (parentMessage.actingVersion < 1)
        {
            return (short)255;
        }

        return ((short)(buffer.getByte(offset + 270) & 0xFF));
    }

    public PegPriceType pegPriceType()
    {
        if (parentMessage.actingVersion < 1)
        {
            return PegPriceType.NULL_VAL;
        }

        return PegPriceType.get(((short)(buffer.getByte(offset + 270) & 0xFF)));
    }


    public static int pegOffsetTypeId()
    {
        return 51;
    }

    public static int pegOffsetTypeSinceVersion()
    {
        return 1;
    }

    public static int pegOffsetTypeEncodingOffset()
    {
        return 271;
    }

    public static int pegOffsetTypeEncodingLength()
    {
        return 1;
    }

    public static String pegOffsetTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public short pegOffsetTypeRaw()
    {
        if (parentMessage.actingVersion < 1)
        {
            return (short)255;
        }

        return ((short)(buffer.getByte(offset + 271) & 0xFF));
    }

    public PegOffsetType pegOffsetType()
    {
        if (parentMessage.actingVersion < 1)
        {
            return PegOffsetType.NULL_VAL;
        }

        return PegOffsetType.get(((short)(buffer.getByte(offset + 271) & 0xFF)));
    }


    public static int pegOffsetValueId()
    {
        return 52;
    }

    public static int pegOffsetValueSinceVersion()
    {
        return 1;
    }

    public static int pegOffsetValueEncodingOffset()
    {
        return 272;
    }

    public static int pegOffsetValueEncodingLength()
    {
        return 1;
    }

    public static String pegOffsetValueMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static short pegOffsetValueNullValue()
    {
        return (short)255;
    }

    public static short pegOffsetValueMinValue()
    {
        return (short)0;
    }

    public static short pegOffsetValueMaxValue()
    {
        return (short)254;
    }

    public short pegOffsetValue()
    {
        if (parentMessage.actingVersion < 1)
        {
            return (short)255;
        }

        return ((short)(buffer.getByte(offset + 272) & 0xFF));
    }


    public static int peggedPriceId()
    {
        return 53;
    }

    public static int peggedPriceSinceVersion()
    {
        return 1;
    }

    public static int peggedPriceEncodingOffset()
    {
        return 273;
    }

    public static int peggedPriceEncodingLength()
    {
        return 8;
    }

    public static String peggedPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public static long peggedPriceNullValue()
    {
        return -9223372036854775808L;
    }

    public static long peggedPriceMinValue()
    {
        return -9223372036854775807L;
    }

    public static long peggedPriceMaxValue()
    {
        return 9223372036854775807L;
    }

    public long peggedPrice()
    {
        if (parentMessage.actingVersion < 1)
        {
            return -9223372036854775808L;
        }

        return buffer.getLong(offset + 273, BYTE_ORDER);
    }


    public static int expiryReasonId()
    {
        return 54;
    }

    public static int expiryReasonSinceVersion()
    {
        return 3;
    }

    public static int expiryReasonEncodingOffset()
    {
        return 281;
    }

    public static int expiryReasonEncodingLength()
    {
        return 1;
    }

    public static String expiryReasonMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "optional";
        }

        return "";
    }

    public short expiryReasonRaw()
    {
        if (parentMessage.actingVersion < 3)
        {
            return (short)255;
        }

        return ((short)(buffer.getByte(offset + 281) & 0xFF));
    }

    public ExpiryReason expiryReason()
    {
        if (parentMessage.actingVersion < 3)
        {
            return ExpiryReason.NULL_VAL;
        }

        return ExpiryReason.get(((short)(buffer.getByte(offset + 281) & 0xFF)));
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

    public static int clientOrderIdId()
    {
        return 201;
    }

    public static int clientOrderIdSinceVersion()
    {
        return 0;
    }

    public static String clientOrderIdCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.UTF_8.name();
    }

    public static String clientOrderIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static int clientOrderIdHeaderLength()
    {
        return 1;
    }

    public int clientOrderIdLength()
    {
        final int limit = parentMessage.limit();
        return ((short)(buffer.getByte(limit) & 0xFF));
    }

    public int skipClientOrderId()
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int dataOffset = limit + headerLength;
        parentMessage.limit(dataOffset + dataLength);

        return dataLength;
    }

    public int getClientOrderId(final MutableDirectBuffer dst, final int dstOffset, final int length)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public int getClientOrderId(final byte[] dst, final int dstOffset, final int length)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public void wrapClientOrderId(final DirectBuffer wrapBuffer)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        parentMessage.limit(limit + headerLength + dataLength);
        wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
    }

    public String clientOrderId()
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

    public static int origClientOrderIdId()
    {
        return 202;
    }

    public static int origClientOrderIdSinceVersion()
    {
        return 0;
    }

    public static String origClientOrderIdCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.UTF_8.name();
    }

    public static String origClientOrderIdMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static int origClientOrderIdHeaderLength()
    {
        return 1;
    }

    public int origClientOrderIdLength()
    {
        final int limit = parentMessage.limit();
        return ((short)(buffer.getByte(limit) & 0xFF));
    }

    public int skipOrigClientOrderId()
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int dataOffset = limit + headerLength;
        parentMessage.limit(dataOffset + dataLength);

        return dataLength;
    }

    public int getOrigClientOrderId(final MutableDirectBuffer dst, final int dstOffset, final int length)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public int getOrigClientOrderId(final byte[] dst, final int dstOffset, final int length)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public void wrapOrigClientOrderId(final DirectBuffer wrapBuffer)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        parentMessage.limit(limit + headerLength + dataLength);
        wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
    }

    public String origClientOrderId()
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
        return 203;
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

    public static int rejectReasonId()
    {
        return 204;
    }

    public static int rejectReasonSinceVersion()
    {
        return 0;
    }

    public static String rejectReasonCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.UTF_8.name();
    }

    public static String rejectReasonMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static int rejectReasonHeaderLength()
    {
        return 1;
    }

    public int rejectReasonLength()
    {
        final int limit = parentMessage.limit();
        return ((short)(buffer.getByte(limit) & 0xFF));
    }

    public int skipRejectReason()
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int dataOffset = limit + headerLength;
        parentMessage.limit(dataOffset + dataLength);

        return dataLength;
    }

    public int getRejectReason(final MutableDirectBuffer dst, final int dstOffset, final int length)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public int getRejectReason(final byte[] dst, final int dstOffset, final int length)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public void wrapRejectReason(final DirectBuffer wrapBuffer)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        parentMessage.limit(limit + headerLength + dataLength);
        wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
    }

    public String rejectReason()
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

    public static int counterSymbolId()
    {
        return 205;
    }

    public static int counterSymbolSinceVersion()
    {
        return 0;
    }

    public static String counterSymbolCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.UTF_8.name();
    }

    public static String counterSymbolMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static int counterSymbolHeaderLength()
    {
        return 1;
    }

    public int counterSymbolLength()
    {
        final int limit = parentMessage.limit();
        return ((short)(buffer.getByte(limit) & 0xFF));
    }

    public int skipCounterSymbol()
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int dataOffset = limit + headerLength;
        parentMessage.limit(dataOffset + dataLength);

        return dataLength;
    }

    public int getCounterSymbol(final MutableDirectBuffer dst, final int dstOffset, final int length)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public int getCounterSymbol(final byte[] dst, final int dstOffset, final int length)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        final int bytesCopied = Math.min(length, dataLength);
        parentMessage.limit(limit + headerLength + dataLength);
        buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

        return bytesCopied;
    }

    public void wrapCounterSymbol(final DirectBuffer wrapBuffer)
    {
        final int headerLength = 1;
        final int limit = parentMessage.limit();
        final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
        parentMessage.limit(limit + headerLength + dataLength);
        wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
    }

    public String counterSymbol()
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

        final ExecutionReportEventDecoder decoder = new ExecutionReportEventDecoder();
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
        builder.append("[ExecutionReportEvent](sbeTemplateId=");
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
        builder.append("orderCreationTime=");
        builder.append(this.orderCreationTime());
        builder.append('|');
        builder.append("workingTime=");
        builder.append(this.workingTime());
        builder.append('|');
        builder.append("orderId=");
        builder.append(this.orderId());
        builder.append('|');
        builder.append("orderListId=");
        builder.append(this.orderListId());
        builder.append('|');
        builder.append("origQty=");
        builder.append(this.origQty());
        builder.append('|');
        builder.append("price=");
        builder.append(this.price());
        builder.append('|');
        builder.append("origQuoteOrderQty=");
        builder.append(this.origQuoteOrderQty());
        builder.append('|');
        builder.append("icebergQty=");
        builder.append(this.icebergQty());
        builder.append('|');
        builder.append("stopPrice=");
        builder.append(this.stopPrice());
        builder.append('|');
        builder.append("orderType=");
        builder.append(this.orderType());
        builder.append('|');
        builder.append("side=");
        builder.append(this.side());
        builder.append('|');
        builder.append("timeInForce=");
        builder.append(this.timeInForce());
        builder.append('|');
        builder.append("executionType=");
        builder.append(this.executionType());
        builder.append('|');
        builder.append("orderStatus=");
        builder.append(this.orderStatus());
        builder.append('|');
        builder.append("tradeId=");
        builder.append(this.tradeId());
        builder.append('|');
        builder.append("executionId=");
        builder.append(this.executionId());
        builder.append('|');
        builder.append("executedQty=");
        builder.append(this.executedQty());
        builder.append('|');
        builder.append("cummulativeQuoteQty=");
        builder.append(this.cummulativeQuoteQty());
        builder.append('|');
        builder.append("lastQty=");
        builder.append(this.lastQty());
        builder.append('|');
        builder.append("lastPrice=");
        builder.append(this.lastPrice());
        builder.append('|');
        builder.append("quoteQty=");
        builder.append(this.quoteQty());
        builder.append('|');
        builder.append("commission=");
        builder.append(this.commission());
        builder.append('|');
        builder.append("isWorking=");
        builder.append(this.isWorking());
        builder.append('|');
        builder.append("isMaker=");
        builder.append(this.isMaker());
        builder.append('|');
        builder.append("isBestMatch=");
        builder.append(this.isBestMatch());
        builder.append('|');
        builder.append("matchType=");
        builder.append(this.matchType());
        builder.append('|');
        builder.append("selfTradePreventionMode=");
        builder.append(this.selfTradePreventionMode());
        builder.append('|');
        builder.append("orderCapacity=");
        builder.append(this.orderCapacity());
        builder.append('|');
        builder.append("workingFloor=");
        builder.append(this.workingFloor());
        builder.append('|');
        builder.append("usedSor=");
        builder.append(this.usedSor());
        builder.append('|');
        builder.append("allocId=");
        builder.append(this.allocId());
        builder.append('|');
        builder.append("trailingDelta=");
        builder.append(this.trailingDelta());
        builder.append('|');
        builder.append("trailingTime=");
        builder.append(this.trailingTime());
        builder.append('|');
        builder.append("tradeGroupId=");
        builder.append(this.tradeGroupId());
        builder.append('|');
        builder.append("preventedQty=");
        builder.append(this.preventedQty());
        builder.append('|');
        builder.append("lastPreventedQty=");
        builder.append(this.lastPreventedQty());
        builder.append('|');
        builder.append("preventedMatchId=");
        builder.append(this.preventedMatchId());
        builder.append('|');
        builder.append("preventedExecutionQty=");
        builder.append(this.preventedExecutionQty());
        builder.append('|');
        builder.append("preventedExecutionPrice=");
        builder.append(this.preventedExecutionPrice());
        builder.append('|');
        builder.append("preventedExecutionQuoteQty=");
        builder.append(this.preventedExecutionQuoteQty());
        builder.append('|');
        builder.append("strategyType=");
        builder.append(this.strategyType());
        builder.append('|');
        builder.append("strategyId=");
        builder.append(this.strategyId());
        builder.append('|');
        builder.append("counterOrderId=");
        builder.append(this.counterOrderId());
        builder.append('|');
        builder.append("subscriptionId=");
        builder.append(this.subscriptionId());
        builder.append('|');
        builder.append("pegPriceType=");
        builder.append(this.pegPriceType());
        builder.append('|');
        builder.append("pegOffsetType=");
        builder.append(this.pegOffsetType());
        builder.append('|');
        builder.append("pegOffsetValue=");
        builder.append(this.pegOffsetValue());
        builder.append('|');
        builder.append("peggedPrice=");
        builder.append(this.peggedPrice());
        builder.append('|');
        builder.append("expiryReason=");
        builder.append(this.expiryReason());
        builder.append('|');
        builder.append("symbol=");
        builder.append('\'').append(symbol()).append('\'');
        builder.append('|');
        builder.append("clientOrderId=");
        builder.append('\'').append(clientOrderId()).append('\'');
        builder.append('|');
        builder.append("origClientOrderId=");
        builder.append('\'').append(origClientOrderId()).append('\'');
        builder.append('|');
        builder.append("commissionAsset=");
        builder.append('\'').append(commissionAsset()).append('\'');
        builder.append('|');
        builder.append("rejectReason=");
        builder.append('\'').append(rejectReason()).append('\'');
        builder.append('|');
        builder.append("counterSymbol=");
        builder.append('\'').append(counterSymbol()).append('\'');

        limit(originalLimit);

        return builder;
    }
    
    public ExecutionReportEventDecoder sbeSkip()
    {
        sbeRewind();
        skipSymbol();
        skipClientOrderId();
        skipOrigClientOrderId();
        skipCommissionAsset();
        skipRejectReason();
        skipCounterSymbol();

        return this;
    }
}
