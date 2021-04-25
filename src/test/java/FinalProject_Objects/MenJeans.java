package FinalProject_Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenJeans extends ProductsBar {

	@FindBy(css = ".header.sylius-product-name")
	List<WebElement> MenJeans;

	public MenJeans(WebDriver web) {
		super(web);
	}

	public void chooseMenJeans(String Jeans) {
		for (int i = 0; i < MenJeans.size() - 1; i++) {
			if (getText(MenJeans.get(i)).equalsIgnoreCase(Jeans))
				Click(MenJeans.get(i));
			sleep(500);
		}
	}
}