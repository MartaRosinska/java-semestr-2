// Marta Rosińska
public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x,float y,float z)
    {
        super(x,y);
        this.z = z;
    }
    public Point3D()
    {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z)
    {
        this.y = y;
        this.x = x;
        this.z = z;
    }
    public float[] getXYZ()
    {
        float[] Point = new float[2];
        return new float[]{x,y,z};
    }

    @Override
    public String toString() {
        return super.toString()+","+z;
    }
}
