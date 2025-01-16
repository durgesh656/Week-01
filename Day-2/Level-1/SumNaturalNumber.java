import java.util.Scanner;

public class SumNaturalNumber{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int formulaSum = 0;
		int whileLoopSum = 0;
		
		// sum of natural no. n * (n+1) / 2 
		
		if(number >= 1){
			formulaSum = number * (number + 1) / 2;
			
			while(number >= 1){
				whileLoopSum += number;
				number --;
			}
			
			System.out.println("Sum calculated using while loop is " + whileLoopSum + " and by using formula is " + formulaSum + ". Both are same.");
		}
		else{
			System.out.println("The number " + number + " is not a natural number");
		}
	}
}