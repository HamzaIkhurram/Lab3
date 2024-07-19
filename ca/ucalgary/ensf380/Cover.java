package ca.ucalgary.ensf380;

/**
 * The Cover class represents the cover of a book.
 */
public class Cover {
    private String coverType;

    // Default constructor
    public Cover() {}

    // Constructor with parameters
    public Cover(String coverType) {
        this.coverType = coverType;
    }

    // Getter for cover type
    public String getCoverType() {
        return coverType;
    }

    // Setter for cover type
    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    // Method to describe the cover
    public String describeCover() {
        return "Method describeCover called from Cover";
    }
}
