package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.nullability.NeverNull.ByDefault;




public class selinium1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aniket");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("pass");
		
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).clear();
	
	Thread.sleep(10000);
     Thread.sleep(1000);
     
     
	
	
	}		

}

