package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("WebDriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get ("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
		WebElement WebEle = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
		 String Actualtext = WebEle.getText();
		 System.out.println("text is " + Actualtext);
		 String Expectedtext = "Welcom To Practice Page";
		 
		 if ( Actualtext.equals(Expectedtext))
		 {
			 
			 System.out.println(" text is match , tc is passs");
		 }
		 else {
			 
			 System.out.println("text is not match, tc is failed ");
		 }
		
		
		
		
		
		

	}

}
