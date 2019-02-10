
import java.util.Arrays;

/**
 * Base class for holding a volumetric dataset.
 *
 * @author smarks
 */
public class VolumeData
{
    public VolumeData(Vector3i _size)
    {
        size = _size.copy();
        data = new float[size.x * size.y * size.z];
        Arrays.fill(data, 0);
    }
    
    
    public float get(Vector3i _v)
    {
        if (   (_v.x < 0) || (_v.x >= size.x)
            || (_v.y < 0) || (_v.y >= size.y)
            || (_v.z < 0) || (_v.z >= size.z)) return 0.0f;
        int idx = _v.z * size.y * size.x + _v.y * size.x + _v.x;
        return data[idx];
    }
    
    public void set(Vector3i _v, float _value)
    {
        if (   (_v.x < 0) || (_v.x >= size.x)
            || (_v.y < 0) || (_v.y >= size.y)
            || (_v.z < 0) || (_v.z >= size.z)) return;
        int idx = _v.z * size.y * size.x + _v.y * size.x + _v.x;
        data[idx] = _value;
    }
    
    
    public Vector3i getSize()
    {
        return size;
    }
    
    
    private final float    data[];
    private final Vector3i size;
}
