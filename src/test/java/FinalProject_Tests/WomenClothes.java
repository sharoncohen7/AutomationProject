package FinalProject_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import FinalProject_Objects.AddressPage;
import FinalProject_Objects.Cart;
import FinalProject_Objects.ChangePayment;
import FinalProject_Objects.Dresses;
import FinalProject_Objects.LoginPage;
import FinalProject_Objects.MainProductsPage;
import FinalProject_Objects.OrderSummary;
import FinalProject_Objects.PaymentPage;
import FinalProject_Objects.ProductPage;
import FinalProject_Objects.ShippingPage;
import FinalProject_Objects.SimpleCaps;
import FinalProject_Objects.Thanksfor;
import FinalProject_Objects.WithPomponsCaps;
import FinalProject_Objects.WomenJeans;
import FinalProject_Objects.WomenTshirts;

public class WomenClothes extends BaseTest{
	
	@Test(description = "Buy a t-shirt without Sign-in")
	public void TC_01() {
		MainProductsPage main = new MainProductsPage(web);
		main.WomenTshirts();
		WomenTshirts shirt = new WomenTshirts(web);
		shirt.Search("Ribbed copper slim fit Tee");
		ProductPage product = new ProductPage(web);
		product.ChooseTshirtSize("M");
		product = new ProductPage(web);
		product.chooseQuantity("3");
		product = new ProductPage(web);
		product.addToCart();
		Cart cart = new Cart(web);
		cart.ChangeQuantity("Ribbed copper slim fit Tee", "2");
		cart = new Cart(web);
		cart.checkout();
		AddressPage address = new AddressPage(web);
		address = new AddressPage(web);
		address.BillingAddress("sharon7@gmail.com", "sharon", "cohen", "", "30 herb st.", "US", "detroit", "", "228312", "0529517282");
		address = new AddressPage(web);
		address.diffAddress();
		address = new AddressPage(web);
		address.useDiffrentAddress("sharon", "cohen", "northern", "30 herb st.", "detroit", "", "US", "2283212", "0528591122");
		address = new AddressPage(web);
		address.next();
		ShippingPage shipping = new ShippingPage(web);
		shipping.chooseCompany("UPS");
		shipping = new ShippingPage(web);
		shipping.nextStep();
		PaymentPage payment = new PaymentPage(web);
		payment.choosePayment("Cash on delivery");
		payment = new PaymentPage(web);
		payment.next();
		OrderSummary order = new OrderSummary(web);
		order.placeOrder();
		String expected = "You have successfully placed an order.";
		Thanksfor thank = new Thanksfor(web);
		String actual = thank.thank();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(description = "Buy a jeans without Sign-in")
	public void TC_02() {
		Thanksfor thank = new Thanksfor(web);
		thank.womenJeans();
		WomenJeans jeans = new WomenJeans(web);
		jeans.Search("111F patched jeans with fancy badges");
		ProductPage product = new ProductPage(web);
		product.chooseJeansSize("XL");
		product = new ProductPage(web);
		product.chooseQuantity("1");
		product = new ProductPage(web);
		product.addToCart();
		Cart cart = new Cart(web);
		cart.checkout();
		AddressPage address = new AddressPage(web);
		address = new AddressPage(web);
		address.BillingAddress("sharon7@gmail.com", "sharon", "cohen", "", "30 herb st.", "US", "detroit", "", "228312", "0529517282");
		address = new AddressPage(web);
		address.next();
		ShippingPage shipping = new ShippingPage(web);
		shipping.chooseCompany("FedEx");
		shipping = new ShippingPage(web);
		shipping.nextStep();
		PaymentPage payment = new PaymentPage(web);
		payment.choosePayment("Cash on delivery");
		payment = new PaymentPage(web);
		payment.next();
		OrderSummary order = new OrderSummary(web);
		order.placeOrder();
		String expected = "You have successfully placed an order.";
		thank = new Thanksfor(web);
		String actual = thank.thank();
		Assert.assertEquals(actual, expected);
	}	
	
	@Test(description = "Buy a dress without Sign-in")
	public void TC_03() {
		Thanksfor thank = new Thanksfor(web);
		thank.Dresses();
		Dresses dresses = new Dresses(web);
		dresses.Search("Off shoulder boho dress");
		ProductPage product = new ProductPage(web);
		product.chooseDressSize("L");
		product = new ProductPage(web);
		product.ChooseDressHeight("Regular"); 
		product = new ProductPage(web);
		product.chooseQuantity("2");
		product = new ProductPage(web);
		product.addToCart();
		Cart cart = new Cart(web);
		cart.checkout();
		AddressPage address = new AddressPage(web);
		address = new AddressPage(web);
		address.BillingAddress("sharon7@gmail.com", "sharon", "cohen", "", "30 herb st.", "US", "detroit", "", "228312", "0529517282");
		address = new AddressPage(web);
		address.next();
		ShippingPage shipping = new ShippingPage(web);
		shipping.chooseCompany("FedEx");
		shipping = new ShippingPage(web);
		shipping.nextStep();
		PaymentPage payment = new PaymentPage(web);
		payment.choosePayment("Cash on delivery");
		payment = new PaymentPage(web);
		payment.next();
		OrderSummary order = new OrderSummary(web);
		order.placeOrder();
		String expected = "You have successfully placed an order.";
		thank = new Thanksfor(web);
		String actual = thank.thank();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(description = "Buy a simple cap without Sign-in")
	public void TC_04() {
		Thanksfor thank = new Thanksfor(web);
		thank.SimpleCaps();
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
		address.BillingAddress("sharon7@gmail.com", "sharon", "cohen", "", "30 herb st.", "US", "detroit", "", "228312", "0529517282");
		address = new AddressPage(web);
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
		thank = new Thanksfor(web);
		String actual = thank.thank();
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "buy a cap with pompons without Sign-in")
	public void TC_05() {
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
		address.BillingAddress("sharon7@gmail.com", "sharon", "cohen", "", "30 herb st.", "US", "detroit", "", "228312", "0529517282");
		address = new AddressPage(web);
		address.next();
		address = new AddressPage(web);
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
