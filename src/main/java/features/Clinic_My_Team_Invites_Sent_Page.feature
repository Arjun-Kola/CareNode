@Login_Page_All_Scenarios
Feature: Clinic My Teams tab Invite Team Members page test scenarios

@Clinic_My_Team_Invitations
Scenario Outline: To validate the My Team member invitation is send successfully for Admin role from Invite Team Member tab

Given User is already on the Sign In Page
Then Validate Username and Password text fields are enable to enter the data
When User enters valid Username and Password
And User clicks on Sign In button
Then Validate user navigated to the Access Panel page
When User clicks on the 'Access as Admin' button
Then Validate user navigated to the 'Referrals' tab
When User clicks on the 'My Team' tab
Then Validate user navigated to the 'My Team' tab
When User clicks on the 'Invite team member' button
Then Validate user navigated to the 'Invite Team Members' page
When User enteres valid text in the 'Name' text field
And User enteres valid text in the 'Email' text field
And User selects the 'Primary Role' dropdown value '<Primary Role>'
When User clicks on the 'Send Invite' button
Then Validate user navigated to the 'Invite Sent' page by page name

Examples:
    |  	Primary Role 		|
    | 	Admin			 			| 
    | 	Clinic Admin 		|
    | 	Provider		 		|
    | 	Clinic Manager	|
    | 	Clinic User 		|
    |	  Guest User		  |
  
 

  
  
  
 
 
 
 
  