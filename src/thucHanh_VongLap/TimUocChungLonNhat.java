package thucHanh_VongLap;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        int gcd = findGCD(a, b);
        if (gcd == 0) {
            System.out.println("Cả hai số đều bằng 0, không có ƯCLN.");
        } else {
            System.out.println("Ước số chung lớn nhất của " + a + " và " + b + " là: " + gcd);
        }
    }

    public static int findGCD(int a, int b) {
        if (a == 0) return Math.abs(b);
        if (b == 0) return Math.abs(a);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return Math.abs(a);
    }
}
