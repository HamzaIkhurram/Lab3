package ca.ucalgary.ensf380;

/**
 * The Nonfiction class extends Paperback and includes additional attributes and methods for topics.
 */
public class Nonfiction extends Paperback {
    private Category deweyClassification;

    public Nonfiction() {
        super();
    }

    public Nonfiction(String isbn, int pages) {
        super(isbn, pages);
    }

    // Method for topic
    public String topic() {
        return "Method topic called from Nonfiction";
    }

    // Getter for Dewey classification
    public Category getDeweyClassification() {
        return deweyClassification;
    }

    // Setter for Dewey classification
    public void setDeweyClassification(Category deweyClassification) {
        this.deweyClassification = deweyClassification;
    }

    @Override
    public String coverArt() {
        return "Method coverArt called from Paperback";
    }
}
