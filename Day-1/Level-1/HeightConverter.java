import java.util.*;

public class HeightConverter{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	
	int heightInCentimeter=sc.nextInt();
	
	//1 inch = 2.54 cm
	double heightInInch=heightInCentimeter/2.54;
	//1 foot = 12 inches
	double heightInFoot=heightInInch/12;
	
	System.out.println("Your Height in cm is "+heightInCentimeter+" while in feet is "+heightInFoot+" and inches is "+heightInInch);
}}