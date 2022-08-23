package Da_Hinh;

public class Splender extends  Bike {
    void run(){
        System.out.println("chạy an toàn với tốc độ 60km/h");
    }

    public static void main(String[] args) {
        Bike bi = new Splender();
        bi.run();
    }
}
