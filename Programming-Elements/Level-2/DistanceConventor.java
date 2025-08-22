import java.util.Scanner;
public class DistanceConventor {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the distance in feet: ");
        float distanceInFeet = scanner.nextFloat();
        float distanceInYards = distanceInFeet / 3;
        float distanceInMiles = distanceInYards / 1760;
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
        scanner.close();


    }
    
}

