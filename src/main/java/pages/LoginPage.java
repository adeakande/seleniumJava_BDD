package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	/***
	 * Page Object Model
	 * This allow re-usability of code and easy maintenance
	 *
	 * Every web page you create tests for must have a page factory and a test class to go with it.
	 *
	 * E.g Page Factory for login page and test class for the login page
	 *
	 * readability of code, others are able to understand code's purpose
	 * Easy for someone else to work on your code
	 *
	 * camel case - starts with lower case
	 * snake case - all words are separated by underscore _
	 */

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//WebElements
	@FindBy(id="user-name")
	WebElement username;

	@FindBy(name="password")
	WebElement password;

	@FindBy(id="login-button")
	WebElement loginButton;

	public void enterUsername(String pass) {
		username.sendKeys(pass);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public void loginToSauceDemo(String user, String pword) {
		username.sendKeys(user);
		password.sendKeys(pword);
		loginButton.click();
	}








}
