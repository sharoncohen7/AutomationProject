package FinalProject_Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainProductsPage extends MenuBar {

	@FindBy(css = "input[placeholder='Email']")
	WebElement Email;

	@FindBy(css = "button[class='ui button']")
	WebElement Subscribe;

	@FindBy(css = ".header.sylius-product-name")
	List<WebElement> MainproductsList;

	public MainProductsPage(WebDriver web) {
		super(web);
	}

	public void Email(String email) {
		fillForm(Email, email);
	}

	public void subscribe() {
		Click(Subscribe);
	}

	public void mainPageProduct(String product) {
		for (int i = 0; i < MainproductsList.size() - 1; i++) {
			if (getText(MainproductsList.get(i)).equalsIgnoreCase(product))
				Click(MainproductsList.get(i));
		}
	}

	// validation

	public String findProduct(String product) {
		for (int i = 0; i < MainproductsList.size() - 1; i++) {
			if (getText(MainproductsList.get(i)).equalsIgnoreCase(product))
				return product;
		}
		return "error";

	}
}
