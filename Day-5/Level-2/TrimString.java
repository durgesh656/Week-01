import java.util.Scanner;

public class TrimString{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		String string = sc.next();
		
		// finding index of substring
		int[]idx = findingIndex(string);
		
		// checking both strings
		boolean isEqual = checkingResults(string, idx);
		
		System.out.println("Is both string equal : " + isEqual);
	}
	
	// finding index after triming the string
	public static int[] findingIndex(String string){
		
		// calculating start index
		int start = 0;
		while(start < string.length() && string.charAt(start) == ' '){
			start++;
		}
		
		// calculating end index
		int end = string.length() - 1;
		while(end >= 0 && string.charAt(end) == ' '){
			end--;
		}
		
		// return index of substring that does not include backspace
		return new int[]{start, end+1};
	}
	
	public static boolean checkingResults(String string, int[]idx){
		String trimstring = string.trim();
		String subStringstring = string.substring(idx[0], idx[1]);
		
		System.out.println("String after using trim() method : " + trimstring + " string using manual method is : " + subStringstring);
		
		if(trimstring.length() != subStringstring.length()) return false;
		
		for(int i=0; i<trimstring.length(); i++){
			if(trimstring.charAt(i) != subStringstring.charAt(i)){
				return false;
			}
		}
		return true;
	}
}