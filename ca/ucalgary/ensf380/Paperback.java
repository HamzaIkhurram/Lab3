package ca.ucalgary.ensf380;

/**
 * The Paperback class is an abstract class that extends Book and includes an abstract method for cover art.
 */
public abstract class Paperback extends Book {
    public Paperback() {
        super();
    }

    public Paperback(String isbn, int pages) {
        super(isbn, pages);
    }

    // Abstract method for cover art
    public abstract String coverArt();
}
