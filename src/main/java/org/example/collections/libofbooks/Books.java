package org.example.collections.libofbooks;

public class Books {

    private String title;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int ISBN;

    /**
     * constructor
     * @param title
     * @param author
     * @param publisher
     * @param yearOfPublishing
     * @param ISBN
     */
    public Books(String title, String author, String publisher, int yearOfPublishing, int ISBN) {
        setTitle(title);
        setAuthor(author);
        setAuthor(author);
        setPublisher(publisher);
        setYearOfPublishing(yearOfPublishing);
        setISBN(ISBN);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null || title.isEmpty()){
            throw new IllegalArgumentException("empty or null string");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author == null||author.isEmpty()){
            throw new IllegalArgumentException("empty or null string");
        }
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if(publisher == null||publisher.isEmpty()){
            throw new IllegalArgumentException("empty or null string");
        }
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        if(yearOfPublishing< 1500 || yearOfPublishing>2023){
            throw new IllegalArgumentException("illegal publishing year");
        }
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        if(ISBN < 0 || ISBN > 1000){
            throw new IllegalArgumentException("illegal ISBN number");
        }
        this.ISBN = ISBN;
    }
    /**
     * override toString method
     * @return string type
     */
    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", ISBN=" + ISBN +
                '}';
    }
}
