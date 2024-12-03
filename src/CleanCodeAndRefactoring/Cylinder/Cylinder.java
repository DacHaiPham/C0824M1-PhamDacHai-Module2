package CleanCodeAndRefactoring.Cylinder;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius); // Gọi phương thức tính diện tích đáy
        double perimeter = getPerimeter(radius); // Gọi phương thức tính chu vi
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    // Tính chu vi của hình trụ
    private static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    // Tính diện tích đáy của hình trụ
    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
}
