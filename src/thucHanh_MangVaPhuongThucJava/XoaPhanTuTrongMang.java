package thucHanh_MangVaPhuongThucJava;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Mảng ban đầu
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập phần tử cần xóa: ");
        int elementToRemove = scanner.nextInt();

        // Tìm vị trí của phần tử cần xóa
        int indexToRemove = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToRemove) {
                indexToRemove = i;
                break;
            }
        }

        // Kiểm tra xem phần tử có tồn tại trong mảng không
        if (indexToRemove == -1) {
            System.out.println("Phần tử không tồn tại trong mảng.");
        } else {
            // Xóa phần tử bằng cách ghi đè
            for (int i = indexToRemove; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            // Hiển thị mảng sau khi xóa
            System.out.print("Mảng sau khi xóa: ");
            for (int i = 0; i < array.length - 1; i++) { // Giảm độ dài mảng đi 1
                System.out.print(array[i] + " ");
            }
        }

        scanner.close();
    }
}
