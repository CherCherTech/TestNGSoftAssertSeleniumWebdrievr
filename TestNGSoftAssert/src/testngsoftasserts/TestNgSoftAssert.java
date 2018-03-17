package testngsoftasserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

public class TestNgSoftAssert {
	public static void main(String[] args) {
		
		// set the geckodriver.exe property
		System.setProperty("webdriver.gecko.driver", "C:/Users/user/Pictures/geckodriver.exe");
				
		WebDriver driver = new FirefoxDriver();
		driver.get("http://chercher.tech");
		
		SoftAssert sa = new SoftAssert();
		// compare the titles
		sa.assertEquals(driver.getTitle(), "Google", "title is not google");
		//try to print the statement
		System.out.println("this step should execute");
		System.out.println("this step also gets executed");
		// execute all the statement before below step
		sa.assertAll();
		// below step will not be executed
		System.out.println("This step will not be executed");
	}
}
