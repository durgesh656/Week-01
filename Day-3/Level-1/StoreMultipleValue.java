import java.util.Scanner;

public class StoreMultipleValue{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		double[] array=new double[10];
		
		double total=0;
		
		int i=0;
		
		while(i<10){
		
			double element=sc.nextDouble();
			
			if(element<=0){
				break;
			}
			else{
				array[i]=element;
				
			}
			++i;
			
		}
		for (i=0; i<array.length; ++i){
			if (array[i]==0){
				break;
			}
			total=total+array[i];
			System.out.print(array[i]+",");
		}
		System.out.println("\nThe total of the elements of the array is: "+total);
		
		
		
	}
}