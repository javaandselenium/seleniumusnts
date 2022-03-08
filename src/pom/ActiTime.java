package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTime {

	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	
	public ActiTime(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void usernametb(String name) {
		user.sendKeys(name);
	}
	
	public void passwordtb(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void loginbutton() {
		loginbtn.click();
	}
	
	
	
}
