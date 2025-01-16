import java.util.Scanner;

public class CalculateBMI{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		double weightInKilograms = sc.nextDouble();
		
		double heightInCentimeters = sc.nextDouble();
		
		// BMI = weight(in kg) / (height * height)(in meters)
		
		double heightInMeters = (heightInCentimeters / 100); 
		double bodyMassIndexValue = weightInKilograms / (heightInMeters * heightInMeters);
		
		String weightStatus;
		
		if (bodyMassIndexValue <= 18.4) {
			weightStatus = "Underweight";
		} 
		else if (bodyMassIndexValue >= 18.5 && bodyMassIndexValue <= 24.9) {
			weightStatus = "Normmal";
		} 
		else if (bodyMassIndexValue >= 25.0 && bodyMassIndexValue <= 39.9) {
			weightStatus = "Overweight";
		} 
		else {
			weightStatus = "Obese";
		}
		
		//  the output is
		System.out.println("Weight status of the person: " + weightStatus);
	}
}