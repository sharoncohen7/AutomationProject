package FinalProject_Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends PaymentBar {

	@FindBy(css = ".header>label")
	List<WebElement> PaymentMethods;

	@FindBy(css = "a[href=\"/en_US/checkout/select-shipping\"]:nth-child(1)")
	WebElement ChangeShipping;

	@FindBy(css = "#next-step")
	WebElement Next;

	public PaymentPage(WebDriver web) {
		super(web);
	}

	public void choosePayment(String Payment) {
		for (int i = 0; i < PaymentMethods.size(); i++) {
			if (getText(PaymentMethods.get(i)).equalsIgnoreCase(Payment))
				Click(PaymentMethods.get(i));
		}
	}

	public void changeShipping() {
		Click(ChangeShipping);
	}

	public void next() {
		Click(Next);
	}

}
