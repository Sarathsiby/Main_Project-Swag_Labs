package Test;

import org.testng.annotations.Test;

import Base.base_Class;
import Swag_Labs.Cart;
import Swag_Labs.Checkout;
import Swag_Labs.Home;
import Swag_Labs.Login;
import Swag_Labs.backToHome;
import Swag_Labs.orderConfirm;

public class Test_Page extends base_Class{
	
	@Test(priority = 0)
	public void test1() {
		Login log=new Login(driver);
		log.usrname("standard_user");
		log.paswrd("secret_sauce");
		log.log_in();
	}
	@Test(priority = 1)
	public void test2() throws InterruptedException {
		Home home=new Home(driver);
		home.img();
		home.cart();
		Thread.sleep(3000);
	}
	@Test(priority = 2)
	public void test3() throws InterruptedException {
		Cart cart=new Cart(driver);
		cart.cartLogo();
		cart.checkout();
		Thread.sleep(3000);
	}
	@Test(priority = 3)
	public void test4() throws InterruptedException {
		Checkout check=new Checkout(driver);
		check.fname("srt");
		check.lname("sby");
		check.postal("123456");
		check.continueButton();
		Thread.sleep(3000);
	}
	@Test(priority = 4)
	public void test5() throws InterruptedException {
		orderConfirm order=new orderConfirm(driver);
			order.finish();
			Thread.sleep(3000);
	}
	@Test(priority = 5)
	public void test6() {
		backToHome backHome=new backToHome(driver);
		backHome.back();
	}
}
