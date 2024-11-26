package Inheritance.CircleAndCylinder;

import thucHanh_AccessModifier.accessModifierPractice.accessModifierPractice;

public class Main {
    public static void main(String[] args) {

        //Test Circle class
       Cirle circle = new Cirle(5.0, "Red");
        System.out.println(circle);

        //Test Cylinder class
        Cylinder cylinder = new Cylinder(5.0, "Blue", 10.0);
        System.out.println(cylinder);
    }
}
