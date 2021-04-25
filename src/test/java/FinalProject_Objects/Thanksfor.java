package FinalProject_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Thanksfor extends MenuBar {

	@FindBy(css = "#payment-method-page")
	WebElement ChangePayment;
	
	@FindBy(css = ".ui.large.green.button")
	WebElement CreateAccount;
	
	//validation
	
	@FindBy(css = ".content>.sub.header")
	WebElement orderMsg;
	
	public Thanksfor(WebDriver web) {
		super(web);
	}
	
	public void changePayment() {
		Click(ChangePayment);
		sleep(500);
	}
	
	public void createAccount() {
		Click(CreateAccount);
		sleep(500);
	}
	
	public String thank() {
		String text = getText(orderMsg);
		return text;
	}

}
