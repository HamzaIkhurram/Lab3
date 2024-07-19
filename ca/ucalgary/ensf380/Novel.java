package ca.ucalgary.ensf380;

/**
 * The Novel class extends Fiction and includes additional attributess and methods for authors and series.
 */
public class Novel extends Fiction {
    private Author[] theAuthor;
    private Series mySeries;

    public Novel() {
        super();
    }

    public Novel(String isbn, int pages) {
        super(isbn, pages);
    }

    // Method for theme
    public String theme() {
        return "Method theme called from Novel";
    }

    // Getter for authors
    public Author[] getTheAuthor() {
        return theAuthor;
    }

    // Setter for authors
    public void setTheAuthor(Author[] theAuthor) {
        this.theAuthor = theAuthor;
    }

    // Getter for series
    public Series getMySeries() {
        return mySeries;
    }

    // Setter for series
    public void setMySeries(Series mySeries) {
        this.mySeries = mySeries;
    }

    @Override
    public String coverArt() {
        return "Method coverArt called from Novel";
    }

	@Override
	public String genre() {
		// TODO Auto-generated method stub
		return null;
	}
}
