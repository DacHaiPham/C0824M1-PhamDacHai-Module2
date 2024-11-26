package thucHanh_AccessModifier.accessModifierPractice;

public class accessModifierPractice {
    public static class Circle{
        protected double radius = 1.0;
        protected String color = "red";

        public Circle(double radius, String color, boolean filled){
        }

        public Circle(double radius){
            this.radius = radius;
        }

        public Circle() {
        }

        protected double getRadius(){
            return radius;
        }

        protected double getArea(){
            return Math.PI * radius * radius;
        }
    }
}
