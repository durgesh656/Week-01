
public class StringIndexOutOfBoundException {
	
	public static void generateStringIndexOutOfBoundException(String text){
		// for generating the exception
		System.out.println(text.charAt(text.length())); 
	}
	
	public static void main(String[]args){
		
		String text = "name";
		
	
		try{
			generateStringIndexOutOfBoundException(text);
		}
		// catch exception
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Exception caught : " + e.getMessage());
		}
	}
}