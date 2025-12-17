package Swag_Labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class backToHome {
WebDriver driver;
@FindBy(xpath = "//button[@id='back-to-products']")WebElement home;
public backToHome(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void back() {
	home.click();
}
}
