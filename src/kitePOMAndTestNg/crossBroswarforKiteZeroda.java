package kitePOMAndTestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBroswarforKiteZeroda {

	WebDriver driver; 
	Sheet Mysheet;
	kiteLoginPage login ;
	kitePinPage pin ;
	kiteHomePage home;
	
	@BeforeClass
 @Parameters("browserName")
 public void lunchBrowser(String browser) throws EncryptedDocumentException, IOException
 {
		if (browser.equals("chrome")) {
		Reporter.log("launching browsar ",true);
	 System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
	 ChromeOptions opt = new ChromeOptions();
	 opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		}
		
		else if (browser.equals("firfox")) {
			 System.setProperty("webdriver.gecko.driver","C:\\selinium setup\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			FirefoxOptions opt = new FirefoxOptions();
			 opt.addArguments("--disable-notifications");
			 driver = new FirefoxDriver();
		}
		
		
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		Reporter.log(" browsar lunched susses ",true);
		FileInputStream Myfile = new FileInputStream("C:\\selinium setup\\excelTest.xlsx");
		Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		
		login = new kiteLoginPage(driver);
		pin = new kitePinPage(driver);
		home = new kiteHomePage(driver);
		
 }
	
	@BeforeMethod
	public void loginTokiteApp()
	{//write reporter.log
		String USERID = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String PIN = Mysheet.getRow(0).getCell(2).getStringCellValue();
		
		Reporter.log("Entering usarid and passward ",true);
		
		login.enterUserID(USERID);
		login.enterPAssword(PWD);
		login.clickOnLoginButtton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("entring pin ",true);
		pin.enterPin(PIN);
		pin.clickonContinueButton();
		
	}
	@Test
	public void validateUserID()
	{
		 String expectedUserID = Mysheet.getRow(0).getCell(0).getStringCellValue();
		 
		 String actualUserID = home.getActualUserID();
		 
		 Assert.assertEquals(actualUserID, expectedUserID ,"actual and expected user id not matching");
	
		 Reporter.log("usar id validat susessfly ",true);}
	
	@AfterMethod
	public void logoutFromKiteApp() throws InterruptedException
	{Reporter.log("loggin out... ",true);
		home.logout();
	}
	@AfterClass
	public void closeBrowser()
	{Reporter.log("closeing browsar ",true);
		driver.close();
	}
}

