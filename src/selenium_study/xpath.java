package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://trade.angelbroking.com/Login");
		Thread.sleep (2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[  @ id ='txtUserID']")).sendKeys("aniket");
	//hread.sleep(2000);
	//river.findElement(By.name("password")).sendKeys("1996");
		Thread.sleep(2000);
    driver.findElement(By.id("txtTradingPassword")).sendKeys("1996");
	//river.findElement(By.className(null);
      Thread.sleep(2000);
		driver.findElement(By.id("loginBtn")).click();
	//webElement UserName = driver.findElement(By.id(null);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[text()='Forgot password? '])[1]"	));

	}

}






