package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseTests;

public class HomePage extends BaseTests {
	

	@FindBy(id="nav-logo") 
	private WebElement amazonlogo;
	
	@FindBy(id = "nav-link-accountList")  
	private WebElement signinotiopn;
	
	@FindBy(id="continue") 
	private WebElement continuebutton;
	
	@FindBy(id="twotabsearchtextbox") 
	private WebElement searchbox;
	
	@FindBy(id="nav-search-submit-text") 
	private WebElement searchbutton;
	
	  public HomePage(WebDriver driver) {
	        
	        PageFactory.initElements(driver, this);
	    }
	
	public boolean checkiflogoisdispalyed() {
		return amazonlogo.isDisplayed();
	}
	
	
	public void clickonsignin() {
		signinotiopn.click();
	}

	public void clickoncontinue() {
		continuebutton.click();
	}
	
	public void enterproductnameintosearchbox(String ProductName) {
		searchbox.sendKeys(ProductName);
	}
	
	public void clickonsearchbutton() {
		searchbutton.click();
	}
	
	
	
	
	
}
