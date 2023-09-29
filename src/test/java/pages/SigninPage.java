package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseTests;

public class SigninPage extends BaseTests {

	  public SigninPage(WebDriver driver) {
	   
	        PageFactory.initElements(driver, this);
	    }
	  
	@FindBy(id="ap_email") 
	private WebElement emailfield;
	
	@FindBy(id="continue") 
	private WebElement continuebutton;
	
	@FindBy(id="ap_password") 
	private WebElement passwordfield;
	
	@FindBy(id="auth-signin-button") 
	private WebElement signinbutton;
	
	@FindBy(id="createAccountSubmit") 
	private WebElement createaccountbtn;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[1]/div/div/div/h4") 
	private WebElement warningmessage;
	
	@FindBy(id="auth-email-missing-alert") 
	private WebElement emailmissingerror;
	
	@FindBy(xpath="//*[@id=\"ap-account-switcher-container\"]/div[1]/div/div/div[2]/h1") 
	private WebElement prompttologin;
	
	public void enteremail(String email) {
		emailfield.sendKeys(email);
	}

	public void clickcontinue() {
		continuebutton.click();
	}
	
	public void enterpassword(String password) {
		passwordfield.sendKeys(password);
	}
	
	public void clicksigninbutton() {
		signinbutton.click();
	}
	
	public void clickcreateaccountbtn() {
		createaccountbtn.click();
	}
	public boolean displayedwarningmessage() {
		return warningmessage.isDisplayed();
	}
	
	public boolean displayedemailmissingerror() {
		return emailmissingerror.isDisplayed();
	}
	
	public boolean prompttologin() {
		return prompttologin.isDisplayed();
	}
}
