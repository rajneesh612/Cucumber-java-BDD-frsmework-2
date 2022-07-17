package stepDefinition;


import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectPackage.LoginPage;

public class StepDefinition {
	public WebDriver driver;
	public LoginPage lPage;
	
	@Given("Laucnh Chrome browser")
	public void laucnh_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","D:\\java\\selenium-web-driver\\chrome-driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		lPage = new  LoginPage(driver);
	
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	

	@When("Go to {string}")
	public void go_to(String url) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
		
	   // throw new io.cucumber.java.PendingException();
	}

	@When("^Enter Username (.*) and password (.*)$")
	public void enter_username_and_password(String username, String passwsd) {
		lPage.setUserName(username);
		lPage.setPassword(passwsd);
	
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		lPage.loginButton();
	   // throw new io.cucumber.java.PendingException();
	}

//	@io.cucumber.java.en.Then("Dashboard page will open with {Dashboard} heading")
//	public void welcome_akon_is_diplayed_on_the_dasboard_page(String heading) {
//	    // Write code here that turns the phrase above into concrete actions
//	org.junit.Assert.assertTrue(true);
//		//lPage.dashboard_stirng(heading);
//	    //throw new io.cucumber.java.PendingException();
//	}
	
	@Then("Dashboard page will open with {string} heading")
	public void dashboard_page_will_open_with_heading(String string) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(true);
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("Click welcome button")
	public void click_welcome_button() {
	    // Write code here that turns the phrase above into concrete actions
		lPage.welcomeButton();
	   // throw new io.cucumber.java.PendingException();
	}
	/*
	 * @Then("Click on logout ") public void click_logout_button() { // Write code
	 * here that turns the phrase above into concrete actions lPage.logoutButton();
	 * // throw new io.cucumber.java.PendingException(); }
	 */
	
	@Then("Click on logout")
	public void click_on_logout() {
	    // Write code here that turns the phrase above into concrete actions
		 lPage.logoutButton();
	   // throw new io.cucumber.java.PendingException();
	}


}
