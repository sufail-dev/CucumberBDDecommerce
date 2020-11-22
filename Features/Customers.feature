Feature:Customers
Scenario: Add a new customer
	Given user launching chrome browser
    When user opens URL "http://admin-demo.nopcommerce.com/login"
    And user enters email "admin@yourstore.com" and password as "admin"
    And click on login button
	Then user can view Dashboard
	When user click customer menu
	And click customer menu items
	And click on add new button
	Then user can view add new Customer page
	When user enters customer info
	And click on save button
	Then user can view confirmation message as "The new customer has been added successfully"
	And close browser
	
	Scenario:search customer by Email Id
	Given user launching chrome browser
    When user opens URL "http://admin-demo.nopcommerce.com/login"
    And user enters email "admin@yourstore.com" and password as "admin"
    And click on login button
    Then user can view Dashboard
		When user click customer menu
		And click customer menu items
		And enter customer email id
		When click on customer search button
		Then user should found customer email id in the search table
		And close browser
	
