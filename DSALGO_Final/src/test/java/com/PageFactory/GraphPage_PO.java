package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.DriverFactory;

public class GraphPage_PO {

	public WebDriver driver;
	
	@FindBy (linkText = "Graph") WebElement graphSubLink;
	@FindBy (linkText = "Graph Representations") WebElement graphRepresentationSubLink;
	@FindBy (linkText = "Practice Questions") WebElement practiceQuestionSubLink;
	
	public GraphPage_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void openPage(String url) {
		String commonurl="https://dsportalapp.herokuapp.com/graph/";
		String url1=url.toLowerCase().replace(" ","-");
		commonurl = commonurl.concat(url1);
		
		DriverFactory.getDriver().get(commonurl);
	}
	
	public void subLinkClick(String option) {
		switch(option) {
		case "Graph": 
			graphSubLink.click();break;
		case "Graph Representations": 
			graphRepresentationSubLink.click();break;
		case "Practice Questions": 
			practiceQuestionSubLink.click();break;
		
		}
	}
}
