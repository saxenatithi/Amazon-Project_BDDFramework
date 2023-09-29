package stepDefinition;


import java.time.Duration;

import org.junit.Assert;


import baseclass.BaseTests;

import io.cucumber.java.en.*;
import pages.CartPage;
import pages.HomePage;
import pages.SearchResultPage;
import pages.SigninPage;

public class GuestUser extends BaseTests {
	

	 HomePage homepage;
	 SearchResultPage searchpage;
	 CartPage cartpage;
	
	@Given("user must be on Amazon Webpage")
	public void user_must_be_on_amazon_webpage(){
		BaseTests.initialization();
		
	}

	@When("user search a product in search bar by entering {string}")
	public void user_search_a_product_in_search_bar_by_entering(String productname) {
		
		homepage = new HomePage(driver);
		homepage.enterproductnameintosearchbox(productname); 
	}

	@And("upon clicking search icon, user should see search product results")
	public void upon_clicking_search_icon_user_should_see_search_product_results() {
		
	    homepage.clickonsearchbutton();
	    
	    searchpage = new SearchResultPage(driver);
	    Assert.assertTrue(searchpage.searchproductpage());
	    
	}

	@And("user select an item and add to the cart")
	public void user_select_an_item_and_add_to_the_cart() {
		
		searchpage.selectproduct();
		searchpage.clickaddtocart();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		searchpage.clicknowarrtenty();
	}

	@Then("user should see confirmation message that the product is added to the cart")
	public void user_should_see_confirmation_message_that_the_product_is_added_to_the_cart() {
		
		cartpage = new CartPage(driver);
		Assert.assertEquals("Added to Cart", cartpage.addedtocartprompt());
	}

	@And("user clicks on the {string} option")
	public void user_clicks_on_the_option(String button)  {
		
		Assert.assertEquals(button, cartpage.proceedtocheckoutbutton());
		cartpage.clickonproceedtocheckoutbutton();
	}

	@And("user should be prompted to log in or create account")
	public void user_should_be_prompted_to_log_in_or_create_account() {
		
		SigninPage signin = new SigninPage(driver);
		Assert.assertTrue(signin.prompttologin());
		driver.close();
	}
}
