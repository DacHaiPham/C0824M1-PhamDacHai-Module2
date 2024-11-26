package thucHanh_AccessModifier.accessModifier;

public class Main {
    public static void main(String[] args) {
        accessModifier.Car car1 = new accessModifier.Car("Mazda 3","Skyactiv 3");
        System.out.println(accessModifier.Car.numberOfCars);
        accessModifier.Car car2 = new accessModifier.Car("Mazda 6","Skyactiv 6");
        System.out.println(accessModifier.Car.numberOfCars);
    }
}
