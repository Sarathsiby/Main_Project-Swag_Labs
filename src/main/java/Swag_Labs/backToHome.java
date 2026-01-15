package Swag_Labs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class backToHome {
WebDriver driver;
WebDriverWait wait;
@FindBy(xpath = "//button[@id='back-to-products']")WebElement home;
public backToHome(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
}
public void back() {
	wait.until(ExpectedConditions.elementToBeClickable(home));
	home.click();
}
}
