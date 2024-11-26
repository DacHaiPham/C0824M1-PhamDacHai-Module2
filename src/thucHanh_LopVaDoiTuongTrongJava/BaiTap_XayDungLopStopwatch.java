package thucHanh_LopVaDoiTuongTrongJava;

import java.util.Random;

public class BaiTap_XayDungLopStopwatch {
    public static class StopWatch {
        private long startTime;
        private long endTime;

        public StopWatch() {
            this.startTime = System.currentTimeMillis();
        }

        //Getter and StartTime
        public long getStartTime() {
            return startTime;
        }

        //Getter and endTime
        public long getEndTime() {
            return endTime;
        }

        public void start() {
            this.startTime = System.currentTimeMillis();
        }

        public void stop() {
            this.endTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            return endTime - startTime;
        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi giá trị
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int [] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();      //bắt đầu đo thời gian
        selectionSort(array);   //Thực hiện thuật toán sắp xếp
        stopWatch.stop();       //Kết thúc đo thời gian

        System.out.println("Thời gian thực thi thuật toán sắp xếp chọn: " + stopWatch.getElapsedTime() + " milliseconds");

    }
}
