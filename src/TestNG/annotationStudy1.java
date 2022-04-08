package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class annotationStudy1 {
  @Test
  public void a() {
	  Reporter.log("Runing A method ", true);
  }
  @Test ()
 public void b() {
	  Reporter.log("Runing b method ", true);
  }
  @Test()
  public void c(){
	  Reporter.log("Runing c method ", true);
  }
}
