package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.TestBase;
import utility.JavaUtility;
import utility.TestUtil;

/**
 * 
 * @author Swarnendu
 *
 */
public class HomePage extends TestBase {

	public static WebDriver driver;
	public static By signinlink =By.xpath("//a[contains(text(),'Sign in')]");

	/**
	 * This is the default constructor of the Home page
	 * 
	 * @param driver holds the driver reference of the TestBase class
	 */
	public HomePage(WebDriver driver) {

		HomePage.driver = driver;
	}

	/**
	 * This function will get the page title of index page and return that title
	 * 
	 * @return the title of index page
	 */
	public static String return_Landing_Page_title() {

		String landing_page_title = driver.getTitle();
		return landing_page_title;

	}

	/**
	 * This function will click the sign in button from header
	 * 
	 * @return the reference of Login page
	 */

	public static LoginPage open_Login_Page() {

		JavaUtility.wait_for_element_clickable(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				signinlink, driver);
		TestUtil.click(TestUtil.getElement(HomePage.signinlink));
		return new LoginPage(driver);

	}
}
