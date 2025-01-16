public class FeeDiscount{
	public static void main(String[]args){
		
		double courseFee = 125000;
		
		double discountPercentage = 10;
		
		double discountAmount= courseFee * discountPercentage/100;
		
		double newFee= courseFee-discountAmount;
		
		System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+newFee);
	}
}