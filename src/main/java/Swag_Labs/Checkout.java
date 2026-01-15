package Swag_Labs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout {

	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath = "//input[@id='first-name']")WebElement firstname;
	@FindBy(xpath = "//input[@id='last-name']")WebElement lastname;
	@FindBy(xpath = "//input[@id='postal-code']")WebElement postalCode;
	@FindBy(xpath = "//input[@id='continue']")WebElement continueClick;
	
	public Checkout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	public void fname(String frstname) {
		wait.until(ExpectedConditions.visibilityOf(firstname));
		firstname.sendKeys(frstname);
	}
	public void lname(String lstname) {
		wait.until(ExpectedConditions.visibilityOf(lastname));
		lastname.sendKeys(lstname);
	}
	public void postal(String postCode) {
		wait.until(ExpectedConditions.visibilityOf(postalCode));
		postalCode.sendKeys(postCode);
	}
	public void continueButton() {
		wait.until(ExpectedConditions.elementToBeClickable(continueClick));
		continueClick.click();
	}
}
