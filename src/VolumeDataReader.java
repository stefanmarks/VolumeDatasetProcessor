import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/**
 * Class for loading volume dataset files.
 * 
 * @author Stefan Marks
 */
public class VolumeDataReader 
{
    public VolumeDataReader(File _file, Vector3i _size) throws FileNotFoundException
    {
        channel = new FileInputStream(_file).getChannel();
        buf     = ByteBuffer.allocate(Float.BYTES * _size.x);
        buf.order(ByteOrder.LITTLE_ENDIAN);
        
        size     = _size.copy();
        listener = null;
    }
    
    public void setProgressListener(IProgressListener _l)
    {
        listener = _l;
    }
    
    public VolumeData readData() throws IOException
    {
        VolumeData out = new VolumeData(size);
        Vector3i pos = new Vector3i();
        float min =  Float.MAX_VALUE;
        float max = -Float.MAX_VALUE;
        for(pos.z=0; pos.z < size.z; pos.z++)
        {
            if (listener != null) 
            {
                listener.updateProgress(100.0f * pos.z / size.z);
            }
            for(pos.y=0 ; pos.y < size.y; pos.y++)
            {
                buf.clear();
                channel.read(buf);
                buf.flip();
                for(pos.x=0 ; pos.x < size.x; pos.x++)
                {
                    float f= buf.getFloat();
                    min = Math.min(min, f);
                    max = Math.max(max, f);
                    out.set(pos, f);
                }
            }
        }
        System.out.println(min + "/" + max);
        if (listener != null) listener.updateProgress(100.0f);
        channel.close();
        return out;
    }
    
    private float readFloats() throws IOException
    {
        buf.clear();
        channel.read(buf);
        return buf.getFloat(0);
    }
    
    private final Vector3i    size;
    private final FileChannel channel;
    private final ByteBuffer  buf;
    private       IProgressListener listener;
}
