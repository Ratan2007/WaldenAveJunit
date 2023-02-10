package opencartPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OP_LoginPageElement {

	// Elements
	@FindBy(xpath = "//input[@name='email']")

	public WebElement enterEmail;
	@FindBy(xpath = "//input[@name='password']")
	public WebElement enterPassword;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	public WebElement clickOnLogin;

	@FindBy(xpath = "//a[text()='Logout' and @class='list-group-item']")
	public WebElement logOut;

}
