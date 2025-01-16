import java.util.Scanner;

public class ArrayIndexOutOfBoundException {
	
	public static void generateArrayIndexOutOfBoundException(String[] array){
		//for generating exception 
		System.out.println(array[array.length]); 
	}
	
	public static void handleException() {
		System.out.println("Array index out of bound exception found.");
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in); // object of scanner class
		
		int numberOfNames = sc.nextInt(); 
		
		String [] arrayOfNames = new String [numberOfNames];
		
		//creating an array
		for(int i=0; i<numberOfNames; i++){
			arrayOfNames [i] = sc.next();
		}
		
		// generating and handling the exception
		try {
			generateArrayIndexOutOfBoundException(arrayOfNames);
		} catch (Exception e) {
			handleException();
		}
	}
}