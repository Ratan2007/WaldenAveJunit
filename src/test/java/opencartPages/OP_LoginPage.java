package opencartPages;

import org.openqa.selenium.support.PageFactory;

import opencartPageElements.OP_LoginPageElement;
import opencartUtilities.TestBase;

public class OP_LoginPage {
	OP_LoginPageElement lp;

	public OP_LoginPage() {
		lp = new OP_LoginPageElement();
		PageFactory.initElements(TestBase.driver, lp);
	}

	public String ValidateLoginPageTitle() {
		return TestBase.driver.getTitle();
	}

	public void enteremail(String email) {
		lp.enterEmail.sendKeys(email);
	}

	public void enterpassword(String password) {
		lp.enterPassword.sendKeys(password);
	}

	public void clickOnLogin() {
		lp.clickOnLogin.click();
	}

	public String getUrl() {
		return TestBase.driver.getCurrentUrl();
	}

	public void logout() {
		lp.logOut.click();
	}

}
