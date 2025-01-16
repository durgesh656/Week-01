import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the marks for Physics: ");
        double physicsMarks = input.nextDouble();

        System.out.print("Enter the marks for Chemistry: ");
        double chemistryMarks = input.nextDouble();

        System.out.print("Enter the marks for Maths: ");
        double mathsMarks = input.nextDouble();

        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (totalMarks / 300) * 100;

        String grade;
        if (percentage >= 80) {
            grade = "A (Level 4, above agency-normalized standards)";
        } else if (percentage >= 70) {
            grade = "B (Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            grade = "C (Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50) {
            grade = "D (Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            grade = "E (Level 1-, too below agency-normalized standards)";
        } else {
            grade = "R (Remedial standards)";
        }

        System.out.println("\nTotal Marks: " + totalMarks + " / 300");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

    }
}