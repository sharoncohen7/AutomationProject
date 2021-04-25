package FinalProject_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import FinalProject_Objects.AddressPage;
import FinalProject_Objects.Cart;
import FinalProject_Objects.LoginPage;
import FinalProject_Objects.MainProductsPage;
import FinalProject_Objects.MenJeans;
import FinalProject_Objects.MenTshirts;
import FinalProject_Objects.OrderSummary;
import FinalProject_Objects.PaymentPage;
import FinalProject_Objects.ProductPage;
import FinalProject_Objects.ShippingPage;
import FinalProject_Objects.SimpleCaps;
import FinalProject_Objects.Thanksfor;
import FinalProject_Objects.WithPomponsCaps;

public class MenClothes extends BaseTest {

	@Test(description = "buy simple cap after Sign-in")
	public void TC_01() {
		MainProductsPage main = new MainProductsPage(web);
		main.toLoginPage();
		LoginPage login = new LoginPage(web);
		login.LoginForm("shop@example.com", "sylius");
		main = new MainProductsPage(web);
		main.SimpleCaps();
		SimpleCaps simple = new SimpleCaps(web);
		simple.Search("Cashmere-blend violet beanie");
		ProductPage product = new ProductPage(web);
		product = new ProductPage(web);
		product.chooseQuantity("2");
		product = new ProductPage(web);
		product.addToCart();
		Cart cart = new Cart(web);
		cart.checkout();
		AddressPage address = new AddressPage(web);
		address.selectFromBook("QW cohen");
		address.next();
		ShippingPage ship = new ShippingPage(web);
		ship.chooseCompany("DHL Express");
		ship = new ShippingPage(web);
		ship.nextStep();
		PaymentPage pay = new PaymentPage(web);
		pay.choosePayment("Cash on delivery");
		pay = new PaymentPage(web);
		pay.next();
		OrderSummary order = new OrderSummary(web);
		order.placeOrder();
		String expected = "You have successfully placed an order.";
		Thanksfor thank = new Thanksfor(web);
		String actual = thank.thank();
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "buy caps with pompons after Sign-in")
	public void TC_02() {
		Thanksfor thank = new Thanksfor(web);
		thank.withPonCaps();
		WithPomponsCaps pompons = new WithPomponsCaps(web);
		pompons.Search("Knitted burgundy winter cap");
		ProductPage product = new ProductPage(web);
		product = new ProductPage(web);
		product.chooseQuantity("3");
		product = new ProductPage(web);
		product.addToCart();
		Cart cart = new Cart(web);
		cart.checkout();
		AddressPage address = new AddressPage(web);
		address.selectFromBook("QW cohen");
		address = new AddressPage(web);
		address.next();
		ShippingPage ship = new ShippingPage(web);
		ship.chooseCompany("UPS");
		ship = new ShippingPage(web);
		ship.nextStep();
		PaymentPage pay = new PaymentPage(web);
		pay.choosePayment("Cash on delivery");
		pay = new PaymentPage(web);
		pay.next();
		OrderSummary order = new OrderSummary(web);
		order.placeOrder();
		String expected = "You have successfully placed an order.";
		thank = new Thanksfor(web);
		String actual = thank.thank();
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "buy a t-shirt after Sign-in")
	public void TC_03() {
		Thanksfor thank = new Thanksfor(web);
		thank.MenTshirts();
		MenTshirts shirt = new MenTshirts(web);
		shirt.Search("Sport basic white T-Shirt");
		ProductPage product = new ProductPage(web);
		// choose size by value
		product.ChooseTshirtSize("L");
		product = new ProductPage(web);
		product.chooseQuantity("2");
		product = new ProductPage(web);
		product.addToCart();
		Cart cart = new Cart(web);
		cart.checkout();
		AddressPage address = new AddressPage(web);
		address.selectFromBook("QW cohen");
		address = new AddressPage(web);
		address.next();
		ShippingPage ship = new ShippingPage(web);
		ship.chooseCompany("UPS");
		ship = new ShippingPage(web);
		ship.nextStep();
		PaymentPage pay = new PaymentPage(web);
		pay.choosePayment("Cash on delivery");
		pay = new PaymentPage(web);
		pay.next();
		OrderSummary order = new OrderSummary(web);
		order.placeOrder();
		String expected = "You have successfully placed an order.";
		thank = new Thanksfor(web);
		String actual = thank.thank();
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "buy a jeans after Sign-in")
	public void TC_04() {
		Thanksfor thank = new Thanksfor(web);
		thank.menJeans();
		MenJeans jeans = new MenJeans(web);
		jeans.Search("911M regular fit jeans");
		ProductPage product = new ProductPage(web);
		// choose size by value
		product.chooseJeansSize("L");
		product = new ProductPage(web);
		product.chooseQuantity("2");
		product = new ProductPage(web);
		product.addToCart();
		Cart cart = new Cart(web);
		cart.checkout();
		AddressPage address = new AddressPage(web);
		address.selectFromBook("QW cohen");
		address = new AddressPage(web);
		address.next();
		ShippingPage ship = new ShippingPage(web);
		ship.chooseCompany("UPS");
		ship = new ShippingPage(web);
		ship.nextStep();
		PaymentPage pay = new PaymentPage(web);
		pay.choosePayment("Cash on delivery");
		pay = new PaymentPage(web);
		pay.next();
		OrderSummary order = new OrderSummary(web);
		order.placeOrder();
		String expected = "You have successfully placed an order.";
		thank = new Thanksfor(web);
		String actual = thank.thank();
		Assert.assertEquals(actual, expected);
	}
}
