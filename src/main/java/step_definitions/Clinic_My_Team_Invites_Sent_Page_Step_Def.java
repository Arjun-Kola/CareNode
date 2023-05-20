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


public class Clinic_My_Team_Invites_Sent_Page_Step_Def extends Base_Class{

	 WebDriver driver;
	 WebDriverWait wait;
	 Object_Repository repo;
	 
	 All_Pages_Common_Step_Def AllPages_Obj;
	 
 
	 @Before
	 public void before_Scenario()
	 {
		 driver 		= get_driver();
		 wait 			= get_explicitWait();
		 repo 			= new Object_Repository();
		 AllPages_Obj = new All_Pages_Common_Step_Def();
		 
	 }
	 
	 
	 
	 
	 
	 
	 @Then ("Validate invited user Name and Email is displayed")
     public void validate_invited_user_and_is_displayed() 
	 {
		 String Expected_Name = AllPages_Obj.Random_text;
		  
		 WebElement Name = driver.findElement(By.xpath("//*[contains(text(),'"+ Expected_Name + "')]"));
		 String Actual_Name = Name.getText();
	     	  
	     		Assert.assertEquals(Actual_Name, Expected_Name);
		     	
	     		
	     		
	     		String Expected_Email = AllPages_Obj.Email; 
	     		
	    		 WebElement Email = driver.findElement(By.xpath("//*[contains(text(),'"+ Expected_Email + "')]"));
	    		 String Actual_Email = Name.getText();
	    	     	  
	    	     		Assert.assertEquals(Actual_Email, Expected_Email);
     	
	  	
     	
	    	     		
     
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 /***************************************************************************************
	  * 						Validations 												*
	  * 																					*
	  ***************************************************************************************/
	
	 
	 
	 
	
}
