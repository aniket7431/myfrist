package softAssertstudy;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class softAssertstudy {
 
	SoftAssert s = new SoftAssert();
	@Test
  public void Mymethod() {
	  String a= "pune";
	  String b = "puneh";
	  
	  s.assertNotNull(b, "b is null");
	s.assertEquals(a,b, "a and b are not equal");
	//  s.assertAll(); for fail larny sati
  }
}
