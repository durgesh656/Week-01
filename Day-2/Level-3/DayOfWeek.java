import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
		
       
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]); 
        int year = Integer.parseInt(args[2]);

        int yearAdjustments = year - (14 - month) / 12;
        int leapYearAdjustments = yearAdjustments + yearAdjustments / 4 - yearAdjustments / 100 + yearAdjustments / 400; 
        int monthAdjustments = month + 12 * ((14 - month) / 12) - 2;
        int dayOfTheWeek = (day + leapYearAdjustments + (31 * monthAdjustments) / 12) % 7;


        System.out.println(dayOfTheWeek);
    }
}
