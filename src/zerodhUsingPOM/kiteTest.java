package zerodhUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteTest {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://kite.zerodha.com/?next=%2Fdashboard");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			kiteLogInPage login = new kiteLogInPage(driver);
			
		login.sendUseId();
		login.sendPassword();
		login.clickonLoginButton();
		
     Thread.sleep(1000);
     
     kitePinPage pin = new kitePinPage(driver);
    		 pin.sendPin();
    		 pin.clickOnCotinueButton();
    		 
    		 Thread.sleep(1000);
    		 
    		 kiteHomePage home = new kiteHomePage(driver);
    		 home.validateUserId();
    		 home.clickOnLogout();
    		 	

	}
	

}
