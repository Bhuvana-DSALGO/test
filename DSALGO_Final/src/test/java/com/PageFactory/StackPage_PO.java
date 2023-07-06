package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage_PO {
	public WebDriver driver;

	@FindBy (xpath="//a[text()='Data Structures']")WebElement dropdownmenu;
	@FindBy (xpath="//a[text()='Stack']")WebElement stackindropdown;
	@FindBy (xpath="//a[text()='Operations in Stack']")WebElement operationsinstack;
	@FindBy (xpath="//a[text()='Implementation']")WebElement implementation;
	@FindBy (xpath="//a[text()='Applications']")WebElement Applications;
	@FindBy (xpath="//a[text()='Try here>>>']") WebElement tryhere;
	@FindBy (xpath="//button[text()='Run']") WebElement runbtn;
	@FindBy (xpath ="//form[@id='answer_form']/div/div/div/textarea") WebElement tryeditor;
	@FindBy (id="output")WebElement output;
	@FindBy (xpath ="//a[text()='Practice Questions']") WebElement practicequestions;

	public StackPage_PO(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);}
	
	public void subModuleClick(String name) {
		switch(name) {

		case "Operations in Stack":operationsinstack.click();break;
		case "Implementation":implementation.click();break;
		case "Applications":Applications.click();break;
		case "Practice Questions":practicequestions.click();break;

		}
	}
}
