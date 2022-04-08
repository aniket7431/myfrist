package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplay {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		Thread.sleep(200);
		  WebElement TextBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		  
		  boolean result = TextBox.isDisplayed();
		  System.out.println("texet box state is" + result);
		  
		  driver.findElement(By.id("hide-textbox"));
		  
		  

	}

}
