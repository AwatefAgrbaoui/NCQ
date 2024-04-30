package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LoginPage {
	private ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.ID, using = "user-name")
	public static WebElement username;
	@FindBy(how = How.ID, using = "password")
	public static WebElement password;
	@FindBy(how = How.ID, using = "login-button")
	public static WebElement btn_login;
	@FindBy(how = How.XPATH, using = "//div[@class='app_logo']")
	public static WebElement title_page;
	@FindBy(how = How.XPATH, using = "//h3[@data-test='error']")
	public static WebElement msg_error;
	
	public LoginPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/*Create Method*/	
	public void go_to_url() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
	}
	public void fill_username(String name ) {	
		username.sendKeys(name);
	}
	public void fill_password(String passwordText ) {
		password.sendKeys(passwordText);
	}
	public void click_on_button_login() throws InterruptedException {
		Thread.sleep(3000);
		btn_login.click();
	}
}
