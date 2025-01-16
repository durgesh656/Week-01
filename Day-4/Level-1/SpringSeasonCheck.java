import java.util.Scanner;

public class SpringSeasonCheck{

	// create a method to check spring season
	public static boolean checkSpring(int month, int day){
		if(month >= 3 && month <=6){
			if((month == 3 && day < 20) || (month == 6 && day > 20)){
				return false;
			}
			else{
				return true;
			}
		}
		else{
			return false;
		}
	}


	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		boolean isSpring = checkSpring(month, day);
		
		// using if-else to print Spring season 
		if(isSpring){
			System.out.println("It's a spring season");
		}
		else{
			System.out.println("It's not a spring season");
		}
	}
	
	
}