package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselecteddropdwon {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement Dropdwonbox = driver.findElement(By.name("cars"));
		
		
		Select s = new Select(Dropdwonbox);
		 boolean result = s.isMultiple();
		 System.out.println("multipal chek is" + result);
		 
		 s.selectByIndex(0);
		 Thread.sleep(2000);
		 s.selectByVisibleText("Saab");
		 Thread.sleep(2000);
		 s.selectByValue("audi");
		 Thread.sleep(2000);
       //  s.deselectAll();
        // Thread.sleep(2000);
         
         
         
         
         
	}

}
