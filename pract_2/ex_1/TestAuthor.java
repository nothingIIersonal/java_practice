import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Pushkin", "as.pushka@mail.ru", 'm');
        Author a2 = new Author("Unknown", "0", 'u');

        a2.setEmail("unknown@mail.ru");
        System.out.println(a1.getGender() + " " + a1.getEmail() + " " + a1.getName());

        System.out.println(a2);
    }
}
