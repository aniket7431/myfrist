package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Thread.sleep(2000);

         driver.switchTo().frame("iframeResult");
		
		Thread.sleep(1000);
	WebElement ClickmeButton=	driver.findElement(By.xpath("//button[@type='button']"));
	
	ClickmeButton.click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath(null))
	

		
		
		
	}

}
