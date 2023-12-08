/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class OrderTypesDecoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final int ENCODED_LENGTH = 2;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public OrderTypesDecoder wrap(final DirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;

        return this;
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public int encodedLength()
    {
        return ENCODED_LENGTH;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public boolean isEmpty()
    {
        return 0 == buffer.getShort(offset);
    }

    public int getRaw()
    {
        return (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
    }

    public boolean market()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 0));
    }

    public static boolean market(final short value)
    {
        return 0 != (value & (1 << 0));
    }

    public boolean limit()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 1));
    }

    public static boolean limit(final short value)
    {
        return 0 != (value & (1 << 1));
    }

    public boolean stopLoss()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 2));
    }

    public static boolean stopLoss(final short value)
    {
        return 0 != (value & (1 << 2));
    }

    public boolean stopLossLimit()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 3));
    }

    public static boolean stopLossLimit(final short value)
    {
        return 0 != (value & (1 << 3));
    }

    public boolean takeProfit()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 4));
    }

    public static boolean takeProfit(final short value)
    {
        return 0 != (value & (1 << 4));
    }

    public boolean takeProfitLimit()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 5));
    }

    public static boolean takeProfitLimit(final short value)
    {
        return 0 != (value & (1 << 5));
    }

    public boolean limitMaker()
    {
        return 0 != (buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 6));
    }

    public static boolean limitMaker(final short value)
    {
        return 0 != (value & (1 << 6));
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        return appendTo(new StringBuilder()).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        builder.append('{');
        boolean atLeastOne = false;
        if (market())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("market");
            atLeastOne = true;
        }
        if (limit())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("limit");
            atLeastOne = true;
        }
        if (stopLoss())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("stopLoss");
            atLeastOne = true;
        }
        if (stopLossLimit())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("stopLossLimit");
            atLeastOne = true;
        }
        if (takeProfit())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("takeProfit");
            atLeastOne = true;
        }
        if (takeProfitLimit())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("takeProfitLimit");
            atLeastOne = true;
        }
        if (limitMaker())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("limitMaker");
            atLeastOne = true;
        }
        builder.append('}');

        return builder;
    }
}
