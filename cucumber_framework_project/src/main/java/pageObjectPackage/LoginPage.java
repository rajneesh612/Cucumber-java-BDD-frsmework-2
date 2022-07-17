package pageObjectPackage;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class LoginPage {

	WebDriver lDriver;
	public LoginPage(WebDriver driver) {
		this.lDriver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="txtUsername")
	@CacheLookup
	WebElement txtUsername;
	

	@FindBy(id="txtPassword")
	@CacheLookup
	WebElement txtPassword;
	
	
	@FindBy(id="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	
	@FindBy(xpath ="//div[@class='head']//h1" )
	@CacheLookup
	WebElement headingElement;
	
	//div[@class='head']//h1
	
	
	//a[@id='welcome']
	@FindBy(xpath ="//a[@id='welcome']" )
	@CacheLookup
	WebElement welcom_btn_Element;
	
	//(//li)[7]
	//@FindBy(xpath ="//body/div[@id='wrapper']/div[@id='branding']/div[@id='welcome-menu']/ul/li[3]" )
	@FindBy(xpath ="(//a[normalize-space()='Logout'])[1]" )
	@CacheLookup
	WebElement logout_btn_Element;
	
	public void setUserName (String userName) {
		txtUsername.clear();
		txtUsername.sendKeys(userName);
		
	}
	
	public void setPassword (String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);
		
	}
	
	
	public void loginButton () {	
		btnLogin.click();
		}
	
	public void dashboard_stirng(String str) {
		//Assert.assertEquals(headingElement.getText(), str);
	
			}
	
	public void welcomeButton () {	
		welcom_btn_Element.click();
		}

	public void logoutButton() {
		// TODO Auto-generated method stub
		new WebDriverWait(lDriver, Duration.ofMillis(2000)).until(ExpectedConditions.visibilityOf(logout_btn_Element));
		new WebDriverWait(lDriver, Duration.ofMillis(2000)).until(ExpectedConditions.elementToBeClickable(logout_btn_Element));
		logout_btn_Element.click();
	}
	
	
	
	

}
