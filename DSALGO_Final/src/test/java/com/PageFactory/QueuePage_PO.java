package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage_PO {
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Implementation of Queue in Python']")WebElement impofqueinpython;
	@FindBy(xpath="//a[text()='Implementation using collections.deque']")WebElement impcollectdeque;
	@FindBy(xpath="//a[text()='Implementation using array']")WebElement impusingarray;
	@FindBy(xpath="//a[text()='Queue Operations']")WebElement queueoperations;
	@FindBy (linkText = "Practice Questions") WebElement practicequestions;

	public QueuePage_PO(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);}
	
	public void subModuleClick1(String name) {
		switch(name) {
		
		case "Implementation of Queue in Python":impofqueinpython.click();break;
		case "Implementation using collections.deque":impcollectdeque.click();break;
		case "Implementation using array":impusingarray.click();System.out.println("Opening Implementation array link");break;
		case "Queue Operations":queueoperations.click();break;
		case "Practice Questions":practicequestions.click();break;
		}
	}
}
