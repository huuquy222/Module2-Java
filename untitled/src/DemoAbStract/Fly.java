package DemoAbStract;

public  class Fly  extends AirlLine{
    @Override
    void fly() {
        System.out.println("bay cao và an toàn");
    }

    public static void main(String[] args) {
        AirlLine airlLine = new Fly();
        airlLine.fly();
    }
}
