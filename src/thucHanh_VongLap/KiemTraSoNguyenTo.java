package thucHanh_VongLap;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " là số nguyên tố.");
        } else {
            System.out.println(number + "không phải là số nguyên tố.");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Các số nhỏ hơn hoặc bằng 1 không phải là số nguyên tố
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Nếu chia hết, không phải là số nguyên tố
            }
        }
        return true; // Nếu không chia hết cho bất kỳ số nào, là số nguyên tố
    }
}
