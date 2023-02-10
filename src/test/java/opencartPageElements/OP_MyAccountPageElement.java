package opencartPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OP_MyAccountPageElement {

	// Element
	@FindBy(xpath = "//a[text()='Logout' and @class='list-group-item']")
	public WebElement logOut;
	@FindBy(xpath = "//h2[text()='My Account']")
	public WebElement textMyAccount;

}
