package BaseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base {

	
	protected WebDriver driver;
	
	
	public void launchBrowser() {
		
		 Reporter.log("launching browsar ",true);
		 System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions opt = new ChromeOptions();
		 opt.addArguments("--disable-notifications");
			driver = new ChromeDriver(opt);
		
			driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			driver.manage().window().maximize();
			Reporter.log(" browsar lunched susses ",true);
	}
	
	
	
	public void closeBrowser()
	{
		driver.close();
	 Reporter.log("browser close sussefuly ", true );
	}
}
