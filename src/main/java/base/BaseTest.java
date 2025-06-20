package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

import utils.Log;

import org.testng.annotations.AfterMethod;

public class BaseTest {
	
	
	protected WebDriver driver;
	
	
	@BeforeMethod
	public void setUp(){
		
		Log.info("Starting WebDriver..");
		driver =new EdgeDriver();
		driver.manage().window().maximize();
		Log.info("Navigating to URL");
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}
	@AfterMethod
	public void teardown() {
		if(driver != null) {
			Log.info("Closing Browser..");
			driver.quit();
		}
	}

}
