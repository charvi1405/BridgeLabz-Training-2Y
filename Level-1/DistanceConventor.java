import java.util.Scanner;
public class DistanceConventor {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Input: distance in feet
        System.out.print("Enter your height in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Convert feet to inches and centimeters
        double inches = distanceInFeet * 12;
        double centimeters = inches * 2.54;

        // Convert feet to yards and miles
        double yards = distanceInFeet / 3.0;
        double miles = yards / 1760.0;

        // Output
        System.out.println("Your Height in cm is " + yards +" while in feet is " +distanceInFeet +" and inches is " + inches);


    }
    
}
