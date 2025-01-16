import java.util.Scanner;

public class OddEvenArray{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int number=sc.nextInt();
		
		if(number>0){
			
			int[] evenNumbers= new int[number/2+1];
			int[] oddNumbers= new int[number/2+1];
			int evenIndex=0, oddIndex=0;
		
			for(int i=1; i<=number; ++i){
				if (i%2==0){
					evenNumbers[evenIndex]=i;
					evenIndex+=1;
				}
				else{
					oddNumbers[oddIndex]=i;
					oddIndex+=1;
				}
			}
			for(int i=0; i<evenIndex; ++i){
				System.out.print(evenNumbers[i]+" ");
			}
			System.out.println("");
			
			for (int i=0; i<oddIndex; ++i){
				System.out.print(oddNumbers[i]+" ");
			}
			
		}
		else{
			System.out.println("please enter a valid number!");
		}
		
		
	}
}