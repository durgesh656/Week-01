import java.util.Scanner;

public class StudentFee{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		
		double studentFee = sc.nextDouble() ;
		
		double discountPercentage = sc.nextDouble();
		
		double discountAmount= studentFee * discountPercentage/100;
		
		double discountedFee= studentFee-discountAmount;
		
		System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+discountedFee);
	}
}