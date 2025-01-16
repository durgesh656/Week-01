import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        String[] results = new String[number + 1];
		
        for (int i = 1; i <= number; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i-1] = "FizzBuzz";
            } 
			else if (i % 3 == 0) {
                results[i-1] = "Fizz";
            }
			else if (i % 5 == 0) {
                results[i-1] = "Buzz";
            } 
			else {
                results[i-1] = String.valueOf(i);
            }
        }

        for (int i = 1; i < results.length; ++i) {
            System.out.println("Position " + i + " : " + results[i-1]);
        }
    }
}