package FinalProject_Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenTshirts extends ProductsBar {

	@FindBy(css = ".header.sylius-product-name")
	List<WebElement> WomenTshirts;

	public WomenTshirts(WebDriver web) {
		super(web);
	}

	public void chooseWithPomponsCaps(String womenTshirts) {
		for (int i = 0; i < WomenTshirts.size() - 1; i++) {
			if (getText(WomenTshirts.get(i)).equalsIgnoreCase(womenTshirts))
				Click(WomenTshirts.get(i));
			sleep(500);
		}
	}

}
