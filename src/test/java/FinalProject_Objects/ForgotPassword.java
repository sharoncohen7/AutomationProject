package FinalProject_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword extends MenuBar {

	@FindBy(css = "#sylius_user_request_password_reset_email")
	WebElement Email;

	@FindBy(css = ".ui.fluid.large.primary.submit.button")
	WebElement ResetBtn;

	@FindBy(css = ".ui.icon.positive.message.sylius-flash-message>.content>p")
	WebElement forgMsg;

	public ForgotPassword(WebDriver web) {
		super(web);
	}

	public void resetEmail(String email) {
		fillForm(Email, email);
		Click(ResetBtn);
		sleep(500);
	}

	// validation

	public String forgMsg() {
		String text = getText(forgMsg);
		return text;
	}

}
