import java.util.Scanner;

public class NumberCheck{
	//create a method to check the number
	public static int numberCheck(int number){
		
		if(number > 0) {
			return 1;
		}
		else if (number < 0){
			return -1;
		}
		else{
			return 0;
		}
	}

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		System.out.println(numberCheck(number));
	}
	
	
}