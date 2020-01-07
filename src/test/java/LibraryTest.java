import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book2;
    private Borrower borrower;

    @Before
    public void before() {
        library = new Library(5);
        book = new Book("The Hobbit", "J. R. R. Tolkien", "fantasy");
        book2 = new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", "fantasy");
        borrower = new Borrower("John");
    }

    @Test
    public void canCountNumberOfBooksInLibrary() {
        assertEquals(0, library.countBooksInLibrary());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBookToLibrary(book);
        assertEquals(1,library.countBooksInLibrary());
    }

    @Test
    public void canNotAddBookToLibraryIfItsFull() {
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        assertEquals(5,library.countBooksInLibrary());
    }

    @Test
    public void canRentOutBook() {
        library.addBookToLibrary(book);
        library.addBookToLibrary(book2);
        library.rentOutBook(borrower, book2);
        assertEquals(1, library.countBooksInLibrary());
        assertEquals(1,borrower.countBorrowedBooks());
    }


}
