import java.util.Scanner;
public class CountdownRocketLaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int counter = scanner.nextInt();
		System.out.println("Starting countdown");
		
        while (counter != 0) {
            System.out.println(counter);
            counter--; // Decrement the counter
            } 
    }
}
