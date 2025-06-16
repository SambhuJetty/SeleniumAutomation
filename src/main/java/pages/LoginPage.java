package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	private By entermobnumTextbox = By.id("ap_email");
	private By enterpasswordTextbox = By.id("ap_password");
	private By continueButton = By.xpath("//*[@id=\"continue\"]/span/input");
	private By signinButton = By.id("signInSubmit");
	
	
	public LoginPage(WebDriver driver) {
		
	this.driver =driver;
	}
	
	public void entermobnum(String mobnum) {
		driver.findElement(entermobnumTextbox).clear();
		driver.findElement(entermobnumTextbox).sendKeys(mobnum);
	} 
	
	public void clickcontinue() {
		driver.findElement(continueButton).click();
	}
	
	public void enterpassword(String password) {
		driver.findElement(enterpasswordTextbox).clear();
		driver.findElement(enterpasswordTextbox).sendKeys(password);
		
	}
	
	public void clicksignin() {
		driver.findElement(signinButton).click();
		
	}
}

