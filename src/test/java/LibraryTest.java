import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    private Books books;
    private Library library;

    @Before
    public void setUp() {
        library = new Library("Carnegie", 23);
    }

    @Test
    public void libraryHasNoBooks(){
        assertEquals( 0, library.bookCount());
    }

    @Test
    public void CanAddBook(){
       library.addBook(books);
       assertEquals(1, library.bookCount());
    }

    @Test

    public void CanRemoveBook(){
        library.addBook(books);
        assertEquals(1, library.bookCount());
        library.removeBook(books);
        assertEquals( 0, library.bookCount());
    }


}