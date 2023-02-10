package opencartPages;

import org.openqa.selenium.support.PageFactory;

import opencartPageElements.OP_RegistrationPageElement;
import opencartUtilities.TestBase;

public class OP_RegistrationPage{
	OP_RegistrationPageElement rp;

	public OP_RegistrationPage() {
		rp = new OP_RegistrationPageElement();
		PageFactory.initElements(TestBase.driver, rp);
	}
	// Action

	public String ValidateRegistrationPageTitle() {
		return TestBase.driver.getTitle();
	}

	public boolean validateOpencartImage() {
		return rp.registrationPagelogo.isDisplayed();
	}

	public void setFirstname(String firstName) {
		rp.firstname.sendKeys(firstName);
	}

	public void setLastname(String lastName) {
		rp.lastname.sendKeys(lastName);
	}

	public void setEmail(String eMail) {
		rp.email.sendKeys(eMail);
	}

	public void setPassword(String passWord) {
		rp.password.sendKeys(passWord);
	}

	public void setconfirmPassword(String passWord) {
		rp.cpassword.sendKeys(passWord);
	}

	public void setPhone(String phone) {
		rp.telephone.sendKeys(phone);
	}

	public void subcribe() {
		rp.subcribe.click();
	}

	public void privcyPolicy() {
		rp.privcyPolicy.click();

	}

	public void clickOnContinue() {
		rp.btncontinue.click();
	}

	// later
	public boolean validateSuccesMessage() {
		return rp.successMessage.isDisplayed();
	}

	// later
	public void clickOnContinueSuccessPage() {
		rp.successMessagePageContinue.click();
	}

}
