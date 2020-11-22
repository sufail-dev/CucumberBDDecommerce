package eCommerceWithCucumber.stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import eCommerceWithCucumber.pageObjects.AddCustomerPage;
import eCommerceWithCucumber.pageObjects.LoginPage;
import eCommerceWithCucumber.pageObjects.SearchCustomerPage;

public class BaseClass {
	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage addCust;
	public SearchCustomerPage searchCust;
	public static String randomString() {
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
}
