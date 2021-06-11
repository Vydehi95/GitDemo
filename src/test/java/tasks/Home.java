package tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import dataProvider.ConfigFileReader;
import repository.Homepage;

public class Home {

	static ConfigFileReader ConfigFileReader;
	static ExtentReports report;
	static ExtentTest result;
	WebDriver driver;

	@BeforeClass
	public static void startTest() {
		ConfigFileReader= new ConfigFileReader();
		String path= "C:\\Users\\vydehi.surya.chinta\\Desktop\\results\\ExtentReportResults.html";
		report = new ExtentReports(path,false);
		result = report.startTest("Loginapplication");

	}
	@Test
	public void Login()
	{
		//Loginapplication LA=new Loginapplication();
		Homepage hp=new Homepage(driver);
		Actions action = new Actions(driver);
		action.moveToElement(hp.admin()).click().sendKeys(Keys.ENTER).perform();
		hp.users().click();
		result.log(LogStatus.PASS, "Test Passed");

	}
    @AfterClass
	public static void endTest()
	{
		report.endTest(result);
		report.flush();
	}

}
