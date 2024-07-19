package ca.ucalgary.ensf380;

/**
 * The Author class represents an author with a name, address, and age.
 */
public class Author {
    private String name;
    private String address;
    private int age;

    // Constructor with parameters
    public Author(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // Default constructor
    public Author() {
        this.name = "Unknown";
        this.address = "Unknown";
        this.age = 0;
    }

    // Method for writing
    public String write() {
        return "Method write called from Author";
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

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
