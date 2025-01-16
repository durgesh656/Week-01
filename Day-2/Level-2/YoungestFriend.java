import java.util.Scanner;

public class YoungestFriend {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); 
		
		
		int amarAge = input.nextInt();
		int akbarAge = input.nextInt();
		int anthonyAge = input.nextInt();
		
		
		double amarHeight = input.nextDouble();
		double akbarHeight = input.nextDouble();
		double anthonyHeight = input.nextDouble();
		
		// finding the youngest among them 
		int youngest;
		String youngestPerson;
		
		if (amarAge < akbarAge && amarAge < anthonyAge){
			youngest = amarAge;
			youngestPerson = "Amar";
		} 
		else if (akbarAge < amarAge && akbarAge < anthonyAge) {
			youngest = akbarAge;
			youngestPerson = "Akbar";
		} 
		else {
			youngest = anthonyAge;
			youngestPerson = "Anthony";
		}
		
		// finding the tallest among them 
		double tallest;
		String tallestPerson;
		if (amarHeight > akbarHeight && amarHeight > anthonyHeight){
			tallest = amarHeight;
			tallestPerson = "Amar";
		} 
		else if (amarHeight < akbarHeight && akbarHeight > anthonyHeight) {
			tallest = akbarHeight;
			tallestPerson = "Akbar";
		} 
		else {
			tallest = anthonyHeight;
			tallestPerson = "Anthony";
		}
		
		System.out.println("youngest among them is " + youngestPerson + " and the tallest among them is " + tallestPerson);
	}
}