package Swag_Labs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orderConfirm {

	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath = "//button[@id='finish']")WebElement finishButton;
	public orderConfirm(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	public void finish() {
		wait.until(ExpectedConditions.elementToBeClickable(finishButton));
		finishButton.click();
	}
}
