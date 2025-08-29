import java.util.Scanner;

public class NumberCheck {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		Scanner scanner = new Scanner(System.in);

		// Input numbers
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
		}

		// Check each number
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			if (num > 0) {
				if (num % 2 == 0) {
					System.out.println("Number " + num + " is positive and even.");
				} else {
					System.out.println("Number " + num + " is positive and odd.");
				}
			} else if (num < 0) {
				System.out.println("Number " + num + " is negative.");
			} else {
				System.out.println("Number is zero.");
			}
		}

		// Compare first and last elements
		int first = numbers[0];
		int last = numbers[numbers.length - 1];
		if (first == last) {
			System.out.println("First and last elements are equal.");
		} else if (first > last) {
			System.out.println("First element is greater than last element.");
		} else {
			System.out.println("First element is less than last element.");
		}

		scanner.close();
	}
}
