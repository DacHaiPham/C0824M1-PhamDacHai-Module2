package thucHanh_IntroductionToJava;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.print("Enter weight (in Kilogram): ");
        weight = scanner.nextDouble();

        System.out.print("Enter height (in meters): ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        System.out.printf("%-20s%s\n", "BMI", "Interpretation");

        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s\n", bmi, "Underweight");
        } else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s\n", bmi, "Normal");
        } else if (bmi < 30.0) {
            System.out.printf("%-20.2f%s\n", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s\n", bmi, "Obese");
        }
    }
}
