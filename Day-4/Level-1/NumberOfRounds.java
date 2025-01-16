import java.util.Scanner;

public class NumberOfRounds{

	//created a Method to find number of rounds
	public static int rounds(int side1, int side2, int side3){
		
		int perimeterOfPark = side1 + side2 + side3;
		
		return 5000 / perimeterOfPark;
		
	}


	public static void main(String[]args){
	
		Scanner sc = new Scanner(System.in);
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		
		System.out.println(rounds(side1, side2, side3));
	}
	
	
}