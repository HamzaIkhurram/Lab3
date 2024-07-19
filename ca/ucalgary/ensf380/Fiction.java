package ca.ucalgary.ensf380;

/**
 * The Fiction class is an abstract class that extends Paperback and includes an abstract method for genre.
 */
public abstract class Fiction extends Paperback {
    public Fiction() {
        super();
    }

    public Fiction(String isbn, int pages) {
        super(isbn, pages);
    }

    // Abstract method for genre
    public abstract String genre();

    @Override
    public abstract String coverArt();
}
