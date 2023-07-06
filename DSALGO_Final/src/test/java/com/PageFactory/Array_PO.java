package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Array_PO {

	@FindBy (xpath ="//a[@data-toggle='dropdown']") WebElement dd;
	@FindBy (xpath = "//*[text()='Arrays']") WebElement arraydd;
	@FindBy (xpath = "//*[text()='Arrays in Python']") WebElement Ainpy;
	@FindBy (xpath = "//form[@id='answer_form']/div/div/div/textarea") WebElement arinput;  
	@FindBy (id = "output") WebElement aroutput;
	@FindBy (xpath = "//*[text()='Arrays Using List']") WebElement arlist;
	@FindBy (xpath = "//*[text()='Basic Operations in Lists']") WebElement aroper;
	@FindBy (xpath = "//*[text()='Applications of Array']") WebElement appar;
	@FindBy (xpath = "//*[text()='Practice Questions']") WebElement pq;
	@FindBy (xpath = "//input[@value='Submit']") WebElement submitbtn; 
	@FindBy (xpath = "//*[text()='Search the array']" ) WebElement pq1;
	@FindBy (xpath = "//*[text()='Max Consecutive Ones']") WebElement pq2;
	@FindBy (xpath = "//*[text()='Find Numbers with Even Number of Digits']") WebElement pq3;
	@FindBy (xpath = "//*[text()='Squares of  a Sorted Array']") WebElement pq4;
	
	public Array_PO (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void dropdown() throws InterruptedException {
		dd.click();
		}
	
	public void array() throws InterruptedException {
		arraydd.click();
		}
	
	public void Ain_pyth() {
		Ainpy.click();	
		}
	
	public void ar_input(String pythoncode) {
		arinput.sendKeys(pythoncode);
		System.out.println(pythoncode); 
		}
	
	public  void ar_output() {
		 aroutput.getText();	
		System.out.println(aroutput.getText());	
		}	
	
	public void ar_list() {
		arlist.click();	
		}
	
	public void ar_oper() {
		aroper.click();	
		}
	
	public void app_ar() {
		appar.click();	
		}
	
	public void submit() {
		submitbtn.click();	
		}
	
	public void ar_PQinput(String pythoncode,String output) {
		arinput.sendKeys(pythoncode);
		System.out.println(pythoncode); 
		}
	
	public void a_PQ() {
		pq.click();	
		}
	
	public void a_PQ1() {
		pq1.click();	
		}
	
	public void a_PQ2() {
		pq2.click();	
		}
	
	public void a_PQ3() {
		pq3.click();	
		}
	
	public void a_PQ4() {
		pq4.click();	
		}
	
}