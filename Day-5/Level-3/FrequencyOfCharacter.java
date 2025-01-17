import java.util.Scanner;

public class FrequencyOfCharacter {

    
    public static int[][] findCharacterFrequencies(String text) {
        int[] frequency = new int[256]; // array to store frequencies (ASCII size)

        // iterating through the text to calculate frequencies
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // counting unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        int[][] result = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;
                result[index][1] = frequency[i]; 
                index++;
            }
        }

        return result; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // taking a string input
        String input = scanner.nextLine().trim();

        // finding character frequencies
        int[][] frequencies = findCharacterFrequencies(input);

        // displaying the result
        for (int[] pair : frequencies) {
            char character = (char) pair[0];
            int count = pair[1];
            System.out.println(character + ": " + count);
        }

        scanner.close(); 
    }
}