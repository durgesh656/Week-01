import java.util.Scanner;

public class ConvertStringToUpperCase {
	
	public static String convertToUpperCase (String string) {
		String UpperCaseString = "";
		
		// converting to uppercase using for loop
		for(int i=0; i<string.length(); i++){
			if((int)string.charAt(i) >= 97){
				UpperCaseString += (char)((int)string.charAt(i)-32);
			}
			else {
				UpperCaseString += string.charAt(i);
			}
		}
		
		return UpperCaseString;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in); 
		
		String string = sc.nextLine().trim(); 
		
		String UpperCaseString = convertToUpperCase(string); // converting the input string to Uppercase by created method
		
		String UpperCaseString2 = string.toUpperCase(); // converting the input string to Uppercase by inbuilt method
		
		// comparing both strings
		if (UpperCaseString == UpperCaseString2) {
			System.out.println("upper case string by both methods are equal");
		} else {
			System.out.println("upper case string by both methods are equal");
		}
		
		
	}
}