/*package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class test {
	public static WebDriver driver;
    private long TimeOut;

    @Test
    public void login() throws InterruptedException {
                   
                   System.setProperty("webdriver.chrome.driver",
                                 "C:\\\\Users\\\\vydehi.surya.chinta\\\\Downloads\\\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
    driver.get("https://boilearningzone-stg.csod.com/client/boilearningzone/");
driver.findElement(By.xpath("//input[@name='userNameBox']")).sendKeys("vydehi.chinta");
driver.findElement(By.xpath("//input[@name='passWordBox']")).sendKeys("Jntuk@9516");
    driver.findElement(By.xpath("//input[@name='LoginBtn']")).click();
    


    WebElement w1=driver.findElement(By.xpath("//a[@id='nav-Reports'][text()='Reports']"));
    WebElement w2=driver.findElement(By.xpath("//a[@id='nav-Reports']"));
    
    Thread.sleep(8000);
    Actions a=new Actions(driver);
    
    a.moveToElement(w1).build().perform();
    w2.click();
    driver.findElement(By.xpath("/html/body/form/div[5]/div/ul/li[3]/ul/li[4]/a[1]")).click();
    driver.findElement(By.xpath("/html/body/div[7]/div/div/div[1]/div[2]/div/div/div[2]/div[2]/span/div[2]/div[5]/button[1]/div/span[2]")).click();
   
   
    //driver.findElement(By.xpath("/html/body/form/div[5]/div/ul/li[3]/ul/li[4]/a[1]")).click();
    
    }

}*/












