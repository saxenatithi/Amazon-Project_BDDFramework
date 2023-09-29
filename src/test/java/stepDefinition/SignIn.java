package stepDefinition;


import baseclass.BaseTests;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.SigninPage;

import org.junit.Assert;

public class SignIn extends BaseTests {

	HomePage homepage;
	SigninPage signinpage;
	
	@Given("User is already on the homepage of Amazon Website")
	public void user_is_already_on_the_homepage_of_amazon_website() {
		BaseTests.initialization();
		
		homepage = new HomePage(driver);
		
		boolean result = homepage.checkiflogoisdispalyed();
	    System.out.print(result);    
	}

	@When("user clicks on Hello, Sign in option")
	public void user_clicks_on_hello_sign_in_option() {
		homepage.clickonsignin();
	    //driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	}

	@Then("user enter valid email {string} and password {string}")
	public void user_enter_valid_email_and_password(String email, String password){
	    signinpage = new SigninPage(driver);
		signinpage.enteremail(email);
		signinpage.clickcontinue();
		signinpage.enterpassword(password);
	}

	@And("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		signinpage.clicksigninbutton();driver.close();
	}

	@Then("user enter valid email {string} and invalid password {string}")
	public void user_enter_valid_email_and_invalid_password(String validemail, String wrgpassword) {
		signinpage = new SigninPage(driver);
		
		signinpage.enteremail(validemail);
		signinpage.clickcontinue();
		signinpage.enterpassword(wrgpassword);
	}

	@And("user to receive error message to enter valid password")
	public void user_to_receive_error_message_to_enter_valid_password() {
		
		signinpage.clicksigninbutton();
		Assert.assertTrue(signinpage.displayedwarningmessage());
		driver.close();
	}

	@Then("user click on continue without entering username")
	public void user_click_on_continue_without_entering_username() {
		signinpage = new SigninPage(driver);
		signinpage.clickcontinue();
	}

	@And("user should receive error to enter username")
	public void user_should_receive_error_to_enter_username() {	
		boolean result = signinpage.displayedemailmissingerror();
		   Assert.assertTrue(result);
		   driver.close();
	}

}
