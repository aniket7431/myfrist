package testNgStudyKeyStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledStudy {
  @Test
  public void a() {
	  Reporter.log("Runing A method ", true);
 }
  @Test (enabled = true)
  public void c() {
	  Reporter.log("Runing c method ", true);
  }
  @Test
  public void b()
  {
	  Reporter.log("Runing b method ", true);
  }
}

