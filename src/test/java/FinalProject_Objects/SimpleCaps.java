package FinalProject_Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleCaps extends ProductsBar{

	@FindBy(css = ".header.sylius-product-name")
	List<WebElement> SimpleCaps;
	
	public SimpleCaps(WebDriver web) {
		super(web);
	}
	
	public void chooseSimpleCaps(String simpCaps) {
		for (int i = 0; i < SimpleCaps.size() - 1; i++) {
			if (getText(SimpleCaps.get(i)).equalsIgnoreCase(simpCaps))
				Click(SimpleCaps.get(i));
			sleep(500);
		}
	}

}
