package UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {
   
	static Sheet Mysheet;
	
	public static String readDateFromExcel1(int rowIndex, int columanindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream Myfile = new FileInputStream("C:\\selinium setup\\excelTest.xlsx");
		 Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		         String value =  Mysheet.getRow(rowIndex).getCell(columanindex).getStringCellValue();
				return value;
		
	}
	
	public static void takeScreenshote (WebDriver driver ,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File ( "C:\\Users\\Aniket Jagdale\\Desktop\\testing automation\\screenshote"+TCID+"screenshot.png")	;
		FileHandler.copy(src, dest);
	
	Reporter.log("screenshote take for Tc " +TCID ,true);
	
	
	}
	
	
	
	
}
