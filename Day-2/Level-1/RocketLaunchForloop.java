import java.util.Scanner;

class RocketLaunchForloop{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		int counter= sc.nextInt();
		
		System.out.println("countdown started!");
		
		for(int i=counter; i>0; i--){
			System.out.println(i);
		}
	}
}