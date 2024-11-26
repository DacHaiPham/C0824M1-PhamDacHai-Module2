package thucHanh_AccessModifier.staticProperty;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Student
        Student student = new Student();

        // Gán giá trị mới
        student.setName("Alice");
        student.setClasses("C03");

        // In thông tin
        System.out.println(student.getInfo());
    }
}
