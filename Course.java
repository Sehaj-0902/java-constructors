public class Course {
    // Class attributes
    // Instance Variables
    String courseName;
    String duration;
    double fee;

    // Class Variables
    static String instituteName;

    // Constructor
    Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
        instituteName = "Chitkara University";
    }

    // Instance Method to display the course details
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + duration);
        System.out.println("Course Fee: " + fee);
    }

    // Class Method to modify the institute name for all courses
    static void updateInstituteName() {
        System.out.println("Institute Name: " + instituteName);
    }

    public static void main(String[] args) {
        System.out.println("Course Details:");

        Course course1 = new Course("Computer Science and Engineering", "4 years", 600000);
        course1.displayCourseDetails();

        Course course2 = new Course("Bachelor of Business Administration", "3 years", 500000);
        course2.displayCourseDetails();

        Course course3 = new Course("Bachelor of Science", "3 years", 400000);
        course3.displayCourseDetails();

        Course.updateInstituteName();
    }
}

/*
Output:
    Course Details:
    Course Name: Computer Science and Engineering
    Course Duration: 4 years
    Course Fee: 600000.0
    Course Name: Bachelor of Business Administration
    Course Duration: 3 years
    Course Fee: 500000.0
    Course Name: Bachelor of Science
    Course Duration: 3 years
    Course Fee: 400000.0
    Institute Name: Chitkara University
 */