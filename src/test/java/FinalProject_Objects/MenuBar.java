package FinalProject_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuBar extends BasePage {

	@FindBy(css = ".ui.right.stackable.inverted.menu>a:nth-child(1)")
	WebElement LoginBtn;

	@FindBy(css = ".ui.right.stackable.inverted.menu>a:nth-child(2)")
	WebElement RegisterBtn;

	@FindBy(css = "a[href='/en_US/account/dashboard']")
	WebElement MyAccount;

	@FindBy(css = ".item.sylius-logout-button")
	WebElement LogOutBtn;

	@FindBy(css = ".column>a>img:nth-child(1)")
	WebElement Logo;

	// Cart

	@FindBy(css = "#sylius-cart-button")
	WebElement CartBtn;

	@FindBy(css = ".ui.fluid.basic.text.button")
	WebElement viewAndEdit;

	@FindBy(className = "ui fluid primary button")
	WebElement CheckoutBtn;

	// T-shirt

	@FindBy(css = ".ui.large.stackable.menu > div:nth-child(1) > span")
	WebElement tshirtMenu;

	@FindBy(css = "a[href='/en_US/taxons/t-shirts/men']")
	WebElement menTshirt;

	@FindBy(css = "a[href='/en_US/taxons/t-shirts/women']")
	WebElement womenTshirt;

	// Caps

	@FindBy(css = ".ui.large.stackable.menu > div:nth-child(2) > span")
	WebElement capsMenu;

	@FindBy(css = "a[href='/en_US/taxons/caps/simple']")
	WebElement simpleCaps;

	@FindBy(css = "a[href='/en_US/taxons/caps/with-pompons']")
	WebElement withPonCaps;

	// Dresses

	@FindBy(css = "	a[href='/en_US/taxons/category/dresses']")
	WebElement Dresses;

	// Jeans

	@FindBy(css = ".ui.large.stackable.menu > div:nth-child(4) > span")
	WebElement jeansMenu;

	@FindBy(css = "a[href='/en_US/taxons/jeans/men']")
	WebElement menJeans;

	@FindBy(css = "a[href='/en_US/taxons/jeans/women']")
	WebElement womenJeans;

	public MenuBar(WebDriver web) {
		super(web);
	}

	public void toLoginPage() {
		Click(LoginBtn);
		sleep(500);
	}

	public void toRegisterPage() {
		Click(RegisterBtn);
		sleep(500);
	}

	public void logOut() {
		Click(LogOutBtn);
		sleep(500);
	}

	public void toMyAccount() {
		Click(MyAccount);
		sleep(500);
	}

	// Cart

	public void viewAndEditCart() {
		Click(CartBtn);
		Click(viewAndEdit);
		sleep(500);
	}

	public void checkout() {
		Click(CartBtn);
		Click(CheckoutBtn);
		sleep(500);
	}

	// T-shirt

	public void MenTshirts() {
		Click(tshirtMenu);
		Click(menTshirt);
		sleep(500);
	}

	public void WomenTshirts() {
		Click(tshirtMenu);
		Click(womenTshirt);
		sleep(500);
	}

	// Jeans

	public void menJeans() {
		Click(jeansMenu);
		Click(menJeans);
		sleep(500);
	}

	public void womenJeans() {
		Click(jeansMenu);
		Click(womenJeans);
		sleep(500);
	}

	// Caps

	public void SimpleCaps() {
		Click(capsMenu);
		Click(simpleCaps);
		sleep(500);
	}

	public void withPonCaps() {
		Click(capsMenu);
		Click(withPonCaps);
		sleep(500);
	}

	// dresses

	public void Dresses() {
		Click(Dresses);
		sleep(500);
	}

	public void LogoClick() {
		Click(Logo);
		sleep(500);
	}

}
