package ca.ucalgary.ensf380;

/**
 * The Publisher class represents a publisher with a name, address, and catalog of classics.
 */
public class Publisher {
    private String name;
    private String address;
    private Classic[] classicsCatalog;

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Method for printing letterhead
    public String printLetterhead() {
        return "Method printLetterhead called from Publisher";
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter for classics catalog
    public Classic[] getClassicsCatalog() {
        return classicsCatalog;
    }

    // Setter for classics catalog
    public void setClassicsCatalog(Classic[] classicsCatalog) {
        this.classicsCatalog = classicsCatalog;
    }
}
