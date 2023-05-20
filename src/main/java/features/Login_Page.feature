@Login_Page_All_Scenarios
Feature: Property Management Super Admin Login Page Tests

@LoginPage_UI
Scenario: To Validate UI of the Log in page

Given User is already on the Sign In Page
Then Validate the Login Page display with the Sign In to your account text
And Validate the + CareNode logo is displayed
And Validate the Username text field is displayed
And Validate the Password text field is displayed with eye icon
And Validate the Remeber me check box is displayed
And Validate the Forgot our password? link is displayed
And Validate the Sign In button is displayed


@Login_valid_Username_invalid_Password 
Scenario: To validate the Sign In functionality when user populate valid Username  and invalid password

Given User is already on the Sign In Page
When User enters valid Username and invalid Password
And User clicks on Sign In button
Then Validate toast message is displayed as Bad credentials (red color) with cross icon
And user not navigated to the Access Panel page

@Login_invalid_Username_valid_Password 
Scenario: To validate the Sign In functionality when user populate invalid Username  and valid password

Given User is already on the Sign In Page
Then Validate Username and Password text fields are enable to enter the data
When User enters invalid Username and valid Password
And User clicks on Sign In button
Then Validate toast message is displayed as Bad credentials (red color) with cross icon
And user not navigated to the Access Panel page

@Login_invalid_Username_invalid_Password
Scenario: To validate the Sign In functionality when user populate invalid Username  and invalid password

Given User is already on the Sign In Page
Then Validate Username and Password text fields are enable to enter the data
When User enters invalid Username and invalid Password
And User clicks on Sign In button
Then Validate toast message is displayed as Bad credentials (red color) with cross icon
And user not navigated to the Access Panel page


@Login_valid_Username_valid_Password
Scenario: To validate the Sign In functionality when user populate valid Username and Valid Password

Given User is already on the Sign In Page
Then Validate Username and Password text fields are enable to enter the data
When User enters valid Username and Password
And User clicks on Sign In button
Then Validate user navigated to the Access Panel page 


