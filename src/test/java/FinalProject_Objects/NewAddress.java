package FinalProject_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewAddress extends ProductsBar{

	@FindBy(id = "sylius_address_firstName")
	WebElement FirstName;
	
	@FindBy(id = "sylius_address_lastName")
	WebElement LastName;
	
	@FindBy(id = "sylius_address_company")
	WebElement Company;
	
	@FindBy(id = "sylius_address_street")
	WebElement Street;
	
	@FindBy(id = "sylius_address_countryCode")
	WebElement Country;
	
	@FindBy(id = "sylius_address_provinceName")
	WebElement Province;
	
	@FindBy(id = "sylius_address_city")
	WebElement City;
	
	@FindBy(id = "sylius_address_postcode")
	WebElement Postcode;
	
	@FindBy(id = "sylius_address_phoneNumber")
	WebElement Phone;
	
	@FindBy(css = "button[class='ui large icon labeled blue button']")
	WebElement Add;
	
	@FindBy(css = "a[class='ui large icon labeled button']")
	WebElement Cancle;
		
	
	public NewAddress(WebDriver web) {
		super(web);
	}
	
	public void addressForm(String firstName, String lastName, String company,String street, String country, 
			String province, String city,String postcode, String phone) {
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
		addAddress();
	}
	
	public void addAddress() {
		Click(Add);
	}
	
	public void cancleAddress() {
		Click(Cancle);
	}

}
