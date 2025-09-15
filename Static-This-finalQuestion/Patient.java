import java.util.Scanner;

// Sample Program 7: Hospital Management System
public class Patient {
    // Static variable shared among all patients
    static String hospitalName = "City Hospital";

    // Static variable to keep track of total patients
    static int totalPatients = 0;

    // Static method to get total patients
    static void getTotalPatients() {
        System.out.println("Total patients in " + hospitalName + ": " + totalPatients);
    }

    // Instance variables
    private String name;
    private int age;
    private String ailment;
    private final int patientID; // Final variable, cannot be changed

    // Constructor using 'this' to initialize
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Method to display patient details with instanceof check
    public void displayDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient patient = (Patient) obj;
            System.out.println("Name: " + patient.name);
            System.out.println("Age: " + patient.age);
            System.out.println("Ailment: " + patient.ailment);
            System.out.println("Patient ID: " + patient.patientID);
        } else {
            System.out.println("Invalid object type.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter ailment: ");
        String ailment = scanner.nextLine();
        System.out.print("Enter patient ID: ");
        int patientID = scanner.nextInt();

        // Create patient object
        Patient patient = new Patient(name, age, ailment, patientID);

        // Display static info
        getTotalPatients();

        // Display patient details
        patient.displayDetails(patient);

        scanner.close();
    }
}
