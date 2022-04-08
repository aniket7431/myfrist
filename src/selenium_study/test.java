package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("  ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
        driver.switchTo().frame(0)		;
        WebElement CloseMeButton = driver.findElement(By.xpath(null));
        
       CloseMeButton.click();

	}

}
