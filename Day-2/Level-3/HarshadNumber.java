import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		int sum = 0, numberReplica = number;
		
		while (numberReplica > 0) {
			int unitDigit = numberReplica % 10; 
			sum = sum + unitDigit;
			numberReplica = numberReplica / 10;
		}
		
		if (number % sum == 0) {
			System.out.println(number + " is a Harshad number");
		} 
		else {
			System.out.println(number + " is not a Harshad number");
		}
	}
}