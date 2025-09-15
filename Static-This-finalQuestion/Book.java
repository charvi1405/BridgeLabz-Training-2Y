import java.util.Scanner;

// Sample Program 2: Library Management System
public class Book {
    // Static variable shared across all books
    static String libraryName = "City Library";

    // Static method to display library name
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Instance variables
    private String title;
    private String author;
    private final String isbn; // Final variable, cannot be changed

    // Constructor using 'this' to initialize
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details with instanceof check
    public void displayDetails(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("ISBN: " + book.isbn);
        } else {
            System.out.println("Invalid object type.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        // Create book object
        Book book = new Book(title, author, isbn);

        // Display static info
        displayLibraryName();

        // Display book details
        book.displayDetails(book);

        scanner.close();
    }
}
