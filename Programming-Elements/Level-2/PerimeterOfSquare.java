import java.util.Scanner;
public class PerimeterOfSquare {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the perimeter of the square: ");
    int perimeter = scanner.nextInt();
    float side = perimeter/4;
    System.out.println("the length of the side is " + side +" whose perimeter is " + perimeter);
    scanner.close();
   } 
}
