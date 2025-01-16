import java.util.Scanner;

class CalculateSimpleInterest{
	
	public double SimpleInterest(double principal, double rate, double time){
		double result = ( principal * rate * time) / 100;
		
		return result;
	}
	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Principal Amount:  ");
		double principal = sc.nextDouble();
		
		System.out.print("Enter the Rate of Interest (in %):  ");
		double rate = sc.nextDouble();
		
		System.out.print("Enter the Time Duration (in year):  ");
		double time = sc.nextDouble();
		
		// Initializing the object of class
		CalculateSimpleInterest simpleInterest = new CalculateSimpleInterest();
		double Interest = simpleInterest.SimpleInterest(principal, rate, time);
		
		// Display the result
		System.out.println("The Simple Interest is " + Interest + " for Principal " + principal + ", Rate of Interest " + rate + "%  and Time " + time);
		
		sc.close();
	}
}
