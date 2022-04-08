package selenium_study;

import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselect {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty(", null)
System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new   ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
        driver.manage().window().maximize();
      
        Thread.sleep(10000);
        WebElement optionchekbox = driver.findElement(By.id("checkBoxOption1"));
        boolean result = optionchekbox.isSelected();
        
        if (result)
        {
        	System.out.println("chekbox is already selectd");
        }
        
        else {
        System.out.println("chek box is not selected , slecting chek box");
		optionchekbox.click();
		Thread.sleep(2000);
		boolean result2 = optionchekbox.isSelected();
		System.out.println("updated chek box selected" + result2);
        Thread.sleep(2000);
        
       
        
      
        }
		
	}

}
