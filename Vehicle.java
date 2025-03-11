public class Vehicle {
    // Class attributes
    // Instance Variables
    String ownerName;
    String vehicleType;

    // Class Variables
    static double registrationFee;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        registrationFee = 1000.0;
    }

    // Instance Method to display owner and vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
    }

    // Class Method to change the registration fee
    static void updateRegistrationFee() {
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void main(String[] args) {
        System.out.println("Vehicle Details:");

        Vehicle vehicle1 = new Vehicle("Alice", "Car");
        vehicle1.displayVehicleDetails();

        Vehicle vehicle2 = new Vehicle("Charlie", "Motorcycle");
        vehicle2.displayVehicleDetails();

        Vehicle.updateRegistrationFee();
    }
}

/*
Output:
    Vehicle Details:
    Owner Name: Alice
    Vehicle Type: Car
    Owner Name: Charlie
    Vehicle Type: Motorcycle
    Registration Fee: 1000.0
 */