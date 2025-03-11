import java.util.Scanner;

public class Product {
    // Class attributes
    // Instance Variables
    String productName;
    double price;

    // Class Variables
    static int totalProducts;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance Method to display details of a product
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
    }

    // Class Method to display total number of products created
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        System.out.println("Product Details:");

        Product product1 = new Product("Laptop", 50000);
        product1.displayProductDetails();

        Product product2 = new Product("Charger", 1500);
        product2.displayProductDetails();

        Product product3 = new Product("Bag", 3000);
        product3.displayProductDetails();

        Product.displayTotalProducts();
    }
}

/*
Output:
    Product Details:
    Product Name: Laptop
    Product Price: 50000.0
    Product Name: Charger
    Product Price: 1500.0
    Product Name: Bag
    Product Price: 3000.0
    Total Products: 3
 */