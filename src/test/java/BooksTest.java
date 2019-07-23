import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    private Books books;

    @Before
    public void setUp() {
        books = new Books("Hyperion", "Dan Simmons", "SyFy");
    }


    @Test
    public void canFindTitle() {
        assertEquals("Hyperion", books.findTitle());
    }

    @Test

    public void canFingAuthor() {
        assertEquals("Dan Simmons", books.findAuthor());
    }

    @Test

    public void canFindGenre() {
        assertEquals("SyFy", books.findGenre());
    }



}
