Feature: AR - Lead Creation

  Scenario: Create a lead as an AR
   Given User navigates to Platform
   When User logs in as an AR
   And User Clicks on Add New Lead
   And Enter New Lead Details
	 Then I submit
	 And The success toast message appears
   
   # Think the first one should be Login as an advisor and add a lead
   # Go through quick quote and then Login as a customer - we can resuse the same logins over and over thanks to multilead
   # Complete FQ as an AR
   # Book an appointment as an AR & Book an appointment as a customer
   #See what else we can do - might be a long one for quick quote, we need to do email testing so figuring that out
   