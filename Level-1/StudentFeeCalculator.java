import java.util.Scanner;

public class StudentFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Student Fee: ");
        int fee = scanner.nextInt();
        System.out.print("Enter the University Discount Percentage: ");
        int discountPercent = scanner.nextInt();
        int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        
        scanner.close();
    }
}
