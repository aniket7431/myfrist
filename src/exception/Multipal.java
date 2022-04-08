package exception;

public class Multipal {

	
	public static void name(String [] args) {
		
		
		int a= 1;
		int b=0;
		
		try {
			int div = a/b;
			System.out.println(div);
			
		}
		catch (NullPointerException e) {
			
			System.out.println("cant perform action on null valve");
			
		}
		catch (StringIndexOutOfBoundsException e) {

System.out.println("check string index");
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("generic exception  caught");
		}
		
		//catch (ArithmeticException e) {
			
			//System.out.println("divide by zero is not possible");
		//}
		
		finally {
			System.out.println("finaly this is exducated");
		}
		
		
	}
	
	
	
}
