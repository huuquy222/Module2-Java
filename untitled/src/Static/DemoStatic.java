package Static;

public class DemoStatic {
    int rollno;
    String name;
    static String college = "bưu chính viễn thông";

    DemoStatic(int rollno, String name){
        rollno = rollno;
//        static truc thuoc lop
        name = name;
    }
    void display(){
        System.out.println(rollno + "-" + name + " - "+ college);
    }

    public static void main(String[] args) {
        DemoStatic s1 = new DemoStatic(11, "hữu quý");
        DemoStatic s2 = new DemoStatic(222, "Tài");

        s2.display();
        s1.display();



    }
}
