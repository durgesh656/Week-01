import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in); 
	
		int number = sc.nextInt();
		
		int noOfDigits = 0, numberReplica = number;
		
		while (numberReplica > 0) {
			noOfDigits++;
			numberReplica /= 10;
		}
		
		int [] digits = new int [noOfDigits];
		
		int iterator = 0;
		
		while (number > 0) {
			digits [iterator] = number % 10;
			number /= 10;
			iterator++;
		}
		
		// Display the digits in reverse order
		for (iterator = 0; iterator < noOfDigits; iterator++) {
			System.out.print(digits [iterator]);
		}
	}
}