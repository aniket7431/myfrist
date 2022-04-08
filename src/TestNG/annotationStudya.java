package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotationStudya {
  @Test
  public void validateUserId()   {
	  
	  Reporter.log("Runing test " ,true);
  }
  
  @Test
  public void sampleTest() {
	  Reporter.log("Runing Sample Test ", true);
  }
 
  @BeforeMethod ()
  public void loginToKite() {
	  Reporter.log("loggggin . . ", true);
  }
  
  @BeforeClass()
 public void lonchBroser(){
	  Reporter.log("lonching Broser ", true);
	  
  }
  @BeforeClass()
  public void closeBroser()
  {
	  Reporter.log("closesing broser " , true);
  }
  @AfterMethod()
  public void logout() {
	  Reporter.log("loggg out ", true);
  }
}
