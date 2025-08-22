import java.util.Scanner;
public class AreaOfTriangle {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the base of the triangle in cm: ");
    float base = scanner.nextFloat();
    System.out.print("Enter the height of the triangle in cm: ");
    float height = scanner.nextFloat();
    float areaSqCm = 0.5f * base * height;
    float areaSqIn = areaSqCm / (2.54f * 2.54f);
    System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
    scanner.close();
   } 
}
