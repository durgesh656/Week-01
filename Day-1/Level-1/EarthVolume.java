import java.util.*;
public class EarthVolume{
	public static void main(String[]args){

		double radiusInKilometer=6378;
		
		//1km=0.621371 miles
		
		double radiusInMile=radiusInKilometer*0.621371;
		
		//volume of sphere is (4/3)*pi*(radius*radius*radius)
		//pi=3.14
		
		double volumeInKilometers=4*3.14*(radiusInKilometer*radiusInKilometer*radiusInKilometer)/3;
		
		double volumeInMiles=4*3.14*(radiusInMile*radiusInMile*radiusInMile)/3;
		
		System.out.println(" The volume of earth in cubic kilometers is "+volumeInKilometers+" and cubic miles is "+volumeInMiles);
	}
}