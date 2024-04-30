package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	private LoginPage loginPage = new LoginPage();

	public LoginStepDefinition() {
		this.loginPage = new LoginPage();
	}

	@Given("I connect to the application Swag Labs")
	public void i_connect_to_the_application_swag_labs() {
		loginPage.go_to_url();
	}

	@When("I enter the username {string}")
	public void i_enter_the_username(String name) {
		loginPage.fill_password(name);
	}

	@When("I enter the password {string}")
	public void i_enter_the_password(String password) {
		loginPage.fill_password(password);
	}

	@When("I click on the button Login")
	public void i_click_on_the_button_login() throws InterruptedException {
		loginPage.click_on_button_login();
	}

	@Then("I am redirected to the home page {string}")
	public void i_am_redirected_to_the_home_page(String text) {
		String message = LoginPage.title_page.getText();
		Assert.assertEquals(message, text);
	}

	@Then("Error message is displayed {string}")
	public void error_message_is_displayed(String error_text) {
		String message_error = LoginPage.msg_error.getText();
		Assert.assertEquals(error_text, message_error);
	}

}
