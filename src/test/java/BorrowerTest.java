import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;

    @Before
    public void before() {
        borrower = new Borrower("John");
        book = new Book("The Hobbit", "J. R. R. Tolkien", "fantasy");
    }


    @Test
    public void canCountBorrowedBooks() {
        assertEquals(0, borrower.countBorrowedBooks());
    }

    @Test
    public void canAddBookToCollection() {
        borrower.addBookToCollection(book);
        assertEquals(1, borrower.countBorrowedBooks());
    }
}
