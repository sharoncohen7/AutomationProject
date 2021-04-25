package FinalProject_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import FinalProject_Objects.AddressBook;
import FinalProject_Objects.ChangeAddress;
import FinalProject_Objects.ChangePassword;
import FinalProject_Objects.LoginPage;
import FinalProject_Objects.MainProductsPage;
import FinalProject_Objects.MyAccount;
import FinalProject_Objects.NewAddress;
import FinalProject_Objects.YourProfile;

public class Myaccount extends BaseTest{
	
	@Test(description = "create new address with valid details")
	public void TC_01() {
		MainProductsPage main = new MainProductsPage(web);
		main.toLoginPage();
		LoginPage login = new LoginPage(web);
		login.LoginForm("shop@example.com", "sylius");
		main = new MainProductsPage(web);
		main.toMyAccount();
		MyAccount account = new MyAccount(web);
		account.AddressBook();
		AddressBook address = new AddressBook(web);
		address.addAddress();
		NewAddress newAdd = new NewAddress(web);
		newAdd.addressForm("QW", "cohen", "", "30 harav st.", "US", "", "new orleans", "22812", "");
		String expected = "QW cohen";
		address = new AddressBook(web);
		String ectual = address.eddMsg();
		Assert.assertEquals(ectual, expected);
	}

	@Test(description = "change existing address details")
	public void TC_02() {
		AddressBook address = new AddressBook(web);
		address.EditList("QW cohen");
		ChangeAddress change = new ChangeAddress(web);
		change.addressForm("QW", "cohen", "", "30 harav st.", "US", "", "new orleans", "300181", "");
		String expected = "QW cohen";
		address = new AddressBook(web);
		String ectual = address.eddMsg();
		Assert.assertEquals(ectual, expected);
	}
	
	@Test(description = "change personal details")
	public void TC_03() {
		AddressBook address = new AddressBook(web);
		address.toPersonnalInfo();
		YourProfile profile = new YourProfile(web);
		profile.changeDetails("QW", "cohen", "shop@example.com", "09/09/1996", "Male", "");
		String expected = "Hello QW cohen!";
		LoginPage login = new LoginPage(web);
		String actual = login.regMsg();
		Assert.assertEquals(actual, expected);		
	}
	
	@Test(description = "change password")
	public void TC_04() {
		YourProfile profile = new YourProfile(web);
		profile.ChangePassword();
		ChangePassword password = new ChangePassword(web);
		password.changePassword("sylius", "sylius", "sylius");
		
		//check validation -- logout and log in
	}
}
