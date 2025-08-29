;
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        final int EMP_COUNT = 10;
        double[] salary = new double[EMP_COUNT];
        double[] years = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            while (true) {
                System.out.print("  Salary: ");
                salary[i] = sc.nextDouble();
                System.out.print("  Years of service: ");
                years[i] = sc.nextDouble();
                if (salary[i] > 0 && years[i] >= 0) break;
                System.out.println("  Invalid input. Please enter again.");
            }
        }
        for (int i = 0; i < EMP_COUNT; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.printf("Total bonus payout: %.2f\n", totalBonus);
        System.out.printf("Total old salary: %.2f\n", totalOldSalary);
        System.out.printf("Total new salary: %.2f\n", totalNewSalary);
        sc.close();
    }
}
