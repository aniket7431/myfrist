package excelSheetStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class angelWithoutDDF {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://trade.angelbroking.com/Login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		 WebElement userIdField = driver.findElement(By.id("txtUserID"));
		WebElement password = driver.findElement(By.xpath("//input[  @type='password']"));
		userIdField.sendKeys("J123053");
		password.sendKeys("bajaj@6309");
		
		 WebElement logInButton = driver.findElement(By.id("loginBtn"));
		 
		 logInButton.click();
		

	}

}
