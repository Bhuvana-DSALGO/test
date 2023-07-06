package com.Stepdefinitions;

import org.junit.Assert;
import com.PageFactory.*;
import com.qa.factory.DriverFactory;
import com.qa.util.Loggerload;

import io.cucumber.java.en.*;

public class TreePage_SD {
	
	TreePage_PO tm=new TreePage_PO(DriverFactory.getDriver());

	
	@Given("The user is on the {string} page of Tree module after logged in")
	public void the_user_is_on_the_after_logged_in(String submodule) {
		Loggerload.info(submodule);
	    tm.subModuleClick(submodule);
	}
	@When("The user clicks on the {string} link of Tree page")
	public void the_user_clicks_on_the_link(String name) {
	    tm.subModuleClick(name);
	}
	@Then("The user should be directed to {string} of tree Page")
	public void the_user_should_be_directed_to_of_tree_page(String expectedTitle) {
		Assert.assertEquals(expectedTitle,DriverFactory.getdriverTitle());
	}
}
