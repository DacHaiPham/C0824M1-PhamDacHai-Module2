package thucHanh_IntroductionToJava;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double rate = 23000.0;

        Scanner scannner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        double USD = scannner.nextDouble();

        double vnd = rate * USD;
        System.out.println("Giá trị tương đương VND: " + vnd);
    }
}
