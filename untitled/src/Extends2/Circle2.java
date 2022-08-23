package Extends2;

public class Circle2 {
    private String color = "yellow";
    private double radius = 3.7;
    private boolean filled = true;

    public Circle2(){

    }

    public Circle2(String color, double radius, boolean filled){
        this.color = color;
        this.radius = radius;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Circle2{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", filled=" + filled +
                '}';
    }
}
