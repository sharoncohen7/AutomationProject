package FinalProject_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ChangeAddress extends ProductsBar {

	@FindBy(css = "#sylius_address_firstName")
	WebElement FirstName;

	@FindBy(css = "#sylius_address_lastName")
	WebElement LastName;

	@FindBy(css = "#sylius_address_company")
	WebElement Company;

	@FindBy(css = "#sylius_address_street")
	WebElement Street;

	@FindBy(css = "#sylius_address_countryCode")
	WebElement Country;

	@FindBy(css = "#sylius_address_provinceName")
	WebElement Province;

	@FindBy(css = "#sylius_address_city")
	WebElement City;

	@FindBy(css = "#sylius_address_postcode")
	WebElement Postcode;

	@FindBy(css = "#sylius_address_phoneNumber")
	WebElement Phone;

	@FindBy(css = ".right.aligned.column>.ui.large.icon.labeled.blue.button")
	WebElement ChangeAddress;

	@FindBy(css = "a[class='ui large icon labeled button']")
	WebElement Cancle;
	


	public ChangeAddress(WebDriver web) {
		super(web);
	}

	public void addressForm(String firstName, String lastName, String company, String street, String country,
			String province, String city, String postcode, String phone) {
		sleep(1000);
		fillForm(FirstName, firstName);
		fillForm(LastName, lastName);
		fillForm(Company, company);
		fillForm(Street, street);
		Select count = new Select(Country);
		count.selectByValue(country);
		sleep(1000);
		fillForm(Province, province);
		fillForm(City, city);
		fillForm(Postcode, postcode);
		fillForm(Phone, phone);
		sleep(500);
		addAddress();
	}

	public void addAddress() {
		Click(ChangeAddress);
	}

	public void cancleAddress() {
		Click(Cancle);
	}

}
