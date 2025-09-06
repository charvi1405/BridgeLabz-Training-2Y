import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create an array to store frequency of each character (ASCII size = 256)
        int[] frequency = new int[256];

        // Count frequency of each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            frequency[ch]++;
        }

        // Find the character with the highest frequency
        char mostFrequent = ' ';
        int maxCount = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                mostFrequent = (char) i;
            }
        }

        // Display the result
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}