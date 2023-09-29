package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseTests;

public class CreateAccountPage extends BaseTests {
	
	
	public CreateAccountPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="auth-customerName-missing-alert") WebElement missingcustomername;
	@FindBy(id="auth-email-missing-alert") WebElement missingemail;
	@FindBy(id="auth-password-missing-alert") WebElement missingpassword;
	@FindBy(id="ap_customer_name") WebElement customername;
	@FindBy(id="ap_email") WebElement enteremail;
	@FindBy(id="ap_password") WebElement enterpassword;
	@FindBy(id="ap_password_check") WebElement enterpasswordagain;
	@FindBy(id="auth-continue") WebElement clickverifyemailbutton;
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/h4[1]") WebElement registererror;
	
	public void entercustomername(String CName) {
		customername.sendKeys(CName);
	}
	
	public void enteremail(String email) {
		enteremail.sendKeys(email);
	}
	
	public void enterpassword(String password) {
		enterpassword.sendKeys(password);
	}
	
	public void enterpasswordagain(String passwordagain) {
		enterpasswordagain.sendKeys(passwordagain);
	}
	
	public void clickverifyemailbtn() {
		clickverifyemailbutton.click();
	}
	
	public boolean registererrormessage() {
		return registererror.isDisplayed();
	}
	
	public String customernameerror() {
		return missingcustomername.getText();
	}
	
	public String emailaddresserror() {
		return missingemail.getText();
	}
	
	public String passworderror() {
		return missingpassword.getText();
	}
	
	
}
