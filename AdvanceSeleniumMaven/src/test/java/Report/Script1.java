package Report;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Script1 {
	
	@Test
	public void launch() {
		WebDriver driver;
		ScreenShotMethod ss= new ScreenShotMethod();
		LocalDateTime dateTime= LocalDateTime.now();
		String date=dateTime.toString().replace(":","-");
		ExtentReports report= new ExtentReports();
		ExtentSparkReporter reporter= new ExtentSparkReporter("./Reports/"+date+".html");
		report.attachReporter(reporter);
		ExtentTest test= report.createTest("login");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		test.log(Status.INFO, "Window is maximised");
		driver.get("https://demowebshop.tricentis.com/");
		test.log(Status.INFO, "DemoWebShop application launched");
		driver.findElement(By.linkText("Log in")).click();
		test.log(Status.INFO, "User is clicked on login link");
		driver.findElement(By.id("Email")).sendKeys("prathi.gsreddy@gmail.com");
		test.log(Status.INFO, "User entered the email");
		driver.findElement(By.id("Password")).sendKeys("Reva@2017");
		test.log(Status.INFO, "User entered password");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		test.log(Status.INFO, "login is completed");
		try {
			if(driver.findElement(By.linkText("log out")).isDisplayed()) {
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(ss.takeScreenShot(driver)).build());	
			}		
		}
		catch (Exception e) {
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(ss.takeScreenShot(driver)).build());
		}
		report.flush();				
	}	
}
