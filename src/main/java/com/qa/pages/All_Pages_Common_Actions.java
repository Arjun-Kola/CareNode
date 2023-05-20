package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.Base.Base_Class;

import io.cucumber.java.en.Then;

public class All_Pages_Common_Actions extends Base_Class {

	
	WebDriver driver;
	
	 public All_Pages_Common_Actions()
	 {
		 driver = Base_Class.driver;	 
	 }
	
	 @FindBy(xpath = "//*[@id=\"username\"]")
	 WebElement YourEmail;
	 
	 @FindBy(xpath = "//*[@id=\"password\"]")
	 WebElement YourPwd;
	 
	 @FindBy(xpath = "//*[@id=\"ddlLoginType\"]")
	 WebElement SelectUserType;
	 
	 @FindBy(xpath = "//*[@id=\"ddlLanguage\"]")
	 WebElement Language;
	 
	 
	
	
	 public void validate_the_login_page_display_the_text(String string) {
	    
		 	
		  
	 }
	 
	 
	 public void enter_login_details_window_with_your_email_and_your_password_text_fields() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }
	 @Then("Select User Type dropdown with values {string} {string} {string} {string} {string}")
	 public void select_user_type_dropdown_with_values(String string, String string2, String string3, String string4, String string5) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }
	 @Then("Select Language dropdown with default value populated with {string}")
	 public void select_language_dropdown_with_default_value_populated_with(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }
	 @Then("Forgot Password link")
	 public void forgot_password_link() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }
	 @Then("Login button displayed")
	 public void login_button_displayed() {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
}
