import java.util.Scanner;

public class FrequencyOfDigits {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		

		int number = sc.nextInt();
		
		// create an array to store the frequency of digits in the number
		int[] frequency = new int[10];
		
		while (number > 0) {
			int unitPlaceDigit = number % 10;
			frequency[unitPlaceDigit]++;
			number /= 10;
		}
		
		for (int iterator=0; iterator<10; iterator++) {
			System.out.println(iterator + " : " + frequency[iterator]);
		}
		
		sc.close();
	}
}