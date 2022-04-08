package kiteAppUsingPOMMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitePinPage {
	@FindBy(id ="pin") private WebElement pin1;
	@FindBy(xpath ="//button[@type='submit']") private WebElement continueButton;
	
	public kitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPin( String Pin2)
	{
		pin1.sendKeys(Pin2);
	}
	
	public void clickOnCotinueButton()
	{
		continueButton.click();	
	}
}
