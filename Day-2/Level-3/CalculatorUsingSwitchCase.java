import java.util.Scanner;

public class CalculatorUsingSwitchCase {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int number1 = sc.nextInt(); 
		int number2 = sc.nextInt();
		String operator = sc.next(); 
		
		switch (operator) {
			case "+" : 
				System.out.println("the answer is " + (number1 + number2));
				break;
			
			case "-" : 
				System.out.println("the answer is " + (number1 - number2));
				break;
				
			case "*" :
				System.out.println("the answer is " + (number1 * number2));
				break;
				
			case "/" : 
				System.out.println("the answer is " + (number1 / number2));
				break;
				
			default : 
				System.out.println("It is an Invalid Operator");
				break;
		}
	}
}