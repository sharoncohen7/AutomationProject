package FinalProject_Tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import utils.Utils;

public class BaseTest {

	WebDriver web;

	@BeforeClass
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "G:\\Program files(x86)\\Selenium\\chromedriver.exe");
		web = new ChromeDriver();
		// Utils u = new Utils();
		web.get(Utils.readProperty("url"));
		web.manage().window().maximize();
		web.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/*@AfterClass
	public void tearDown() {
		web.quit();
	}*/
}
