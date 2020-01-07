import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.bookCollection = new ArrayList<Book>();
    }


    public int countBooksInLibrary() {
        return bookCollection.size();
    }

    public void addBookToLibrary(Book book) {
        if( capacity > countBooksInLibrary()) {
            this.bookCollection.add(book);
        }
    }

    public void rentOutBook(Borrower borrower, Book book) {
        borrower.addBookToCollection(book);
        this.bookCollection.remove(book);
    }
}
