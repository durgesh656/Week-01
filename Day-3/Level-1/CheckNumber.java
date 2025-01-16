import java.util.*;

class CheckNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int size=5;
		int[] number=new int[size];
		
		for (int i=0; i<size; ++i){
			number[i]=sc.nextInt();
		}
		
		for (int i=0; i<number.length; ++i){
			if(number[i]>0){
				if(number[i]%2==0){
					System.out.println("number is positive and even is "+number[i]);
				}
				else{
					System.out.println("number is positive and odd is "+number[i]);
				}
			}
			else if(number[i]<0){
				System.out.println("number is negative "+number[i]);
			}
			else{
				System.out.println("number is zero "+number[i]);
			}
		}
		//compare first and last number
		if (number[0]>number[number.length-1]){
			System.out.println("first number is greater than last number! ");
		}
		else if(number[0]<number[number.length-1]){
			System.out.println("first number is smaller than last number! ");
		}
		else{
			System.out.println("first number is equal to the last number! ");
		}
	}
}