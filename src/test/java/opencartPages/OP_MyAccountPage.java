package opencartPages;

import org.openqa.selenium.support.PageFactory;

import opencartPageElements.OP_MyAccountPageElement;
import opencartUtilities.TestBase;

public class OP_MyAccountPage {
	OP_MyAccountPageElement myAc;

	public OP_MyAccountPage() {
		myAc = new OP_MyAccountPageElement();
		PageFactory.initElements(TestBase.driver, myAc);
	}

	// Action
	public void logout() {
		myAc.logOut.click();
	}

	public boolean isMyAccountPageExists() {
		try {
			return myAc.textMyAccount.isDisplayed();
		} catch (Exception e) {
			return (false);
		}
	}

}
