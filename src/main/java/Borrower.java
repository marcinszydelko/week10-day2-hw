import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> booksBorrowed;

    public Borrower(String name) {
        this.name = name;
        this.booksBorrowed = new ArrayList<Book>();
    }

    public int countBorrowedBooks() {
        return booksBorrowed.size();
    }

    public void addBookToCollection(Book book) {
        this.booksBorrowed.add(book);
    }
}
