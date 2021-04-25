package FinalProject_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountBar extends MenuBar {

	@FindBy(css = ".ui.fluid.vertical.menu>.item:nth-child(2)")
	WebElement Dashboard;

	@FindBy(css = ".ui.fluid.vertical.menu>.item:nth-child(3)")
	WebElement PersonnalInfo;

	@FindBy(css = ".ui.fluid.vertical.menu>.item:nth-child(4)")
	WebElement ChangePassword;

	@FindBy(css = ".ui.fluid.vertical.menu>.item:nth-child(5)")
	WebElement AddressBook;

	@FindBy(css = ".ui.fluid.vertical.menu>.item:nth-child(6)")
	WebElement OrderHistory;

	public AccountBar(WebDriver web) {
		super(web);
	}

	public void toDashboard() {
		Click(Dashboard);
	}

	public void toPersonnalInfo() {
		Click(PersonnalInfo);
	}

	public void ChangePassword() {
		Click(ChangePassword);
	}

	public void AddressBook() {
		Click(AddressBook);
	}

	public void toOrderHistory() {
		Click(OrderHistory);
	}

}
