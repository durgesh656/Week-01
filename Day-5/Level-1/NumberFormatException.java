import java.util.Scanner;

public class NumberFormatException {
	
	public static void generateNumberFormatException(String text){
		int number = Integer.parseInt(text); // runtime exception will arise here due to converting the string to integer
	}
	
	public static void handleException() {
		System.out.println("Number Format exception arised.");
	}
	
	public static void main(String [] args) {
		//creating object of scanner class
		Scanner sc = new Scanner(System.in); 
		
		String text = sc.nextLine().trim(); 
		
		
		try {
			generateNumberFormatException(text); 
		} catch (Exception e) {
			handleException();
		}
	}
}