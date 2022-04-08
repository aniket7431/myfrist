package failedxml;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failedxmlstudy {
  @Test
  public void TC1() {
	  Reporter.log("Runing TC1 " ,true);
  }
  
  @Test(timeOut = 1000)
  public void TC2() throws InterruptedException {
	  Thread.sleep(5000);
	  Reporter.log("Runing TC2 " ,true);
	  
  }
  
  @Test 
  public void TC3() {
	  Reporter.log("Runing TC3 " ,true);
  }
  @Test
  public void TC4()
  {
	 // Assert.fail();
	  Reporter.log("Runing TC4 " ,true);
  }
  @Test
  public void TC5()
  {
	  Reporter.log("Runing TC5 " ,true);  
  }
}
