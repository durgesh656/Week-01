import java.util.Scanner;

public class MultiplicationTable2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int[] array = new int[4];

        // Calculate the multiplication table for a number from 6 to 9
        for (int i = 6; i <= 9; i++) {
            array[i - 6] = number * i; 
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + array[i - 6]);
        }

        // Close the scanner
        scanner.close();
    }
}