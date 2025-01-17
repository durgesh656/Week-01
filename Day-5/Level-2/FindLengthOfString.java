import java.util.Scanner;

public class FindLengthOfString{
	
	public static int findLengthUsingCharAt(String string){
		
		int length = 0;
		
		// using try-catch block to handle string out of bound exception
		try{
			while(true){
				string.charAt(length);//exception encounter when 'length' equals string length
				length++;    
			}
		}
		catch(Exception e){
			return length;
		}
		
	}

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		String string = sc.nextLine().trim();
		
		int length1=findLengthUsingCharAt(string);
		int length2=string.length();
		
		System.out.println("Length of the given string using user define method is : " +length1+". And using Built-in method is : "+length2);
	}
	
}