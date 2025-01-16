import java.util.Scanner;

public class QuotientAndRemainder{

	public static int[] findRemainderAndQuotient(int number, int divisor){
		
		//find remainder and quotient
		int remainder = number % divisor;
		int quotient = number / divisor;
		
		return new int[]{remainder, quotient};
	}


	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int divisor = sc.nextInt();
		
		int[]ans = findRemainderAndQuotient(number, divisor);
		
		// print answer
		System.out.println("Reminder is " + ans[0] + " and quotient is " + ans[1]);
	}
	
}