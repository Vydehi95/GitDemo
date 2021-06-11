package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class usercreation {

	WebDriver driver;
	public usercreation(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	/*@FindBy(xpath="//div[@role='navigation']/div/ul/li[7]/a")
	WebElement admin;
	
	@FindBy(xpath="//*[@id=\\\"main-menu\\\"]/li[7]/ul/li[11]/a")
	WebElement users;*/
	
	@FindBy(xpath="//*[@id=\"csLBAddUser\"]/span")
	WebElement AddUser;
	
	@FindBy(xpath="//*[@id=\"bg____________________bb_508\"]")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"bg____________________bu_508\"]")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"bg____________________cr_508\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"bg____________________pa0ja_button\"]/span")
	WebElement division;
	
	@FindBy(xpath="//*[@id=\"bg____________________pa0jhbh0m\"]")
	WebElement accenturedivision;
	
	@FindBy(xpath="//*[@id=\"bt\"]")
	WebElement save;
	
	
	public WebElement AddUser() {
		return AddUser;
	}
	
	public WebElement firstname() {
		return firstname;
	}
	
	public WebElement lastname() {
		return lastname;
	}
	
	public WebElement username() {
		return username;
	}
	
	public WebElement division() {
		return division;
	}
	
	public WebElement accenturedivision() {
		return accenturedivision;
	}
	public WebElement save() {
		return save;
	}
	
	public void addNewUser() {
		
	}
}
