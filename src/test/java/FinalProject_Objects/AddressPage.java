package FinalProject_Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddressPage extends PaymentBar {

	// for unregisterd user

	@FindBy(css = "#sylius_checkout_address_customer_email")
	WebElement Email;

	// for registerd user

	@FindBy(css = "#sylius-billing-address>.search")
	WebElement SelectFromAddBook;

	@FindBy(css = ".menu.transition.visible>div>strong")
	List<WebElement> Addresses;

	// billing address

	@FindBy(css = "#sylius_checkout_address_billingAddress_firstName")
	WebElement BFirstName;

	@FindBy(css = "#sylius_checkout_address_billingAddress_lastName")
	WebElement BLastName;

	@FindBy(css = "#sylius_checkout_address_billingAddress_company")
	WebElement BCompany;

	@FindBy(css = "#sylius_checkout_address_billingAddress_street")
	WebElement BAddress;

	@FindBy(css = "#sylius_checkout_address_billingAddress_countryCode")
	WebElement BCountry;

	@FindBy(css = "#sylius_checkout_address_billingAddress_city")
	WebElement BCity;

	@FindBy(css = "#sylius_checkout_address_billingAddress_provinceName")
	WebElement BProvince;

	@FindBy(css = "#sylius_checkout_address_billingAddress_postcode")
	WebElement BPostCode;

	@FindBy(css = "#sylius_checkout_address_billingAddress_phoneNumber")
	WebElement BPhoneNumber;

	// shipping address

	@FindBy(css = "#sylius_checkout_address_shippingAddress_firstName")
	WebElement SFirstName;

	@FindBy(css = "#sylius_checkout_address_shippingAddress_lastName")
	WebElement SLastName;

	@FindBy(css = "#sylius_checkout_address_shippingAddress_company")
	WebElement SCompany;

	@FindBy(css = "#sylius_checkout_address_shippingAddress_street")
	WebElement SAddress;

	@FindBy(css = "#sylius_checkout_address_shippingAddress_countryCode")
	WebElement SCountry;

	@FindBy(css = "#sylius_checkout_address_shippingAddress_city")
	WebElement SCity;

	@FindBy(css = "#sylius_checkout_address_shippingAddress_provinceName")
	WebElement SProvince;

	@FindBy(css = "#sylius_checkout_address_shippingAddress_postcode")
	WebElement SPostCode;

	@FindBy(css = "#sylius_checkout_address_shippingAddress_phoneNumber")
	WebElement SPhoneNumber;

	@FindBy(css = ".ui.toggle.checkbox")
	WebElement UseDiffAdd;

	@FindBy(css = ".ui.two.column.grid >.column:nth-child(1) > a")
	WebElement BackToStore;

	@FindBy(css = "#next-step")
	WebElement Next;

	public AddressPage(WebDriver web) {
		super(web);
	}

	public void selectFromBook(String address) {
		Click(SelectFromAddBook);
		sleep(500);
		for (int i = 0; i < Addresses.size(); i++) {
			if (getText(Addresses.get(i)).equalsIgnoreCase(address))
				Click(Addresses.get(i));
			sleep(500);
		}
	}

	public void BillingAddress(String email, String firstname, String lastname, String company, String address,
			String country, String city, String province, String postcode, String phonenumber) {
		fillForm(Email, email);
		fillForm(BFirstName, firstname);
		fillForm(BLastName, lastname);
		fillForm(BCompany, company);
		fillForm(BAddress, address);
		fillForm(BPostCode, postcode);
		fillForm(BCity, city);
		fillForm(BPhoneNumber, phonenumber);
		Select count = new Select(BCountry);
		count.selectByValue(country);
		sleep(1000);
		fillForm(BProvince, province);
	}

	public void useDiffrentAddress(String firstname, String lastname, String company, String address, String city,
			String province, String country, String postcode, String phonenumber) {
		fillForm(SFirstName, firstname);
		fillForm(SLastName, lastname);
		fillForm(SCompany, company);
		fillForm(SAddress, address);
		fillForm(SCity, city);
		fillForm(SPostCode, postcode);
		fillForm(SPhoneNumber, phonenumber);
		Select count = new Select(SCountry);
		count.selectByValue(country);
		sleep(1000);
		fillForm(BProvince, province);
	}

	public void diffAddress() {
		choose(UseDiffAdd, "class", "ui toggle checkbox");
	}

	public void next() {
		Click(Next);
	}

	public void backToStore() {
		Click(BackToStore);
	}
}
