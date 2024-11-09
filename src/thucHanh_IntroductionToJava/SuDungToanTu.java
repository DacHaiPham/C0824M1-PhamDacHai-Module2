package thucHanh_IntroductionToJava;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner input = new Scanner(System.in); //Khai bao doi tuong bang nhap ban phim

        System.out.print("Enter the width: ");
        width = input.nextFloat();

        System.out.print("Enter the height: ");
        height = input.nextFloat();

        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
