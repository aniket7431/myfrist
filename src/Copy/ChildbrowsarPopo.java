package Copy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildbrowsarPopo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		String mainPagewindoID = driver.getWindowHandle();//will give windowID in string form
//		System.out.println("Window id is "+mainPagewindoID);
		
		driver.findElement(By.name("NewWindow")).click();// opening child browser popup
		// we got multiple windows
		
		Set<String> allWindowIds = driver.getWindowHandles();
		
		System.out.println("All ids are "+allWindowIds);
		
		

	}
	}

}
