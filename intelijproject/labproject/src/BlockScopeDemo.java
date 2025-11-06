public class BlockScopeDemo{
    public static void main(String[] args) {
        int outerX = 5;  // Dıştaki değişken

        if (true) {
            int innerY = 15;  // İçteki değişken
            System.out.println("Inside if block:");
            System.out.println("outerX = " + outerX);
            System.out.println("innerY = " + innerY);
        }

        System.out.println("\nOutside if block:");
        System.out.println("outerX = " + outerX);
    }
}
