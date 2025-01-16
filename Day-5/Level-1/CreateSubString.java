

import java.util.Scanner;

public class CreateSubString{

	public static String subStringUsingCharAt(String text,int startIndex,int endIndex){
		String subString="";
		for (int i=startIndex; i<endIndex; i++){
			subString+=text.charAt(i);
			
		}
		return subString;
	}
	
	public static boolean checkSubString(String text,int startIndex,int endIndex ){
		//return the result of checking both methods substrings are equal or not
		return subStringUsingCharAt( text, startIndex, endIndex ).equals(text.substring( startIndex, endIndex));
	}


	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		String text= sc.nextLine().trim();
		int startIndex=sc.nextInt();
		int endIndex=sc.nextInt();
		
		if (checkSubString(text, startIndex, endIndex)){
			System.out.println("both method's subStrings are equal");
		}
		else{
			System.out.println("both method's substrings are not equal");
		}
		
		
	}
}