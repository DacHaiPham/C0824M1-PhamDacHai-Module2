package thucHanh_IntroductionToJava;

import java.util.Scanner;

public class NumberReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Yêu cầu nhập số
        System.out.print("Nhập số cần đọc (0-999): ");
        int number = scanner.nextInt();

        // Bước 2: Đọc số có một chữ số
        if (number >= 0 && number < 10) {
            System.out.println(readOneDigit(number));
        }
        // Bước 3: Đọc số có hai chữ số nhỏ hơn 20
        else if (number >= 10 && number < 20) {
            System.out.println(readTeen(number));
        }
        // Bước 4: Đọc số có hai chữ số lớn hơn hoặc bằng 20
        else if (number >= 20 && number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            System.out.println(readTens(tens) + (ones > 0 ? " " + readOneDigit(ones) : ""));
        }
        // Bước 5: Đọc số có ba chữ số
        else if (number >= 100 && number < 1000) {
            int hundreds = number / 100;
            int remainder = number % 100;
            String result = readOneDigit(hundreds) + " hundred";
            if (remainder > 0) {
                if (remainder < 10) {
                    result += " and " + readOneDigit(remainder);
                } else if (remainder < 20) {
                    result += " and " + readTeen(remainder);
                } else {
                    int tens = remainder / 10;
                    int ones = remainder % 10;
                    result += " and " + readTens(tens) + (ones > 0 ? " " + readOneDigit(ones) : "");
                }
            }
            System.out.println(result);
        }
        // Nếu số vượt quá khả năng đọc
        else {
            System.out.println("Out of ability");
        }
    }

    // Hàm đọc các số có một chữ số
    public static String readOneDigit(int number) {
        switch (number) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    // Hàm đọc các số từ 10 đến 19
    public static String readTeen(int number) {
        switch (number) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    // Hàm đọc các số chục (20, 30, ..., 90)
    public static String readTens(int number) {
        switch (number) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }
}
