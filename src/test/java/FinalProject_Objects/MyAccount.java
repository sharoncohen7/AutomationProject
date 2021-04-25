package FinalProject_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends AccountBar {

	@FindBy(css = ".ui.icon.red.basic.label")
	WebElement isVerify;

	@FindBy(css = ".ui.basic.icon.mini.button")
	WebElement verifyBtn;

	@FindBy(css = ".ui.text.menu>a:nth-child(1)")
	WebElement edit;

	@FindBy(css = ".ui.text.menu>a:nth-child(2)")
	WebElement ChangePassword;

	public MyAccount(WebDriver web) {
		super(web);
	}

	public void verifyStatus() {
     if(getText(isVerify).equals("Not verified"))
    	 Click(verifyBtn);
	}

	public void Edit() {
		Click(edit);
	}

	public void changePassword() {
		Click(ChangePassword);
	}

}
