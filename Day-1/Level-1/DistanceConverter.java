import java.util.Scanner;

public class DistanceConverter{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		double distanceInFeet= sc.nextDouble();
		
		//1 yard = 3 feet
		double distanceInYard=distanceInFeet/3;
		
		// 1 mile = 1760 yard
		double distanceInMile=distanceInYard/1760;
		
		System.out.println("The distance in Yard is "+distanceInYard+" and in Miles is "+distanceInMile);
		
	}
}