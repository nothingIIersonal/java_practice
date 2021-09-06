import java.lang.*;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Pushkin", "Pick'ovaya lady");
        Book b2 = new Book("Tolstoy", "Voyna and peace");
        Book b3 = new Book("Zamyatin");

        b3.setTitle("We");

        b1.setPages(666);
        b2.setPages(100000000);
        b3.setPages(-1);

        System.out.println(b1);
        b1.printAll();
        b2.printAll();
        b3.printAll();
    }
}
