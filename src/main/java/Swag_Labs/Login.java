package Swag_Labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;
	@FindBy(xpath = "//input[@id='user-name']")WebElement username;
	@FindBy(xpath = "//input[@id='password']")WebElement password;
	@FindBy(xpath = "//input[@id='login-button']")WebElement loginButton;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void usrname(String uname) {
		username.sendKeys(uname);
	}
	public void paswrd(String pwd) {
		password.sendKeys(pwd);
	}
	public void log_in() {
		loginButton.click();
	}
}
