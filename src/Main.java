
import library.model.Book;
import library.model.LibraryMember;
import library.system.Library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Java Basics", "John Smith", "12345");
        Book book2 = new Book("Python Basics", "Jane Doe", "67890");

        LibraryMember member1 = new LibraryMember("Alex", 1);
        LibraryMember member2 = new LibraryMember("Sam", 2);

        System.out.println("Library Management System\n");

        library.addBook(book1);
        library.addBook(book2);

        library.addMember(member1);
        library.addMember(member2);

        System.out.println();

        library.borrowBook(member1, book1);
        library.returnBook(member1, book1);

        System.out.println();

        library.reserveBook(member1, book1);
        library.reserveBook(member2, book2);

        System.out.println();

        library.displayReservedBooks(member1);
        library.displayReservedBooks(member2);

        System.out.println();

        library.cancelReservation(member1, book1);

        System.out.println();

        library.displayReservedBooks(member1);
        library.displayReservedBooks(member2);
    }
}
