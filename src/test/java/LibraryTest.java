import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(5);
        book = new Book("The Hobbit", "J. R. R. Tolkien", "fantasy");
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
    

}
