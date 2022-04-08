package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zerodhWithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
FileInputStream Myfile = new FileInputStream ("C:\\selinium setup\\excelTest.xlsx");	
		
		Sheet MySheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		
         String myUsarId   = MySheet.getRow(0).getCell(0).getStringCellValue();
         String myPassward = MySheet.getRow(0).getCell(1).getStringCellValue();
         String myPin      = MySheet.getRow(0).getCell(2).getStringCellValue();
        
 System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		   WebElement userIdField  = driver.findElement(By.id("userid"));
		   WebElement password     = driver.findElement(By.id("password"));
		   WebElement logInButton  = driver.findElement(By.xpath("//button[@type= 'submit']"));
		   
		   userIdField.sendKeys(myUsarId);
		   password.sendKeys(myPassward);
		   logInButton.click();
		   
		   Thread.sleep(2000);
		    WebElement pin = driver.findElement(By.id("pin")); //pin expath
		     WebElement contionueButton = driver.findElement(By.xpath("//button[@type='submit']")); //continu button xpath
		     
		     
		     pin.sendKeys(myPin);
		     contionueButton.click();
		     Thread.sleep(2000);
		     
		       WebElement userId = driver.findElement(By.xpath("//span[@class='user-id']")); //usr id after log in
		       
		        String actualUserId = userId.getText();
		       Object expectedUserId = myUsarId ;
		       
		       
		       if ( actualUserId.equals(expectedUserId) )
		       {
		    	   
		    	   System.out.println(" usear id matchin test casese passs" );}
		    	   else {
		    		   System.out.println("usar id not match faild");
		    	   }
		    	   userId.click();
		    	   
		    	   WebElement logOutButton = driver.findElement(By.xpath("//a[@targt='_self']"));  // log out
		    	   
		    	   logOutButton.click();
		    	   driver.close();
		       
		       }
	
      
	

}
