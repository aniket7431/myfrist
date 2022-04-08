package selenium_study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class honda {

	public static void main(String[] args) throws InterruptedException {
		

        System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		  
		 driver.findElement(By.xpath("//input[@class= 'gLFyf gsfi']")).sendKeys("honda");
		 
	List<WebElement> list = driver.findElements(By.xpath("//ul//li"));
		System.out.println(list.size());
      for (WebElement w:list)
      {
    	    String actualResult = w.getText();
    	     String expectedResult = "honda amaze";
    	     
    	     
    	 if(actualResult.equals(expectedResult)) 
    	 {
    		 w.click();
    		 break;
    		 
    	 }
      }
      
    		  
	
	}

}
