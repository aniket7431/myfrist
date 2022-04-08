package kiteAppUsingPOMMandDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import zerodhUsingPOM.kiteHomePage;
import zerodhUsingPOM.kiteLogInPage;
import zerodhUsingPOM.kitePinPage;

public class kiteTestWithDDf {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
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
		
		kiteLogInPage login = new kiteLogInPage(driver);
		
	login.sendUseId(MySheet.getRow(0).getCell(0).getStringCellValue());
	login.sendPassword();
	login.clickonLoginButton();
	
 Thread.sleep(1000);
 
	kiteAppUsingPOMMandDDF.kitePinPage piin =new kiteAppUsingPOMMandDDF.kitePinPage(driver);
        piin.enterPin(MySheet.getRow(0).getCell(2).getStringCellValue());
		 piin.clickOnCotinueButton();
		 
		 Thread.sleep(1000);
		 
		 kiteHomePage home = new kiteHomePage(driver);
		 home.validateUserId(userID);
		 home.clickOnLogout();
		 	

	}

}
