package com.Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.factory.DriverFactory;

public class TR_PF {
	
	static WebDriver driver = DriverFactory.getDriver();
	
	public void th() {		
		WebElement tryhere1 = driver.findElement(By.xpath("//*[text()='Try here>>>']"));
		tryhere1.click(); 
	}
	
	public void run() {
		WebElement run1 = driver.findElement(By.xpath("//*[text()='Run']"));
		run1.click(); 
	}
		
	public void clear1() {
		WebElement t = driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea"));
		String s = Keys.chord(Keys.CONTROL,"a");
		t.sendKeys(s);
		t.sendKeys(Keys.DELETE);	
	}
	
}

	
	
	
	
	
	

