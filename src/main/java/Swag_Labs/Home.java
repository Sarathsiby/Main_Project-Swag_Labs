package Swag_Labs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home{

	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath = "//img[@alt='Sauce Labs Backpack']")WebElement imageClick;
	@FindBy(xpath = "//button[text()='Add to cart']")WebElement addToCart;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	public void img() {
		wait.until(ExpectedConditions.elementToBeClickable(imageClick)).click();

	}
	public void cart() {
		wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
	}
}
