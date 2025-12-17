package Swag_Labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderConfirm {

	WebDriver driver;
	@FindBy(xpath = "//button[@id='finish']")WebElement finishButton;
	public orderConfirm(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void finish() {
		finishButton.click();
	}
}
