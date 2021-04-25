package FinalProject_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistory extends ProductsBar{

	@FindBy(css = ".ui.labeled.icon.button")
	WebElement ShowActions;
	
	//Sort by tags
	
	@FindBy(css = ".sortable.sylius-table-column-number")
	WebElement SortByNumber;
	
	@FindBy(css = ".sortable.sorted.descending.sylius-table-column-checkoutCompletedAt")
	WebElement SortByDate;
	
	@FindBy(css = ".sortable.sylius-table-column-total")
	WebElement SortByTotal;
	
	@FindBy(css = ".sortable.sylius-table-column-state")
	WebElement SortByState;
	

	public OrderHistory(WebDriver web) {
		super(web);
	}

	public void sortNumber() {
		Click(SortByNumber);
	}

	public void sortDate() {
		Click(SortByDate);
	}
	
	public void sortTotal() {
		Click(SortByTotal);
	}
	
	public void sortState() {
		Click(SortByState);
	}

}
