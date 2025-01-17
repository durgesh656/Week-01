import java.util.Scanner;

public class VowelAndConsonant{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine().trim();
		
		// converting the string into lowercase
		text = text.toLowerCase();
		
		String vowels = "aeiou";
		
		int countVowel = 0;
		int countConsonant = 0;
		
		for(int i=0; i<text.length(); i++){
			String s = "";
			s += text.charAt(i);
			if(vowels.contains(s)){
				
				countVowel++;
			}
			else{
				
				countConsonant++;
			}
		}
		
		System.out.println("The given string has " + countVowel + " vowels and " + countConsonant + " consonants");
	}
}