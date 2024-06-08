package Ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IntegrationDemoWebShop_Test {
	
	@Test
	public void demoWebShop() throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("prathi.gsreddy@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Reva@2017");
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	Thread.sleep(2000);
	driver.quit();
	
	
	
		
	}

}
