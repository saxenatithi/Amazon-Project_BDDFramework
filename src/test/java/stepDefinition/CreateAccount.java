package stepDefinition;

import java.util.Map;

import org.junit.Assert;

import baseclass.BaseTests;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.SigninPage;

public class CreateAccount extends BaseTests {
	 
	 CreateAccountPage createaccount;
	 HomePage homepage;
	 SigninPage sign;
	
	
	@Given("the user is already on Amazon registration page")
	public void the_user_is_already_on_amazon_registration_page() {
		
		BaseTests.initialization();
		
		homepage = new HomePage(driver);
		sign = new SigninPage(driver);
		createaccount = new CreateAccountPage(driver);
		homepage.clickonsignin();
		sign.clickcreateaccountbtn();
	}
	
	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() {
		
		homepage.clickoncontinue();
	}
	
	@Then("user should see error message on username, email and password fields")
	public void user_should_see_error_message_on_username_email_and_password_fields() {
	
	  Assert.assertEquals("Enter your name", createaccount.customernameerror());
	  Assert.assertEquals("Enter your e-mail address or mobile phone number",createaccount.emailaddresserror()); 
	  Assert.assertEquals("Minimum 6 characters required", createaccount.passworderror());
	  driver.close();
	}
	
	@When("user entered existing account details as below")
	public void user_entered_existing_account_details_as_below(DataTable dataTable) {
		
	   Map<String, String> dataMap= dataTable.asMap(String.class,String.class);
	   
	   createaccount = new CreateAccountPage (driver);
	   
	   createaccount.entercustomername(dataMap.get("Name"));
	   createaccount.enteremail(dataMap.get("Email"));
	   createaccount.enterpassword(dataMap.get("Password"));
	   createaccount.enterpasswordagain(dataMap.get("PasswordAgain")); 
	}
	
	@And("user clicks on verify email button")
	public void user_clicks_on_verify_email_button() {
		
		createaccount.clickverifyemailbtn();  
	}
	
	@Then("user should receive displayed message as {string}")
	public void user_should_receive_displayed_message_as(String Errormessage) {
		
	    boolean actual = createaccount.registererrormessage();
	    Assert.assertTrue(actual);
	    driver.close();
	}
}
