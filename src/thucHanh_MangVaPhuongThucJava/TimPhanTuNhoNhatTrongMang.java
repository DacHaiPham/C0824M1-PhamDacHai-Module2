package thucHanh_MangVaPhuongThucJava;

import java.util.Scanner;

public class TimPhanTuNhoNhatTrongMang {
    public static void main(String[] args) {
            final int SIZE = 5; // Bạn có thể thay đổi kích thước mảng tại đây
            int[] array = new int[SIZE];
            Scanner scanner = new Scanner(System.in);

            // Bước 2: Nhập giá trị cho các phần tử trong mảng từ bàn phím
            System.out.println("Nhập vào " + SIZE + " số nguyên:");
            for (int i = 0; i < SIZE; i++) {
                System.out.print("Phần tử " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

            // Bước 3: Gọi phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
            int min = array[0];

            // Bước 4: Duyệt mảng từ phần tử thứ 2 đến hết mảng
            for (int i = 1; i < SIZE; i++) {
                if (array[i] < min) {
                    min = array[i]; // Gán giá trị nhỏ nhất là phần tử tiếp theo nếu nhỏ hơn
                }
            }

            // Bước 5: Kết thúc duyệt mảng. In ra giá trị nhỏ nhất
            System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
