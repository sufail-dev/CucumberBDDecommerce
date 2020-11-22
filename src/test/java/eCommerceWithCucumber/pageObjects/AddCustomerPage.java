package eCommerceWithCucumber.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {
public WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	By customerMenuLink=By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");
	By customerMenuItem=By.xpath("//span[@class='menu-item-title'][contains(text(),'Customer')]");
	By btnAdd=By.xpath("//a[@class='btn bg-blue']");
	By textEmail =By.xpath("//input[@id='Email']");
	By txtPassword=By.xpath("//input[@id='Password']");
	By txtCustomerRole=By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
	By lstitemAdministrators=By.xpath("//li[contains(text(),'Administrators']");
	By lstitemRegistered=By.xpath("//li[contains(text(),'Registered']");
	By listitmGuests=By.xpath("//li[contains(text(),'Guests')]");
	By listitmVendors=By.xpath("//li[contains(text(),'Vendors')]");
	By drpManagerVendor=By.xpath("//*[id='vendorId']");
	By rdMaleGender=By.id("Gender_Male");
	By rdFeMaleGender=By.id("Gender_Female");
	By textFirstNmae=By.xpath("//input[@id='FirstName']");
	By textLastName=By.xpath("//input[@id='LastName']");
	By txtDoB=By.xpath("//input[@id='DateOfBirth']");
	By txtCompanyName=By.xpath("//input[@id='Company']");
	By txtAdminContent=By.xpath("//textarea[@id='AdminComment']");
	By btnSave=By.xpath("//button[@name='save']");
	
	public String getPageTitle() {
		return ldriver.getTitle();
	}
	
	public void clickOnCutomerMenu() {
		ldriver.findElement(customerMenuLink).click();
	}
	public void clickOnCutomerMenuItem() {
		ldriver.findElement(customerMenuItem).click();
	}
	public void clickOnbtnaddNew() {
		ldriver.findElement(btnAdd).click();
	}
	public void setEmail(String email) {
		ldriver.findElement(textEmail).sendKeys(email);
	}
	public void setPassword(String pswd) {
		ldriver.findElement(txtPassword).sendKeys(pswd);
	}
	public void setCustomerRoles(String role) throws InterruptedException {
		if(!role.equals("Vendors")) {
		ldriver.findElement(By.xpath("//*[id=\"SelectedCustomerRoleIds_tagList\"]/li/span"));
		}
		ldriver.findElement(txtCustomerRole).click();
		WebElement listItem;
		Thread.sleep(2000);
		if(role.equals("Administrators")) {
			listItem=ldriver.findElement(lstitemAdministrators);
		}
		else if(role.equals("Guests")) {
			listItem=ldriver.findElement(listitmGuests);
		}
		else if(role.equals("Registered")) {
			listItem=ldriver.findElement(lstitemRegistered);
		}
		else if(role.equals("Vendors")) {
			listItem=ldriver.findElement(listitmVendors);
			
		}
		else {
			listItem=ldriver.findElement(listitmGuests);
		}
		
		listItem.click();
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click();", listItem);
		
	}
	public void setMnagerOfVendor(String value) {
		Select drp=new Select(ldriver.findElement(drpManagerVendor));
		drp.selectByVisibleText(value);
	}
	public void setGender(String gender) {
		if(gender.equals("Male")) {
			ldriver.findElement(rdMaleGender).click();
		}
		else if(gender.equals("Female")) {
			ldriver.findElement(rdFeMaleGender).click();
		}
		else {
			ldriver.findElement(rdMaleGender).click();
		}
	}
	public void setFirstName(String fName) {
		ldriver.findElement(textFirstNmae).sendKeys(fName);
	}
	public void setLastName(String fName) {
		ldriver.findElement(textLastName).sendKeys(fName);
	}
	public void setDOB(String DOB) {
		ldriver.findElement(txtDoB).sendKeys(DOB);
	}
	public void setCompanyName(String cmpnyName) {
		ldriver.findElement(txtCompanyName).sendKeys(cmpnyName);
	}
	public void setAdminContent(String content) {
		ldriver.findElement(txtAdminContent).sendKeys(content);
	}
	public void clickOnSave() {
		ldriver.findElement(btnSave).click();
	}
	
}
