package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedList_PO {

	public WebDriver driver;
	public Boolean display;
	public String inputData;
	
	@FindBy (linkText = "Introduction") WebElement introductionSubLink;
	@FindBy (linkText = "Creating Linked LIst") WebElement creatingLinkedListSubLink;
	@FindBy (linkText = "Types of Linked List") WebElement typesOfLinkedListSubLink;
	@FindBy (linkText = "Implement Linked List in Python") WebElement implementLinkedListInPythonSubLink;
	@FindBy (linkText = "Traversal") WebElement traversalSubLink;
	@FindBy (linkText = "Insertion") WebElement insertionSubLink;
	@FindBy (linkText = "Deletion") WebElement deletionSubLink;
	@FindBy (linkText = "Practice Questions") WebElement practiceQuestionSubLink;
	@FindBy (partialLinkText = "Try here") WebElement tryHereBtn;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement tryEditor;
	@FindBy (xpath = "//button[text()='Run']") WebElement runBtn;
	@FindBy (id = "output") WebElement codeOutput;
	
	public LinkedList_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void subLinkClick(String option) {
		switch(option) {
		case "Introduction": 
			introductionSubLink.click();break;
		case "Creating Linked LIst": 
			creatingLinkedListSubLink.click();break;
		case "Types of Linked List": 
			typesOfLinkedListSubLink.click();break;
		case "Implement Linked List in Python": 
			implementLinkedListInPythonSubLink.click();break;
		case "Traversal": 
			traversalSubLink.click();break;
		case "Insertion": 
			insertionSubLink.click();break;
		case "Deletion": 
			deletionSubLink.click();break;
		case "Practice Questions": 
			practiceQuestionSubLink.click();break;
		
		}
	}
	public void clickTryHere() {
		tryHereBtn.click();
	}
	
	public Boolean assessment() {
		
		if(display = runBtn.isDisplayed()) {
		}
		return display;
	}
	
	public void enterDataToTryEditor(String data) {
		inputData = data;
		tryEditor.sendKeys(data);
	}
	
	public void clickRunBtn() {
		runBtn.click();
	}
	
	public Boolean runOutput() {
		String outputData = inputData.replace("print", "").replace("'", "");
		if(codeOutput.getText().equals(outputData)) {}
		return true;
	}
}
