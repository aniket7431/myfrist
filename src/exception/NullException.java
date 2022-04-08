package exception;

public class NullException {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		
		
		
		String name = null;
				try {
					name.charAt(1);
				} catch (NullPointerException e) {
					System.out.println("cant perform action on null value");
					
					
				}
	
	System.out.println("hi");
	}

}
