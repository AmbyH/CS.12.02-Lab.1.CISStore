import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTester {
    private Store store;
    private Book book;
    private Phone iPhone12;
    private Phone iPhone11;
    @BeforeEach
    void setUp() {
        store = new Store();
        book = new Book("The Great Gatsby", "A millionare pursues a rich young woman", 200, 47094, "1925", "F. Scott Fitzgerald", "9780743273565", "1st", "The Great Gatsby");
        iPhone12 = new Phone("iPhone 12", "The iPhone 12", 1000, 128, "12", "Apple", "iOS", "5G", "6.1 inches");
        iPhone11 = new Phone("iPhone 11", "The iPhone 11", 800, 64, "11", "Apple", "iOS", "4G", "6.1 inches");
    }

    @AfterEach
    void tearDown() {
        store = null;
        book = null;
        iPhone12 = null;
        iPhone11 = null;
    }

    @Test
    void testAddBook() throws ClassNotFoundException {
        store.addBook(book);
        ArrayList<CISItem> items = store.getItems("Book");
        assertEquals(1, items.size());
        assertEquals(book, items.get(0));
    }

    @Test
    void testAddBookAndPhone() throws ClassNotFoundException {
        store.addBook(book);
        store.addPhone(iPhone12);
        ArrayList<CISItem> items = store.getItems("Book");
        assertEquals(1, items.size());
        assertEquals(book, items.get(0));
        items = store.getItems("Phone");
        assertEquals(1, items.size());
        assertEquals(iPhone12, items.get(0));
    }

    @Test
    void testUpdatePhoneLocationAndGetAllPhones() {
        store.addPhone(iPhone12);
        store.addPhone(iPhone11);
        store.updatePhonesLocation("Room 512");
        ArrayList<Phone> phones = store.getAllPhones();
        assertEquals(2, phones.size());
        assertEquals("Room 512", phones.get(0).getLocation());
        assertEquals("Room 512", phones.get(1).getLocation());
    }

    @Test
    void testGetItems() throws ClassNotFoundException {
        store.addBook(book);
        store.addPhone(iPhone12);
        store.addPhone(iPhone11);
        ArrayList<CISItem> items1 = store.getItems("Phone");
        assertEquals(2, items1.size());
        assertEquals(iPhone12, items1.get(0));
        assertEquals(iPhone11, items1.get(1));
        ArrayList<CISItem> items2 = store.getItems("Book");
        assertEquals(1, items2.size());
        assertEquals(book, items2.get(0));
    }

    @Test
    void testUpdateItems() throws ClassNotFoundException {
        store.addBook(book);
        store.addPhone(iPhone12);
        store.addPhone(iPhone11);
        store.updateItems("Phone", "location", "Room 512");
        ArrayList<Phone> phones = store.getAllPhones();
        assertEquals(2, phones.size());
        assertEquals("Room 512", phones.get(0).getLocation());
        assertEquals("Room 512", phones.get(1).getLocation());
        store.updateItems("Book", "price", "300");
        ArrayList<CISItem> items = store.getItems("Book");
        assertEquals(1, items.size());
        assertEquals(300, items.get(0).getPrice());
    }

    @Test
    void testShowAllInfo() {
        store.addBook(book);
        store.addPhone(iPhone12);
        store.addPhone(iPhone11);
        store.showAllInfo();
    }

}
