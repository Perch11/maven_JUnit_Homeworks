package org.example.collections.libofbooks;

import java.util.ArrayList;
import java.util.List;

public class Lib {

    private String libName;
    private List<Books> books;

    /**
     * constructor
     * @param libName type string
     */
    public Lib(String libName) {
        setLibName(libName);
        books = new ArrayList<>();
    }


    public String getLibName() {
        return libName;
    }

    public void setLibName(String libName) {
        if(libName == null || libName.isEmpty()){
            throw new IllegalArgumentException("empty or null string");
        }
        this.libName = libName;
    }

    public List<Books> getBooks() {
        return books;
    }

    /**
     * this method adds new book in the List
     * @param book type Books
     */
    public void addBook(Books book) {
        books.add(book);
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
        List<Books> result = new ArrayList<>();
        for (Books book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
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
        List<Books> result = new ArrayList<>();
        for (Books book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * all books displaying
     */
    public void displayBooks() {
        for (Books book : books) {
            System.out.println(book);
        }
    }

    /**
     * this method removes book by title and author
     * @param title type string
     * @param author type string
     * throw exception when passed null or empty strings
     */
    public void deleteBy(String title, String author) {
        if (title == null || title.isEmpty() || author == null || author.isEmpty()) {
            throw new IllegalArgumentException("null or empty strings ");
        }

        for (int i = 0; i < books.size(); i++) {
            Books item = books.get(i);
            if (item.getTitle().equals(title) && item.getAuthor().equals(author)) {
                books.remove(item);
            }
        }

    }

    /**
     * override toString method
     * @return string type
     */
    @Override
    public String toString() {
        return "Lib{" +
                "libName='" + libName + '\'' +
                ", books=" + books +
                '}';
    }
}
