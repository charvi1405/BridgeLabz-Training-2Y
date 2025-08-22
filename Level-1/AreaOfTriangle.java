import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Input base and height in inches
        System.out.print("Enter base of the triangle (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter height of the triangle (in inches): ");
        double height = sc.nextDouble();

        // Calculate area in square inches
        double areaInInches = 0.5 * base * height;

        // Convert area into square centimeters (1 inch = 2.54 cm, so 1 in² = 6.4516 cm²)
        double areaInCm = areaInInches * 6.4516;

        // Convert height into centimeters
        double heightInCm = height * 2.54;

        // Convert height into feet and inches
        int feet = (int)(height / 12);   // 1 foot = 12 inches
        double remainingInches = height % 12;

        // Output
        
        System.out.println("Your Height in cm is " + heightInCm +" while in feet is " + feet + " and inches is " + remainingInches);
    }
}
