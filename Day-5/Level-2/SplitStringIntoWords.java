import java.util.Scanner;
import java.util.Arrays;

public class SplitStringIntoWords {
	
	public static String[] findWords(String str){
		// finding number of words
		int lengthofSentance = numberOfWords(str);
		
		String[]words = new String[lengthofSentance];
		
		
		int i=0;
		
		// creating a temporary string that hold a word
		StringBuilder temp = new StringBuilder();
		for(int j=0; j<str.length(); j++){
			char ch = str.charAt(j);
			if(ch == ' '){
				words[i++] = temp.toString();
				temp.setLength(0);
			} else if(j == str.length()-1) {
				temp.append(ch);
				words[i++] = temp.toString();
				temp.setLength(0);
			} else{
				temp.append(ch);
			}
		}
		return words;
	}
 	
	//create a Method to find number of words 
	public static int numberOfWords(String str){
		int len = 0;
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == ' ' || i==str.length()-1){
				len++;
			}
		}
		
		return len;
	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
	
		String str = sc.nextLine().trim();
		
		String[] ansUsingSplit = str.split(" ");
		String[] ansUsingCharAt = findWords(str);
		
		System.out.println("Words of the sentence using split method " + Arrays.toString(ansUsingSplit));
		System.out.println("Words of the sentence using CharAt method " + Arrays.toString(ansUsingCharAt));
	}
}