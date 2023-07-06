package com.Stepdefinitions;

import java.util.List;
import org.junit.Assert;
import com.PageFactory.*;
import com.qa.factory.DriverFactory;
import com.qa.util.Loggerload;

import io.cucumber.java.en.*;

public class RegisterPage_SD {
	
	private RegisterPage_PO rp = new RegisterPage_PO(DriverFactory.getDriver());
	private HomePage_PO hp = new HomePage_PO(DriverFactory.getDriver());

	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		Loggerload.info("User in Register page");
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/register");
	}
	
	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_register_button_with_all_fields_empty() {
		rp.registerBtnClick();
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String expectedMsg) { 
		Assert.assertEquals(expectedMsg,rp.displayerror());
	}
	
	@When("The user clicks Register button after entering username with other fields empty")
	public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty(io.cucumber.datatable.DataTable dataTable) {
	   List<String> userName = dataTable.asList(String.class);
	   	rp.enterUserName(userName.get(1));
		rp.registerBtnClick();
	}

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_password_textbox(String expectedMsg) {
		Assert.assertEquals(expectedMsg,rp.displayerror());
	}
	
	@When("The user enters a username with characters other than Letters, digits and special characters")
	public void the_user_enters_a_username_with_characters_other_than_letters_digits_and_special_characters(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		rp.enterUserName(data.get(1).get(0));
		rp.enterPassword(data.get(1).get(1));
		rp.enterConfirmPassword(data.get(1).get(2));
		rp.registerBtnClick();
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String expectedMsg) {
		String error1= hp.errormsg1();
		Assert.assertEquals(expectedMsg,error1);
	}
	
	@When("The user clicks Register button after entering valid username and different passwords in password and password confirmation fields")
	public void the_user_clicks_register_button_after_entering_valid_username_and_different_passwords_in_password_and_password_confirmation_fields(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		rp.enterUserName(data.get(1).get(0));
		rp.enterPassword(data.get(1).get(1));
		rp.enterConfirmPassword(data.get(1).get(2));
		rp.registerBtnClick();
	}
	
	@When("The user enters a valid username and password and password confirmation")
	public void the_user_enters_a_valid_username_and_password_and_password_confirmation(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		rp.enterUserName(data.get(1).get(0));
		rp.enterPassword(data.get(1).get(1));
		rp.enterConfirmPassword(data.get(1).get(2));
		rp.registerBtnClick();
	}
	
	@Then("The user should be redirected to Homepage and pagetitle is {string}")
	public void the_user_should_be_redirected_to_homepage_and_pagetitle_is(String expectedTitle) {
		Assert.assertEquals(expectedTitle,DriverFactory.getdriverTitle());
	}
}
