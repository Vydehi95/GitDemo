package tasks;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import dataProvider.ConfigFileReader;
import repository.loginPage;


public class Loginapplication {

	static ConfigFileReader ConfigFileReader; 

	static ExtentReports report;
	static ExtentTest result;

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
		ConfigFileReader= new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vydehi.surya.chinta\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://boilearningzone-stg.csod.com/client/boilearningzone/default.aspx");
		loginPage LP = new loginPage(driver);
		LP.userNameBox().sendKeys(ConfigFileReader.getuserNameBox());
		LP.passWordBox().sendKeys(ConfigFileReader.getpassWordBox());
		LP.Enter().click();
		driver.manage().window().maximize();
		result.log(LogStatus.PASS, "Test Passed");

	}
	@AfterClass
	public static void endTest()
	{
		report.endTest(result);
		report.flush();
	}


}
