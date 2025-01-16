public class CalculateProfit{
	public static void main(String[]args){
		
		double costPrice = 129;
		
		double sellingPrice = 191;
		
		double profit = sellingPrice - costPrice;
		
		double profitPercent = (profit/costPrice)*100;
		
		System.out.println("The cost price is INR "+costPrice+" and selling price is INR "+sellingPrice+"\nThe Profit is INR "+profit+" and the Profit percentage is "+profitPercent+"%");
	}
}