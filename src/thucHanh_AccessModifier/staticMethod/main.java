package thucHanh_AccessModifier.staticMethod;

public class main {
    public static void main(String args[]) {
        staticMethod.Student.change(); //calling change method

            //creating objects
        staticMethod.Student s1 = new staticMethod.Student(111, "Hoang");
        staticMethod.Student s2 = new staticMethod.Student(222, "Khanh");
        staticMethod.Student s3 = new staticMethod.Student(333, "Nam");

            //calling display method
        s1.display();
        s2.display();
        s3.display();
        }
}
