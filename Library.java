package HW_OOP.Lesson_2_Task_4_Library;

import java.util.ArrayList;
import java.util.Objects;

public class Library {
    private final ArrayList<Book> library = new ArrayList<>();

    public void addBook(Book book) {
        library.add(book);
    }

    public Library findByAuthor(String author) {
        Library booksByAuthor = new Library();
        for (Book book : library) {
            if (Objects.equals(book.getAuthor(), author)) {
                booksByAuthor.addBook(book);
            }
        }
        return booksByAuthor;
    }

    public Library findByPublishing(String publishing) {
        Library booksByPublishing = new Library();
        for (Book book : library) {
            if (Objects.equals(book.getPublishing(), publishing)) {
                booksByPublishing.addBook(book);
            }
        }
        return booksByPublishing;
    }

    public Library findByYearEdition(int year) {
        Library booksByYear = new Library();
        for (Book book : library) {
            if (book.getYearEdition() >= year) {
                booksByYear.addBook(book);
            }
        }
        return booksByYear;
    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }
}
