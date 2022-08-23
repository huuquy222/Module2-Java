package DemoAbStract;

public class HinhTron extends  Hinh{
    @Override
    void draw() {
        System.out.println("vẽ hình tròn");
    }

    public static void main(String[] args) {
        Hinh hinh = new HinhTron();
        Hinh hinh2 = new HinhChunhat();
        hinh.draw();
        hinh2.draw();
    }
}
