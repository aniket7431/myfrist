package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.BaseUsingPropertyFile;
import UtilityPackage.utilityUsingPropertyFile;
import kitePOMAndTestNg.kiteHomePage;
import kitePOMAndTestNg.kiteLoginPage;
import kitePOMAndTestNg.kitePinPage;

public class kiteAppUserNameValidationUsingPropertyFile extends BaseUsingPropertyFile {
 
	kiteLoginPage login ;
	kitePinPage pin ;
	kiteHomePage home;
	int TCID =10;
	
	@BeforeClass
	public void launchingBrowser() throws IOException
	{
		launchBrowser();
		login = new kiteLoginPage(driver);
		pin = new kitePinPage(driver);
		home = new kiteHomePage(driver);
		
		
	}
	
	@BeforeMethod
	public void loginTokiteApp() throws IOException
	{
		login.enterUserID(utilityUsingPropertyFile.getDataFromPropertyFile("UN"));
		login.enterPAssword(utilityUsingPropertyFile.getDataFromPropertyFile("PWD"));
		
		login.clickOnLoginButtton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.enterPin(utilityUsingPropertyFile.getDataFromPropertyFile("PIN"));;
		pin.clickonContinueButton();
	}
	
	@Test
	public void validateUserID() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 String expectedUserID = utilityUsingPropertyFile.getDataFromPropertyFile("UN");
		   String actualUserID = home.getActualUserID();
		   
		   Assert.fail();    
		   //for taking the ss after fail the test
		   
		   Assert.assertEquals(expectedUserID, actualUserID ,"actual and expected user id are matching");
		   
		
		   utilityUsingPropertyFile.takeScreenshote(driver, TCID);
	}
	
	
	@AfterMethod
	public void logoutFromkiteApp(ITestResult result) throws InterruptedException, IOException
	{
	if(  result.getStatus()==result.FAILURE)
	{
		utilityUsingPropertyFile.takeScreenshote(driver, TCID);
	}
		else {
			Reporter.log("TC is passed", true);  // change the TCID 
		}
		
		
		//home.logout();
	}
	
	
	@AfterClass
	public void closingBrowser()
	{
		closeBrowser();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
