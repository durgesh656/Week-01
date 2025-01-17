import java.util.Scanner;

public class FrequencyUniqueCharacters {

    // method to find unique characters 
    public static char[] findUniqueCharacters(String text) {
        int length = text.length(); 
		
        char[] unique = new char[length];
        int uniqueIndex = 0; 

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // checking if the character is already in the unique array
            for (int j = 0; j < uniqueIndex; j++) {
                if (unique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // if the character is unique, then add this to the array
            if (isUnique) {
                unique[uniqueIndex] = currentChar;
                uniqueIndex++;
            }
        }

        // trim the unique array to the actual size of unique characters
        char[] trimmedUnique = new char[uniqueIndex];
        System.arraycopy(unique, 0, trimmedUnique, 0, uniqueIndex); // inbuilt function to extract an array from an existing array

        return trimmedUnique;
    }

    // method to find the frequency of characters using unique characters
    public static String[][] findFrequencies(String text) {
        char[] uniqueChars = findUniqueCharacters(text);
        int uniqueCount = uniqueChars.length;
		
		// created an array to store the frequencies of the array
        String[][] frequencies = new String[uniqueCount][2];

        // calculating the frequency for each unique character
        for (int i = 0; i < uniqueCount; i++) {
            char currentChar = uniqueChars[i];
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    count++;
                }
            }

            frequencies[i][0] = String.valueOf(currentChar); // store the character
            frequencies[i][1] = String.valueOf(count);       // store its frequency
        }

        return frequencies; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // object of scanner class

        // taking a string input
        String input = scanner.nextLine();

        // finding and displaying frequencies
        String[][] frequencies = findFrequencies(input);
        System.out.println("Character frequencies:");

        for (String[] pair : frequencies) {
            System.out.println(pair[0] + ": " + pair[1]);
        }

    }
}