@Login_Page_All_Scenarios
Feature: Property Management Super Admin Login Page Tests

@Create_New_Referral
Scenario: To validate Clinic Admin created a new referral

#Given User is already on the Sign In Page
#Then Validate Username and Password text fields are enable to enter the data
#When User enters valid Username and Password
#And User clicks on Sign In button
#Then Validate user navigated to the Access Panel page
#When User clicks on the 'Access as Admin' button
#Then Validate user navigated to the 'Referrals' tab
#When User clicks on the 'Create New Referral' button
#Then Validate user navigated to the 'Create New Referral' page by page name
#When User enters 'First Name', 'Last Name', 'DOB', 'Email', 'Phone Number' and 'Home Phone Number'
#And User clicks on the 'Insurance Details' button
#And User enters 'Insurance Name', 'Insurance Plan Name', 'Insurance ID Number', 'Group ID Number', 'Insurance Address Line1', 'Address Line 2', 'City', 'Zipcode' and 'Authorization Number(if required)'
#And User selects the 'state' dropdown value 'AZ -Arizona'
#And User clicks on the 'Assign Doctors' button
And User selects the Choose Referring Doctor dropdown value 'Srija P'

#-------------------------------------------------------------------------------------------------------------------------------

Given User is already on the Sign In Page
Then Validate Username and Password text fields are enable to enter the data
When User enters valid Username and Password
And User clicks on Sign In button
Then Validate user navigated to the Access Panel page
When User clicks on the 'Referrals' tab
Then Validate user navigated to the 'Referrals' tab






















