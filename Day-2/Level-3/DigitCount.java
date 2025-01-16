import java.util.Scanner;

public class DigitCount {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		int number = input.nextInt();
		
		int digitCount = 0, numberReplica = number;
		
		while (numberReplica > 0) {
			digitCount++ ;
			numberReplica = numberReplica / 10; 
		}
		
		System.out.println("there are " + digitCount + " digits in " + number);
	}
}