import java.util.Scanner;

// Sample Program 6: Vehicle Registration System
public class Vehicle {
    // Static variable common for all vehicles
    static double registrationFee = 500.0;

    // Static method to update registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to $" + registrationFee);
    }

    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; // Final variable, cannot be changed

    // Constructor using 'this' to initialize
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Method to display vehicle details with instanceof check
    public void displayDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) obj;
            System.out.println("Owner Name: " + vehicle.ownerName);
            System.out.println("Vehicle Type: " + vehicle.vehicleType);
            System.out.println("Registration Number: " + vehicle.registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid object type.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter owner name: ");
        String ownerName = scanner.nextLine();
        System.out.print("Enter vehicle type: ");
        String vehicleType = scanner.nextLine();
        System.out.print("Enter registration number: ");
        String registrationNumber = scanner.nextLine();

        // Create vehicle object
        Vehicle vehicle = new Vehicle(ownerName, vehicleType, registrationNumber);

        // Display vehicle details
        vehicle.displayDetails(vehicle);

        // Optionally update fee
        System.out.print("Do you want to update registration fee? (yes/no): ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.print("Enter new fee: ");
            double newFee = scanner.nextDouble();
            updateRegistrationFee(newFee);
            vehicle.displayDetails(vehicle);
        }

        scanner.close();
    }
}
