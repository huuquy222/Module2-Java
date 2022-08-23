package DemoOveridetoString;

public class Circle {
    private double radius;
//    Overide dưới dạng trả về một chuỗi kèm thêm thuộc tính của lớp đó
//    Demo Overide dưới dạng Overide+ToString

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "I am Circle, my radius is" + this.radius;
    }
}
