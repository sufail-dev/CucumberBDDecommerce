package eCommerceWithCucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver ) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(id="Email")
	WebElement txtEmail;
	@FindBy(id="Password")
	WebElement txtPassword;
	@FindBy(xpath="//input[@value='Log in']")
	WebElement btnLogin;
	@FindBy(linkText="Logout")
	WebElement linkLogout;
	
	public void setUserName(String usrName) {
		txtEmail.clear();
		txtEmail.sendKeys(usrName);
	}
	public void setPassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	public void clickLogin() {
		btnLogin.click();
	}
	public void logout() {
		linkLogout.click();
	}
	
}
