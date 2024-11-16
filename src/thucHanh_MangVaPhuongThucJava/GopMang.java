package thucHanh_MangVaPhuongThucJava;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tạo 2 mảng số với kích thước cho trước
        System.out.print("Nhập kích thước mảng 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Nhập các phần tử cho mảng 1:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Nhập kích thước mảng 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Nhập các phần tử cho mảng 2:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Bước 3: Tạo mảng thứ 3 với kích thước bằng tổng kích thước mảng 1 và mảng 2
        int[] array3 = new int[size1 + size2];

        // Bước 4: Duyệt mảng 1 và gán các phần tử vào mảng 3
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        // Bước 5: Duyệt mảng 2 và gán các phần tử vào mảng 3, bắt đầu từ vị trí sau mảng 1
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        // In mảng 3 sau khi gộp
        System.out.println("Mảng sau khi gộp:");
        for (int i : array3) {
            System.out.print(i + " ");
        }
    }
}
