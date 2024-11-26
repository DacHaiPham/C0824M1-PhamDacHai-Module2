package Inheritance.point2Dandpoint3D;

class point3D extends point2D {
    private float z = 0.0f;

    // Constructors
    public point3D() {
        super();
    }

    public point3D(float x, float y, float z) {
        super(x, y); // Reuse constructor of Point2D
        this.z = z;
    }

    // Getter and Setter for z
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    // Set x, y, and z together
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    // Get x, y, and z as an array
    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    // Override toString
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
