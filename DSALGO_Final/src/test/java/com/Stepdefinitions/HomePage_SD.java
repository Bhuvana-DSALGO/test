package com.Stepdefinitions ;

import org.junit.Assert;
import com.PageFactory.HomePage_PO;
import com.qa.factory.DriverFactory;
import com.qa.util.Loggerload;
import io.cucumber.java.en.*;

public class HomePage_SD {
	
	private HomePage_PO hp = new HomePage_PO(DriverFactory.getDriver());
	
	@Given("The user opens Home Page")
	public void the_user_opens_home_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		Loggerload.info("User launch home page of an dsalgo project");
	}
	
	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String modulename) {
	    hp.clickGetStarted(modulename);
	    
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {
		String error= hp.errormsg1();
		System.out.println(error);
		Assert.assertEquals(string,error);
	}

	@When("The user clicks Sign in")
	public void the_user_clicks_sign_in() {
	    hp.signIn();
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_sign_in_page(String expectedTitle) {
		Assert.assertEquals(expectedTitle,DriverFactory.getdriverTitle());
	}
	
	@When("The user clicks Register")
	public void the_user_clicks_register() {
		hp.register();
	}
}
