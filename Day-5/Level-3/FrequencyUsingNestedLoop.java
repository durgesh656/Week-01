import java.util.Scanner;

public class FrequencyUsingNestedLoop {

    // method to find the frequency of characters
    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] frequencies = new int[chars.length];

        // initialize the frequency array with -1 to track unprocessed characters
        for (int i = 0; i < frequencies.length; i++) {
            frequencies[i] = -1;
        }

        // outer loop to iterate through each character
        for (int i = 0; i < chars.length; i++) {
            if (frequencies[i] == 0) {
                continue; // skip characters already counted
            }
            frequencies[i] = 1; // initialize frequency to 1

            // inner loop to find duplicates
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequencies[i]++;
                    frequencies[j] = 0; // mark duplicate character as processed
                }
            }
        }

        // calculate the result array size
        int count = 0;
        for (int freq : frequencies) {
            if (freq > 0) {
                count++;
            }
        }

        // create a result array to store characters and their frequencies
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (frequencies[i] > 0) {
                result[index++] = chars[i] + " : " + frequencies[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // convert to lowercase
        text = text.toLowerCase();

        // call the method to find frequencies
        String[] frequencies = findCharacterFrequency(text);

       //print result
        System.out.println("Frequencies:");
        for (String frequency : frequencies) {
            System.out.println(frequency);
        }

        
    }
}