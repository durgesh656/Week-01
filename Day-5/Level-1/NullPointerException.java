import java.util.Scanner;
import java.util.*;

public class NullPointerException {
	
	public static void generateNullPointerException(String str){
		// we can't use length method with null string
		System.out.println(str.length());
	}
	
	public static void main(String[]args){
		// create a null string
		String str = null;
		
		try{
			generateNullPointerException(str);
		}
		catch(Exception e){
			System.out.println("Null Pointer exception caught!"+e.getMessage() );
		}
		
		
	}
}