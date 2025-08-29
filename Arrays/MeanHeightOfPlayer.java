import java.util.Scanner;

public class MeanHeightOfPlayer {
	public static void main(String[] args) {
		double[] heights = new double[11];
		double sum = 0.0;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < heights.length; i++) {
			System.out.print("Enter height of player " + (i + 1) + ": ");
			heights[i] = scanner.nextDouble();
			sum += heights[i];
		}

		double mean = sum / heights.length;
		System.out.printf("Mean height of the football team: %.2f\n", mean);

		scanner.close();
	}
}
