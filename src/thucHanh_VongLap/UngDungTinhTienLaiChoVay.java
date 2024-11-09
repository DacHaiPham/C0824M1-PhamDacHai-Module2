package thucHanh_VongLap;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền cho vay: ");
        double principal = scanner.nextDouble();

        System.out.print("Nhập tỉ lệ lãi suất theo tháng (%): ");
        double monthlyInterestRate = scanner.nextDouble() / 10;

        System.out.print("Nhập số tháng cho vay: ");
        int loanTerm = scanner.nextInt();

        double totalAmount = principal * (1 + monthlyInterestRate * loanTerm);

        System.out.printf("Tổng số tiền sau %d tháng: %.2f\n",loanTerm, totalAmount);
    }
}
