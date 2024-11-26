package Inheritance.CircleAndCylinder;

public class Cylinder extends Cirle{
    private double height;

    //Constructor
    public Cylinder(double radius, String color, double height) {
        super(radius, color); //Call supercall constructor
        this.height = height;
    }

    //Getter and setter for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Method to calculate volume
    public double getVolume(){
        return getArea() * height; //getArea() from Circle
    }

    public String toString() {
        return "Cylinder[radius=" + getRadius() + ", color=" + getColor() +
                ", height=" + height + ", area=" + getArea() + ", volume=" + getVolume() + "]";
    }
}
