import java.util.Scanner;

public class CheckCollinearPoints {

    public boolean arePointsCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        // Points are collinear if slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    public boolean arePointsCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the area of the triangle formed by the points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // Points are collinear if the area is 0
        return area == 0;
    }

    public static void main(String[] args) {
        CheckCollinearPoints collinearChecker = new CheckCollinearPoints();

        // Example points: A(2, 4), B(4, 6), C(6, 8)
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        // Check for collinearity using slope formula
        boolean isCollinearBySlope = collinearChecker.arePointsCollinearBySlope(x1, y1, x2, y2, x3, y3);

        // Check for collinearity using area formula
        boolean isCollinearByArea = collinearChecker.arePointsCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Output results
        System.out.println("Checking collinearity for points A(" + x1 + ", " + y1 + "), B(" + x2 + ", " + y2 + "), C(" + x3 + ", " + y3 + "):");
        System.out.println("Collinear by Slope Method: " + isCollinearBySlope);
        System.out.println("Collinear by Area Method: " + isCollinearByArea);
    }
}
