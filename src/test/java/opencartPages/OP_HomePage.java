package opencartPages;

import org.openqa.selenium.support.PageFactory;

import opencartPageElements.OP_HomePageElement;
import opencartUtilities.TestBase;

public class OP_HomePage {
	OP_HomePageElement mp;

	public OP_HomePage() {
		mp = new OP_HomePageElement();
		PageFactory.initElements(TestBase.driver, mp);
	}

	// Action Methods
	public boolean validateOpencartImage() {
		return mp.homePagelogo.isDisplayed();
	}

	public String ValidateHomePageTitle() {
		return TestBase.driver.getTitle();
	}

	public void clickOnMyAccount() {
		mp.myAccount.click();
	}

	public void clickOnRegister() {
		mp.linkregister.click();
	}

	public void clickOnLogin() {
		mp.linklogin.click();
	}

}
