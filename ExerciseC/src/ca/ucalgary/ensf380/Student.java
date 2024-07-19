package ca.ucalgary.ensf380;

public class Student extends Person {
    private String major;

    public Student(String name, String email, String major) {
        super(name, email);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDetails() {
        return "Student [Name: " + getName() + ", Email: " + getEmail() + ", Major: " + major + "]";
    }
}
