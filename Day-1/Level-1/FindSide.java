import java.util.Scanner;

public class FindSide{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		double perimeterOfSquare=sc.nextDouble();
		
		double sideOfSquare=perimeterOfSquare/4;
		
		System.out.println("The lengthof the side is "+sideOfSquare+" whose perimeter is "+perimeterOfSquare);
	}
}