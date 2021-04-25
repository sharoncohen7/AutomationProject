package FinalProject_Objects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBook extends AccountBar {

	@FindBy(css = ".ui.right.floated.blue.button")
	WebElement AddAddress;

	@FindBy(css = ".column>address>strong")
	List<WebElement> AddressNamesList;

	@FindBy(css = ".ui.vertical.icon.labeled.buttons>div>a")
	WebElement EditList;

	@FindBy(className = "ui labeled icon teal button")
	WebElement SetAsDefault;

	@FindBy(css = ".ui.red.labeled.icon.button")
	WebElement DeleteList;

	@FindBy(id = "confirmation-button")
	WebElement ConfirmDelete;

	@FindBy(css = ".ui.red.basic.cancel.inverted.button")
	WebElement CancleDelete;
	
	//validate
	
	@FindBy(css = ".column>address>strong")
	WebElement AddressName;


	public AddressBook(WebDriver web) {
		super(web);
	}

	public void DeleteList(String listName) {
		sleep(1000);
		for (int i = 0; i < AddressNamesList.size() - 1; i++) {
			if (getText(AddressNamesList.get(i)).equalsIgnoreCase(listName))
				Click(DeleteList);
		}
	}

	public void DefaultList(String listName) {
		sleep(1000);
		for (int i = 0; i < AddressNamesList.size() - 1; i++) {
			if (getText(AddressNamesList.get(i)).equalsIgnoreCase(listName))
				Click(SetAsDefault);
		}
	}

	public void EditList(String listName) {
		sleep(1000);
		for (int i = 0; i < AddressNamesList.size() - 1; i++) {
			if (getText(AddressNamesList.get(i)).equalsIgnoreCase(listName))
				Click(EditList);
			sleep(1000);
		}
	}
	

	public void confirmDelete() {
		Click(ConfirmDelete);
	}

	public void cancleDelete() {
		Click(CancleDelete);
	}

	public void addAddress() {
		Click(AddAddress);
	}
	
	//validation
	
	public String eddMsg() {
		String text = getText(AddressName);
		return text;
	}
	
}
