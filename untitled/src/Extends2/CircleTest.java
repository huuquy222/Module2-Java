package Extends2;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(4.5, "yellow",false);
        System.out.println(circle);
    }
}
