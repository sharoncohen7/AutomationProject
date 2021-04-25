package FinalProject_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummary extends PaymentBar{

	@FindBy(css = ".ui.huge.primary.fluid.icon.labeled.button")
	WebElement PlaceOrder;
	
	public OrderSummary(WebDriver web) {
		super(web);
	}
	
	public void placeOrder() {
		Click(PlaceOrder);
	}
	
	

}
