package FinalProject_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import FinalProject_Objects.MainProductsPage;
import FinalProject_Objects.RegisterPage;

public class Register extends BaseTest {

	@Test(description = "Register with valid details")
	public void TC_01() {
		MainProductsPage main = new MainProductsPage(web);
		main.toRegisterPage();
		RegisterPage register = new RegisterPage(web);
		register.RegisterForm("sharon", "cohen", "register160@gmail.com", "0528291122", "113011", "113011");
		String expected = "Success";
		register = new RegisterPage(web);
		String actual = register.regMsg();
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Register with empty first name")
	public void TC_02() {
		MainProductsPage main = new MainProductsPage(web);
		main.toRegisterPage();
		RegisterPage register = new RegisterPage(web);
		register.RegisterForm("", "cohen", "register17@gmail.com", "0528291122", "113011", "113011");
		String expected = "Please enter your first name.";
		register = new RegisterPage(web);
		String actual = register.regError();
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Register with empty last name")
	public void TC_03() {
		MainProductsPage main = new MainProductsPage(web);
		main.toRegisterPage();
		RegisterPage register = new RegisterPage(web);
		register.RegisterForm("sharon", "", "register18@gmail.com", "0528291122", "113011", "113011");
		String expected = "Please enter your last name.";
		register = new RegisterPage(web);
		String actual = register.regError();
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "register without @ in the email field")
	public void TC_04() {
		MainProductsPage main = new MainProductsPage(web);
		main.toRegisterPage();
		RegisterPage register = new RegisterPage(web);
		register.RegisterForm("sharon", "cohen", "registeר19gmail.com", "0528291122", "113011", "113011");
		String expected = "This email is invalid.";
		register = new RegisterPage(web);
		String actual = register.regError();
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "register without domain name")
	public void TC_05() {
		MainProductsPage main = new MainProductsPage(web);
		main.toRegisterPage();
		RegisterPage register = new RegisterPage(web);
		register.RegisterForm("sharon", "cohen", "register20@", "0528291122", "113011", "113011");
		String expected = "This email is invalid.";
		register = new RegisterPage(web);
		String actual = register.regError();
		Assert.assertEquals(actual, expected);
	}
    
	//Test failed
	@Test(description = "register without ending")
	public void TC_06() {
		MainProductsPage main = new MainProductsPage(web);
		main.toRegisterPage();
		RegisterPage register = new RegisterPage(web);
		register.RegisterForm("sharon", "cohen", "register21@gmail", "0528291122", "113011", "113011");
		String expected = "This email is invalid.";
		register = new RegisterPage(web);
		String actual = register.regError();
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "register without a password")
	public void TC_07() {
		MainProductsPage main = new MainProductsPage(web);
		main.toRegisterPage();
		RegisterPage register = new RegisterPage(web);
		register.RegisterForm("sharon", "cohen", "register22@gmail.com", "0528291122", "113011", "");
		String expected = "The entered passwords don't match";
		register = new RegisterPage(web);
		String actual = register.regError();
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 1, description = "register without verfication password")
	public void Tc_08() {
		MainProductsPage main = new MainProductsPage(web);
		main.toRegisterPage();
		RegisterPage register = new RegisterPage(web);
		register.RegisterForm("sharon", "cohen", "register23@gmail.com", "0528291122", "", "113011");
		String expected = "The entered passwords don't match";
		register = new RegisterPage(web);
		String actual = register.regError();
		Assert.assertEquals(actual, expected);
	}
}
