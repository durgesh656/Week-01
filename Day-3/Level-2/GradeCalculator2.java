import java.util.Scanner;

public class GradeCalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Create a 2D array to store the marks of Physics, Chemistry, and Maths
        double[][] marks = new double[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter the marks for Student " + (i + 1));

            System.out.print("Physics marks: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Chemistry marks: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Maths marks: ");
            marks[i][2] = sc.nextDouble();
        }

        for (int i = 0; i < numberOfStudents; i++) {

            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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

            // print the results for the student
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Total Marks: " + totalMarks + " / 300");
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);
        }

    }
}