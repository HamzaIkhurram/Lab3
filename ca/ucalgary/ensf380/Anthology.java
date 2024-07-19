package ca.ucalgary.ensf380;

/**
 * The Anthology class extends Fiction and includes additional attributes and methods for stories.
 */
public class Anthology extends Fiction {
    private Story[] story;

    public Anthology() {
        super();
    }

    public Anthology(String isbn, int pages) {
        super(isbn, pages);
    }

    // Method for story order
    public String storyOrder() {
        return "Method storyOrder called from Anthology";
    }

    // Getter for stories
    public Story[] getStory() {
        return story;
    }

    // Setter for stories
    public void setStory(Story[] story) {
        this.story = story;
    }

    @Override
    public String coverArt() {
        return "Method coverArt called from Anthology";
    }

    @Override
    public String genre() {
        return "Method genre called from Fiction";
    }
}
