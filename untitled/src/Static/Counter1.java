package Static;

public class Counter1 {
    int count = 0;

    Counter1(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter1 counter1 = new Counter1();
        Counter1 counter2 = new Counter1();
        Counter1 counter3 = new Counter1();
    }
}
