package ca.ucalgary.ensf380;

/**
 * The Book class represents a book with an ISBN, publication year, and number of pages.
 */
public class Book {
    private String isbn;
    private int publicationYear;
    private int pages;

    // Default constructor
    public Book() {}

    // Constructor with parameters
    public Book(String isbn, int pages) {
        this.isbn = isbn;
        this.pages = pages;
    }

    // Getter for ISBN
    public String getIsbn() {
        return isbn;
    }

    // Setter for ISBN
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Getter for publication year
    public int getPublicationYear() {
        return publicationYear;
    }

    // Setter for publication year
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    // Getter for number of pages
    public int getPages() {
        return pages;
    }

    // Setter for number of pages
    public void setPages(int pages) {
        this.pages = pages;
    }
}
