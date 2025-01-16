import java.util.Scanner;

public class LargestAndSecondLargestDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
		
        int number = scanner.nextInt();
	
        final int MAX_DIGITS = 10;
		
        int[] digits = new int[MAX_DIGITS];
        int index = 0;

        while (number != 0 && index < MAX_DIGITS) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }


        int largest = -1;
        int secondLargest = -1;

        // find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
		
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        scanner.close();
    }
}