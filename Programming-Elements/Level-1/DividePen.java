public class DividePen {
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;

        // Calculate pens per student and remaining pens
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        // Display the results
        System.out.printf("The Pen Per Student is %d and the remaining pen not distributed is %d\n",
        pensPerStudent, remainingPens);

    }
}
