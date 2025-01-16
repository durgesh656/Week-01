import java.util.Scanner;

public class PrintTable{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if (number>=6 && number<=9){
			for(int i=1; i<=10; i++){
				System.out.println(number + " * " + i + " = " + i*number);
			}
		}
		else{
			System.out.println("please enter number between 6 to 9");
			}
		
	}
}