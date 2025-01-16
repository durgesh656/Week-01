import java.util.Scanner;

public class CalculateBMI {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		int number = input.nextInt();
		

		double [] weight = new double [number];
		double [] height = new double [number];
		double [] bodyMassIndex = new double [number];
		String [] weightStatus = new String [number];
		
		for (int i = 0; i < number; i++) {
			weight [i] = input.nextDouble(); 
			height [i] = input.nextDouble();
			
			bodyMassIndex [i] = weight [i] / ((height [i] / 100f) * (height [i] / 100f)); 
			if (bodyMassIndex [i] <= 18.4) {
				weightStatus [i] = "Underweight";
			} 
			else if (bodyMassIndex [i] >= 18.5 && bodyMassIndex [i] <= 24.9) {
				weightStatus [i] = "Normmal";
			}
			else if (bodyMassIndex [i] >= 25.0 && bodyMassIndex [i] <= 39.9) {
				weightStatus [i] = "Overweight";
			}
			else {
				weightStatus [i] = "Obese";
			}
			System.out.println("height: " + height [i] + ", weight: " + weight [i] + ", BMI: " + bodyMassIndex [i] + ", weight status: " + weightStatus [i]);
		}
		
		
	}
}