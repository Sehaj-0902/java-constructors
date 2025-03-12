class Student {
    // Class attributes
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Parameterized Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Method to set CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass
class PostgraduateStudent extends Student {
    private String course;

    // Parameterized Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String course) {
        super(rollNumber, name, CGPA);
        this.course = course;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Course: " + course);
    }

    // Method to update name
    public void updateName(String newName) {
        this.name = newName;
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        System.out.println("Student Details:");
        Student student = new Student(101, "Alice", 3.5);
        student.displayStudentDetails();

        student.setCGPA(3.9);
        System.out.println("Updated CGPA: " + student.getCGPA());

        System.out.println("Postgraduate Student Details:");
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Charlie", 4.7, "Computer Science");
        pgStudent.displayPostgraduateStudentDetails();

        System.out.println("Updated Postgraduate Student Details:");
        pgStudent.updateName("Alex");
        pgStudent.displayPostgraduateStudentDetails();

        System.out.println("Roll Number of Student: " + student.rollNumber);
        System.out.println("Roll Number of Postgraduate Student : " + pgStudent.rollNumber);
    }
}

/*
Output:
    Student Details:
    Roll Number: 101
    Name: Alice
    CGPA: 3.5
    Updated CGPA: 3.9
    Postgraduate Student Details:
    Roll Number: 201
    Name: Charlie
    CGPA: 4.7
    Course: Computer Science
    Updated Postgraduate Student Details:
    Roll Number: 201
    Name: Alex
    CGPA: 4.7
    Course: Computer Science
    Roll Number of Student: 101
    Roll Number of Postgraduate Student : 201
 */