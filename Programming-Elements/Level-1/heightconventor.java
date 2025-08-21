import java.util.Scanner;
public class heightconventor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height in centimeters: ");
        double cm = scanner.nextDouble();
        double feet = cm / 30.48;
        double inches = (cm % 30.48) / 2.54;
        System.out.printf("Height in feet and inches: %.0f feet %.2f inches%n", feet, inches);  
    }
}
