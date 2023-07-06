package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PO {
	
	public WebDriver driver;
	
	@FindBy (name = "password") WebElement passwordTxtBox;
	@FindBy (xpath="//input[@value='Login']")WebElement loginBtn;
	@FindBy (linkText = "Sign out") WebElement logoutBtn;
	@FindBy (linkText = "Register!") WebElement registerBtn;
	
	
	public LoginPage_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword(String password) {
		passwordTxtBox.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public void clickLogoutBtn() {
		logoutBtn.click();
	}
	
	public void clickRegisterBtn() {
		registerBtn.click();
	}
}
