
import java.util.Scanner;

public class CompareString{
	
	public static boolean compareTwoStrings(String str1,String str2){
		int stringLength=0;
		if(str1.length()!=str2.length()){
			return false;
		} else{
		for (int i=0; i<str1.length() ;i++){
			if (str1.charAt(i)!=str2.charAt(i)){
				return false;
			}
		} 
		return true;
		}
	}

	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		
		String str1=sc.next().trim();
		String str2=sc.next().trim();
		
		if (compareTwoStrings(str1,str2)){
			
				System.out.println("Given strings are equal!");
			}
			
		else{
			System.out.println("Given strings are not equal!");
		}
		
		
		
	}
}