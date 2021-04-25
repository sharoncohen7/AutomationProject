package FinalProject_Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart extends MenuBar {

	@FindBy(css = "#sylius-cart-clear")
	WebElement ClearCart;

	@FindBy(id = "sylius_cart_items_0_quantity")
	WebElement CartQuantity;

	@FindBy(css = ".ui.circular.icon.button.sylius-cart-remove-button")
	WebElement ClearItem;

	@FindBy(css = ".sylius-product-name")
	List<WebElement> ItemName;

	@FindBy(id = "sylius_cart_promotionCoupon")
	WebElement EnterCouponCode;

	@FindBy(id = "sylius-save")
	WebElement ApplyCoupon;

	@FindBy(css = ".ui.icon.labeled.large.button")
	WebElement UpdateCart;

	@FindBy(css = ".ui.huge.primary.fluid.labeled.icon.button")
	WebElement Checkout;

	public Cart(WebDriver web) {
		super(web);
	}

	public void clearCart() {
		Click(ClearCart);
	}

	public void ChangeQuantity(String itemName, String quantity) {
		for (int i = 0; i < ItemName.size() - 1; i++) {
			if (getText(ItemName.get(i)).equalsIgnoreCase(itemName))
				fillForm(CartQuantity, quantity);
			sleep(500);
		}
	}

	public void clearItem(String itemName) {
		for (int i = 0; i < ItemName.size() - 1; i++) {
			if (getText(ItemName.get(i)).equalsIgnoreCase(itemName))
				Click(ClearItem);
			sleep(500);
		}
	}

	public void enterCoupon(String code) {
		fillForm(EnterCouponCode, code);
		Click(ApplyCoupon);
	}

	public void updateCart() {
		Click(UpdateCart);
	}

	public void checkout() {
		Click(Checkout);
	}

}
