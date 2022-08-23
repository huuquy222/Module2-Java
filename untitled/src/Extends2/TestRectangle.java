package Extends2;

public class TestRectangle {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(4.6);
        System.out.println(square);

        square = new Square(4.9,"pink",true);
        System.out.println(square);
    }
}
