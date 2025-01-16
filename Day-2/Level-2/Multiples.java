import java.util.Scanner;

public class Multiples {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		
		for (int i = 100; i >= number; i--){
		
			if (i%number== 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}