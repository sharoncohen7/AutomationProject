package FinalProject_Objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver web;
	JavascriptExecutor js;

	public BasePage(WebDriver web) {
		super();
		this.web = web;
		js = (JavascriptExecutor)web;
		PageFactory.initElements(web, this);
	}

	public WebDriver getWeb() {
		return web;
	}

	public void setWeb(WebDriver web) {
		this.web = web;
	}

	public void Click(WebElement web) {
		//highlight
		sleep(500);
		js.executeScript("arguments[0].setAttribute('style', 'background-color:Coral; border: 1px solid orange;');", web);
		web.click();
	}

	public void fillForm(WebElement web, String text) {
		web.clear();
		web.sendKeys(text);
	}

	public String getText(WebElement we) {
		return we.getText();
	}

	public void sleep(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void alert(String text) {
		web.switchTo().alert().sendKeys(text);
		web.switchTo().alert().accept();
	}

	public void hover(WebElement we) {
		Actions actions = new Actions(web);
		actions.moveToElement(we).build().perform();
	}

	public void choose(WebElement web, String attribute, String text) {
		String value = web.getAttribute(attribute);
		if (value.equalsIgnoreCase(text))
			Click(web);
	}

}
