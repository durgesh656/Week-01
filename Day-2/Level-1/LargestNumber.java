import java.util.Scanner;
public class LargestNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int number1 = input.nextInt();
		
        int number2 = input.nextInt();
		
        int number3 = input.nextInt();
		
        //check the given number is greater than another given two number 
        boolean firstLargest= number1>= number2 && number1>=number3;
        boolean secondLargest= number2>= number1 && number2>=number3;
        boolean thirdLargest= number3>= number1 && number3>=number2;
		
        
        if(firstLargest){
         System.out.println("\nIs the first number the largest? " + firstLargest);
        }
        else if(secondLargest){
         System.out.println("\nIs the second number the largest? " + secondLargest);
       }
        else{
         System.out.println("\nIs the third number the largest? " + thirdLargest);
      }
    }
}