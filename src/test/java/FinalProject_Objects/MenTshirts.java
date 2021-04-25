package FinalProject_Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenTshirts extends ProductsBar {

	@FindBy(css = ".header.sylius-product-name")
	List<WebElement> MenTshirts;

	public MenTshirts(WebDriver web) {
		super(web);
	}

	public void chooseMenTshirts(String menTshirts) {
		for (int i = 0; i < MenTshirts.size() - 1; i++) {
			if (getText(MenTshirts.get(i)).equalsIgnoreCase(menTshirts))
				Click(MenTshirts.get(i));
			sleep(500);
		}
	}
}
