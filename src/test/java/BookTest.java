import org.junit.Before;
import org.junit.Test;

public class BookTest {

    private Book book;
    private String author;
    private String genre;

    @Before
    public void before() {
       book = new Book("The Hobbit", "J. R. R. Tolkien", "fantasy");
    }



}
