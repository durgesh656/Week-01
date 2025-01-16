
import java.util.Scanner;

public class StringsCharacter{
         
	public static char[] stringToCharArray(String str){
            
       char [] ch =new char[str.length()];
		for (int i=0; i<str.length(); i++){
			ch[i] +=str.charAt(i);
		}
		return ch;
	}
	
	public static boolean compareCharArrays(String str ){
		return stringToCharArray( str).equals(str.toCharArray());
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine().trim();
		
		if(compareCharArrays( str )){
			System.out.println("Character arrays are equal");
		}
		else{
			System.out.println("Character arrays are not equal");
		}
		
		
		
	}
}