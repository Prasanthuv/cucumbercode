package com.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass1;

public class LoginPagePOM extends BaseClass1 {
protected WebDriver driver;
	
	public LoginPagePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//button[text()='Login/ Sign Up']")
	private WebElement loginButton;
	
	@FindBy(id="multiform")
	private WebElement phoneField;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continueButton;
	
     public void getLoginPage() {
     clickOneElement(loginButton, driver);
     	
    }
     public void getPhonePage() {
    	 inputValues(driver, phoneField, "9384157536");
     }
     public void getContinuePage() {
    	 clickOneElement(continueButton, driver);
     }
}

