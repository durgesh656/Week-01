import java.util.Scanner;

public class FactorsArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int maxFactor = 10;
		
        int[] factors = new int[maxFactor];     
		
        int index = 0;

        // Finding factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                // Add the factor to the array
                factors[index++] = i;
            }
        }

        System.out.print("Factors of " + number + " : ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
		sc.close();
    }
}