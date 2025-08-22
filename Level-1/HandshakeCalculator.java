import java.util.Scanner;
public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int n = scanner.nextInt();
        int handshakes = n * (n - 1) / 2;
        System.out.println("Total handshakes: " + handshakes);
        scanner.close();
    }
}
