/* Generated SBE (Simple Binary Encoding) message codec. */
package spot_sbe;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class AllowedSelfTradePreventionModesDecoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final String SEMANTIC_VERSION = "5.2";
    public static final int ENCODED_LENGTH = 1;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public AllowedSelfTradePreventionModesDecoder wrap(final DirectBuffer buffer, final int offset)
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
        return 0 == buffer.getByte(offset);
    }

    public short getRaw()
    {
        return ((short)(buffer.getByte(offset) & 0xFF));
    }

    public boolean none()
    {
        return 0 != (buffer.getByte(offset) & (1 << 0));
    }

    public static boolean none(final byte value)
    {
        return 0 != (value & (1 << 0));
    }

    public boolean expireTaker()
    {
        return 0 != (buffer.getByte(offset) & (1 << 1));
    }

    public static boolean expireTaker(final byte value)
    {
        return 0 != (value & (1 << 1));
    }

    public boolean expireMaker()
    {
        return 0 != (buffer.getByte(offset) & (1 << 2));
    }

    public static boolean expireMaker(final byte value)
    {
        return 0 != (value & (1 << 2));
    }

    public boolean expireBoth()
    {
        return 0 != (buffer.getByte(offset) & (1 << 3));
    }

    public static boolean expireBoth(final byte value)
    {
        return 0 != (value & (1 << 3));
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
        if (none())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("none");
            atLeastOne = true;
        }
        if (expireTaker())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("expireTaker");
            atLeastOne = true;
        }
        if (expireMaker())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("expireMaker");
            atLeastOne = true;
        }
        if (expireBoth())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("expireBoth");
            atLeastOne = true;
        }
        builder.append('}');

        return builder;
    }
}
