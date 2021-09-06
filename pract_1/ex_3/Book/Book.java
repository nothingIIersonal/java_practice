import java.lang.*;

public class Book {
    private String title;
    private String author;

    private int pages;

    public Book(String a, String t) {
        title = t;
        author = a;
    }

    public Book(String t) {
        title = "Unknown";
        author = t;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public void setAuthor(String a) {
        this.author = a;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return this.author + ", " + this.title;
    }

    public void setPages(int p) {
        pages = p;
    }

    public void printAll() {
        System.out.println("Book title: " + title + ", author: " + author + ", count of pages: " + pages);
    }
}
