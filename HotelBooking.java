import java.util.Scanner;

public class HotelBooking {
    // Class attributes
    private String guestName;
    private String roomType;
    private int nights;

    // Default Constructor
    HotelBooking() {
        guestName = "Alice";
        roomType = "Single";
        nights = 1;
    }

    // Parameterized Constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    HotelBooking(HotelBooking previousBooking) {
        this.guestName = previousBooking.guestName;
        this.roomType = previousBooking.roomType;
        this.nights = previousBooking.nights;
    }

    // Method to display hotel booking details
    void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter guest name: ");
        String guestName = sc.nextLine();

        System.out.print("Enter Room Type: ");
        String roomType = sc.nextLine();

        System.out.print("Enter Number of Nights: ");
        int nights = sc.nextInt();

        // Default Constructor
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Default Booking");
        booking1.displayBookingDetails();

        // Parameterized Constructor
        HotelBooking booking2 = new HotelBooking(guestName, roomType, nights);
        System.out.println("Parameterized Booking");
        booking2.displayBookingDetails();

        // Copy Constructor
        HotelBooking booking3 = new HotelBooking(guestName, roomType, nights);
        System.out.println("Cloned Booking");
        booking3.displayBookingDetails();
    }
}

/*
Input:
    Enter guest name: Charlie
    Enter Room Type: Delux
    Enter Number of Nights: 2
Output:
    Default Booking
    Guest Name: Alice
    Room Type: Single
    Number of Nights: 1
    Parameterized Booking
    Guest Name: Charlie
    Room Type: Delux
    Number of Nights: 2
    Cloned Booking
    Guest Name: Charlie
    Room Type: Delux
    Number of Nights: 2
 */