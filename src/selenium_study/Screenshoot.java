package selenium_study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshoot {

	private static final String Output = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		
	

		System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
        System.out.println(" source patha is" + source);
        RandomString name = new RandomString(2);
        File desination = new File ("C:\\Users\\Aniket Jagdale\\Desktop\\testing automation\\screenshote"+name+".png");
        
        FileHandler.copy(source, desination);
        
	
	
	
	
	
	
	
	
	
	
	
	}

}
