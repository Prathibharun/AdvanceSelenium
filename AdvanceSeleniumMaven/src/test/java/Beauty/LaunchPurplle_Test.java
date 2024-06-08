package Beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchPurplle_Test {
	
	@Test
	
	public void purplle() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.purplle.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
