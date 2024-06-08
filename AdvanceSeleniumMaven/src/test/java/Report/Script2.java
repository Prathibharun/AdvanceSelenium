package Report;

import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Script2 {
	
	@Test
	public void script2() {
		WebDriver driver;
		ScreenShotMethod ss= new ScreenShotMethod();
		LocalDateTime dateTime=LocalDateTime.now();
		String date=dateTime.toString().replace(":","-");
		ExtentReports reports=new ExtentReports();
		ExtentSparkReporter reporter=new ExtentSparkReporter("./Reports/"+date+".html");
		reports.attachReporter(reporter);
		ExtentTest test=reports.createTest("book");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		test.log(Status.INFO, "Window is maximised");
		driver.get("https://demowebshop.tricentis.com/");
		test.log(Status.INFO, "DemoWebShop application launched");
		
			
		
		
	}
	

}
