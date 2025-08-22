import java.util.*;
public class TotalPrice {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Input: unit price and quantity
        System.out.print("Enter the unit price (INR): ");
        int unitPrice = scanner.nextInt();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        scanner.close(); 
    }
}
