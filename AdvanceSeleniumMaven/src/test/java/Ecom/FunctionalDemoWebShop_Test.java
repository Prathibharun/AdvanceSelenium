package Ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FunctionalDemoWebShop_Test {
	
	@Test
	public void demoWebShop() throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Register")).click();
	Thread.sleep(2000);
	driver.quit();
		
	}

}
