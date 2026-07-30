/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class OutboundAccountPositionEventDecoder
{
    public static final int BLOCK_LENGTH = 18;
    public static final int TEMPLATE_ID = 607;
    public static final int SCHEMA_ID = 3;
    public static final int SCHEMA_VERSION = 5;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final OutboundAccountPositionEventDecoder parentMessage = this;
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

    public OutboundAccountPositionEventDecoder wrap(
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

    public OutboundAccountPositionEventDecoder wrapAndApplyHeader(
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

    public OutboundAccountPositionEventDecoder sbeRewind()
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


    public static int updateTimeId()
    {
        return 2;
    }

    public static int updateTimeSinceVersion()
    {
        return 0;
    }

    public static int updateTimeEncodingOffset()
    {
        return 8;
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
        return buffer.getLong(offset + 8, BYTE_ORDER);
    }


    public static int subscriptionIdId()
    {
        return 3;
    }

    public static int subscriptionIdSinceVersion()
    {
        return 1;
    }

    public static int subscriptionIdEncodingOffset()
    {
        return 16;
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

        return (buffer.getShort(offset + 16, BYTE_ORDER) & 0xFFFF);
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
        private final OutboundAccountPositionEventDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        BalancesDecoder(final OutboundAccountPositionEventDecoder parentMessage)
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
            blockLength = (buffer.getShort(limit + 0, BYTE_ORDER) & 0xFFFF);
            count = (int)(buffer.getInt(limit + 2, BYTE_ORDER) & 0xFFFF_FFFFL);
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

        public int actingVersion()
        {
            return parentMessage.actingVersion;
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
            return buffer.getLong(offset + 1, BYTE_ORDER);
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
            return buffer.getLong(offset + 9, BYTE_ORDER);
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

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final OutboundAccountPositionEventDecoder decoder = new OutboundAccountPositionEventDecoder();
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
        builder.append("[OutboundAccountPositionEvent](sbeTemplateId=");
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
        builder.append("updateTime=");
        builder.append(this.updateTime());
        builder.append('|');
        builder.append("subscriptionId=");
        builder.append(this.subscriptionId());
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

        limit(originalLimit);

        return builder;
    }
    
    public OutboundAccountPositionEventDecoder sbeSkip()
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

        return this;
    }
}
