import java.util.Scanner;

public class LeapYearCheck {

	static void isLeapYear(int year) {
	
		// checking if entered year is a leap year or not 
		if (year >= 1582 && (year % 4 == 0 && ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0)))) {
		
			System.out.println("year " + year + " is a leap year");
		}
		else { // if the number is not divisible by 4, then it is not a leap year
			System.out.println("year " + year + " is not a leap year");
		}
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // Object of scanner class
		
		// user input for check leap year
		int year = input.nextInt();
		
		isLeapYear(year);
	}
}