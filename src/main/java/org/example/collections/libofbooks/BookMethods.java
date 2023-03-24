package org.example.collections.libofbooks;

import java.util.ArrayList;
import java.util.List;

public class BookMethods {

    List<Books> books = new ArrayList<>();

    /**
     * this method adding new book in the arraylist
     * @param tittle string type
     * @param author string type
     * @param publisher string type
     * @param yearOfPublishing int type
     * @param ISBN int type
     * @return books type
     */
    public Books add(String tittle, String author, String publisher, int yearOfPublishing, int ISBN) {
        for (Books book : books) {
            if (book.getTitle().equals(tittle) && book.getAuthor().equals(author)) {
                System.out.println("es grqic ka arden ");
                return null;
            }
        }
        Books newBook = new Books(tittle, author, publisher, yearOfPublishing, ISBN);
        books.add(newBook);
        return newBook;
    }

    /**
     * this method searching books by author
     * @param author type string
     * @return  List<Books>
     * throw exception when passed null or empty string
     */
    public List<Books> searchByAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("null or empty string ");
        }
        if (books.isEmpty()) {
            System.out.println("in list no books ");
            return null;
        }

        List<Books> searchBYAuthor = new ArrayList<>();
        for (Books item : books) {
            if (item.getAuthor().equals(author)) {
                searchBYAuthor.add(item);
            }
        }
        return searchBYAuthor;
    }

    /**
     * this method searching books by title
     * @param title type string
     * @return List<Books>
     * throw exception when passed null or empty string
     */
    public List<Books> searchByTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("null or empty string ");
        }
        if (books.isEmpty()) {
            System.out.println("in list no books ");
            return null;
        }

        List<Books> searchBYTitle = new ArrayList<>();
        for (Books item : books) {
            if (item.getAuthor().equals(title)) {
                searchBYTitle.add(item);
            }
        }
        return searchBYTitle;
    }

    /**
     * displeying all books
     * @return List<Books>
     */
    public List<Books> getBooks() {
        return books;
    }

    /**
     * this method removes book by title and author
     * @param title type string
     * @param author type string
     * @return type boolean
     * throw exception when passed null or empty strings
     */
    public boolean deleteBy(String title, String author) {
        if (title == null || title.isEmpty() || author == null || author.isEmpty()) {
            throw new IllegalArgumentException("null or empty strings ");
        }

        for (Books item : books) {
            if (item.getTitle().equals(title) && item.getAuthor().equals(author)) {
                return books.remove(item);
            }
        }
        return false;
    }
}
