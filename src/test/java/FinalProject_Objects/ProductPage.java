package FinalProject_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends ProductsBar {

	@FindBy(id = "sylius_add_to_cart_cartItem_variant_jeans_size")
	WebElement Size;

	@FindBy(id = "sylius_add_to_cart_cartItem_variant_dress_size")
	WebElement DressSize;

	@FindBy(id = "sylius_add_to_cart_cartItem_variant_dress_height")
	WebElement DressHeight;

	@FindBy(id = "sylius_add_to_cart_cartItem_variant_t_shirt_size")
	WebElement TshirtSize;

	@FindBy(id = "sylius_add_to_cart_cartItem_quantity")
	WebElement Quantity;

	@FindBy(css = ".ui.huge.primary.icon.labeled.button")
	WebElement AddToCart;
	
	@FindBy(css = ".ui.text.menu>a:nth-child(3)")
	WebElement AddReview;
	
	@FindBy(css = ".ui.top.attached.large.tabular.menu>a:nth-child(1)")
	WebElement DetailsTab;
	
	@FindBy(css = ".ui.top.attached.large.tabular.menu>a:nth-child(2)")
	WebElement AttributesTab;
	
	@FindBy(css = ".ui.top.attached.large.tabular.menu>a:nth-child(3)")
	WebElement ReviewsTab;

	public ProductPage(WebDriver web) {
		super(web);
	}

	public void chooseJeansSize(String JeansSize) {
		Select jeansSize = new Select(Size);
		jeansSize.selectByVisibleText(JeansSize);
		sleep(500);
	}

	public void chooseDressSize(String dresssize) {
		Select dressSize = new Select(DressSize);
		dressSize.selectByVisibleText(dresssize);
		sleep(500);
	}

	public void ChooseDressHeight(String height) {
		Select dressHeight = new Select(DressHeight);
		dressHeight.selectByVisibleText(height);
		sleep(500);
	}

	public void ChooseTshirtSize(String tshirtSize) {
		Select dressHeight = new Select(TshirtSize);
		dressHeight.selectByVisibleText(tshirtSize);
		sleep(500);
	}

	public void chooseQuantity(String quantity) {
		fillForm(Quantity, quantity);
		sleep(500);
	}

	public void addToCart() {
		Click(AddToCart);
		sleep(500);
	}
	
	public void addReview() {
		Click(AddReview);
		sleep(500);
	}
	
	public void details() {
		Click(DetailsTab);
		sleep(500);
	}
	
	public void attributes() {
		Click(AttributesTab);
		sleep(500);
	}
	
	public void reviews() {
		Click(ReviewsTab);
		sleep(500);
	}

}
