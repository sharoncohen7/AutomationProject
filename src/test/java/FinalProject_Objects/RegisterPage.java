package FinalProject_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	@FindBy(id = "sylius_customer_registration_firstName")
	WebElement FirstName;

	@FindBy(id = "sylius_customer_registration_lastName")
	WebElement LastName;

	@FindBy(id = "sylius_customer_registration_email")
	WebElement Email;

	@FindBy(id = "sylius_customer_registration_phoneNumber")
	WebElement phone;

	@FindBy(id = "sylius_customer_registration_user_plainPassword_first")
	WebElement Password;

	@FindBy(id = "sylius_customer_registration_user_plainPassword_second")
	WebElement Verfication;

	@FindBy(css = ".ui.toggle.checkbox")
	WebElement subscribeBtn;

	@FindBy(css = ".ui.large.primary.button")
	WebElement createAccount;

	@FindBy(css = ".ui.right.floated.basic.button")
	WebElement Login;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div")
	WebElement regMsg;
	
	@FindBy(css = ".ui.red.pointing.label.sylius-validation-error")
	WebElement regError;

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	public void RegisterForm(String firstName, String lastName, String email, String phoneNumber, String password,
			String verfication) {
		fillForm(FirstName, firstName);
		fillForm(LastName, lastName);
		fillForm(Email, email);
		fillForm(phone, phoneNumber);
		fillForm(Password, password);
		fillForm(Verfication, verfication);
		RegSubscribe();

	}

	public void RegSubscribe() {
		choose(subscribeBtn, "class", "ui toggle checkbox");
		sleep(500);
	}

	public void CreateAccount() {
		Click(createAccount);
		sleep(500);
	}

	public void alreadyHaveAccount() {
		Click(Login);
		sleep(500);
	}

	//validation
	
	public String regMsg() {
		String msg = getText(regMsg);
		return msg;
	}
	
	public String regError() {
		String msg = getText(regError);
		return msg;
	}

}
