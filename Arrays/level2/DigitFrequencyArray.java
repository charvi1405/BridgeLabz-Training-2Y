

import java.util.Scanner;

public class DigitFrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        // Count digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        temp = number;
        // Store digits in array
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        int[] freq = new int[10];
        // Count frequency
        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }
        System.out.println("Digit frequencies in the number:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i]);
            }
        }
        sc.close();
    }
}
