package excelSheetStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zerodaWithoutStudy {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		 WebElement userIdField = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		
		
		userIdField.sendKeys("HD5857");
		password.sendKeys("Ajinkya@123");
		
		 WebElement logInButton = driver.findElement(By.xpath("//button[@type= 'submit']"));
		 
		 logInButton.click();
    Thread.sleep(2000);
     WebElement pin = driver.findElement(By.xpath("//input[@type= 'password']"));
     pin.sendKeys("969696");
     
            WebElement contiounButton = driver.findElement(By.xpath("//button[@type= 'submit']"));
            contiounButton.click();
            Thread.sleep(2000);
          WebElement userId = driver.findElement(By.xpath("//span[@class='user-id']"));
        		  
            
              String actualUserId = userId.getText();
            
              String expectedUserId = "HD5857" ;
              
              
              if ( actualUserId.equals(expectedUserId)   )
              {
            	  
            	  System.out.println(" user id is matching test case is pass");
            	  
              }
              else {
            	  System.out.println(" user id is no maching test case is faild ");
              }
              userId.click();
              
            WebElement logOut = driver.findElement(By.xpath("//a[@target='_self']"));
              
              logOut.click();
              driver.close();
              
	}

}
