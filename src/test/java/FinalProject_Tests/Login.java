package FinalProject_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import FinalProject_Objects.LoginPage;
import FinalProject_Objects.MainProductsPage;

public class Login extends BaseTest{	
	
	@Test(description = "Login with valid details")
	public void TC_01() {
		MainProductsPage main = new MainProductsPage(web);
		main.toLoginPage();
		LoginPage login = new LoginPage(web);
		login.LoginForm("shop@example.com", "sylius");
		String expected = "Hello QW cohen!";
		login = new LoginPage(web);
		String actual = login.regMsg();
		Assert.assertEquals(actual, expected);
		main = new MainProductsPage(web);
		main.logOut();
	}
	
	@Test(description = "Login with invalid username")
	public void TC_02() {
		MainProductsPage main = new MainProductsPage(web);
		main.toLoginPage();
		LoginPage login = new LoginPage(web);
		login.LoginForm("shop", "sylius");
		String expected = "Invalid credentials.";
		login = new LoginPage(web);
		String actual = login.failedLogin();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(description = "Login with invalid password")
	public void TC_03() {
		LoginPage login = new LoginPage(web);
		login.LoginForm("shop@example.com", "syli");
		String expected = "Invalid credentials.";
		login = new LoginPage(web);
		String actual = login.failedLogin();
		Assert.assertEquals(actual, expected);
	}
}
