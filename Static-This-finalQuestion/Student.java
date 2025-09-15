import java.util.Scanner;

// Sample Program 5: University Student Management
public class Student {
    // Static variable shared across all students
    static String universityName = "Global University";

    // Static variable to keep track of total students
    static int totalStudents = 0;

    // Static method to display total students
    static void displayTotalStudents() {
        System.out.println("Total students in " + universityName + ": " + totalStudents);
    }

    // Instance variables
    private String name;
    private final int rollNumber; // Final variable, cannot be changed
    private String grade;

    // Constructor using 'this' to initialize
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Method to display student details with instanceof check
    public void displayDetails(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            System.out.println("Name: " + student.name);
            System.out.println("Roll Number: " + student.rollNumber);
            System.out.println("Grade: " + student.grade);
        } else {
            System.out.println("Invalid object type.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();

        // Create student object
        Student student = new Student(name, rollNumber, grade);

        // Display static info
        displayTotalStudents();

        // Display student details
        student.displayDetails(student);

        scanner.close();
    }
}
