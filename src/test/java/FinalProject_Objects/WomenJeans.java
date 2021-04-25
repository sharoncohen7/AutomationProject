package FinalProject_Objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenJeans extends ProductsBar{

	@FindBy(css = ".header.sylius-product-name")
	List<WebElement> WomenJeans;
	
	public WomenJeans(WebDriver web) {
		super(web);
	}
	
	public void chooseWomenJeans(String womenJeans) {
		for (int i = 0; i < WomenJeans.size() - 1; i++) {
			if (getText(WomenJeans.get(i)).equalsIgnoreCase(womenJeans))
				Click(WomenJeans.get(i));
			sleep(500);
		}
	}

}
