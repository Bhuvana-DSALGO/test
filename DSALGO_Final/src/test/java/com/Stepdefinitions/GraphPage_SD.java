package com.Stepdefinitions;
import org.junit.Assert;
import com.PageFactory.*;
import com.qa.factory.DriverFactory;
import com.qa.util.Loggerload;

import io.cucumber.java.en.*;

public class GraphPage_SD {

	private GraphPage_PO gp = new GraphPage_PO(DriverFactory.getDriver());
	private LoginPage_PO lp = new LoginPage_PO(DriverFactory.getDriver());
	
	@When("The user clicks {string} sub link of Graph Page")
	public void the_user_clicks_sub_link_of_graph_page(String subLink) {
		Loggerload.info("User is in Graph Module");
	    gp.subLinkClick(subLink);
	}
	
	@Then("The user should be directed to {string} of Graph Page")
	public void the_user_should_be_directed_to_of_graph_page(String expectedTitle) {
		Assert.assertEquals(expectedTitle,DriverFactory.getdriverTitle());
	}
	
	@Given("The user is on the {string} sub link of Graph page")
	public void the_user_is_on_the_sub_link_of_graph_page(String subLink) {
	    gp.subLinkClick(subLink);
	}
	
	@Then("The user clicks Sign Out button")
	public void the_user_clicks_sign_out_button() {
		lp.clickLogoutBtn();
	}
}
