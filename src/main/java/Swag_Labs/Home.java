package Swag_Labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home{

	WebDriver driver;
	@FindBy(xpath = "//a[@id='item_4_img_link']")WebElement imageClick;
	@FindBy(xpath = "//button[@id='add-to-cart']")WebElement addToCart;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void img() {
		imageClick.click();
	}
	public void cart() {
		addToCart.click();
	}
}
