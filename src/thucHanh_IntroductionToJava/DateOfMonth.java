package thucHanh_IntroductionToJava;

import java.util.Scanner;

public class DateOfMonth {
    private static String daysInMonth;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month: ");
        int month = input.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng'" + month + "' có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng'" + month + "' có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng'" + month + "' có 30 ngày");
                break;
            default:
                daysInMonth = "";
        }
        if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        else System.out.print("Invalid input!");
    }
}
