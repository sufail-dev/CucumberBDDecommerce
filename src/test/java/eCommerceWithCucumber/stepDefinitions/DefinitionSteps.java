package eCommerceWithCucumber.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import eCommerceWithCucumber.pageObjects.AddCustomerPage;
import eCommerceWithCucumber.pageObjects.LoginPage;



public class DefinitionSteps extends BaseClass {
	
	@Given("user launching chrome browser")
	public void user_launching_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
	    lp=new LoginPage(driver);
	}

	@When("user opens URL {string}")
	public void user_opens_URL(String url) {
	   driver.get(url);
	}

	@When("user enters email {string} and password as {string}")
	public void user_enters_email_and_password_as(String email, String password) {
	   lp.setUserName(email);
	   lp.setPassword(password);
	}

	@When("click on login button")
	public void click_on_login_button() {
	   lp.clickLogin();
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) {
		
	    if(driver.getPageSource().contains("Login was successful")) {
	    	driver.close();
	    	Assert.assertTrue(false);
	    }else {
	    	Assert.assertEquals(title, driver.getTitle());
	    }
	}

	@When("user click on Logout link")
	public void user_click_on_Logout_link() throws InterruptedException {
	    lp.logout();
	    Thread.sleep(2000);
	}


	@Then("close browser")
	public void close_browser() {
	   driver.close();
	}
	
	//ADD NEW CUSTOMER DETAILS
	@Then("user can view Dashboard")
	public void user_can_view_Dashboard() {
	    addCust=new AddCustomerPage(driver);
	    Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
	}

	@When("user click customer menu")
	public void user_click_customer_menu() throws InterruptedException {
		Thread.sleep(2000);
	    addCust.clickOnCutomerMenu();
	}

	@When("click customer menu items")
	public void click_customer_menu_items() throws InterruptedException {
		Thread.sleep(2000);
		addCust.clickOnCutomerMenuItem();
	}

	@When("click on add new button")
	public void click_on_add_new_button() throws InterruptedException {
		addCust.clickOnbtnaddNew();
		Thread.sleep(2000);
	}

	@Then("user can view add new Customer page")
	public void user_can_view_add_new_Customer_page() {
	   Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
	}

	@When("user enters customer info")
	public void user_enters_customer_info() throws InterruptedException {
	  String email=randomString()+"@gmail.com";
	  addCust.setEmail(email);
	  addCust.setPassword("sufail");
	  addCust.setCustomerRoles("Guest");
	  Thread.sleep(2000);
	  addCust.setMnagerOfVendor("Vendor 2");
	  addCust.setGender("Male");
	  addCust.setFirstName("sufail");
	  addCust.setLastName("s");
	  addCust.setDOB("22/07/1995");
	  addCust.setCompanyName("cognizant");
	  addCust.setAdminContent("this is required");
	  
	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
	   addCust.clickOnSave();
	   Thread.sleep(2000);
	}

	@Then("user can view confirmation message as {string}")
	public void user_can_view_confirmation_message_as(String message) {
	   Assert.assertTrue(driver.getPageSource().contains("The new customer  has been added successfully"));
	   
	}
	
}
