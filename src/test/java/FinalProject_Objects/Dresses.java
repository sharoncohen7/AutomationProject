package FinalProject_Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dresses extends ProductsBar {

	@FindBy(css = ".header.sylius-product-name")
	List<WebElement> Dresses;

	public Dresses(WebDriver web) {
		super(web);
	}

	public void chooseMenJeans(String dresses) {
		for (int i = 0; i < Dresses.size() - 1; i++) {
			if (getText(Dresses.get(i)).equalsIgnoreCase(dresses))
				Click(Dresses.get(i));
		}
	}

}
