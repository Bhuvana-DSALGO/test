package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePage_PO {
	
private WebDriver driver;

@FindBy (xpath="//a[text()='Overview of Trees']") WebElement overviewoftrees;
@FindBy (xpath="//a[text()='Terminologies']") WebElement Terminologies;
@FindBy (xpath="//a[text()='Types of Trees']") WebElement TypesofTrees;
@FindBy (xpath="//a[text()='Tree Traversals']") WebElement TreeTraversals;
@FindBy (xpath="//a[text()='Traversals-Illustration']") WebElement TraversalsIllustration;
@FindBy (xpath="//a[text()='Binary Trees']") WebElement BinaryTrees;
@FindBy (xpath="//a[text()='Types of Binary Trees']") WebElement TypesofBinaryTrees;
@FindBy (xpath="//a[text()='Implementation in Python']") WebElement ImplementationinPython;
@FindBy (xpath="//a[text()='Binary Tree Traversals']") WebElement BinaryTreeTraversals;
@FindBy (xpath="//a[text()='Implementation of Binary Trees']") WebElement ImplementationofBinaryTrees;
@FindBy (xpath="//a[text()='Applications of Binary trees']") WebElement ApplicationsofBinarytrees;
@FindBy (xpath="//a[text()='Binary Search Trees']") WebElement BinarySearchTrees;
@FindBy (xpath="//a[text()='Implementation Of BST']") WebElement ImplementationOfBST;
@FindBy (linkText = "Practice Questions") WebElement practicequestions;

	public TreePage_PO(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver,this);
	}
	
	public void subModuleClick(String name) {
	
	switch(name) {
	
	case "Overview of Trees":overviewoftrees.click();break;
	case "Terminologies":Terminologies.click();break;
	case "Types of Trees":TypesofTrees.click();break;
	case "Tree Traversals":TreeTraversals.click();break;
	case "Traversals-Illustration":TraversalsIllustration.click();break;
	case "Binary Trees":BinaryTrees.click();break;
	case "Types of Binary Trees":TypesofBinaryTrees.click();break;
	case "Implementation in Python":ImplementationinPython.click();break;
	case "Binary Tree Traversals":BinaryTreeTraversals.click();break;
	case "Implementation of Binary Trees":ImplementationofBinaryTrees.click();break;
	case "Applications of Binary trees":ApplicationsofBinarytrees.click();break;
	case "Binary Search Trees":BinarySearchTrees.click();break;
	case "Implementation Of BST":ImplementationOfBST.click();break;
	case "Practice Questions":practicequestions.click();
	}
 }
}
