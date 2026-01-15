package Swag_Labs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath = "//input[@id='user-name']")WebElement username;
	@FindBy(xpath = "//input[@id='password']")WebElement password;
	@FindBy(xpath = "//input[@id='login-button']")WebElement loginButton;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	public void usrname(String uname) {
		wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(uname);
	}
	public void paswrd(String pwd) {
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(pwd);
	}
	public void log_in() {
		wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
	}
}
