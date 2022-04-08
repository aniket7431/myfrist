package assertsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEqualStudy {
  @Test
  public void AssertTest() {
	  
	  String name ="VCTC";
	  String name1 ="VCTC5";
	  
	  Assert.assertNotEquals(name, name1, "string are matching");
	  
	  
	  
	  
  }
}
