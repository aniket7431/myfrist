package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", null)
		System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new   ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		
		WebElement  singinbutton = driver.findElement(By.xpath("//a[text() = 'Login']"));
		
		singinbutton.click();
		Thread.sleep(1000);
		
		WebElement getloginbutton = driver.findElement(By.className("a-ayg"));
		boolean result = getloginbutton.isEnabled();
		System.out.println("get login button is" + result);
		//if (result)
		//{
		//	System.out.println("get login button is enable");
	//		getloginbutton.click();
		//}
		if (result){
			
			
			driver.findElement(By.id("mobile")).sendKeys("888888");
			Thread.sleep(1000);
			getloginbutton.click();
			System.out.println("clicked on log in button");
		}
		else {
			
			System.out.println("faild");
		}
		
		
		
		
		
		
	}

}
