package testNgStudyKeyStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethod {
  @Test (dependsOnMethods = {"c"})
  public void a () 
  { Reporter.log("Runing A method ", true);
  }
  
  @Test ( timeOut = 2000)
  public void c() throws InterruptedException {
	  Thread.sleep(2000);
	  Reporter.log("Runing c method ", true);
  }
  @Test ()
  public void b()
  {
	  Reporter.log("Runing A method ", true);
  }
}
