package tasks;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import dataProvider.ConfigFileReader;
import repository.loginPage;
import repository.usercreation;

public class Usercreationtest {
	
	static ConfigFileReader ConfigFileReader; 

	static ExtentReports report;
	static ExtentTest result;
	WebDriver driver;

	@BeforeClass
	public static void startTest() {
		ConfigFileReader= new ConfigFileReader();
		String path= "C:\\Users\\vydehi.surya.chinta\\Desktop\\results\\ExtentReportResults.html";
		report = new ExtentReports(path,false);
		result = report.startTest("Usercreationtest");

	}
	@Test
   public void usercreation()  {
	   usercreation uc = new usercreation(driver);
	   uc.AddUser().click();
	   String firstname=RandomStringUtils.randomAlphabetic(6,8);
	   uc.firstname().sendKeys(firstname);
	   String lastname=RandomStringUtils.randomAlphabetic(6,8);
	   uc.lastname().sendKeys(lastname);
	   String username=RandomStringUtils.randomAlphabetic(6,8);
	   uc.username().sendKeys(username);
	   uc.division().click();
	   
	   
	   String MainWindow=driver.getWindowHandle();
	   Set<String> s1=driver.getWindowHandles();		
	   Iterator<String> i1=s1.iterator();		
	   		
	   while(i1.hasNext())			
	   {		
	       String ChildWindow=i1.next();		
	       		
	       if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	       {    		
	            
	               // Switching to Child window
	               driver.switchTo().window(ChildWindow);	                                                                                                           
	               //String MainWindow1=driver.getWindowHandle();	
	               
	               driver.manage().timeouts().implicitlyWait(400,TimeUnit.SECONDS);
	               //Thread.sleep(4000);
	               uc.accenturedivision().click();			
	       }
	   
	       driver.switchTo().window(MainWindow);
	   }
	   uc.save().click();
	   }
   
   @AfterClass
	public static void endTest()
	{
		report.endTest(result);
		report.flush();
	}

}
