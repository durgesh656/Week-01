import java.util.Scanner;

public class CheckCharacterType{
	
	public static String isVowel(char ch){
		
		String vowel = "aeiou";
		// consonant string to compare character
		String consonant = "bcdfghjklmnpqrstvwxyz";
		
		if(vowel.contains(ch + "")){
			return "Vowel";
		}
		else if(consonant.contains(ch + "")){
			return "Consonant";
		}
		else{
			return "Not a letter";
		}
	}
	
	public static String[][] checkLetter(String text){
		
		text = text.toLowerCase();
		
		String[][] answer = new String[2][text.length()];
		
		for(int i=0; i<text.length(); i++){
			answer[0][i] = text.charAt(i) + "";
			answer[1][i] = isVowel(text.charAt(i));
		}
		
		return answer;
	}

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		//taking input String
		String word = sc.nextLine().trim();
		
		String[][]answer = checkLetter(word);
		
		
		for(int i=0; i<word.length(); i++){
			System.out.println(answer[0][i] + " - " + answer[1][i]);
		}
	}
	
}