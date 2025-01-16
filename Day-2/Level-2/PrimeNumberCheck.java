import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		// checking the number is prime or not 
		boolean check = true;
		for (int i = 2; i < number; i++){
			if (number % i == 0) { 
				check=false;
				break; 
			}
		}
		
		// displaying the output
		if (check) { // if check is still true then number is prime
			System.out.println(number + " is prime");
		} else {
			System.out.println(number + " is not prime");
		}
	}
}