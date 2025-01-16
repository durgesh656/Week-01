import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		int sum = 0, originalNumber = number;
		
		while (originalNumber > 0) {
			int unitDigit = originalNumber % 10;
			
			sum = sum + ( unitDigit * unitDigit * unitDigit ); 
			
			originalNumber = originalNumber / 10; 
		}
		
		if (sum == number) {
			System.out.println(number + " is an armstrong number");
		} else {
			System.out.println(number + " is not an armstrong number");
		}
	}
}