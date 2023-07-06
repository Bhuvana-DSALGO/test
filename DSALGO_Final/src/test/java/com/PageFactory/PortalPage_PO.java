package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalPage_PO {
	
	private WebDriver driver;

	@FindBy (xpath = "//button[text()='Get Started']") WebElement getStartedBtn;
	//By getStartedBtn = By.xpath("//button[text()='Get Started']");
	
	public PortalPage_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginPageTile() {
		return driver.getTitle();
	}
	
	public void getStarted() {
		getStartedBtn.click();
	}
}
