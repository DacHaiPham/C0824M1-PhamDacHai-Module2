package Inheritance.PointAndMoveablePoint;

public class Main {
    public static void main(String[] args) {
        // Test Point
        Point point = new Point(1.0f, 2.0f);
        System.out.println("Point: " + point); // Expected: (1.0, 2.0)

        point.setXY(3.0f, 4.0f);
        System.out.println("Updated Point: " + point); // Expected: (3.0, 4.0)

        // Test MovablePoint
        MoveablePoint movablePoint = new MoveablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println("MovablePoint: " + movablePoint); // Expected: (1.0, 2.0), speed=(0.5, 0.5)

        movablePoint.move();
        System.out.println("After move: " + movablePoint); // Expected: (1.5, 2.5), speed=(0.5, 0.5)

        movablePoint.setSpeed(1.0f, 1.0f);
        movablePoint.move();
        System.out.println("After another move: " + movablePoint); // Expected: (2.5, 3.5), speed=(1.0, 1.0)
    }
}
