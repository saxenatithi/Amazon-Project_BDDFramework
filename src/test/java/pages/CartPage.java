package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baseclass.BaseTests;

public class CartPage extends BaseTests  {
	

	@FindBy(id="NATC_SMART_WAGON_CONF_MSG_SUCCESS") 
	private WebElement addedtocartprompt;
	
	@FindBy(id="sc-buy-box-ptc-button") 
	private WebElement proceedtocheckoutbutton;
	
	public CartPage(WebDriver driver) {
      
        PageFactory.initElements(driver, this);
    }
	
	public String addedtocartprompt() {
		driver.manage().timeouts().getPageLoadTimeout();
		Duration.ofSeconds(20);
        return addedtocartprompt.getText();
        }
	
	public String proceedtocheckoutbutton() {
		driver.manage().timeouts().getPageLoadTimeout();
		Duration.ofSeconds(20);
		return proceedtocheckoutbutton.getText();
	}
	
	public void clickonproceedtocheckoutbutton() {
		driver.manage().timeouts().getPageLoadTimeout();
		Duration.ofSeconds(20);
		proceedtocheckoutbutton.click();
	}
	
	
}
