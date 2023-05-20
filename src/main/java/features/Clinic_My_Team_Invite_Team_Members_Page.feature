@Login_Page_All_Scenarios
Feature: Clinic My Teams tab Invite Team Members page test scenarios

@Clinic_Invite_Sent_Validation_01
Scenario Outline: To validate a new record is added in Invites Sent tab when a new Invite Team Members request is sent

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
When User clicks on the 'Go back' button
Then Validate user navigated to the 'My Team' tab
When User clicks on the 'Invites Sent' tab
Then Validate user navigated to the 'Invites Sent' sub tab by button 'Reinvite'
And Validate invited user Name and Email is displayed

Examples:
    |  	Primary Role 		|
    | 	Admin			 			| 

  
#----------------------------------------------------------------------------------------------------------------------


@Clinic_Reinvite_Email_Sent_02
Scenario Outline: To validate an email sent to the already invited user when user clicks on the Reinvite button 

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
When User clicks on the 'Go back' button
Then Validate user navigated to the 'My Team' tab
When User clicks on the 'Invites Sent' tab
Then Validate user navigated to the 'Invites Sent' sub tab by button 'Reinvite'
When User clicks on the 'Reinvite' button
Then Validate a reinvite mail is sent to the user inbox in email

Examples:
    |  	Primary Role 		|
    | 	Admin			 			|
  
#----------------------------------------------------------------------------------------------------------------------------
 
 
 
  