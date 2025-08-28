public class FizzBuzzUsingWhile {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1;
            while (i <= n) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        }
        scanner.close();
    }}
