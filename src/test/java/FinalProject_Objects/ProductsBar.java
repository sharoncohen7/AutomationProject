package FinalProject_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsBar extends MenuBar {

	@FindBy(css = ".up.arrow.icon")
	WebElement levelUp;

	@FindBy(id = "criteria_search_value")
	WebElement Search;

	@FindBy(css = ".ui.negative.icon.labeled.button")
	WebElement Clear;

	@FindBy(css = ".ui.primary.icon.labeled.button")
	WebElement SearchBtn;


	@FindBy(css = ".twelve.wide.column > div:nth-child(3) > div > div")
	WebElement Show;

	@FindBy(css = ".ui.inline.dropdown>i:nth-child(2)")
	WebElement SortBy;

	@FindBy(css = ".ui.monster.dividing.header")
	WebElement ProductName;

	@FindBy(css = ".header.sylius-product-name")
	WebElement productName;

	public ProductsBar(WebDriver web) {
		super(web);
	}

	public void goLevelUp() {
		Click(levelUp);
		sleep(500);
	}

	public void Search(String search) {
		fillForm(Search, search);
		Click(SearchBtn);
		Click(productName);
		sleep(500);
	}

	public void Show(String numOfItems) {
		choose(Show, "class", numOfItems);

	}

	public void clear() {
		sleep(500);
		Click(Clear);
		sleep(500);
	}

	// Validation

	public String productName(String name) {
		if (getText(ProductName).equalsIgnoreCase(name))
			return name;

		return "error";
	}
}