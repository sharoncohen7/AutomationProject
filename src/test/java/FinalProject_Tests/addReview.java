package FinalProject_Tests;

import org.testng.annotations.Test;
import FinalProject_Objects.MainProductsPage;
import FinalProject_Objects.MenTshirts;
import FinalProject_Objects.ProductPage;
import FinalProject_Objects.Review;


public class addReview extends BaseTest{

	
	@Test(description = "writing reivew")
	public void review() {
		MainProductsPage main = new MainProductsPage(web);
		main.MenTshirts();
		MenTshirts shirt = new MenTshirts(web);
		shirt.Search("Sport basic white T-Shirt");
		ProductPage product = new ProductPage(web);
		product.addReview();
		Review review = new Review(web);
		review.Star(2);
        review = new Review(web);
		review.reviewForm("my review", "this is a test", "sharon21@gmail.com");
        review = new Review(web);
        review.add();
	}

}
