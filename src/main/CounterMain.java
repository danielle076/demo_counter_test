package main;

public class CounterMain {
    public static void main(String[] args) {

        Counter counter = new Counter();

        counter.add(1);
        counter.add(2);
        counter.add(3);

        System.out.println("Total: " + counter.getTotal());
    }
}
