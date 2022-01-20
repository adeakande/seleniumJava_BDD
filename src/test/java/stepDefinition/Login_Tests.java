package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import utility.BaseUtil;
import utility.Constant;

public class Login_Tests extends BaseUtil{

	private BaseUtil base;
	public Login_Tests(BaseUtil base) {
		this.base=base;
	}

	//Scenario: user to be able to login as a standard user
	@Given("user opens URL")
	public void user_opens_URL() {
//		base.driver.get("https://www.saucedemo.com/");
		base.driver.get(Constant.URL);
	}

	@When("user enters username")
	public void user_enters_username() {
		LoginPage login = new LoginPage(base.driver);
//		login.enterUsername("standard_user");
		login.enterUsername(Constant.STANDARD_USER);
	}

    @And("user enters password")
    public void user_enters_password() {
    	LoginPage login = new LoginPage(base.driver);
//    	login.enterPassword("secret_sauce");
    	login.enterPassword(Constant.PASSWORD);
    }

    @Then("clicks on the login button")
    public void clicks_on_the_login_button() {
    	LoginPage login = new LoginPage(base.driver);
    	login.clickOnLoginButton();
    }

    @And("user is navigated to homepage")
    public void user_is_navigated_to_homepage() throws Exception {
    	Thread.sleep(2000);
    	String expectedURL = "https://www.saucedemo.com/inventory.html";
    	String actualURL = base.driver.getCurrentUrl();
    	Assert.assertEquals(expectedURL, actualURL);
    }
    
  //Scenario: user to login with a locked account
    @Given("the user opens URL")
    public void the_user_opens_URL() {
//    	base.driver.get("https://www.saucedemo.com/");
    	base.driver.get(Constant.URL);
    }

    @When("the user enters username")
    public void the_user_enters_username() {
    	LoginPage login = new LoginPage(base.driver);
//		login.enterUsername("locked_out_user");
    	login.enterUsername(Constant.LOCKED_USER);
    }

    @And("the user enters password")
    public void the_user_enters_password() {
    	LoginPage login = new LoginPage(base.driver);
//    	login.enterPassword("secret_sauce");
    	login.enterPassword(Constant.PASSWORD);
    }

    @Then("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
    	LoginPage login = new LoginPage(base.driver);
    	login.clickOnLoginButton();
    }

    @And("user to get error message")
    public void user_to_get_error_message() {
    	WebElement errorMessage = base.driver.findElement(By.cssSelector("h3[data-test='error']"));
		Assert.assertTrue(errorMessage.isDisplayed());
    }


}

