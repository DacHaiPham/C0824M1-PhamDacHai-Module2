package thucHanh_AccessModifier.accessModifierPractice;

public class Main {
    public static void main(String[] args) {
        accessModifierPractice.Circle circle = new accessModifierPractice.Circle(5.0);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
    }
}
