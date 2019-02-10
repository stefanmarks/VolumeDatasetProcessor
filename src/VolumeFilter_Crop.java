/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smarks
 */
public class VolumeFilter_Crop
{
    public VolumeFilter_Crop(Vector3i _offset, Vector3i _size)
    {
        offset = _offset.copy();
        size   = _size.copy();
    }
    
    public VolumeData filter(VolumeData _in)
    {
        VolumeData out = new VolumeData(size);
        Vector3i src = new Vector3i();
        Vector3i dst = new Vector3i();
        for(src.z=offset.z, dst.z=0; src.z < offset.z+size.z; src.z++, dst.z++)
        {
            for(src.y=offset.y, dst.y=0; src.y < offset.y+size.y; src.y++, dst.y++)
            {
                for(src.x=offset.x, dst.x=0; src.x < offset.x+size.x; src.x++, dst.x++)
                {
                    out.set(dst, _in.get(src));
                }
            }
        }
        return out;
    }
    
    private final Vector3i offset, size;
}
