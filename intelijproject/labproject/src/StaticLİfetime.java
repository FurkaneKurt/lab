public class StaticLİfetime {

    static int counter = 0;

    static void incrementCounter() {

        counter++;

        System.out.println("Counter = " + counter);
    }

    public static void main(String[] args) {

        StaticLİfetime.incrementCounter();
        StaticLİfetime.incrementCounter();
    }
}