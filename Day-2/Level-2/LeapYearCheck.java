import java.util.Scanner;

public class LeapYearCheck {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int year = input.nextInt();
		
		if (year < 1582) {
			System.out.println("The LeapYear program only works for year >= 1582"); 
		} 
		else if (year % 4 == 0) { 
		
			if (year % 100 == 0) { 
			
				if (year % 400 == 0) { 
					System.out.println("year " + year + "is a leap year");
				} 
				else { 
					System.out.println("year " + year + "is not a leap year");
				}
			}
			else { 
				System.out.println("year " + year + "is a leap year");
			}
		} 
		else { 
			System.out.println("year " + year + "is not a leap year");
		}
		
	}
}