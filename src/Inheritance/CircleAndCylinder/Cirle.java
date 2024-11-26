package Inheritance.CircleAndCylinder;

public class Cirle {
    private double radius;
    private String color;

    //Constructor
    public Cirle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Mehtod to calculate Area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //Override toString method
    public String toString() {
        return "Cirle[radius=" + radius + ", color=" + color + ", area=" + getArea() + "]";
    }
}
