/*package practice1;

import org.testng.annotations.Test;

import dataProvider.ConfigFileReader;
import jdk.jfr.Configuration;
import practice1.EventsSessions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class MainTest {
	WebDriver driver;
	ConfigFileReader ConfigFileReader;
  @Test(priority=1)
  public void f() {
	  ConfigFileReader= new ConfigFileReader();
	  WebElement userNameBox = driver.findElement(By.name("userNameBox"));
	  userNameBox.sendKeys(ConfigFileReader.getuserNameBox());
	  WebElement passWordBox = driver.findElement(By.name("passWordBox"));
	  passWordBox.sendKeys(ConfigFileReader.getpassWordBox());
	  driver.findElement(By.name("LoginBtn")).click();
	  
  }
  @Test(priority=2)
  public void event() throws InterruptedException {
	  EventsSessions kk=new EventsSessions();
	  kk.f1(driver);
	
  }
  @BeforeTest
  public void beforeTest() {
	  driver.get("https://boilearningzone-stg.csod.com/client/boilearningzone/default.aspx");
		driver.manage().window().maximize();
  }
  
  
  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vydehi.surya.chinta\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
  }

  @AfterSuite
  public void afterSuite() {
  }

}*/
