package assertsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsstudy {
  @Test
  public void AssertTest1() {
	  
	  String  name = "VCTC";
	  String name1 = "VCTC";
	  
	  Assert.assertEquals(name, name1 ,"string not match" );
	  
  }
}
