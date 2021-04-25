package FinalProject_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends MenuBar {

	@FindBy(id = "_username")
	WebElement userName;

	@FindBy(id = "_password")
	WebElement Password;

	@FindBy(css = ".ui.toggle.checkbox")
	WebElement Remember;

	@FindBy(css = ".ui.blue.submit.button")
	WebElement Login;

	@FindBy(css = ".ui.right.floated.button")
	WebElement ForgotPass;

	@FindBy(css = "a[href='/en_US/register']>.signup.icon")
	WebElement CreateAccount;
	
	//validation
	
	@FindBy(css = ".ui.right.stackable.inverted.menu>div")
	WebElement logMsg;
	
	@FindBy(css = ".ui.icon.negative.message>.content>p")
	WebElement FloginMsg;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void LoginForm(String username, String password) {
		sleep(500);
		fillForm(userName, username);
		fillForm(Password, password);
		rememberMe();
		Click(Login);
		sleep(1000);
	}

	public void forgotpass() {
		Click(ForgotPass);
		sleep(500);
	}

	public void rememberMe() {
		choose(Remember, "class", "ui toggle checkbox");
		sleep(500);
	}

	public void createAccnt() {
		Click(CreateAccount);
		sleep(500);
	}

	//Validation
	
	public String regMsg() {
		String msg = getText(logMsg);
		return msg;
	}

	public String getatt() {
		String att = Remember.getAttribute("class");
		return att;
	}
	
	public String failedLogin() {
		String text = getText(FloginMsg);
		return text;
	}

}
