package FinalProject_Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePayment extends MenuBar{

	@FindBy(css = ".header>label")
	List<WebElement> PaymentMethods;
	
	@FindBy(css = ".ui.large.blue.icon.labeled.button")
	WebElement Pay;
	
	public ChangePayment(WebDriver web) {
		super(web);
	}

	public void choosePayment(String Payment) {
		for (int i = 0; i < PaymentMethods.size(); i++) {
			if (getText(PaymentMethods.get(i)).equalsIgnoreCase(Payment))
				Click(PaymentMethods.get(i));
		}
	}
	
	public void pay() {
		Click(Pay);
	}

}
