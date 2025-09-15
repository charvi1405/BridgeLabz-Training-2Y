import java.util.Scanner;

// Sample Program 1: Bank Account System
public class BankAccount {
    // Static variable shared across all accounts
    static String bankName = "MyBank";

    // Static method to display total accounts
    static void getTotalAccounts(int total) {
        System.out.println("Total accounts in " + bankName + ": " + total);
    }

    // Instance variables
    private String accountHolderName;
    private final int accountNumber; // Final variable, cannot be changed
    private double balance;

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details with instanceof check
    public void displayDetails(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount account = (BankAccount) obj;
            System.out.println("Account Holder: " + account.accountHolderName);
            System.out.println("Account Number: " + account.accountNumber);
            System.out.println("Balance: $" + account.balance);
        } else {
            System.out.println("Invalid object type.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        // Create account object
        BankAccount account = new BankAccount(name, number, balance);

        // Display static info
        getTotalAccounts(1); // Assuming 1 account for demo

        // Display account details
        account.displayDetails(account);

        scanner.close();
    }
}
