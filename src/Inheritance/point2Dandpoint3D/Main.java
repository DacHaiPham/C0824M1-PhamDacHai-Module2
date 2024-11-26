package Inheritance.point2Dandpoint3D;

public class Main {
    public static void main(String[] args) {
        //Test Point2D
        point2D point2D = new point2D(1.5f, 2.5f);
        System.out.println("point2D: " + point2D);

        point2D.setXY(3.0f, 4.0f);
        System.out.println("Updated point2D: " + point2D);

        //Test Point3D
        point3D point3D = new point3D(5.0f, 6.0f, 7.0f);
        System.out.println("point3D: " + point3D);

        point3D.setXYZ(8.0f, 9.0f, 10.0f);
        System.out.println("Updated point3D: " + point3D);

        //Access individual coordinates
        float[] xyz = point3D.getXYZ();
        System.out.println("xyz: " + xyz[0] + ", " + xyz[1] + ", " + xyz[2]);
    }
}
