package src.test.java;

import src.main.*;
import src.main.java.Book;

import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

public class BookTest {

    @Test
    public void testBookCreatedWithValidInput() {
        Book book = new Book("Clean Code", "Robert C. Martin", 2008, 9780132350884.0);

        assertEquals("Clean Code", book.getTitle());
        assertEquals("Robert C. Martin", book.getAuthor());
        assertEquals(2008, book.getYearofPublication());
        assertEquals(9780132350884.0, book.getIsbn(), 0.0);
    }

    @Test 
    public void testBookCreatedWithEmptyTitle(){
        Book book = new Book ("", "Author Name", 2020, 1234567890123.0);
        assertEquals("", book.getTitle());
    }
}
