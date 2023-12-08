/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class AccountResponseDecoder
{
    public static final int BLOCK_LENGTH = 64;
    public static final int TEMPLATE_ID = 400;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final AccountResponseDecoder parentMessage = this;
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

    public AccountResponseDecoder wrap(
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

    public AccountResponseDecoder wrapAndApplyHeader(
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

    public AccountResponseDecoder sbeRewind()
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


    public static int commissionRateMakerId()
    {
        return 2;
    }

    public static int commissionRateMakerSinceVersion()
    {
        return 0;
    }

    public static int commissionRateMakerEncodingOffset()
    {
        return 1;
    }

    public static int commissionRateMakerEncodingLength()
    {
        return 8;
    }

    public static String commissionRateMakerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long commissionRateMakerNullValue()
    {
        return -9223372036854775808L;
    }

    public static long commissionRateMakerMinValue()
    {
        return -9223372036854775807L;
    }

    public static long commissionRateMakerMaxValue()
    {
        return 9223372036854775807L;
    }

    public long commissionRateMaker()
    {
        return buffer.getLong(offset + 1, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int commissionRateTakerId()
    {
        return 3;
    }

    public static int commissionRateTakerSinceVersion()
    {
        return 0;
    }

    public static int commissionRateTakerEncodingOffset()
    {
        return 9;
    }

    public static int commissionRateTakerEncodingLength()
    {
        return 8;
    }

    public static String commissionRateTakerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long commissionRateTakerNullValue()
    {
        return -9223372036854775808L;
    }

    public static long commissionRateTakerMinValue()
    {
        return -9223372036854775807L;
    }

    public static long commissionRateTakerMaxValue()
    {
        return 9223372036854775807L;
    }

    public long commissionRateTaker()
    {
        return buffer.getLong(offset + 9, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int commissionRateBuyerId()
    {
        return 4;
    }

    public static int commissionRateBuyerSinceVersion()
    {
        return 0;
    }

    public static int commissionRateBuyerEncodingOffset()
    {
        return 17;
    }

    public static int commissionRateBuyerEncodingLength()
    {
        return 8;
    }

    public static String commissionRateBuyerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long commissionRateBuyerNullValue()
    {
        return -9223372036854775808L;
    }

    public static long commissionRateBuyerMinValue()
    {
        return -9223372036854775807L;
    }

    public static long commissionRateBuyerMaxValue()
    {
        return 9223372036854775807L;
    }

    public long commissionRateBuyer()
    {
        return buffer.getLong(offset + 17, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int commissionRateSellerId()
    {
        return 5;
    }

    public static int commissionRateSellerSinceVersion()
    {
        return 0;
    }

    public static int commissionRateSellerEncodingOffset()
    {
        return 25;
    }

    public static int commissionRateSellerEncodingLength()
    {
        return 8;
    }

    public static String commissionRateSellerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long commissionRateSellerNullValue()
    {
        return -9223372036854775808L;
    }

    public static long commissionRateSellerMinValue()
    {
        return -9223372036854775807L;
    }

    public static long commissionRateSellerMaxValue()
    {
        return 9223372036854775807L;
    }

    public long commissionRateSeller()
    {
        return buffer.getLong(offset + 25, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int canTradeId()
    {
        return 6;
    }

    public static int canTradeSinceVersion()
    {
        return 0;
    }

    public static int canTradeEncodingOffset()
    {
        return 33;
    }

    public static int canTradeEncodingLength()
    {
        return 1;
    }

    public static String canTradeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short canTradeRaw()
    {
        return ((short)(buffer.getByte(offset + 33) & 0xFF));
    }

    public BoolEnum canTrade()
    {
        return BoolEnum.get(((short)(buffer.getByte(offset + 33) & 0xFF)));
    }


    public static int canWithdrawId()
    {
        return 7;
    }

    public static int canWithdrawSinceVersion()
    {
        return 0;
    }

    public static int canWithdrawEncodingOffset()
    {
        return 34;
    }

    public static int canWithdrawEncodingLength()
    {
        return 1;
    }

    public static String canWithdrawMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short canWithdrawRaw()
    {
        return ((short)(buffer.getByte(offset + 34) & 0xFF));
    }

    public BoolEnum canWithdraw()
    {
        return BoolEnum.get(((short)(buffer.getByte(offset + 34) & 0xFF)));
    }


    public static int canDepositId()
    {
        return 8;
    }

    public static int canDepositSinceVersion()
    {
        return 0;
    }

    public static int canDepositEncodingOffset()
    {
        return 35;
    }

    public static int canDepositEncodingLength()
    {
        return 1;
    }

    public static String canDepositMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short canDepositRaw()
    {
        return ((short)(buffer.getByte(offset + 35) & 0xFF));
    }

    public BoolEnum canDeposit()
    {
        return BoolEnum.get(((short)(buffer.getByte(offset + 35) & 0xFF)));
    }


    public static int brokeredId()
    {
        return 9;
    }

    public static int brokeredSinceVersion()
    {
        return 0;
    }

    public static int brokeredEncodingOffset()
    {
        return 36;
    }

    public static int brokeredEncodingLength()
    {
        return 1;
    }

    public static String brokeredMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short brokeredRaw()
    {
        return ((short)(buffer.getByte(offset + 36) & 0xFF));
    }

    public BoolEnum brokered()
    {
        return BoolEnum.get(((short)(buffer.getByte(offset + 36) & 0xFF)));
    }


    public static int requireSelfTradePreventionId()
    {
        return 10;
    }

    public static int requireSelfTradePreventionSinceVersion()
    {
        return 0;
    }

    public static int requireSelfTradePreventionEncodingOffset()
    {
        return 37;
    }

    public static int requireSelfTradePreventionEncodingLength()
    {
        return 1;
    }

    public static String requireSelfTradePreventionMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short requireSelfTradePreventionRaw()
    {
        return ((short)(buffer.getByte(offset + 37) & 0xFF));
    }

    public BoolEnum requireSelfTradePrevention()
    {
        return BoolEnum.get(((short)(buffer.getByte(offset + 37) & 0xFF)));
    }


    public static int preventSorId()
    {
        return 11;
    }

    public static int preventSorSinceVersion()
    {
        return 0;
    }

    public static int preventSorEncodingOffset()
    {
        return 38;
    }

    public static int preventSorEncodingLength()
    {
        return 1;
    }

    public static String preventSorMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short preventSorRaw()
    {
        return ((short)(buffer.getByte(offset + 38) & 0xFF));
    }

    public BoolEnum preventSor()
    {
        return BoolEnum.get(((short)(buffer.getByte(offset + 38) & 0xFF)));
    }


    public static int updateTimeId()
    {
        return 12;
    }

    public static int updateTimeSinceVersion()
    {
        return 0;
    }

    public static int updateTimeEncodingOffset()
    {
        return 39;
    }

    public static int updateTimeEncodingLength()
    {
        return 8;
    }

    public static String updateTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long updateTimeNullValue()
    {
        return -9223372036854775808L;
    }

    public static long updateTimeMinValue()
    {
        return -9223372036854775807L;
    }

    public static long updateTimeMaxValue()
    {
        return 9223372036854775807L;
    }

    public long updateTime()
    {
        return buffer.getLong(offset + 39, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int accountTypeId()
    {
        return 13;
    }

    public static int accountTypeSinceVersion()
    {
        return 0;
    }

    public static int accountTypeEncodingOffset()
    {
        return 47;
    }

    public static int accountTypeEncodingLength()
    {
        return 1;
    }

    public static String accountTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public short accountTypeRaw()
    {
        return ((short)(buffer.getByte(offset + 47) & 0xFF));
    }

    public AccountType accountType()
    {
        return AccountType.get(((short)(buffer.getByte(offset + 47) & 0xFF)));
    }


    public static int tradeGroupIdId()
    {
        return 14;
    }

    public static int tradeGroupIdSinceVersion()
    {
        return 0;
    }

    public static int tradeGroupIdEncodingOffset()
    {
        return 48;
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
        return buffer.getLong(offset + 48, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int uidId()
    {
        return 15;
    }

    public static int uidSinceVersion()
    {
        return 0;
    }

    public static int uidEncodingOffset()
    {
        return 56;
    }

    public static int uidEncodingLength()
    {
        return 8;
    }

    public static String uidMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static long uidNullValue()
    {
        return -9223372036854775808L;
    }

    public static long uidMinValue()
    {
        return -9223372036854775807L;
    }

    public static long uidMaxValue()
    {
        return 9223372036854775807L;
    }

    public long uid()
    {
        return buffer.getLong(offset + 56, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    private final BalancesDecoder balances = new BalancesDecoder(this);

    public static long balancesDecoderId()
    {
        return 100;
    }

    public static int balancesDecoderSinceVersion()
    {
        return 0;
    }

    public BalancesDecoder balances()
    {
        balances.wrap(buffer);
        return balances;
    }

    public static final class BalancesDecoder
        implements Iterable<BalancesDecoder>, java.util.Iterator<BalancesDecoder>
    {
        public static final int HEADER_SIZE = 6;
        private final AccountResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        BalancesDecoder(final AccountResponseDecoder parentMessage)
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

        public BalancesDecoder next()
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
            return 17;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<BalancesDecoder> iterator()
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

        public static int exponentId()
        {
            return 1;
        }

        public static int exponentSinceVersion()
        {
            return 0;
        }

        public static int exponentEncodingOffset()
        {
            return 0;
        }

        public static int exponentEncodingLength()
        {
            return 1;
        }

        public static String exponentMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static byte exponentNullValue()
        {
            return (byte)-128;
        }

        public static byte exponentMinValue()
        {
            return (byte)-127;
        }

        public static byte exponentMaxValue()
        {
            return (byte)127;
        }

        public byte exponent()
        {
            return buffer.getByte(offset + 0);
        }


        public static int freeId()
        {
            return 2;
        }

        public static int freeSinceVersion()
        {
            return 0;
        }

        public static int freeEncodingOffset()
        {
            return 1;
        }

        public static int freeEncodingLength()
        {
            return 8;
        }

        public static String freeMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long freeNullValue()
        {
            return -9223372036854775808L;
        }

        public static long freeMinValue()
        {
            return -9223372036854775807L;
        }

        public static long freeMaxValue()
        {
            return 9223372036854775807L;
        }

        public long free()
        {
            return buffer.getLong(offset + 1, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int lockedId()
        {
            return 3;
        }

        public static int lockedSinceVersion()
        {
            return 0;
        }

        public static int lockedEncodingOffset()
        {
            return 9;
        }

        public static int lockedEncodingLength()
        {
            return 8;
        }

        public static String lockedMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long lockedNullValue()
        {
            return -9223372036854775808L;
        }

        public static long lockedMinValue()
        {
            return -9223372036854775807L;
        }

        public static long lockedMaxValue()
        {
            return 9223372036854775807L;
        }

        public long locked()
        {
            return buffer.getLong(offset + 9, java.nio.ByteOrder.LITTLE_ENDIAN);
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

        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("exponent=");
            builder.append(this.exponent());
            builder.append('|');
            builder.append("free=");
            builder.append(this.free());
            builder.append('|');
            builder.append("locked=");
            builder.append(this.locked());
            builder.append('|');
            builder.append("asset=");
            builder.append('\'').append(asset()).append('\'');
            builder.append(')');

            return builder;
        }
        
        public BalancesDecoder sbeSkip()
        {
            skipAsset();

            return this;
        }
    }

    private final PermissionsDecoder permissions = new PermissionsDecoder(this);

    public static long permissionsDecoderId()
    {
        return 101;
    }

    public static int permissionsDecoderSinceVersion()
    {
        return 0;
    }

    public PermissionsDecoder permissions()
    {
        permissions.wrap(buffer);
        return permissions;
    }

    public static final class PermissionsDecoder
        implements Iterable<PermissionsDecoder>, java.util.Iterator<PermissionsDecoder>
    {
        public static final int HEADER_SIZE = 6;
        private final AccountResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        PermissionsDecoder(final AccountResponseDecoder parentMessage)
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

        public PermissionsDecoder next()
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

        public java.util.Iterator<PermissionsDecoder> iterator()
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

        public static int permissionId()
        {
            return 200;
        }

        public static int permissionSinceVersion()
        {
            return 0;
        }

        public static String permissionCharacterEncoding()
        {
            return java.nio.charset.StandardCharsets.UTF_8.name();
        }

        public static String permissionMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static int permissionHeaderLength()
        {
            return 1;
        }

        public int permissionLength()
        {
            final int limit = parentMessage.limit();
            return ((short)(buffer.getByte(limit) & 0xFF));
        }

        public int skipPermission()
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int dataOffset = limit + headerLength;
            parentMessage.limit(dataOffset + dataLength);

            return dataLength;
        }

        public int getPermission(final MutableDirectBuffer dst, final int dstOffset, final int length)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public int getPermission(final byte[] dst, final int dstOffset, final int length)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            final int bytesCopied = Math.min(length, dataLength);
            parentMessage.limit(limit + headerLength + dataLength);
            buffer.getBytes(limit + headerLength, dst, dstOffset, bytesCopied);

            return bytesCopied;
        }

        public void wrapPermission(final DirectBuffer wrapBuffer)
        {
            final int headerLength = 1;
            final int limit = parentMessage.limit();
            final int dataLength = ((short)(buffer.getByte(limit) & 0xFF));
            parentMessage.limit(limit + headerLength + dataLength);
            wrapBuffer.wrap(buffer, limit + headerLength, dataLength);
        }

        public String permission()
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

        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("permission=");
            builder.append('\'').append(permission()).append('\'');
            builder.append(')');

            return builder;
        }
        
        public PermissionsDecoder sbeSkip()
        {
            skipPermission();

            return this;
        }
    }

    private final ReduceOnlyAssetsDecoder reduceOnlyAssets = new ReduceOnlyAssetsDecoder(this);

    public static long reduceOnlyAssetsDecoderId()
    {
        return 102;
    }

    public static int reduceOnlyAssetsDecoderSinceVersion()
    {
        return 0;
    }

    public ReduceOnlyAssetsDecoder reduceOnlyAssets()
    {
        reduceOnlyAssets.wrap(buffer);
        return reduceOnlyAssets;
    }

    public static final class ReduceOnlyAssetsDecoder
        implements Iterable<ReduceOnlyAssetsDecoder>, java.util.Iterator<ReduceOnlyAssetsDecoder>
    {
        public static final int HEADER_SIZE = 6;
        private final AccountResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        ReduceOnlyAssetsDecoder(final AccountResponseDecoder parentMessage)
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

        public ReduceOnlyAssetsDecoder next()
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

        public java.util.Iterator<ReduceOnlyAssetsDecoder> iterator()
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

        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("asset=");
            builder.append('\'').append(asset()).append('\'');
            builder.append(')');

            return builder;
        }
        
        public ReduceOnlyAssetsDecoder sbeSkip()
        {
            skipAsset();

            return this;
        }
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final AccountResponseDecoder decoder = new AccountResponseDecoder();
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
        builder.append("[AccountResponse](sbeTemplateId=");
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
        builder.append("commissionRateMaker=");
        builder.append(this.commissionRateMaker());
        builder.append('|');
        builder.append("commissionRateTaker=");
        builder.append(this.commissionRateTaker());
        builder.append('|');
        builder.append("commissionRateBuyer=");
        builder.append(this.commissionRateBuyer());
        builder.append('|');
        builder.append("commissionRateSeller=");
        builder.append(this.commissionRateSeller());
        builder.append('|');
        builder.append("canTrade=");
        builder.append(this.canTrade());
        builder.append('|');
        builder.append("canWithdraw=");
        builder.append(this.canWithdraw());
        builder.append('|');
        builder.append("canDeposit=");
        builder.append(this.canDeposit());
        builder.append('|');
        builder.append("brokered=");
        builder.append(this.brokered());
        builder.append('|');
        builder.append("requireSelfTradePrevention=");
        builder.append(this.requireSelfTradePrevention());
        builder.append('|');
        builder.append("preventSor=");
        builder.append(this.preventSor());
        builder.append('|');
        builder.append("updateTime=");
        builder.append(this.updateTime());
        builder.append('|');
        builder.append("accountType=");
        builder.append(this.accountType());
        builder.append('|');
        builder.append("tradeGroupId=");
        builder.append(this.tradeGroupId());
        builder.append('|');
        builder.append("uid=");
        builder.append(this.uid());
        builder.append('|');
        builder.append("balances=[");
        final int balancesOriginalOffset = balances.offset;
        final int balancesOriginalIndex = balances.index;
        final BalancesDecoder balances = this.balances();
        if (balances.count() > 0)
        {
            while (balances.hasNext())
            {
                balances.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        balances.offset = balancesOriginalOffset;
        balances.index = balancesOriginalIndex;
        builder.append(']');
        builder.append('|');
        builder.append("permissions=[");
        final int permissionsOriginalOffset = permissions.offset;
        final int permissionsOriginalIndex = permissions.index;
        final PermissionsDecoder permissions = this.permissions();
        if (permissions.count() > 0)
        {
            while (permissions.hasNext())
            {
                permissions.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        permissions.offset = permissionsOriginalOffset;
        permissions.index = permissionsOriginalIndex;
        builder.append(']');
        builder.append('|');
        builder.append("reduceOnlyAssets=[");
        final int reduceOnlyAssetsOriginalOffset = reduceOnlyAssets.offset;
        final int reduceOnlyAssetsOriginalIndex = reduceOnlyAssets.index;
        final ReduceOnlyAssetsDecoder reduceOnlyAssets = this.reduceOnlyAssets();
        if (reduceOnlyAssets.count() > 0)
        {
            while (reduceOnlyAssets.hasNext())
            {
                reduceOnlyAssets.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        reduceOnlyAssets.offset = reduceOnlyAssetsOriginalOffset;
        reduceOnlyAssets.index = reduceOnlyAssetsOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public AccountResponseDecoder sbeSkip()
    {
        sbeRewind();
        BalancesDecoder balances = this.balances();
        if (balances.count() > 0)
        {
            while (balances.hasNext())
            {
                balances.next();
                balances.sbeSkip();
            }
        }
        PermissionsDecoder permissions = this.permissions();
        if (permissions.count() > 0)
        {
            while (permissions.hasNext())
            {
                permissions.next();
                permissions.sbeSkip();
            }
        }
        ReduceOnlyAssetsDecoder reduceOnlyAssets = this.reduceOnlyAssets();
        if (reduceOnlyAssets.count() > 0)
        {
            while (reduceOnlyAssets.hasNext())
            {
                reduceOnlyAssets.next();
                reduceOnlyAssets.sbeSkip();
            }
        }

        return this;
    }
}
