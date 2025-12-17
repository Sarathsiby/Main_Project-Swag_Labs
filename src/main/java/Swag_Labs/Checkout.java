package Swag_Labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {

	WebDriver driver;
	@FindBy(xpath = "//input[@id='first-name']")WebElement firstname;
	@FindBy(xpath = "//input[@id='last-name']")WebElement lastname;
	@FindBy(xpath = "//input[@id='postal-code']")WebElement postalCode;
	@FindBy(xpath = "//input[@id='continue']")WebElement continueClick;
	
	public Checkout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void fname(String frstname) {
		firstname.sendKeys(frstname);
	}
	public void lname(String lstname) {
		lastname.sendKeys(lstname);
	}
	public void postal(String postCode) {
		postalCode.sendKeys(postCode);
	}
	public void continueButton() {
		continueClick.click();
	}
}
