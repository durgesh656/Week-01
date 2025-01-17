import java.util.Scanner;

public class ShortestAndLongestWord{

	// Method to split a sentence into words using charAt()
    public static String[] splitIntoWords(String text) {
        String[] words = new String[findStringLength(text)];
        int wordIndex = 0;
        String currentWord = "";

        for (int i = 0; i < findStringLength(text); i++) {
            if (text.charAt(i) != ' ') {
                currentWord += text.charAt(i);
            } else {
                if (!currentWord.isEmpty()) {
                    words[wordIndex++] = currentWord;
                    currentWord = "";
                }
            }
        }
        if (!currentWord.isEmpty()) {
            words[wordIndex++] = currentWord;
        }

        // Resize array to the exact number of words
        String[] result = new String[wordIndex];
        for (int i = 0; i < wordIndex; i++) {
            result[i] = words[i];
        }
        return result;
    }


    // create a Method to find length of a string 
    public static int findStringLength(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length++);
            }
        } catch (Exception e) {
            
        }
        return length;
    }

 
    // Method to create a 2D array with words and their lengths
    public static String[][] mapWordsWithLengths(String[] words) {
        String[][] wordLengthMap = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengthMap[i][0] = words[i];
            wordLengthMap[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordLengthMap;
    }

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordLengthMap) {
        String shortest = wordLengthMap[0][0];
        String longest = wordLengthMap[0][0];
        int shortestLength = Integer.parseInt(wordLengthMap[0][1]);
        int longestLength = Integer.parseInt(wordLengthMap[0][1]);

        for (String[] wordLength : wordLengthMap) {
            int length = Integer.parseInt(wordLength[1]);
            if (length < shortestLength) {
                shortest = wordLength[0];
                shortestLength = length;
            }
            if (length > longestLength) {
                longest = wordLength[0];
                longestLength = length;
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text:");
        String text = sc.nextLine().trim();
		
        String[] words = splitIntoWords(text);

        String[][] wordLengthMap = mapWordsWithLengths(words);

        // for Finding the shortest and longest words
        String[] result = findShortestAndLongest(wordLengthMap);

        
        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);

       
    }
}
