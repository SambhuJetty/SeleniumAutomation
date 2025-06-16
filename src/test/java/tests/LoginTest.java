package tests; 

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import base.BaseTest;
import org.testng.Assert;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void testValidLogin() {
		
		LoginPage login= new LoginPage(driver);
		// Amazon login using phone number
		login.entermobnum("8332844480");
		login.clickcontinue();
		// this is password
		login.enterpassword("Sambhu@6050");
		login.clicksignin();
		
		System.out.println("Title :"+driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	

}
