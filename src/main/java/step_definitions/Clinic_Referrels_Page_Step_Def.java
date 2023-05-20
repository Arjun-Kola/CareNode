package step_definitions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.Base.Base_Class;

import PageFactory.Object_Repository;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Clinic_Referrels_Page_Step_Def extends Base_Class{

	 WebDriver driver;
	 WebDriverWait wait;
	 Object_Repository repo;
	 
 
	 @Before
	 public void before_Scenario()
	 {
		 driver 		= get_driver();
		 wait 			= get_explicitWait();
		 repo 			= new Object_Repository();
	 }
	 
	
	 				// 'First Name', 'Last Name', 'DOB', 'Email', 'Phone Number' and 'Home Phone Number'
	 @When("User enters {string}, {string}, {string}, {string}, {string} and {string}")
	 public void user_enters_and(String string, String string2, String string3, String string4, String string5, String string6) 
	 {
	     
		      WebElement FirstName = driver.findElement(By.xpath("(//input[@id='first-name'])[1]")); 
		      FirstName .sendKeys("Firstname");
		      
              WebElement LastName = driver.findElement(By.xpath("(//input[@id='first-name'])[2]")); 
              LastName .sendKeys("LastName");
		    
		      WebElement DateofBirth = driver.findElement(By.xpath("//*[@id=\"datePickerId\"]\r\n"));
		      DateofBirth.click();
		      
		      WebElement DOB = driver.findElement(By.xpath("//span[text()='10']"));
		      DOB.click();
		      
		      WebElement Email = driver.findElement(By.xpath("//*[@id=\"email-address\"]"));
		      Email.sendKeys("email@yopmail.com");
		      
		      WebElement PhNum = driver.findElement(By.xpath("//*[@id=\"phone-number\"]"));
		      PhNum.sendKeys("1234567890");
		      
		      WebElement HomePhNum = driver.findElement(By.xpath("//*[@id=\"home-phonenumber\"]"));
		      HomePhNum.sendKeys("1122334455");
		      
	 }
	 
	 		//'Insurance Name', 'Insurance Plan Name', 'Insurance ID Number', 'Group ID Number', 'Insurance Address Line1',
	 		//		'Address Line 2', 'City', 'Zipcode' and 'Authorization Number(if required)'
	 
	 @When("User enters {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	 public void user_enters_and(String string, String string2, String string3, String string4, String string5,
			 										String string6, String string7, String string8, String string9) {
	    
		 
		 WebElement InsuranceName = driver.findElement(By.xpath("//*[@id=\"insurance-name\"]"));  
		 InsuranceName .sendKeys("InsuranceName");
	      
         WebElement InsurancePlanName = driver.findElement(By.xpath("//*[@id=\"insurance-plan-name\"]")); 
         InsurancePlanName .sendKeys("InsurancePlanName");
	    
	     WebElement InsuranceIDNumber = driver.findElement(By.xpath("//*[@id=\"insurance-idnumber\"]"));
	     InsuranceIDNumber.sendKeys("1122334455");
	      
	     WebElement GroupIDNumber = driver.findElement(By.xpath("//*[@id=\"group-idnumber\"]"));
	     GroupIDNumber.sendKeys("1234566666");
	      
	     WebElement InsuranceAddressLine1 = driver.findElement(By.xpath("//*[@id=\"insuranceDetails\"]/form/div/div/div[4]/div[1]/input"));
	     InsuranceAddressLine1.sendKeys("InsuranceAddressLine1");
	      
	     WebElement AddressLine2 = driver.findElement(By.xpath("//*[@id=\"address-line2\"]"));
	     AddressLine2.sendKeys("AddressLine2");
	     
	     WebElement City = driver.findElement(By.xpath("//*[@id=\"city\"]")); 
	     City .sendKeys("City");
	      
         WebElement Zipcode = driver.findElement(By.xpath("//*[@id=\"postal-code\"]")); 
         Zipcode .sendKeys("123456");
	    
         WebElement AuthorizationNumber = driver.findElement(By.xpath("(//*[@id=\"first-name\"])[3]"));
         AuthorizationNumber.sendKeys("2508199800");
	      
	   	 
	 }
	
}
