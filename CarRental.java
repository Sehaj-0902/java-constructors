import java.util.Scanner;

public class CarRental {
    // Class attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay;

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = 500.0;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Method to display rental details
    void displayRentalDetails() {
        System.out.println("Rental Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Car Model: ");
        String carModel = sc.nextLine();

        System.out.print("Enter Rental Days: ");
        int rentalDays = sc.nextInt();

        CarRental car = new CarRental(customerName, carModel, rentalDays);
        car.displayRentalDetails();
    }
}

/*
Input:
    Enter Customer Name: Alice
    Enter Car Model: Maruti Suzuki Swift
    Enter Rental Days: 3
Output:
    Rental Details:
    Customer Name: Alice
    Car Model: Maruti Suzuki Swift
    Rental Days: 3
    Total Cost: 1500.0
 */