package resources;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Base {
	WebDriver driver;
	public void getScreenShotPath(String testCaseName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	    FileUtils.copyFile(source,new File(destinationFile));
		
	}

}
