package List.PracticeArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Danh sách sau khi thêm phần tử: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Thêm phần tử vào vị trí chỉ định
        list.add(1, "D");
        System.out.println("Danh sách sau khi thêm 'D' vào vị trí 1: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Xóa phần tử
        list.remove(2);
        System.out.println("Danh sách sau khi xóa phần tử ở vị trí 2: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Kiểm tra phần tử
        System.out.println("Danh sách có chứa 'A': " + list.contains("A"));

        // Xóa toàn bộ
        list.clear();
        System.out.println("Danh sách sau khi xóa toàn bộ: ");
        System.out.println("Kích thước: " + list.size());


    }
}
