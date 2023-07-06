package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage_PO {
	public WebDriver driver;
	
	@FindBy (name = "username") WebElement usernameTxtBox;
	@FindBy (name = "password1") WebElement passwordTxtBox;
	@FindBy (name = "password2") WebElement confirmPasswordTxtBox;
	@FindBy (xpath = "//input [@value='Register']") WebElement registerBtn;
	
	
	public RegisterPage_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void registerBtnClick() {
		registerBtn.click();
	}
	
	public String displayerror() {
		String error = null;
		
		String val = usernameTxtBox.getAttribute("required"); 
		if(val.equalsIgnoreCase("true")) {
			error="Please fill out this field.";	
		}
		return error;
	}
	
	public void enterUserName(String name) {
		usernameTxtBox.sendKeys(name);
	}
	
	public void enterPassword(String password) {
		passwordTxtBox.sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmPassword) {
		confirmPasswordTxtBox.sendKeys(confirmPassword);
	}
	
}
