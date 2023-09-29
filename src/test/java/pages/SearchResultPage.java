package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseTests;

public class SearchResultPage extends BaseTests {

	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[8]") 
	private WebElement searchproduct;
	
	@FindBy(css="div.sg-col-4-of-24:nth-child(13)") 
	private WebElement selectedproduct;
	
	@FindBy(id="submit.add-to-cart") 
	private WebElement selectaddtocart;
	
	@FindBy(id="attachSiNoCoverage") 
	private WebElement clicknowarrenty;
	
	  public SearchResultPage(WebDriver driver) {
	       
	        PageFactory.initElements(driver, this);
	        
	    }
	
	public boolean searchproductpage() {
		return searchproduct.isDisplayed();
	}
	
	public void selectproduct() {
		driver.manage().timeouts().getPageLoadTimeout();
		Duration.ofSeconds(20);
		selectedproduct.click();
		
	}
	
	public void clickaddtocart() {
		driver.manage().timeouts().getPageLoadTimeout();
		Duration.ofSeconds(20);
		selectaddtocart.click();	
	}
	
	public void clicknowarrtenty() {
		driver.manage().timeouts().getPageLoadTimeout();
		Duration.ofSeconds(20);
		clicknowarrenty.click();
	}
}
