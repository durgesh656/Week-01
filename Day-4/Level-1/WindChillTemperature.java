import java.util.Scanner;

public class WindChillTemperature{

	public static double calculateWindChill(double temperature, double windSpeed){
		
		// formula [windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16]
		
		double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
		
		return windChill;
	}


	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		// taking  input
		
		double temparature = sc.nextDouble();
		double windSpeed = sc.nextDouble();
		
		double ans = calculateWindChill(temparature, windSpeed);
		
		System.out.println("Wind Chill is " + ans);
	}
	
	
}