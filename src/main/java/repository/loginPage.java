package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	public loginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="userNameBox")
	WebElement userNameBox;
	
	@FindBy(name="passWordBox")
	WebElement passWordBox;
	
	@FindBy(name="LoginBtn")
    WebElement Enter;
	
	public WebElement userNameBox() {
		return userNameBox;
	}
	
	public WebElement passWordBox() {
		return passWordBox;
	}
	
	public WebElement Enter() {
		return Enter;
	}
	
}

