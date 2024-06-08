package Ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EndToEndDemoWebShop {
	
	@Test
	public void endToEndDemoWebShop() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		WebElement female = driver.findElement(By.id("gender-female"));
		female.click();
		WebElement fname = driver.findElement(By.id("FirstName"));
		fname.sendKeys("Lakshmi");
		WebElement lname = driver.findElement(By.id("LastName"));
		lname.sendKeys("KV");
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("lakshmi789@gmail.com");
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("Lakshmi@123");
		WebElement confirmpassword = driver.findElement(By.id("ConfirmPassword"));
		confirmpassword.sendKeys("Lakshmi@123");
		Thread.sleep(2000);
		WebElement register = driver.findElement(By.id("register-button"));
		register.click();
	}
}
