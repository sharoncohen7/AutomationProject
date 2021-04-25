package FinalProject_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class YourProfile extends AccountBar {

	@FindBy(id = "sylius_customer_profile_firstName")
	WebElement FirstName;

	@FindBy(id = "sylius_customer_profile_lastName")
	WebElement LastName;

	@FindBy(id = "sylius_customer_profile_email")
	WebElement Email;

	@FindBy(id = "sylius_customer_profile_birthday")
	WebElement Birthday;

	@FindBy(id = "sylius_customer_profile_phoneNumber")
	WebElement Phone;

	@FindBy(id = "sylius_customer_profile_gender")
	WebElement Gender;

	@FindBy(css = ".ui.toggle.checkbox")
	WebElement ProSubscribe;

	@FindBy(css = ".ui.large.primary.button")
	WebElement SaveChanges;

	public YourProfile(WebDriver web) {
		super(web);
	}

	public void changeDetails(String firstName, String lastName, String email, String birthday, String gender,String phone) {
		fillForm(FirstName, firstName);
		fillForm(LastName, lastName);
		fillForm(Email, email);
		fillForm(Birthday, birthday);
		Select chooseGender = new Select(Gender);
		chooseGender.selectByVisibleText(gender);
		fillForm(Phone, phone);
		proSubscribe();
		saveChanges();
	}

	public void proSubscribe() {
		choose(ProSubscribe, "class", "ui toggle checkbox");
		Click(SaveChanges);
	}
	
	public void saveChanges() {
		Click(SaveChanges);
	}

}
