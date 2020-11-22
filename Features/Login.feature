
Feature: Login

 
  Scenario: Successful login with valid credentials
    Given user launching chrome browser
    When user opens URL "http://admin-demo.nopcommerce.com/login"
    And user enters email "admin@yourstore.com" and password as "admin"
    And click on login button
    Then Page Title should be "Dashboard / nopCommerce administration"
    When user click on Logout link
    Then Page Title should be "Your store. Login"
    And close browser

	Scenario Outline:Login Login DataDriven
	Given user launching chrome browser
    When user opens URL "http://admin-demo.nopcommerce.com/login"
    And user enters email "<email>" and password as "<password>"
    And click on login button
    Then Page Title should be "Dashboard / nopCommerce administration"
    When user click on Logout link
    Then Page Title should be "Your store. Login"
    And close browser
    
    Examples:
    |email|password|
    |admin@yourstore.com|admin|
    |admin1@yourstore.com|admin|
    
	