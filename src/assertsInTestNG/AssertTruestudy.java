package assertsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTruestudy {
  @Test
  public void testing() {
	  
	  
	 boolean result = true;
	  
	  Assert.assertTrue(result, " result is false");
  }
}
