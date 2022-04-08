package assertsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNullStudy {
  @Test
  public void f() {
	
	  
	  String a = "hi" ;
	  Assert.assertNotNull(a, "a is null");
			  
	  
	  
  }
}
