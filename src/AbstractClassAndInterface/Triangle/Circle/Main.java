package AbstractClassAndInterface.Triangle.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
