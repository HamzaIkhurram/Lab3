package ca.ucalgary.ensf380;

/**
 * The Story class represents a story with authors and a plot.
 */
public class Story {
    private Author[] theAuthor;

    // Method for plot
    public String plot() {
        return "Method plot called from Story";
    }

    // Getter for authors
    public Author[] getTheAuthor() {
        return theAuthor;
    }

    // Setter for authors
    public void setTheAuthor(Author[] theAuthor) {
        this.theAuthor = theAuthor;
    }
}
