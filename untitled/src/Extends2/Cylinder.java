package Extends2;

public class Cylinder extends Circle2{
    private double thickness = 1.0;
    private double height = 4.0;

    public Cylinder(){

    }
    public Cylinder(double width, double height){
        this.height = height;
        this.thickness = width;
    }

    public Cylinder(double width, double height, String color, double radius, boolean filled){
        super(color, radius, filled);
        this.thickness = width;
        this.height = height;
    }

    public double getthickness() {
        return thickness;
    }

    public void setthickness(double width) {
        this.thickness = thickness;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return thickness * this.height;
    }
    public double getPerimeter(){
        return 2 * (thickness + this.thickness);
    }
    @Override
    public String toString(){
        return  "A rectangle with width ="
                +getthickness()
                + "and width"
                + getHeight()
                + ", which is a subclass of"
                + super.toString();
    }
}
