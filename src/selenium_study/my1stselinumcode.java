package selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class my1stselinumcode {,

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver =  new ChromeDriver();
		driver.get("https://vctcpune.com/");
		//driver.close();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.get("https://kite.zerodha.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.close();
		driver.navigate().back();
		driver.

	
       
		
		
		
		
		
	}

}
