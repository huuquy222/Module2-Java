package DemoOveride;

public class Subclass extends Superclass{
    @Override
    public void run(){
        System.out.println("thực ra là em đi bộ để đi học");
    }

    public static void main(String[] args) {
        Superclass superclass = new Superclass();
        Superclass subclass = new Subclass();
        superclass.run();
        subclass.run();
        //tu khoa super dung de
        // goi den constructer cua lop cha
        //goi den cac phuong thuc cua lop cha
        //
    }
}
