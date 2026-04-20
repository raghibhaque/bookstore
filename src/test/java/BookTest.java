import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testBookCreatedWithValidInput() {
        Book book = new Book("Clean Code", "Robert C. Martin", 2008, 9780132350884.0);

        assertEquals("Clean Code", book.getTitle());
        assertEquals("Robert C. Martin", book.getAuthor());
        assertEquals(2008, book.getYearofPublication());
        assertEquals(9780132350884.0, book.getIsbn(), 0.0);
    }
}
