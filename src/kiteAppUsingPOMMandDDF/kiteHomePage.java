package kiteAppUsingPOMMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage {

	//1
		@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
		@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;
		
		//2
		
		public kiteHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		//3
		public void validateUserId( String  userid )
		{
			String actualUserID = userID.getText();
			String expectedUserId = userid;
			if(actualUserID.equals(expectedUserId))
				{
	System.out.println("user Id matching Tc is passed");
			}
			else {
				System.out.println("user id not matching tc faild");
			}
			}
		public void clickOnLogout() throws InterruptedException 
		{
			userID.click();
			Thread.sleep(1000);
			logoutButton.click();
			
		}
		
	
	
	
}
