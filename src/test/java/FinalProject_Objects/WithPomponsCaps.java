package FinalProject_Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WithPomponsCaps extends ProductsBar {

	@FindBy(css = ".header.sylius-product-name")
	List<WebElement> WithPomponsCaps;

	public WithPomponsCaps(WebDriver web) {
		super(web);
	}

	public void chooseWithPomponsCaps(String PomCaps) {
		for (int i = 0; i < WithPomponsCaps.size() - 1; i++) {
			if (getText(WithPomponsCaps.get(i)).equalsIgnoreCase(PomCaps))
				Click(WithPomponsCaps.get(i));
			sleep(500);
		}
	}

}
