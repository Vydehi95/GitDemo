package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	public Homepage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@role='navigation']/div/ul/li[7]/a")
	WebElement admin;
	
	@FindBy(xpath="//*[@id=\\\"main-menu\\\"]/li[7]/ul/li[11]/a")
	WebElement users;
	
	public WebElement users() {
		return users;
	}
	public WebElement admin() {
		return admin;
	}
	
	//@FindBy(xpath="//*[@id=\\\"main-menu\\\"]/li[7]/ul/li[1]/a")
	//WebElement tools;
	
	
}