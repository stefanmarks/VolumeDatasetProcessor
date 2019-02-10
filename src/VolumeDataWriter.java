import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/**
 * Class for loading volume dataset files.
 * 
 * @author Stefan Marks
 */
public class VolumeDataWriter 
{
    public VolumeDataWriter(File _file) throws IOException
    {
        channel = new FileOutputStream(_file).getChannel();
    }
    
    public void setProgressListener(IProgressListener _l)
    {
        listener = _l;
    }
    
    public void write(VolumeData _vol) throws IOException
    {
        // magic header
        ByteBuffer buf = ByteBuffer.allocate(2);
        buf.put((byte) 'V').put((byte) 'F');
        buf.flip();
        channel.write(buf);
        // size
        buf = ByteBuffer.allocate(3*Integer.SIZE);
        buf.order(ByteOrder.LITTLE_ENDIAN);
        Vector3i size = _vol.getSize();
        buf.putInt(size.x).putInt(size.y).putInt(size.z);
        buf.flip();
        channel.write(buf);
        // data
        buf = ByteBuffer.allocate(size.x*Float.SIZE);
        buf.order(ByteOrder.LITTLE_ENDIAN);
        Vector3i pos = new Vector3i();
        for(pos.z=0; pos.z < size.z; pos.z++)
        {
            if (listener != null) 
            {
                listener.updateProgress(100.0f * pos.z / size.z);
            }
            for(pos.y=0 ; pos.y < size.y; pos.y++)
            {
                buf.clear();
                for(pos.x=0 ; pos.x < size.x; pos.x++)
                {
                    buf.putFloat(_vol.get(pos));
                }
                buf.flip();
                channel.write(buf);
            }
        }
        if (listener != null) listener.updateProgress(100.0f);
        channel.close();
    }
    

    private final FileChannel channel;
    private       IProgressListener listener;
}
