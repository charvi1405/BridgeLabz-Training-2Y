import java.util.Scanner;

// Sample Program 3: Employee Management System
public class Employee {
    // Static variable shared by all employees
    static String companyName = "Tech Solutions";

    // Static variable to keep track of total employees
    static int totalEmployees = 0;

    // Static method to display total employees
    static void displayTotalEmployees() {
        System.out.println("Total employees in " + companyName + ": " + totalEmployees);
    }

    // Instance variables
    private String name;
    private final int id; // Final variable, cannot be changed
    private String designation;

    // Constructor using 'this' to initialize
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Method to display employee details with instanceof check
    public void displayDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee emp = (Employee) obj;
            System.out.println("Name: " + emp.name);
            System.out.println("ID: " + emp.id);
            System.out.println("Designation: " + emp.designation);
        } else {
            System.out.println("Invalid object type.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter designation: ");
        String designation = scanner.nextLine();

        // Create employee object
        Employee emp = new Employee(name, id, designation);

        // Display static info
        displayTotalEmployees();

        // Display employee details
        emp.displayDetails(emp);

        scanner.close();
    }
}
