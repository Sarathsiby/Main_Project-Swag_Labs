package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Base.base_Class;
import Swag_Labs.Cart;
import Swag_Labs.Checkout;
import Swag_Labs.Home;
import Swag_Labs.Login;
import Swag_Labs.backToHome;
import Swag_Labs.orderConfirm;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Page extends base_Class{
	
	
	@Test(priority = 0)
	public void test1() throws InterruptedException {
		test= extent.createTest("login page verification");

		Login log=new Login(driver);
		log.usrname("standard_user");
		log.paswrd("secret_sauce");
		log.log_in();
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void test2() throws InterruptedException {
		test= extent.createTest("home page verification");

		Home home=new Home(driver);
		home.img();
		home.cart();
		Thread.sleep(3000);
	}
	@Test(priority = 2)
	public void test3() throws InterruptedException {
		test= extent.createTest("cart page verification");

		Cart cart=new Cart(driver);
		cart.cartLogo();
		cart.checkout();
		Thread.sleep(3000);
	}
	@Test(priority = 3)
	public void test4() throws InterruptedException {
		test= extent.createTest("check page verification");

		Checkout check=new Checkout(driver);
		check.fname("srt");
		check.lname("sby");
		check.postal("123456");
		check.continueButton();
		Thread.sleep(3000);
	}
	@Test(priority = 4)
	public void test5() throws InterruptedException {
		test= extent.createTest("order page verification");

		orderConfirm order=new orderConfirm(driver);
			order.finish();
			Thread.sleep(3000);
	}
	@Test(priority = 5)
	public void test6() {
		test= extent.createTest("last page verification");

		backToHome backHome=new backToHome(driver);
		backHome.back();
	}
}
