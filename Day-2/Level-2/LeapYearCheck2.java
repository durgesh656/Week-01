import java.util.Scanner;

public class LeapYearCheck2 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in); 
		
		int year = sc.nextInt();
		
		// checking the year is a leap year or not 
		if (year >= 1582 && (year % 4 == 0 && ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0)))) { 
			System.out.println("year " + year + " is a leap year");
			
		} 
		else { 
			System.out.println("year " + year + " is not a leap year");
		}
	}
}