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


public class Clinic_Referrals_Create_New_Referrals_Page_Step_Def extends Base_Class{

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
	 
	 
	 
	 
	 
	 
	 
	
	 @Given("User selects the Choose Referring Doctor dropdown value {string}")
	 public void user_selects_the_choose_referring_doctor_dropdown_value(String DD_Value) 
	 {
		 ThreadSleep(3000);
		 
		 WebElement ChooseReferringDoctor = driver.findElement(By.xpath("//select[@name='referringDoctorId']"));
		 
		 Dropdown_Select_ByVisibileText(ChooseReferringDoctor, DD_Value); 
		 
	 }
	 
	 
	 
	 
	 

	
	 
}
