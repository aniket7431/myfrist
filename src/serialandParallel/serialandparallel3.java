package serialandParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class serialandparallel3 {
  @Test
  public void mymethod() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
		 
			driver.get("https://trade.angelbroking.com/Login");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.close();
	  
  }
}
