import java.util.Scanner;

public class FizzBuzzUsingWhileLoop {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();

		int iterator = 0;
		
		while (iterator <= number){
			if ((iterator % 3 == 0) && (iterator % 5 == 0)) { 
				System.out.print("FizzBuzz "); 
			} 
			else if (iterator % 3 == 0) {
				System.out.print("Fizz ");
			}
			else if (iterator % 5 == 0) { 
				System.out.print("Buzz ");
			}
			else {
				System.out.print(iterator + " ");
			}
			iterator++; 
		}
	}
}