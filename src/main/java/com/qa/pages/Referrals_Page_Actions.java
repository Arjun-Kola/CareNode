package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.Base.Base_Class;

import io.cucumber.java.en.Then;

public class Referrals_Page_Actions extends Base_Class {

	
	 WebDriver driver;
	
	 public Referrals_Page_Actions()
	 {
		 driver = Base_Class.driver;	 
	 }
	
	 @FindBy(xpath = "//*[@id=\"first-name\"]")
	 WebElement First_Name;
	 
	 @FindBy(xpath = "//*[formcontrolname=\"lastName\"]")
	 WebElement Last_Name;
	 
	 @FindBy(xpath = "//*[@id=\"ddlLoginType\"]")
	 WebElement SelectUserType;
	 
	 @FindBy(xpath = "//*[@id=\"ddlLanguage\"]")
	 WebElement Language;
	 
	
	 
	 public void Enter_Data_To_Text_Field()
	 {
		 
		 // Enter data to First Name field
		 	
		 	
		 
		 
		 
		 
		 
		 
	 }
	 
	
}
