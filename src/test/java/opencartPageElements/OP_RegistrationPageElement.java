package opencartPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OP_RegistrationPageElement {

	@FindBy(xpath = "//img[@class='img-responsive']")
	public WebElement registrationPagelogo;

	@FindBy(xpath = "//input[@id='input-firstname']")

	public WebElement firstname;

	@FindBy(xpath = "//input[contains(@name,'lastname')]")
	public WebElement lastname;

	@FindBy(xpath = "//input[contains(@placeholder,'E-Mail')]")
	public WebElement email;
	@FindBy(xpath = "//input[@id='input-telephone']")
	public WebElement telephone;

	@FindBy(xpath = "//input[contains(@type,'password')]")
	public WebElement password;

	@FindBy(xpath = "//input[@placeholder='Password Confirm']")
	public WebElement cpassword;
	@FindBy(xpath = "//input[@name='newsletter' and @value='0']")
	public WebElement subcribe;
	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement privcyPolicy;

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement btncontinue;

	@FindBy(xpath = "//div[@id=\"content\"]//child::h1")
	public WebElement successMessage;
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	public WebElement successMessagePageContinue;

}
