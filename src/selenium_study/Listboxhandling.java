package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxhandling {

	public static void main(String[] args) throws InterruptedException {

		

		System.setProperty("webdriver.chrome.driver", "C:\\selinium setup\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement Dropdwonbox = driver.findElement(By.name("dropdown-class-example"));
		
		
		Select s = new Select(Dropdwonbox);
		
		s.deselectByVisibleText("Option1");
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("option3");
		
		System.out.println("is multipal state" + s.isMultiple());
		
		
		
	}

}
