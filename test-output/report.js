$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customers.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "search customer by Email Id",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launching chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "DefinitionSteps.user_launching_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "DefinitionSteps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "DefinitionSteps.user_enters_email_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "DefinitionSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can view Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "DefinitionSteps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click customer menu",
  "keyword": "When "
});
formatter.match({
  "location": "DefinitionSteps.user_click_customer_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click customer menu items",
  "keyword": "And "
});
formatter.match({
  "location": "DefinitionSteps.click_customer_menu_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter customer email id",
  "keyword": "And "
});
formatter.match({
  "location": "DefinitionSteps.enter_customer_email_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customer search button",
  "keyword": "When "
});
formatter.match({
  "location": "DefinitionSteps.click_on_customer_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should found customer email id in the search table",
  "keyword": "Then "
});
formatter.match({
  "location": "DefinitionSteps.user_should_found_customer_email_id_in_the_search_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "DefinitionSteps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});