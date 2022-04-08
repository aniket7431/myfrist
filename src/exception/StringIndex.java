package exception;

public class StringIndex {

	public static void main(String[] args) {

		
		
		String name = "velocity";
		
		try {
			System.out.println(name.charAt(9));
			
		} catch (   StringIndexOutOfBoundsException e) {
			
			System.out.println("enter Chart at argument between 0-7");
			
		}
	}

}
