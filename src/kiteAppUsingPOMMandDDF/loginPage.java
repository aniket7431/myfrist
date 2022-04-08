package kiteAppUsingPOMMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	//variable declaration ---> web element
	
	@FindBy(id ="userid") private WebElement UserId;
	@FindBy(id= "password") private WebElement Password;
	@FindBy(xpath = "//button [@type= 'submit']") private WebElement LoginButton;
	
	//2use constructor --->.publi
	public loginPage ( WebDriver driver)
	{
		PageFactory.initElements(driver, Password);
	}
	//3	method
	
	public void  enterUserId (String uid)
	{
		UserId.sendKeys(uid);
	}
	public void enterPassword (String pwd)
	{
      Password.sendKeys(pwd);
	}
	public void clickeonloginButton() {
		LoginButton.click();
	}
	
	
	
	
}
