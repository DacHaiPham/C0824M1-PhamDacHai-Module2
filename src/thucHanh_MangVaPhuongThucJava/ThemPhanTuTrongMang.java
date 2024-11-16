package thucHanh_MangVaPhuongThucJava;

import java.util.Scanner;

public class ThemPhanTuTrongMang {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo mảng số nguyên với N phần tử
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int N = scanner.nextInt();

        int[] array = new int[N];
        System.out.println("Nhập các phần tử cho mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Nhập X là số cần chèn
        System.out.print("Nhập số cần chèn vào mảng: ");
        int X = scanner.nextInt();

        // Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
        System.out.print("Nhập vị trí index cần chèn X: ");
        int index = scanner.nextInt();

        // Bước 4: Kiểm tra vị trí index hợp lệ
        if (index < 0 || index >= array.length) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {
            // Bước 5: Thực hiện chèn phần tử X vào vị trí index trong mảng
            int[] newArray = new int[array.length + 1]; // Tạo mảng mới có kích thước lớn hơn 1
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i]; // Sao chép phần tử trước vị trí chèn
            }
            newArray[index] = X; // Chèn phần tử X vào vị trí index
            for (int i = index + 1; i < newArray.length; i++) {
                newArray[i] = array[i - 1]; // Sao chép phần tử còn lại
            }

            // Bước 6: In ra mảng sau khi chèn
            System.out.println("Mảng sau khi chèn phần tử X:");
            for (int i : newArray) {
                System.out.print(i + " ");
            }
        }
    }
}
