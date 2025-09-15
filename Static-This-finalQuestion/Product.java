import java.util.Scanner;

// Sample Program 4: Shopping Cart System
public class Product {
    // Static variable shared by all products
    static double discount = 0.10; // 10% discount

    // Static method to update discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + (discount * 100) + "%");
    }

    // Instance variables
    private String productName;
    private final int productID; // Final variable, cannot be changed
    private double price;
    private int quantity;

    // Constructor using 'this' to initialize
    public Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to display product details with instanceof check
    public void displayDetails(Object obj) {
        if (obj instanceof Product) {
            Product product = (Product) obj;
            System.out.println("Product Name: " + product.productName);
            System.out.println("Product ID: " + product.productID);
            System.out.println("Price: $" + product.price);
            System.out.println("Quantity: " + product.quantity);
            System.out.println("Discount: " + (discount * 100) + "%");
            double discountedPrice = product.price * (1 - discount);
            System.out.println("Price after discount: $" + discountedPrice);
        } else {
            System.out.println("Invalid object type.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // Create product object
        Product product = new Product(name, id, price, quantity);

        // Display product details
        product.displayDetails(product);

        // Optionally update discount
        System.out.print("Do you want to update discount? (yes/no): ");
        scanner.nextLine(); // consume newline
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.print("Enter new discount (e.g. 0.15 for 15%): ");
            double newDiscount = scanner.nextDouble();
            updateDiscount(newDiscount);
            product.displayDetails(product);
        }

        scanner.close();
    }
}
