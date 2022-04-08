package testNgStudyKeyStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountStudy {
  @Test(invocationCount = 3)
  public void a() { Reporter.log("Runing A method ", true);
  }
  @aftermethod()
  public void afterMethod() {
	 Reporter.log("Afer method running " ,true);
  }
  
}
