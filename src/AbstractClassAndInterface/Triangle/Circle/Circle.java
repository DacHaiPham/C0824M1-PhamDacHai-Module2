package AbstractClassAndInterface.Triangle.Circle;

import AbstractClassAndInterface.Triangle.Shape.Shape;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        super(); // Gọi constructor mặc định của Shape
    }

    public Circle(double radius) {
        super(); // Gọi constructor mặc định của Shape
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(); // Gọi constructor có tham số của Shape
        this.radius = radius;
    }

    public Circle(double v, String indigo, boolean b) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
