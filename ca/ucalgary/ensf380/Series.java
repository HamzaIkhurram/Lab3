package ca.ucalgary.ensf380;

/**
 * The Series class represents a book series with a name and a theme.
 */
public class Series {
    private String seriesName;

    // Method for theme
    public String theme() {
        return "Method theme called from Series";
    }

    // Getter for series name
    public String getSeriesName() {
        return seriesName;
    }

    // Setter for series name
    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }
}
