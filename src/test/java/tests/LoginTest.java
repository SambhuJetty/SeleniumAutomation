package tests; 

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import base.BaseTest;
import org.testng.Assert;
import pages.LoginPage;
import utils.Log;

public class LoginTest extends BaseTest {
	
	@Test
	public void testValidLogin() {
		
		
		Log.info("Starting login test..");
		LoginPage login= new LoginPage(driver);
		// Amazon login using phone number
		Log.info("Adding Credentials..");
		login.entermobnum("8332844480");
		login.clickcontinue();
		login.enterpassword("Sambhu@6050");
		login.clicksignin();
		
		System.out.println("Title :"+driver.getTitle());
		Log.info("Verifying page title..");
		Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	

}
 