package waitOrSynchronized;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class impliciteWaitUse {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		//dont use below commented syntax for wait this is old one, before selenium 4
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//use below syntax for selenium 4 onwards
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//implicitlyWait--> Dynamic wait--> applicable for whole webpage
		//1000ms-->10ms page is loaded--> 900ms --> will be released

	}

}
