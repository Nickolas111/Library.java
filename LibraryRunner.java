package HW_OOP.Lesson_2_Task_4_Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Book book1 = new Book("Author1","Publishing1", 1995);
        book1.setAmountPages(500);
        book1.setName("Name1");
        book1.setPrice(250);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(new Book("Author2", "Pub2",2000));
        library.addBook(new Book("Author3", "Pub3", 2005));
        library.addBook(new Book("Author1", "Pub3", 1985));
        library.addBook(new Book("Author1", "Pub5", 2011));
        library.addBook(new Book("Author6", "Pub3", 2014));
        library.addBook(new Book("Author2", "Pub7", 1999));

        System.out.println(library.findByAuthor("Author1"));
        System.out.println();
        System.out.println(library.findByPublishing("Publishing1"));
        System.out.println();
        System.out.println(library.findByYearEdition(2005));
    }
}
