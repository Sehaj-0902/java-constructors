public class Book {
    // Class attributes
    private String title;
    private String author;
    private double price;

    // Default Constructor
    Book() {
        title = "Alice In Wonderland";
        author = "Lewis Carroll";
        price = 149.0;
    }

    // Parameterized Constructor
    Book(String title, String author, double price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    // Method to display book details
    void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: Rs." + price);
    }

    public static void main(String[] args) {
        // Default Constructor
        Book book1 = new Book();
        System.out.println("Book 1:");
        book1.displayBookDetails();

        // Parameterized Constructor
        Book book2 = new Book("Charlie and the Chocolate Factory", "Roald Dahl", 249.0);
        System.out.println("Book 2:");
        book2.displayBookDetails();
    }
}

/*
Output:
    Book 1:
    Book Title: Alice In Wonderland
    Book Author: Lewis Carroll
    Book Price: Rs.149.0
    Book 2:
    Book Title: Charlie and the Chocolate Factory
    Book Author: Roald Dahl
    Book Price: Rs.249.0
 */