import java.util.Scanner;

public class Circle {
    // Class attributes
    private double radius;

    // Default Constructor
    Circle() {
        radius = 1.0;
    }

    // Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius of circle
    void displayRadius() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        // Default Constructor
        Circle circle1 = new Circle();
        System.out.println("Default radius:");
        circle1.displayRadius();

        // Parameterized Constructor
        Circle circle2 = new Circle(radius);
        System.out.println("User-defined radius:");
        circle2.displayRadius();
    }
}

/*
Input:
    Enter radius of circle: 5.0
Output:
    Default radius:
    Radius: 1.0
    User-defined radius:
    Radius: 5.0
 */