package eCommerceWithCucumber.pageObjects;
import eCommerceWithCucumber.utilities.waitHelper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage {
	public WebDriver ldriver;
	waitHelper waithelper;
	public SearchCustomerPage(WebDriver rdriver ) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		waithelper=new waitHelper(ldriver);
		
	}
	@FindBy(xpath="//input[@id='SearchEmail']")
	WebElement email;
	@FindBy(xpath="//input[@id='SearchFirstName']")
	WebElement firstName;
	@FindBy(xpath="//input[@id='SearchLastName']")
	WebElement lastname;
	@FindBy(xpath="//button[@id='search-customers']")
	WebElement searchbtn;
	@FindBy(xpath="//select[@id='SearchMonthOfBirth']")
	WebElement month;
	@FindBy(xpath="//select[@id='SearchDayOfBirth']")
	WebElement day;
	@FindBy(xpath="//table[@role='grid']")
	WebElement tableSearchResults;
	@FindBy(xpath="//table[@id='customers-grid']")
	WebElement table;
	@FindBy(xpath="//table[@id='customers-grid']//tbody/tr")
	List<WebElement> tableRows;
	@FindBy(xpath="//table[@id='customers-grid']//tbody/tr/td")
	List<WebElement> tablecolumns;
	
	public void passEmail(String em) {
		email.sendKeys(em);
	}
	public void passFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	public void passLastName(String lastName) {
		lastname.sendKeys(lastName);
	}
	public void clickSearch() {
		searchbtn.click();
		waithelper.waitForElement(searchbtn, 30);
	}
	public int getNoRows() {
		return tableRows.size();
	}
	public int getColumns() {
		return tablecolumns.size();
	}
	
	public boolean searchCustomerEmail(String email) {
		boolean isfound=false;
		for(int i=1;i<=getNoRows();i++) {
			String emailId=ldriver.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr["+i+"]/td[2]")).getText();
			if(emailId.equals(email)) {
				isfound=true;
			}
		}
		return isfound;
	}
	
	
	
}
