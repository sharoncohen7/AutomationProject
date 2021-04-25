package FinalProject_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePassword extends BasePage {

	@FindBy(id = "sylius_user_request_password_reset_email")
	WebElement Email;

	@FindBy(css = ".ui.fluid.large.primary.submit.button")
	WebElement resetBtn;

	@FindBy(id = "sylius_user_change_password_currentPassword")
	WebElement CurrentPassword;

	@FindBy(id = "sylius_user_change_password_newPassword_first")
	WebElement NewPassword;

	@FindBy(id = "sylius_user_change_password_newPassword_second")
	WebElement Confirmation;

	@FindBy(css = ".ui.large.primary.button")
	WebElement SaveChanges;

	public ChangePassword(WebDriver web) {
		super(web);
	}

	public void resetDetails(String email) {
		fillForm(Email, email);
		Click(resetBtn);
	}

	public void changePassword(String currentPass, String newPass, String confirmation) {
		fillForm(CurrentPassword, currentPass);
		fillForm(NewPassword, newPass);
		fillForm(Confirmation, confirmation);
		Click(SaveChanges);
	}
}
