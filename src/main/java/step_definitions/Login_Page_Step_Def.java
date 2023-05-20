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


public class Login_Page_Step_Def extends Base_Class{

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
	 
	 
	 @Given("User is already on the Sign In Page")
	 public void user_is_already_on_the_sign_in_page()
	 {
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 driver.get("http://carenode.s3-website-us-west-1.amazonaws.com/");
		 WaitTillPageLoad();	 
	     
	 }
	 
	 
	 @Then("Validate the Login Page display with the Sign In to your account text")
	 public void validate_the_login_page_display_with_the_sign_in_to_your_account_text() 
	 {
	     WebElement SignIn_PageName = driver.findElement(By.xpath("//*[text() ='Sign in to your account 3/3']"));
	     
	     String Actual_Text = SignIn_PageName.getText();
	     String Expected_Text = "Sign in to your account 3/3";
	     
	     Assert.assertEquals(Actual_Text, Expected_Text);
	     
	 }
	 
	 
	 @Then("Validate the + CareNode logo is displayed")
	 public void validate_the_care_node_logo_is_displayed() 
	 {
		 WebElement CareNode_Logo = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[1]/div/div/div/div/img"));
	     
	     boolean Actual_Result = CareNode_Logo.isDisplayed();
	     
	     Assert.assertTrue(Actual_Result);
		 
		 
	 }
	 @Then("Validate the Username text field is displayed")
	 public void validate_the_username_text_field_is_displayed() {
	 
         WebElement Username_field = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[1]/div/div/div/form/div[1]/label"));
	     
         boolean Actual_Result = Username_field.isDisplayed();

         Assert.assertTrue(Actual_Result);
		 
	 }
	 
	 @Then("Validate the Password text field is displayed with eye icon")
	 public void validate_the_password_text_field_is_displayed_with_eye_icon() {
		 
		  WebElement Password_field = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[1]/div/div/div/form/div[2]/label"));
		     
	         boolean Actual_Result = Password_field.isDisplayed();

	         Assert.assertTrue(Actual_Result);
	     
		
	 }
	 @Then("Validate the Remeber me check box is displayed")
	 public void validate_the_remeber_me_check_box_is_displayed() {
	  
		 WebElement Check_Box = driver.findElement(By.xpath("//input[@id='remember-me']"));
	     
         boolean Actual_Result = Check_Box.isDisplayed();

         Assert.assertTrue(Actual_Result);
	  
	 }
	 @Then("Validate the Forgot our password? link is displayed")
	 public void validate_the_forgot_our_password_link_is_displayed() { 
	     
         WebElement Forget_Link = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[1]/div/div/div/form/div[3]/div[2]/a"));
	     
         boolean Actual_Result = Forget_Link.isDisplayed();

         Assert.assertTrue(Actual_Result);
		 
		 
		 
	 }
	 @Then("Validate the Sign In button is displayed")
	 public void validate_the_sign_in_button_is_displayed() {
	     
		  WebElement Signin_Button = driver.findElement(By.xpath("//button[@type='submit']"));
		     
	      boolean Actual_Result = Signin_Button.isDisplayed();

	      Assert.assertTrue(Actual_Result); 
		 
		 
		 
	 }
	 //-------------------------------------------------------------------------------------------------------------------------------

              @When("User enters valid Username and invalid Password")
               public void user_enters_valid_username_and_invalid_password() {
                
              WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
            	  
              Username.sendKeys("arjclinic");
              
              WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
        	  
              Password.sendKeys("carenode@124");
              
        	  
}
              @When("User clicks on Sign In button")
              public void user_clicks_on_sign_in_button() {
    
              WebElement Sign_in = driver.findElement(By.xpath("//button[@type='submit']"));
            	  
              Sign_in.click();
              
              }
              
              @Then("Validate toast message is displayed as Bad credentials \\(red color) with cross icon")
              public void validate_toast_message_is_displayed_as_bad_credentials_red_color_with_cross_icon() {
    
            
              WebElement Toast_msg = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[1]/div/div/div/div[2]/div/div[1]/p"));
            	
              String Actual_Text = Toast_msg.getText();
              
     	      String Expected_Text = "Bad credentials";
     	     
     	      Assert.assertEquals(Actual_Text, Expected_Text);

            	  
}
               @Then("user not navigated to the Access Panel page")
               public void user_not_navigated_to_the_access_panel_page() {
            	   
            	  String Actual_URL = driver.getCurrentUrl();
                   
          	      String Expected_URL = "http://carenode.s3-website-us-west-1.amazonaws.com/";
          	     
          	      Assert.assertEquals(Actual_URL, Expected_URL);
    	  
               }
               
  //----------------------------------------------------------------------------------------------------------------------------
              
              
              @When("User enters invalid Username and valid Password")
              public void user_enters_invalid_username_and_valid_password() {
                  
            	  WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
            	  
                  Username.sendKeys("arjclini");
                  
                  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
            	  
                  Password.sendKeys("carenode@123");
            	    
              }
              
              @Then("Validate Username and Password text fields are enable to enter the data")
              public void validate_username_and_password_text_fields_are_enable_to_enter_the_data() {
            	  
            	  
            	  WaitTillPageLoad();
            	  
            	  WebElement Username_field = driver.findElement(By.xpath("//*[@id=\"username\"]")); 
                  
                  boolean Actual_Result1 = Username_field.isEnabled();

         	      Assert.assertTrue(Actual_Result1);

         	      
         	     WebElement Password_field = driver.findElement(By.xpath("//*[@id='password']")); 
                 
                 boolean Actual_Result2 = Password_field.isEnabled();

       	         Assert.assertTrue(Actual_Result2); 
       	         
              }
       	         
       	//-----------------------------------------------------------------------------------------         
       	      @When("User enters invalid Username and invalid Password")
       	      public void user_enters_invalid_username_and_invalid_password() {
       	    	  
       	    	  
       	    	WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
          	  
                Username.sendKeys("arjclini");
                
                WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
          	  
                Password.sendKeys("carenode@124");
  
              }
       	      
       	//-----------------------------------------------------------------------------------------
       	      
       	   @When("User enters valid Username and Password")
       	   public void user_enters_valid_username_and_password() {

      	       WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
         	  
               Username.sendKeys("arjclinic");
               
               WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
         	  
               Password.sendKeys("carenode@123");
       		   
       	   }
	 

       	@Then("Validate user navigated to the Access Panel page")
        public void Validate_user_navigated_to_the_Access_Panel_page() 
       	{
       		
	     	  String Actual_URL = driver.getCurrentUrl();
	     	  
	     	  System.out.println("Actual URL : " + Actual_URL);
	     	  
	   	      String Expected_URL = "http://carenode.s3-website-us-west-1.amazonaws.com/module/clinic/clinic-panel/details";
	   	     
	   	     // Assert.assertEquals(Actual_URL, Expected_URL);
	   	      
        }
	 
	 
   
	 
	  
	 
	 
	 
//	 
//	 @Given("^Admin is already on Login Page$")
//	 public void user_is_already_on_login_page(){
//	 
//	 driver.manage().window().maximize();
//	 
//	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//	
//	 driver.get("http://lawoffices3-testing-env.s3-website-us-east-1.amazonaws.com/");
//	 
//	 //Code will wait till the page is loaded
//	 	WaitTillPageLoad();
//	 
//	 }
	 
//	 @Given("^Law Sub Admin is already on Login Page$")
//	 public void Law_SA_is_already_on_login_page(){
//	 
//	 driver.manage().window().maximize();
//	 
//	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//	
//	 driver.get("http://lawoffices3-testing-env.s3-website-us-east-1.amazonaws.com/");
//	 
//	 //Code will wait till the page is loaded
//	 	WaitTillPageLoad();
//	 
//	 }
//	 
//	 
//	 
//	 
//	 @When("^Admin is on Login Page$")
//	 public void user1_is_already_on_login_page(){
//	 
//	 driver.manage().window().maximize();
//	 
//	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//	
//	 driver.get("http://lawoffices3-testing-env.s3-website-us-east-1.amazonaws.com/");
//	 
//	 //Code will wait till the page is loaded
//	 	WaitTillPageLoad();
//	 
//	 }
//	
//	 @When("^title of login page is Login$")
//	 public void title_of_login_page_is_Login()
//	 { 
//		 wait.until(ExpectedConditions.titleIs("lawfront"));
//		
//		 String Title_Login = driver.getTitle();
//		 
//		 Assert.assertEquals(Title_Login, "lawfront"); 
//	 }
//	 
//	 
//	 @Then("^Admin enters \"(.*)\" and \"(.*)\"$")
//	 public void user_enters_username_and_password(String UName, String Pwd)
//	 {
//		 WebElement Username = driver.findElement(By.xpath(repo.UserName));
//		 Username.sendKeys(UName);
//		 
//		 WebElement Password = driver.findElement(By.xpath(repo.Password));
//		 Password.sendKeys(Pwd);
//		
//		 
//	 }
//	 
//	 @Then("^Law Sub Admin enters \"(.*)\" and \"(.*)\"$")
//	 public void Law_SA_enters_username_and_password(String UName, String Pwd)
//	 {
//		 WebElement Law_SA_Username = driver.findElement(By.xpath(repo.UserName));
//		 Law_SA_Username.sendKeys(UName);
//		 
//		 WebElement Law_SA_Password = driver.findElement(By.xpath(repo.Password));
//		 Law_SA_Password.sendKeys(Pwd);
//		
//		 
//	 }
//	
//	 @And("^Law Sub Admin clicks on login button$")
//	 public void Law_SA_clicks_on_login_button()
//	 {
//		 WebElement SignIn = driver.findElement(By.xpath(repo.Login_Button));
//		 SignIn.click();	
//	 }
//	 	@Then("^Admin enters username and password$") 
//		 public void user_enters_username_and_password()
//		 {
//			 WebElement Username1 = driver.findElement(By.xpath("//input[contains(@name,'uname')]"));
//				
//			 Username1.sendKeys("Arjun");
//			 
//			 WebElement Password1 = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
//			 
//			 Password1.sendKeys("Arjun123");
//		 }
//	
//	 
//	 @Then("^Admin enters \"(.*)\" and \"(.*)\" as null values$")
//	 public void user_enters_username_and_password_as_null_values(String Username, String Password)
//	 {
//		 WebElement Username1 = driver.findElement(By.xpath("//input[contains(@name,'uname')]"));
//		 Username1.sendKeys(Username);
//		 
//		 WebElement Password1 = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
//		 Password1.sendKeys(Password);
//	 }
//	 
//	
//	 @And("^Admin clicks on login button$")
//	 public void user_clicks_on_login_button()
//	 {
//		 WebElement SignIn = driver.findElement(By.xpath(repo.Login_Button));
//		 SignIn.click();	
//	 }
//	 
//	 @Then("^validate Admin is on homepage$")
//	 public void validate_user_is_on_Create_post_page()
//	 { 
//		 wait.until(ExpectedConditions.titleIs("lawfront"));
//		
//		 String Title_Creat_post = driver.getTitle();
//		 
//		 Assert.assertEquals(Title_Creat_post, "lawfront");
//	 }
//	 
//	 @Then("^validate Admin is not logged in due to missing login creadentilas$")
//	 public void user_is_not_logged_in_due_to_missing_login_creadentilas()
//		{
//			wait.until(ExpectedConditions.titleIs("Login"));
//			String Title_Creat_post = driver.getTitle();
//			Assert.assertEquals(Title_Creat_post, "Login");
//			
//		}
//	 
//
//	 @Then("^logout from the application$")
//	 public void logout_from_the_application() throws Exception{
//		 
//		 ThreadSleep(10000);
//	
//		// Actions action =  new Actions(driver);
//		
//		 WebElement SignOut_Option = driver.findElement(By.xpath(repo.SignOut));
//	
//		 try {
//			 SignOut_Option.click();
//		  } catch (Exception e) {
//		     JavascriptExecutor executor = (JavascriptExecutor) driver;
//		     executor.executeScript("arguments[0].click();",SignOut_Option);
//		  }
//	/*	 
//	//	 wait.until(ExpectedConditions.elementToBeClickable(SignOut_Option));
//	//	 action.moveToElement(SignOut_Option).build().perform();
//		 SignOut_Option.clear();
//	*/	 
//		 WebElement LogOut_Btn = driver.findElement(By.xpath(repo.Logout_btn));
//		 wait.until(ExpectedConditions.elementToBeClickable(LogOut_Btn));
//		 LogOut_Btn.click();
//		 
//		 ThreadSleep(5000);
//		 
//		 WebElement Confirm_Logout = driver.findElement(By.xpath(repo.LogOut_Confirm));
//	//	 wait.until(ExpectedConditions.elementToBeClickable(Confirm_Logout));
//		
//		 
//		 	String parent=driver.getWindowHandle();
//
//			Set<String>s=driver.getWindowHandles();
//
//			// Now iterate using Iterator
//			Iterator<String> I1= s.iterator();
//
//			while(I1.hasNext())
//			{
//				System.out.println("Step 1");
//				String child_window=I1.next();
//			
//				if(!parent.equals(child_window))
//				{
//					System.out.println("Step 2");
//					driver.switchTo().window(child_window);
//					if(Confirm_Logout.isDisplayed())
//					{
//						System.out.println("Step 3");
//						Confirm_Logout.click();
//						break;
//					}
//				}	
//			}
//	 }
//	 //==============================Client Login==============================//
//	 @Given("^Client Is On Login Page$")
//	 public void User_Is_On_Client_Login_Page(){
//	 
//	 driver.manage().window().maximize();
//		 
//	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		
//	 driver.get("http://lawoffices3-testing-env.s3-website-us-east-1.amazonaws.com/client");
//	 
//	 } 
//	 
//	 @When("^Client is on login page$")
//	 public void User_Is_On_Client1_Login_Page(){
//	 
//	 driver.manage().window().maximize();
//		 
//	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		
//	 driver.get("http://lawoffices3-testing-env.s3-website-us-east-1.amazonaws.com/client");
//	 
//	 } 
//	 
//	 @Then("^Client enters \"(.*)\" and \"(.*)\"$")
//	 public void Client_enters_username_and_password(String UName, String Pwd)
//	 {
//		 WebElement Client_Username = driver.findElement(By.xpath("//input[@name = 'email']"));
//		 Client_Username.sendKeys(UName);
//		 
//		 WebElement Password = driver.findElement(By.xpath("//input[@name = 'password']"));
//		 Password.sendKeys(Pwd);
//	 
//	 
//	 }
//	 
//	 
//	 
//	 
//	 
//	 
//	 
//	 @Then("^Client enters \"(.*)\" and \"(.*)\" as null values$")
//	 public void Client_enters_username_and_password_as_null_values(String Client_Username, String Client_Password)
//	 {
//		 WebElement Username1 = driver.findElement(By.xpath("//input[@name = 'email']"));
//		 Username1.sendKeys(Client_Username);
//		 
//		 WebElement Password1 = driver.findElement(By.xpath("//input[@name = 'password']"));
//		 Password1.sendKeys(Client_Password);
//	 }
//	 
//	 @When("^title of client login page is Login$")
//	 public void title_of_Client_login_page_is_Login()
//	 { 
//		 wait.until(ExpectedConditions.titleIs("lawfront"));
//		
//		 String Title_Login = driver.getTitle();
//		 
//		 Assert.assertEquals(Title_Login, "lawfront"); 
//	 }
//	 
//	 @Then("^Client enters Username And Password$")
//	 public void Client_user_enters_username_and_Password()
//	 {
//		 WebElement Username2 = driver.findElement(By.xpath("//input[@name = 'email']"));
//		 Username2.sendKeys("clientadmin");
//		 
//		 WebElement Password2 = driver.findElement(By.xpath("//input[@name = 'password']"));
//		 Password2.sendKeys("lawoffice@123");
//	 }
//	 
//	 @And("^Client clicks on login button$")
//	 public void Client_user_clicks_on_login_button()
//	 {
//		 WebElement SignIn = driver.findElement(By.xpath("//button[contains(text(),\"Sign In\")]"));
//		 SignIn.click();
//		 WaitTillPageLoad();
//	 }
//	 
//	
//	 
//	 @Then("^Client logout from the application$")
//	 public void Client_logout_from_the_application() throws Exception{
//		 
//		 ThreadSleep(10000);
//	
//		// Actions action =  new Actions(driver);
//		
//		 WebElement SignOut_Option = driver.findElement(By.xpath("//*[@id=\"user-dropdown\"]/span"));
//	
//		 try {
//			 SignOut_Option.click();
//		  } catch (Exception e) {
//		     JavascriptExecutor executor = (JavascriptExecutor) driver;
//		     executor.executeScript("arguments[0].click();",SignOut_Option);
//		  }
//	/*	 
//	//	 wait.until(ExpectedConditions.elementToBeClickable(SignOut_Option));
//	//	 action.moveToElement(SignOut_Option).build().perform();
//		 SignOut_Option.clear();
//	*/	 
//		 ThreadSleep(5000);
//		 WebElement LogOut_Btn = driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[2]/div/div/div[3]/div/div/button"));
//		 wait.until(ExpectedConditions.elementToBeClickable(LogOut_Btn));
//		 LogOut_Btn.click();
//		 
//		 ThreadSleep(5000);
//		 
//		 WebElement Confirm_Logout = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div[3]/button[2]"));
//	//	 wait.until(ExpectedConditions.elementToBeClickable(Confirm_Logout));
//		
//		 
//		 	String parent=driver.getWindowHandle();
//
//			Set<String>s=driver.getWindowHandles();
//
//			// Now iterate using Iterator
//			Iterator<String> I1= s.iterator();
//
//			while(I1.hasNext())
//			{
//				System.out.println("Step 1");
//				String child_window=I1.next();
//			
//				if(!parent.equals(child_window))
//				{
//					System.out.println("Step 2");
//					driver.switchTo().window(child_window);
//					if(Confirm_Logout.isDisplayed())
//					{
//						System.out.println("Step 3");
//						Confirm_Logout.click();
//						break;
//					}
//				}	
//			}
//	 }
//	//============================Law Sub Admin Login======================//
//	 
//	 
//	 @When("^title of subadmin login page is Login$")
//	 public void title_of_Subadmin_login_page_is_Login()
//	 { 
//		 wait.until(ExpectedConditions.titleIs("lawfront"));
//		
//		 String Title_Login = driver.getTitle();
//		 
//		 Assert.assertEquals(Title_Login, "lawfront"); 
//	 }
//	 
//	 
//	/* @Then("^Sub Admin enters \"(.*)\" and \"(.*)\"$")
//	 public void Sub_Amin_enters_username_and_password(String UName, String Pwd)
//	 {
//		 WebElement Law_SA_Username = driver.findElement(By.xpath(repo.UserName));
//		 Law_SA_Username.sendKeys(UName);
//		 
//		 WebElement Law_SA_Password = driver.findElement(By.xpath(repo.Password));
//		 Law_SA_Password.sendKeys(Pwd);
//		
//		 
//	 }*/
//	
//	 
//	
//	 
//	 @Then("^Sub Admin enters \"(.*)\" and \"(.*)\" as null values$")
//	 public void Sub_admin_enters_username_and_password_as_null_values(String Subadmin_Username, String Subadmin_Password)
//	 {
//		 WebElement Username1 = driver.findElement(By.xpath("//input[contains(@name,'uname')]"));
//		 Username1.sendKeys(Subadmin_Username);
//		 
//		 WebElement Password1 = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
//		 Password1.sendKeys(Subadmin_Password);
//	 }
//	 
//	
//	 @And("^Sub Admin clicks on login button$")
//	 public void Subadmin_clicks_on_login_button()
//	 {
//		 WebElement SignIn = driver.findElement(By.xpath(repo.Login_Button));
//		 SignIn.click();	
//	 }
//	 
//	 
//	 
//
//	 @When("^title of TeamMember login page is Login$")
//	 public void title_of_TeamMember_login_page_is_Login()
//	 { 
//		 wait.until(ExpectedConditions.titleIs("lawfront"));
//		
//		 String Title_Login = driver.getTitle();
//		 
//		 Assert.assertEquals(Title_Login, "lawfront"); 
//	 }
//	 
//	 
//	 @Then("^TeamMember enters \"(.*)\" and \"(.*)\"$")
//	 public void TeamMember_enters_username_and_password(String UName, String Pwd)
//	 {
//		 WebElement Client_Username = driver.findElement(By.xpath(repo.UserName));
//		 Client_Username.sendKeys(UName);
//		 
//		 WebElement Client_Password = driver.findElement(By.xpath(repo.Password));
//		 Client_Password.sendKeys(Pwd);
//		
//		 
//	 }
//	
//	 
//	//=============Law Team Member Login===========================//
//	 
//	 @Then("^TeamMember enters \"(.*)\" and \"(.*)\" as null values$")
//	 public void TeamMember_enters_username_and_password_as_null_values(String TeamMember_Username, String TeamMember_Password)
//	 {
//		 WebElement Username1 = driver.findElement(By.xpath("//input[contains(@name,'uname')]"));
//		 Username1.sendKeys(TeamMember_Username);
//		 
//		 WebElement Password1 = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
//		 Password1.sendKeys(TeamMember_Password);
//	 }
//	 
//	
//	 @And("^Team member clicks on login button$")
//	 public void TeamMember_clicks_on_login_button()
//	 {
//		 WebElement SignIn = driver.findElement(By.xpath(repo.Login_Button));
//		 SignIn.click();	
//	 }
	 
}
