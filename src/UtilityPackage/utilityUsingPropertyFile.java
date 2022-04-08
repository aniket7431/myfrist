package UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class utilityUsingPropertyFile {
	

	public static void takeScreenshote (WebDriver driver ,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File ( "C:\\Users\\Aniket Jagdale\\Desktop\\testing automation\\screenshote"+TCID+"screenshot.png")	;
		FileHandler.copy(src, dest);
	
	Reporter.log("screenshote take for Tc " +TCID ,true);
		
			}
	
	public static String getDataFromPropertyFile (String key) throws IOException
	{  Properties p = new  Properties();
	FileInputStream File = new FileInputStream("C:\\Users\\Aniket Jagdale\\eclipse-workspace\\Selenium\\Myfile.properties");
	           p.load(File);
	      String valve = p.getProperty(key);
		return valve;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
