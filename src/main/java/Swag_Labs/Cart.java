package Swag_Labs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {

	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")WebElement cartLogoClick;
	@FindBy(xpath = "//button[@id='checkout']")WebElement checkoutClick;
	
	public Cart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	public void cartLogo() {
		wait.until(ExpectedConditions.elementToBeClickable(cartLogoClick)).click();

	}
	public void checkout() {
		wait.until(ExpectedConditions.elementToBeClickable(checkoutClick)).click();
	}
}
