import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double baseInInches = scanner.nextDouble();

        double heightInInches = scanner.nextDouble();
		
		
		//area of triangle= 0.5*base*height
        double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        // Convert the area to square centimeters
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;
		
		System.out.println("The area of triangle in square inches is"+areaInSquareInches+" and in square centimeter is "+areaInSquareCentimeters);
	}
}