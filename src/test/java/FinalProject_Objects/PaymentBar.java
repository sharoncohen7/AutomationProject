package FinalProject_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentBar extends BasePage {

	@FindBy(css = ".ui.four.steps>a:nth-child(1)")
	WebElement Address;

	@FindBy(css = ".ui.four.steps>a:nth-child(2)")
	WebElement Shipping;

	@FindBy(css = ".ui.four.steps>a:nth-child(3)")
	WebElement Payment;

	@FindBy(css = ".ui.four.steps>dive")
	WebElement OrderSummary;

	public PaymentBar(WebDriver web) {
		super(web);
	}

	public void address() {
		Click(Address);
	}

	public void shipping() {
		Click(Shipping);
	}

	public void payment() {
		Click(Payment);
	}

	public void orderSummary() {
		Click(OrderSummary);
	}

}
