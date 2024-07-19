package ca.ucalgary.ensf380;

public class University {
    public static void main(String[] args) {
        //Professor Ansari supervises students
        Professor prof = new Professor("Dr. Ansari", "ansari@ucalgary.ca", "Software Engineering");
        Student student1 = new Student("Ahmed", "ahmed@ucalgary.ca", "Electrical Engineering");
        Student student2 = new Student("Khadija", "khadija@ucalgary.ca", "Computer Science");

        Course course = new Course("ENSF380", "Object Oriented Design", prof);
        course.addStudent(student1);
        course.addStudent(student2);

        System.out.println(course.getDetails());
        System.out.println("Students enrolled in the course:");
        for (Student s : course.getStudents()) {
            System.out.println(s.getDetails());
        }
    }
}
