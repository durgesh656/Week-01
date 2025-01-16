import java.util.Scanner;

public class YoungestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            age[i] = input.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            height[i] = input.nextDouble();
        }

        // Find the youngest
        int youngestAge = age[0];
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < youngestAge) {
                youngestAge = age[i];
                youngestIndex = i;
            }
        }

        // Find the tallest 
        double tallestHeight = height[0];
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > tallestHeight) {
                tallestHeight = height[i];
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest Friend: " + (youngestIndex == 0 ? "Amar" : (youngestIndex == 1 ? "Akbar" : "Anthony")) + " with age " + youngestAge);
        System.out.println("Tallest Friend: " + (tallestIndex == 0 ? "Amar" : (tallestIndex == 1 ? "Akbar" : "Anthony")) + " with height " + tallestHeight);

    }
}
