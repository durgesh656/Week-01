import java.util.Scanner;

public class  IllegalArgumentException {
	
	public static void generateIllegalArgumentException(String str){
		//for generating runtime exception
		String subString = str.substring(3,1); 
		System.out.println(subString);
	}
	
	public static void handleException() {
		System.out.println("Illegal Argument exception Caught:");
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in); 
		
		String str =sc.nextLine().trim(); 
		
		// generating and handling the exception
		try {
			generateIllegalArgumentException(str); 
		} catch (Exception e) {
			handleException();
		}
	}
}