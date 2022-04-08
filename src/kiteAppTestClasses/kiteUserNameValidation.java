package kiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.Base;
import UtilityPackage.Utility;
import kitePOMAndTestNg.kiteHomePage;
import kitePOMAndTestNg.kiteLoginPage;
import kitePOMAndTestNg.kitePinPage;

public class kiteUserNameValidation extends Base {
 
	kiteLoginPage login ;
	kitePinPage pin ;
	kiteHomePage home;
	
	
	@BeforeClass
  public void browserLaunch() {
	  
	  launchBrowser();
     login  = new kiteLoginPage(driver);
     pin = new kitePinPage(driver);
     home = new kiteHomePage(driver);
     
  }
  
  @BeforeMethod
  public void loginToKiteApp() throws EncryptedDocumentException, IOException
  {
	login.enterUserID(Utility.readDateFromExcel1(0, 0));
	login.enterPAssword(Utility.readDateFromExcel1(0, 1));
	login.clickOnLoginButtton();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	pin.enterPin(Utility.readDateFromExcel1(0, 2));
	pin.clickonContinueButton();
  }
  
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException
  { int TCID =100;
	
  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  
	    String actualUserId = home.getActualUserID();
	String expectedUserId = Utility.readDateFromExcel1(0, 0);
	
	
	Assert.assertEquals(actualUserId ,expectedUserId ,"actual and exected is not matching"); //hard asset test case fail zali ki next mothde is not worling
	Utility.takeScreenshote(driver, TCID);
	Reporter.log("validate user name ", true );
	
  }
  
 @AfterMethod
  public void logoutFromKiteApp() throws InterruptedException 
  {
	  
	  home.logout();
	  Reporter.log("logging out " ,true );
  }
  
  @AfterClass
  public void closingBrowser()
  {
	  
	  closeBrowser();
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
