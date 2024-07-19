package ca.ucalgary.ensf380;

/**
 * The Classic class extends Book and includes additional attributes and methods for original publication year, author, and publishers.
 */
public class Classic extends Book {
    private int origPubYear = 1860;
    private Author theAuthor;
    private Publisher[] bookPublisher;

    // Method for creating notes
    public String createNotes() {
        return "Method createNotes called from Classic";
    }

    // Getter for original publication year
    public int getOrigPubYear() {
        return origPubYear;
    }

    // Setter for original publication year
    public void setOrigPubYear(int origPubYear) {
        this.origPubYear = origPubYear;
    }

    // Getter for author
    public Author getTheAuthor() {
        return theAuthor;
    }

    // Setter for author
    public void setTheAuthor(Author theAuthor) {
        this.theAuthor = theAuthor;
    }

    // Getter for book publishers
    public Publisher[] getBookPublisher() {
        return bookPublisher;
    }

    // Setter for book publishers
    public void setBookPublisher(Publisher[] bookPublisher) {
        this.bookPublisher = bookPublisher;
    }
}
