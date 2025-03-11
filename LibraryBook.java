import java.util.Scanner;

public class LibraryBook {
    // Class attributes
    private String title;
    private String author;
    private double price;
    private String borrowBook;

    // Parameterized Constructor
    LibraryBook(String title, String author, double price, String borrowBook) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.borrowBook = borrowBook;
    }

    // Method to display book details
    void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: Rs." + price);
        System.out.println("Book to be Borrowed: " + borrowBook);
    }

    // Method to check book availability
    void bookAvailability() {
        if (title.equals(borrowBook)) {
            System.out.println(title + " is available for borrowing");
        }
        else {
            System.out.println(borrowBook + " is not available for borrowing");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Book Author: ");
        String author = sc.nextLine();

        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();

        sc.nextLine();
        System.out.print("Enter Book to be Borrowed: ");
        String borrowBook = sc.nextLine();

        // Parameterized Constructor
        LibraryBook book = new LibraryBook(title, author, price, borrowBook);
        System.out.println("Book Details:");
        book.displayBookDetails();

        System.out.println("Book Availability:");
        book.bookAvailability();
    }
}

/*
Input:
    Enter Book Title: Alice In Wonderland
    Enter Book Author: Lewis Carroll
    Enter Book Price: 149.0
    Enter Book to be Borrowed: Charlie and the Chocolate Factory
Output:
    Book Details:
    Book Title: Alice In Wonderland
    Book Author: Lewis Carroll
    Book Price: Rs.149.0
    Book to be Borrowed: Charlie and the Chocolate Factory
    Book Availability:
    Charlie and the Chocolate Factory is not available for borrowing
 */