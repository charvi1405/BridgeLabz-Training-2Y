public class PowerWhile {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the base number (positive integer): ");
        int number = scanner.nextInt();
        System.out.print("Enter the power (non-negative integer): ");
        int power = scanner.nextInt();

        if (number < 1 || power < 0) {
            System.out.println("Please enter positive integers for base and non-negative integer for power.");
        } else {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(number + " raised to the power " + power + " is " + result);
        }
        scanner.close();}}
