
import java.util.Scanner;

public class VoteChecker {
	public static void main(String[] args) {
		int[] ages = new int[10];
		Scanner scanner = new Scanner(System.in);

		// Take input for ages
		for (int i = 0; i < ages.length; i++) {
			System.out.print("Enter the age of student " + (i + 1) + ": ");
			ages[i] = scanner.nextInt();
		}

		// Check voting eligibility
		for (int i = 0; i < ages.length; i++) {
			int age = ages[i];
			if (age < 0) {
				System.out.println("Invalid age for student " + (i + 1));
			} else if (age >= 18) {
				System.out.println("The student with the age " + age + " can vote.");
			} else {
				System.out.println("The student with the age " + age + " cannot vote.");
			}
		}

		scanner.close();
	}
}
