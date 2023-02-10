package opencartPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OP_HomePageElement {

	// Elements
	@FindBy(xpath = "//img[@class='img-responsive']")
	public WebElement homePagelogo;
	@FindBy(xpath = "//a[@title='My Account']")
	public WebElement myAccount;

	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	public WebElement linkregister;

	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	public WebElement linklogin;

}
