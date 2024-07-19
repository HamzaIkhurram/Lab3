package ca.ucalgary.ensf380;

import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    private Professor instructor;
    private ArrayList<Student> students;

    public Course(String courseCode, String courseName, Professor instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Professor getInstructor() {
        return instructor;
    }

    public void setInstructor(Professor instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public String getDetails() {
        return "Course [Course Code: " + courseCode + ", Course Name: " + courseName + ", Instructor: " + instructor.getName() + "]";
    }
}
