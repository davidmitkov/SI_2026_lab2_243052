import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SI2026Lab2Test {
    Library library = new Library();

    @Test
    void searchBookEveryStatementTest() {
        assertThrows(IllegalArgumentException.class, () -> library.searchBookByTitle(""));
        library.addBook(new Book("Clean Code", "Robert Martin", "IT"));
        assertNotNull(library.searchBookByTitle("Clean Code"));
        assertNull(library.searchBookByTitle("Harry Potter"));
    }

    @Test
    void borrowBookEveryBranchTest() {
        library.addBook(new Book("The Hobbit", "Tolkien", "Fantasy"));
        assertThrows(IllegalArgumentException.class, () -> library.borrowBook("", ""));
        library.borrowBook("The Hobbit", "Tolkien");
        assertThrows(RuntimeException.class, () -> library.borrowBook("The Hobbit", "Tolkien"));
        assertThrows(RuntimeException.class, () -> library.borrowBook("Unknown", "Unknown"));
    }

    @Test
    void searchBookMultipleConditionTest() {
        library.addBook(new Book("Java", "Oracle", "IT"));
        assertNotNull(library.searchBookByTitle("Java")); // T && T
    }

    @Test
    void borrowBookMultipleConditionTest() {
        assertThrows(IllegalArgumentException.class, () -> library.borrowBook("", "Author")); // T || F
        assertThrows(IllegalArgumentException.class, () -> library.borrowBook("Title", ""));   // F || T
    }
}