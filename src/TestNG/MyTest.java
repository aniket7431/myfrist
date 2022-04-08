package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void
  MyMethod1() {
	  
	  
	 System.out.println("well come to test NG1");
  }
  @Test
  public void MyMethod2() {
	  
	  
		 System.out.println("well come to test NG12");
		 Reporter.log("well come to test NG12" , true);
		 
	  }
}
