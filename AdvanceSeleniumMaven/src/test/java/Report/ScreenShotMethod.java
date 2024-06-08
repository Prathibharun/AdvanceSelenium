package Report;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotMethod {
	
	public String takeScreenShot(WebDriver driver) {
		LocalDateTime dateTime=LocalDateTime.now();
		String date=dateTime.toString().replace(":","-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		String path="./ScreenShots/"+date+".png";
		File source= ts.getScreenshotAs(OutputType.FILE);
		File target= new File(path);
		try {
			org.openqa.selenium.io.FileHandler.copy(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
	   return"."+path;
   }

}
