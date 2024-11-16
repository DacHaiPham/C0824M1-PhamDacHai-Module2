package thucHanh_MangVaPhuongThucJava;

import java.util.Scanner;

public class BaiTap_UngDungDemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        final int MAX_STUDENTS = 30;
        int[] scores = new int[MAX_STUDENTS];
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên (tối đa " + MAX_STUDENTS + "): ");
        int numberOfStudents = scanner.nextInt();

        // Kiểm tra nếu số lượng sinh viên vượt quá giới hạn
        if (numberOfStudents > MAX_STUDENTS) {
            System.out.println("Số lượng sinh viên không được vượt quá " + MAX_STUDENTS);
            return;
        }

        // Nhập điểm cho từng sinh viên
        System.out.println("Nhập điểm cho từng sinh viên:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Điểm của sinh viên " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();

            // Kiểm tra điểm và tăng biến đếm nếu sinh viên đạt điểm đỗ
            if (scores[i] >= 5) {
                count++;
            }
        }

        // In ra số lượng sinh viên đã thi đỗ
        System.out.println("Số lượng sinh viên đã thi đỗ: " + count);
    }
}
