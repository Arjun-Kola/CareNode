package step_definitions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
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


public class Clinic_Yopmail_Step_Def extends Base_Class{

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
	 
	
	 @Then("Validate a reinvite mail is sent to the user inbox in email")
	 public void validate_a_reinvite_mail_is_sent_to_the_user_inbox_in_email() { 
		 
		 String EmailID = All_Pages_Common_Step_Def.Email;
		 
		 System.out.println(EmailID);
		 ThreadSleep(3000);
		 
		 Open_a_NewTab("https://yopmail.com/en/");
		 
		 WebElement Emailtextbox = driver.findElement(By.xpath("//input[@id='login']"));
		 Emailtextbox.clear();
		 Emailtextbox.sendKeys(EmailID);
		 
		 WebElement arrow = driver.findElement(By.xpath("//*[@id=\"refreshbut\"]/button/i"));
		 arrow.click();
		 
		 List<WebElement> emails = driver.findElements(By.xpath("//*[text()='navyug.infotech.inc@gmail.com']"));
		 
		 int no_of_emails = emails.size();
		 
		 Assert.assertEquals(no_of_emails, 2, "Email count is not matched to 2");
		 
		 
	 } 
}
