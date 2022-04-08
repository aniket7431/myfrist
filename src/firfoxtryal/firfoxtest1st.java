package firfoxtryal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firfoxtest1st {
  @Test
  public void mymethod() {
	 
	  System.setProperty("webdriver.gecko.driver","C:\\selinium setup\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().window().maximize();
	  
	  
	  
	  
	  
	  
  }
}
