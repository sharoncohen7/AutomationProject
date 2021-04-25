package FinalProject_Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends ProductsBar {

	@FindBy(css = ".header.sylius-product-name")
	List<WebElement> Products;
	
	public ProductsPage(WebDriver web) {
		super(web);
	}

	public void Products(String product) {
		for (int i = 0; i < Products.size() - 1; i++) {
			if (getText(Products.get(i)).equalsIgnoreCase(product))
				Click(Products.get(i));
		}
	}
}
