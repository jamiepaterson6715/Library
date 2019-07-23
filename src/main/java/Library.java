import java.util.ArrayList;

public class Library {


    private String name;
    private int capacity;
    private ArrayList<Books> books;

    public Library(String name, int capacity) {
        this.name = name;
        this.books = new ArrayList<Books>();
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Books books) {
        this.books.add(books);
    }

    public void removeBook(Books books) {
        this.books.remove(books);
    }
}