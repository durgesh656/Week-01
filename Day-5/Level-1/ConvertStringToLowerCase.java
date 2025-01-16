import java.util.Scanner;

public class ConvertStringToLowerCase {
	
	public static String convertToLowerCase (String string) {
		String lowerCaseString = "";
		
		// conversion of string to lowerCaseString
		for(int i=0; i<string.length(); i++){
			if((int)string.charAt(i) < 97){
				lowerCaseString += (char)((int)string.charAt(i)+32);
			}
			else {
				lowerCaseString += string.charAt(i);
			}
		}
		
		return lowerCaseString;
	}
	
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in); 
		
		String string = sc.nextLine().trim(); 
		
		String lowerCaseString = convertToLowerCase(string); // converting the input string to lowercase by created method
		
		String lowerCaseString2 = lowerCaseString.toLowerCase(); // converting the input string to lowercase by inbuilt method
		
		if (lowerCaseString == lowerCaseString2) {
			System.out.println("lower case string by both methods are equal");
		} 
		else{
			System.out.println("lower case string by both methods are equal");
		}
		
		
	}
}