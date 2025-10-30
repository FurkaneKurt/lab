public class Main{
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("java101","james gosling",150.0);

        b1.showDetail();
        b2.showDetail();

    }
}