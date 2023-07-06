package com.PageFactory;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage_PO {
	public WebDriver driver;
	
	@FindBy (xpath = "//h5[text()='Data Structures-Introduction']/..//a[text()='Get Started']") WebElement dataStrGetStarted;
	@FindBy (xpath = "//div[@class='alert alert-primary']") WebElement errormsg1;
	@FindBy (xpath = "//h5[text()='Array']/..//a[text()='Get Started']") WebElement arrayGetStarted;
	@FindBy (xpath = "//h5[text()='Linked List']/..//a[text()='Get Started']") WebElement linkListGetStarted;
	@FindBy (xpath = "//h5[text()='Stack']/..//a[text()='Get Started']") WebElement stackGetStarted;
	@FindBy (xpath = "//h5[text()='Queue']/..//a[text()='Get Started']") WebElement queueGetStarted;
	@FindBy (xpath = "//h5[text()='Tree']/..//a[text()='Get Started']") WebElement treeGetStarted;
	@FindBy (xpath = "//h5[text()='Graph']/..//a[text()='Get Started']") WebElement graphGetStarted;
	@FindBy (xpath = "//a[text()='Sign in']") WebElement signInBtn;
	@FindBy (xpath = "//a[text()=' Register ']") WebElement registerBtn;
	@FindBy (linkText = "Data Structures") WebElement mainDropDown;
	@FindBy (linkText = "Arrays") WebElement arrayDropDown;
	@FindBy (linkText = "Linked List") WebElement linkedListDropDown;
	@FindBy (linkText = "Stack") WebElement stackDropDown;
	@FindBy (linkText = "Queue") WebElement queueDropDown;
	@FindBy (linkText = "Tree") WebElement treeDropDown;
	@FindBy (linkText = "Graph") WebElement graphDropDown;
	
	
	public HomePage_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickGetStarted(String option) {
		
		switch(option) {
		case "Datastructures": 
			dataStrGetStarted.click();break;
		case "Arrays": 
			arrayGetStarted.click();break;
		case "Linkedlist": 
			linkListGetStarted.click();break;
		case "Stack": 
			stackGetStarted.click();break;
		case "Queue": 
			queueGetStarted.click();break;
		case "Tree": 
			treeGetStarted.click();break;
		case "Graph": 
			graphGetStarted.click();break;
		
		}
	}
	public String errormsg1() {
		return errormsg1.getText();
	}
	public void signIn() {
		signInBtn.click();
	}
	
	public void register() {
		registerBtn.click();
	}
	
	public void mainDropDown() {
		mainDropDown.click();
	}
	
	public void dropDownSelection(String option) {
		switch(option) {
		case "Arrays": 
			arrayDropDown.click();break;
		case "Linked List": 
			linkedListDropDown.click();break;
		case "Stack": 
			stackDropDown.click();break;
		case "Queue": 
			queueDropDown.click();break;
		case "Tree": 
			treeDropDown.click();break;
		case "Graph": 
			graphDropDown.click();break;
		}
	}
	
}
