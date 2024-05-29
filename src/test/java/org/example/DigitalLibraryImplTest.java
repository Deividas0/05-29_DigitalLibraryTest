package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class DigitalLibraryImplTest {
    static DigitalLibraryImpl DLI;


    @BeforeAll
    public static void setUp() {
        DLI = new DigitalLibraryImpl();
    }


    @Test
    void addBookTest() {
        //Setup
        String book1 = "123";
        //Execute
        DLI.addBook(book1);
        //Assert
        assertTrue(DLI.getAllBooks().contains(book1));
    }

    @Test
    void getAllBooksTest() {
        //Setup
        String book1 = "111";
        String book2 = "222";
        String book3 = "333";
        //Execute
        DLI.addBook(book1);
        DLI.addBook(book2);
        DLI.addBook(book3);
        //Assert
        assertEquals(3, DLI.getBookCount());
        assertNotEquals(4,DLI.getBookCount());

    }

    @Test
    void searchBooksTest() {
        //Setup
        String book1 = "111";
        String book2 = "647";
        String book3 = "518";
        //Execute
        DLI.addBook(book1);
        DLI.addBook(book2);
        DLI.addBook(book3);
        //Assert
        assertEquals(book1, DLI.searchBooks("1").getFirst());
        assertEquals(2, DLI.searchBooks("1").size());
    }

    @Test
    void getBookCountTest() {
        //Setup
        String book1 = "111";
        String book2 = "222";
        String book3 = "333";
        //Execute
        DLI.addBook(book1);
        DLI.addBook(book2);
        DLI.addBook(book3);
        //Assert
        assertEquals(3, DLI.getBookCount());

    }

    @Test
    void isBookAvailableTest() {
        //Setup
        String book1 = "111";
        //Execute
        DLI.addBook(book1);
        //Assert
        assertEquals(book1, DLI.searchBooks(book1).getFirst());
    }

    @Test
    void updateBookTitleTest() {
        //Setup
        String book1 = "111";
        //Execute
        DLI.addBook(book1);
        DLI.updateBookTitle(book1, book1 = "new111");
        //Assert
        assertEquals("new111", DLI.searchBooks(book1).getFirst());
    }

    @Test
    void removeBookTest() {
        //Setup
        String book1 = "111";
        String book2 = "222";
        String book3 = "333";
        //Execute
        DLI.addBook(book1);
        DLI.addBook(book2);
        DLI.addBook(book3);
        DLI.removeBook(book3);
        //Assert
        assertEquals(2, DLI.getBookCount());
    }
}