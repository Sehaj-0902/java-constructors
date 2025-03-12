class Book {
    // Class attributes
    public String ISBN;
    protected String title;
    private String author;

    // Parameterized Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Method to get author
    public String getAuthor() {
        return author;
    }

    // Method to set author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass
class EBook extends Book {
    private String downloadLink;

    // Parameterized Constructor
    public EBook(String ISBN, String title, String author, String downloadLink) {
        super(ISBN, title, author);
        this.downloadLink = downloadLink;
    }

    // Method to display ebook details
    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("Download Link: " + downloadLink);
    }

    // Method to update title
    public void updateTitle(String newTitle) {
        this.title = newTitle;
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        System.out.println("Book Details:");
        Book book = new Book("978-0321125211", "Design Patterns", "Erich Gamma");
        book.displayBookDetails();

        book.setAuthor("Richard Helm");
        System.out.println("Updated Author: " + book.getAuthor());

        System.out.println("EBook Details:");
        EBook eBook = new EBook("978-1491910399", "Head First Java", "Kathy Sierra", "https://example.com/download");
        eBook.displayEBookDetails();

        System.out.println("Updated EBook Details:");
        eBook.updateTitle("Head First Java 2nd Edition");
        eBook.displayEBookDetails();

        System.out.println("ISBN of book 1: " + book.ISBN);
        System.out.println("ISBN of ebook 1: " + eBook.ISBN);
    }
}

/*
Output:
    Book Details:
    ISBN: 978-0321125211
    Title: Design Patterns
    Author: Erich Gamma
    Updated Author: Richard Helm
    EBook Details:
    ISBN: 978-1491910399
    Title: Head First Java
    Author: Kathy Sierra
    Download Link: https://example.com/download
    Updated EBook Details:
    ISBN: 978-1491910399
    Title: Head First Java 2nd Edition
    Author: Kathy Sierra
    Download Link: https://example.com/download
    ISBN of book 1: 978-0321125211
    ISBN of ebook 1: 978-1491910399
 */