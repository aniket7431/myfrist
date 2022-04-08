package testNgStudyKeyStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy {
  @Test (priority = 1)
  public void a() { Reporter.log("Runing A method ", true);
  }
  @Test (priority = -3)
  public void c() {
	  Reporter.log("Runing c method ", true);
  }
  @Test(priority = 1)
  public void b() {
	  Reporter.log("Runing c method ", true);
  }
}
