package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 {
	 @Test
	  public void p() 
	  {
		  
		  Reporter.log("TC p is running " , true);
	  }
	  @Test
	  public void q()
	  {
		  Assert.fail();
		  Reporter.log("TC q is running ",true   );
		   }
	    @Test(dependsOnMethods = {"q"})
	  public void r()
	  {
		  
		  Reporter.log("TC r is running ", true);
	  }
}
