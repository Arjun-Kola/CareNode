package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.Base.Base_Class;

import PageFactory.Object_Repository;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class All_Pages_Common_Step_Def extends Base_Class{

	 WebDriver driver;
	 WebDriverWait wait;
	 Object_Repository repo;
	 
	 String Random_text;
	 public static String Email;
	 
	 @Before
	 public void before_Scenario()
	 {
		 repo 			= new Object_Repository();
		 driver 		= get_driver();
		 wait 			= get_explicitWait();
		 Random_text 	= Gen_Randome_String();
		 
	 }
	 
	 
	 @When("User clicks on the {string} button")
	 public void user_clicks_on_the_button(String buttonname){
	    
		 WebElement button_loc = driver.findElement(By.xpath("//*[contains(text(),'"+ buttonname +"')]"));
		 
		 button_loc.click();
		 
		 ThreadSleep(5000);
	 }


	 @When("User clicks on the {string} tab")
	 public void user_clicks_on_the_tab(String TabName) {
	     
		 WebElement Tab_Name = driver.findElement(By.xpath("//*[contains(text(),'"+ TabName +"')]"));
		 
		 Tab_Name.click();
		 WaitTillPageLoad();
		 
	 }
	 
	 @When("User enteres valid text in the {string} text field")
	 public void user_enteres_valid_text_in_the_text_field(String Text_FieldName) {
		 
		WebElement Textfield = driver.findElement(By.xpath("//input[@placeholder ='"+ Text_FieldName +"']"));
		 
		 
		 if(Text_FieldName.equals("Name"))
		 {
			 String Name = Random_text;
			 Textfield.sendKeys(Name);
		 }
		 else if(Text_FieldName.equals("Email"))
		 {
			 Email = Random_text + "@yopmail.com";
			 Textfield.sendKeys(Email);
		 }
		 else
		 {
			 
		 }
		 
	 }

	 @When("User selects the {string} dropdown value {string}")
	 public void user_selects_the_valid_dropdown_value_from_dropdown(String DropDown_FieldName, String DD_Value) {
	     
		 ThreadSleep(3000);
		 
		 WebElement DropDown_Field = driver.findElement(By.xpath("//select[@id ='"+DropDown_FieldName+"']"));
		 
		 Dropdown_Select_ByVisibileText(DropDown_Field, DD_Value);
		 
		 ThreadSleep(3000);
		 
		 if(DD_Value.equals("Provider"))
		 {
			 WebElement Speciality_DropDown_Field = driver.findElement(By.xpath("//*[@id=\"relation\"]"));
			 Dropdown_Select_ByVisibileText(Speciality_DropDown_Field, "Endodontist");
		 }
		 else
		 {
			 
		 }

	 }
	
	 
	 /************************************************************************************************************************************
	              						 					Validations 
	 *************************************************************************************************************************************/
	 
	 
	 @Then("Validate user navigated to the {string} page by page name")
	 public void validate_user_navigated_to_the_page_by_page_name(String PageName) {
		 
		 By ele 	= By.xpath("//*[contains(text(),'"+ PageName +"')]");
		 ExplicitWait_VisibilityOfElement(ele);
		 WebElement Page_Name = driver.findElement(ele);
				 
		 String Expected_Text = Page_Name.getText();
		 String Actual_Text = Page_Name.getText();
		 
		 Assert.assertEquals(Actual_Text, Expected_Text);
	 }

	 
	 @Then("Validate user navigated to the {string} page")
	 public void validate_user_navigated_to_the_page(String PageName) {
	    
		 
		 WaitTillPageLoad();
		 String Expected_Page_URL;
		 String Modified_PageNamewithSpace;
		 
		 String PageNameToLowercase = PageName.toLowerCase();
		 
		 if(PageNameToLowercase.contains(" "))
		 {
			 //replace spaces with -
			 Modified_PageNamewithSpace = PageNameToLowercase.replace(" ", "-");
	
			 Expected_Page_URL = "http://carenode.s3-website-us-west-1.amazonaws.com/module/clinic/clinic-home/myteam/"+ Modified_PageNamewithSpace;
			
			 System.out.println("Modified URL " + Modified_PageNamewithSpace);
			 
		 }
		 else
		 {
			 Expected_Page_URL = "http://carenode.s3-website-us-west-1.amazonaws.com/module/clinic/clinic-home/"+ PageName;
				
			 System.out.println("Not Modified URL " + Expected_Page_URL);
		 }
		 
		
		 String Actual_Page_URL 	 = driver.getCurrentUrl();
		 
		 if(Actual_Page_URL.equals(Expected_Page_URL))
		 {
			Assert.assertEquals(Actual_Page_URL, Expected_Page_URL);
		 }
		 else
		 {
			 Expected_Page_URL = Expected_Page_URL.substring(0, Expected_Page_URL.length()-1);
			 Assert.assertEquals(Actual_Page_URL, Expected_Page_URL);
		 }
		 
		 
	 }
	 
	 
	 
	 @Then("Validate user navigated to the {string} tab")
	 public void validate_user_navigated_to_the_tab(String TabName) {
	     
		 WaitTillPageLoad();
		 
		 String TabNameToLowercase = TabName.toLowerCase();
		 
		 String Modified_TabNamewith_RemoveSpace = null;
		 String Expected_Tab_URL;
	 
		 String Actual_Tab_URL 	 = driver.getCurrentUrl();
		 
		 
		 if(TabNameToLowercase.contains(" "))
		 {
			 Modified_TabNamewith_RemoveSpace = TabNameToLowercase.replace(" ", "");
			
			 Expected_Tab_URL = "http://carenode.s3-website-us-west-1.amazonaws.com/module/clinic/clinic-home/"+ Modified_TabNamewith_RemoveSpace;
			
			// System.out.println("Modified URL " + Modified_TabNamewith_RemoveSpace);
			 
		 }
		 else
		 {
			 Expected_Tab_URL = "http://carenode.s3-website-us-west-1.amazonaws.com/module/clinic/clinic-home/"+ TabNameToLowercase;
				
			// System.out.println("Not Modified URL " + Expected_Tab_URL);
		 }
		 
		 Assert.assertEquals(Actual_Tab_URL, Expected_Tab_URL);
		 
		
		 
	 }
	 
	 
	 
	 @Then("Validate user navigated to the {string} sub tab by button {string}")
	 public void validate_user_navigated_to_the_sub_tab(String Subtabname, String ButtonName) 
	 {
		 
		 // Sub tab name validation 
		 WebElement SubTab_Name_ele = driver.findElement(By.xpath("//*[contains(text(),'"+ Subtabname + "')]"));
	     String Actual_TabName_Text = SubTab_Name_ele.getText();
	     String Expected_TabName_Text = Subtabname;
	  
	     		Assert.assertEquals(Actual_TabName_Text, Expected_TabName_Text);
		 
		 
 		 // A button on a sub tab validation
		 WebElement ButtonName_ele = driver.findElement(By.xpath("//*[contains(text(),'"+ ButtonName +"')]"));
	     String Actual_btn_Text 		= 	ButtonName_ele.getText();
	     String Expected_btn_Text 	= 	ButtonName;
	     
	     		Assert.assertEquals(Actual_btn_Text, Expected_btn_Text);
	    }
		
	    
	 
	 @And("^close the browser$")
	 public void close_the_browser()
	 {
		 driver.close();
		 super.driver = null;
		 super.ExplicitWait = null;
	 }
	 
	 
	 
}
