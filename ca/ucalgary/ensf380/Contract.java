package ca.ucalgary.ensf380;

/**
 * The Contract class represents a contract with a date, publisher information, and author information.
 */
public class Contract {
    private String date;
    private Publisher publisherInfo;
    private Author[] authorInfo;

    public Contract(String date, Publisher publisherInfo, Author[] authorInfo) {
        this.date = date;
        this.publisherInfo = publisherInfo;
        this.authorInfo = authorInfo;
    }

    // Method for printing contract
    public String printContract() {
        return "Method printContract called from Contract";
    }

    // Getter for date
    public String getDate() {
        return date;
    }

    // Setter for date
    public void setDate(String date) {
        this.date = date;
    }

    // Getter for publisher information
    public Publisher getPublisherInfo() {
        return publisherInfo;
    }

    // Setter for publisher information
    public void setPublisherInfo(Publisher publisherInfo) {
        this.publisherInfo = publisherInfo;
    }

    // Getter for author information
    public Author[] getAuthorInfo() {
        return authorInfo;
    }

    // Setter for author information
    public void setAuthorInfo(Author[] authorInfo) {
        this.authorInfo = authorInfo;
    }
}
