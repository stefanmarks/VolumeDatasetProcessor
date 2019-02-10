/**
 * Class for encapsulating 3D integer coordinates.
 * 
 * @author Stefan Marks
 */
public class Vector3i
{
    public int x, y, z;
    
    public Vector3i() 
    {
        x=0; y=0; z=0;
    }
    
    public Vector3i(int _x, int _y, int _z) 
    {
        x=_x; y=_y; z=_z;
    }

    public Vector3i(Vector3i _v) 
    {
        x=_v.x; y=_v.y; z=_v.z;
    }
    
    public Vector3i copy()
    {
        return new Vector3i(x, y, z);
    }
}
