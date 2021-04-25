package FinalProject_Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends PaymentBar {

	@FindBy(css = ".header>label")
	List<WebElement> ShippingCompanies;

	@FindBy(css = "div.ui.two.column.grid > div:nth-child(1) > a")
	WebElement ChangeAddress;

	@FindBy(css = ".arrow.right.icon")
	WebElement NextStep;

	public ShippingPage(WebDriver web) {
		super(web);
	}

	public void chooseCompany(String company) {
		for (int i = 0; i < ShippingCompanies.size(); i++) {
			if (getText(ShippingCompanies.get(i)).equalsIgnoreCase(company))
				Click(ShippingCompanies.get(i));
			sleep(500);
		}
	}

	public void changeAddress() {
		Click(ChangeAddress);
		sleep(500);
	}

	public void nextStep() {
		Click(NextStep);
		sleep(500);
	}
}
