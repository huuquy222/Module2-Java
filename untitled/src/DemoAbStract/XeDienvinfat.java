package DemoAbStract;

public class XeDienvinfat extends  XeDien {
    @Override
    void run() {
        System.out.println("chạy nhanh hơn tiết kiệm nhiên liệu");
    }

    public static void main(String[] args) {
        XeDien xeDien = new XeDienvinfat();
        xeDien.run();
    }
}
