package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CT1 {
 
	@Parameters("browserName")
	
	
	@Test
  public void crossBrowser(String browserName) throws InterruptedException
			 {
		WebDriver driver = null;
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
			
			 driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			  System.setProperty("webdriver.gecko.driver","C:\\selinium setup\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
  }
	driver.get("https://vctcpune.com/selenium/practice.html");	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
			 
}
}