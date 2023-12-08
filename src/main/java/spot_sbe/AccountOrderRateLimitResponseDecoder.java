/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class AccountOrderRateLimitResponseDecoder
{
    public static final int BLOCK_LENGTH = 0;
    public static final int TEMPLATE_ID = 402;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final AccountOrderRateLimitResponseDecoder parentMessage = this;
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

    public AccountOrderRateLimitResponseDecoder wrap(
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

    public AccountOrderRateLimitResponseDecoder wrapAndApplyHeader(
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

    public AccountOrderRateLimitResponseDecoder sbeRewind()
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
        public static final int HEADER_SIZE = 6;
        private final AccountOrderRateLimitResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        RateLimitsDecoder(final AccountOrderRateLimitResponseDecoder parentMessage)
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


        public static int numOrdersId()
        {
            return 5;
        }

        public static int numOrdersSinceVersion()
        {
            return 0;
        }

        public static int numOrdersEncodingOffset()
        {
            return 11;
        }

        public static int numOrdersEncodingLength()
        {
            return 8;
        }

        public static String numOrdersMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static long numOrdersNullValue()
        {
            return -9223372036854775808L;
        }

        public static long numOrdersMinValue()
        {
            return -9223372036854775807L;
        }

        public static long numOrdersMaxValue()
        {
            return 9223372036854775807L;
        }

        public long numOrders()
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
            builder.append("numOrders=");
            builder.append(this.numOrders());
            builder.append(')');

            return builder;
        }
        
        public RateLimitsDecoder sbeSkip()
        {

            return this;
        }
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final AccountOrderRateLimitResponseDecoder decoder = new AccountOrderRateLimitResponseDecoder();
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
        builder.append("[AccountOrderRateLimitResponse](sbeTemplateId=");
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

        limit(originalLimit);

        return builder;
    }
    
    public AccountOrderRateLimitResponseDecoder sbeSkip()
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

        return this;
    }
}
