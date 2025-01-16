import java.util.Scanner;

public class NaturalNumbersSum {

	static int nNaturalSum(int number) {
		if(number == 1) {
			return 1;
		}
		return number + nNaturalSum(number - 1);
	}
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// taking user input 
		int number = input.nextInt();
		
		// created two integer variables, formulaSum, and recursionSum
		int formulaSum = 0;
		int recursionSum = 0;
		
		// A sum of n natural numbers is n * (n+1) / 2 
		if(number >= 1){
			formulaSum = number * (number + 1) / 2; // sum calculated using formula
			
			recursionSum = nNaturalSum(number); // sum calculated using recursion
			
			System.out.println("Sum calculated using for recursion is " + recursionSum + " and by using formula is " + formulaSum + ". Both are same.");
		}
		else{
			System.out.println("The number " + number + " is not a natural number");
		}
		
		input.close(); // closing the Scanner object
	}
}