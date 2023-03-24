package org.example.collections.libofbooks;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Lib library = new Lib("My Library");
        library.addBook(new Books("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Bloomsbury", 1997, 978));
        library.addBook(new Books("The Da Vinci Code", "Dan Brown", "Doubleday", 2003, 979));
        library.addBook(new Books("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "Prentice Hall", 2008, 975));
        library.addBook(new Books("The Pragmatic Programmer: From Journeyman to Master", "Andrew Hunt and David Thomas", "Addison-Wesley Professional", 1999, 987));

        System.out.println("All books:");
        library.displayBooks();

        System.out.println("\nBooks by J.K. Rowling:");
        List<Books> jkRowlingBooks = library.searchByAuthor("J.K. Rowling");
        for (Books book : jkRowlingBooks) {
            System.out.println(book);
        }

        System.out.println("\nBooks by Andrew Hunt and David Thomas:");
        List<Books> pragmaticProgrammerBooks = library.searchByAuthor("Andrew Hunt and David Thomas");
        for (Books book : pragmaticProgrammerBooks) {
            System.out.println(book);
        }

        System.out.println("\nBooks by Title");
        List<Books> theDaVinciCode = library.searchByTitle("The Da Vinci Code");
        for (Books book : theDaVinciCode) {
            System.out.println(book);
        }

        System.out.println("\nDelete book");
        library.deleteBy("The Da Vinci Code","Dan Brown");
        for (Books book : library.getBooks()) {
            System.out.println(book);
        }

    }
}
