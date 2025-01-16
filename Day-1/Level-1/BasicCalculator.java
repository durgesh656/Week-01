import java.util.Scanner;

public class BasicCalculator{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		float number1=sc.nextFloat();
		
		float number2=sc.nextFloat();
		
		float addition= number1+number2;
		
		float subtraction= number1-number2;
		
		float multiplication= number1*number2;
		
		float division=0;
		
		if (number2!=0){
			division=number1/number2;
		}
		else{
			System.out.println("Can't divide by 0. sorry!! ");
		}
		
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+addition+","+subtraction+","+multiplication+",and "+division);
		
	}
}