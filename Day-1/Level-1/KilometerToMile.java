import java.util.Scanner;

public class KilometerToMile{
	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		
		double distanceInKilometers=sc.nextDouble();
		
		// 1 mile = 1.6 km
		
		double distanceInMiles=distanceInKilometers/1.6;
		
		System.out.println("The total miles is "+distanceInMiles+" mile for the given "+distanceInKilometers+" km");
		
		
		
		
		
	}
}