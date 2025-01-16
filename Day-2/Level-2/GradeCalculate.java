import java.util.Scanner;

public class GradeCalculate{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in); // Object of scanner class
		
		int physicsMarks = sc.nextInt();
		
		int chemistryMarks = sc.nextInt();
		
		int mathsMarks = sc.nextInt();
		
		float percentage = (float)(physicsMarks + chemistryMarks + mathsMarks) / 300f * 100f; 
		float averageMarks = (float)(physicsMarks + chemistryMarks + mathsMarks) / 3f;
		
		String grade, remarks;
		
		if (percentage <= 39) {
			grade = "R";
			remarks = "Remedial Standards";
		} else if (percentage >= 40 && percentage <= 49) {
			grade = "E";
			remarks = "Level 1, too below agency-normalized standards";
		} else if (percentage >= 50 && percentage <= 59) {
			grade = "D";
			remarks = "Level 1, well below agency-normalized standards";
		} else if (percentage >= 60 && percentage <= 69) {
			grade = "C";
			remarks = "Level 2, below, but approaching agency-normalized standards";
		} else if (percentage >= 70 && percentage <= 79) {
			grade = "B";
			remarks = "Level 3, at agency-normalized standards";
		} else {
			grade = "A";
			remarks = "Level 4, above agency-normalized standards";
		}
		
		// the output
		System.out.println("average marks: " + averageMarks + "\ngrade: " + grade + "\nremarks: " + remarks);
	}
}