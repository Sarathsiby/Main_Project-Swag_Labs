package Swag_Labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {

	WebDriver driver;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")WebElement cartLogoClick;
	@FindBy(xpath = "//button[@id='checkout']")WebElement checkoutClick;
	
	public Cart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void cartLogo() {
		cartLogoClick.click();
	}
	public void checkout() {
		checkoutClick.click();
	}
}
