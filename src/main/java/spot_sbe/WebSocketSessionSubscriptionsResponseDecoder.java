/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class WebSocketSessionSubscriptionsResponseDecoder
{
    public static final int BLOCK_LENGTH = 0;
    public static final int TEMPLATE_ID = 54;
    public static final int SCHEMA_ID = 3;
    public static final int SCHEMA_VERSION = 5;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final WebSocketSessionSubscriptionsResponseDecoder parentMessage = this;
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

    public WebSocketSessionSubscriptionsResponseDecoder wrap(
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

    public WebSocketSessionSubscriptionsResponseDecoder wrapAndApplyHeader(
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

    public WebSocketSessionSubscriptionsResponseDecoder sbeRewind()
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

    private final SubscriptionsDecoder subscriptions = new SubscriptionsDecoder(this);

    public static long subscriptionsDecoderId()
    {
        return 100;
    }

    public static int subscriptionsDecoderSinceVersion()
    {
        return 0;
    }

    public SubscriptionsDecoder subscriptions()
    {
        subscriptions.wrap(buffer);
        return subscriptions;
    }

    public static final class SubscriptionsDecoder
        implements Iterable<SubscriptionsDecoder>, java.util.Iterator<SubscriptionsDecoder>
    {
        public static final int HEADER_SIZE = 6;
        private final WebSocketSessionSubscriptionsResponseDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        SubscriptionsDecoder(final WebSocketSessionSubscriptionsResponseDecoder parentMessage)
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

        public SubscriptionsDecoder next()
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
            return 10;
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

        public java.util.Iterator<SubscriptionsDecoder> iterator()
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

        public static int subscriptionIdId()
        {
            return 1;
        }

        public static int subscriptionIdSinceVersion()
        {
            return 0;
        }

        public static int subscriptionIdEncodingOffset()
        {
            return 0;
        }

        public static int subscriptionIdEncodingLength()
        {
            return 2;
        }

        public static String subscriptionIdMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
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
            return (buffer.getShort(offset + 0, BYTE_ORDER) & 0xFFFF);
        }


        public static int expirationTimeId()
        {
            return 2;
        }

        public static int expirationTimeSinceVersion()
        {
            return 0;
        }

        public static int expirationTimeEncodingOffset()
        {
            return 2;
        }

        public static int expirationTimeEncodingLength()
        {
            return 8;
        }

        public static String expirationTimeMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "optional";
            }

            return "";
        }

        public static long expirationTimeNullValue()
        {
            return -9223372036854775808L;
        }

        public static long expirationTimeMinValue()
        {
            return -9223372036854775807L;
        }

        public static long expirationTimeMaxValue()
        {
            return 9223372036854775807L;
        }

        public long expirationTime()
        {
            return buffer.getLong(offset + 2, BYTE_ORDER);
        }


        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("subscriptionId=");
            builder.append(this.subscriptionId());
            builder.append('|');
            builder.append("expirationTime=");
            builder.append(this.expirationTime());
            builder.append(')');

            return builder;
        }
        
        public SubscriptionsDecoder sbeSkip()
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

        final WebSocketSessionSubscriptionsResponseDecoder decoder = new WebSocketSessionSubscriptionsResponseDecoder();
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
        builder.append("[WebSocketSessionSubscriptionsResponse](sbeTemplateId=");
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
        builder.append("subscriptions=[");
        final int subscriptionsOriginalOffset = subscriptions.offset;
        final int subscriptionsOriginalIndex = subscriptions.index;
        final SubscriptionsDecoder subscriptions = this.subscriptions();
        if (subscriptions.count() > 0)
        {
            while (subscriptions.hasNext())
            {
                subscriptions.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        subscriptions.offset = subscriptionsOriginalOffset;
        subscriptions.index = subscriptionsOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public WebSocketSessionSubscriptionsResponseDecoder sbeSkip()
    {
        sbeRewind();
        SubscriptionsDecoder subscriptions = this.subscriptions();
        if (subscriptions.count() > 0)
        {
            while (subscriptions.hasNext())
            {
                subscriptions.next();
                subscriptions.sbeSkip();
            }
        }

        return this;
    }
}
