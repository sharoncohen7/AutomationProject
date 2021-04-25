package FinalProject_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Review extends MenuBar {

	public Review(WebDriver web) {
		super(web);
	}

	@FindBy(css = "#sylius_product_review_title")
	WebElement Title;

	@FindBy(css = "#sylius_product_review_comment")
	WebElement Comment;

	@FindBy(css = "#sylius_product_review_author_email")
	WebElement Email;

	@FindBy(css = ".ui.blue.labeled.large.icon.submit.button")
	WebElement Add;

	public void Star(int num) {
		WebElement rev = web.findElement(By.cssSelector(".ui.huge.star.rating>i:nth-child("+num+")"));
		Click(rev);
	}


	public void reviewForm(String title, String comment, String email) {
		fillForm(Title, title);
		fillForm(Comment, comment);
		fillForm(Email, email);
	}

	public void add() {
		Click(Add);
	}
}
