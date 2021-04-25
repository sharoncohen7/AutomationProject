package FinalProject_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import FinalProject_Objects.ForgotPassword;
import FinalProject_Objects.LoginPage;
import FinalProject_Objects.MainProductsPage;


public class EmailReset extends BaseTest{

	@Test(description = "Reset password with valid email")
		public void TC_01() {
			MainProductsPage main = new MainProductsPage(web);
			main.toLoginPage();
			LoginPage login = new LoginPage(web);
			login.forgotpass();
			ForgotPassword forgot = new ForgotPassword(web);
			forgot.resetEmail("sharon12@gmail.com");
			String expected = "If the email you have specified exists in our system, we have sent there an instruction on how to reset your password.";
			forgot = new ForgotPassword(web);
			String actual = forgot.forgMsg();
			Assert.assertEquals(actual, expected);
		}
	}

