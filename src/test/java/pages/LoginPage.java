package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.TestBase;
import utility.JavaUtility;
import utility.TestUtil;

/**
 * @author Swarnendu
 *
 */
public class LoginPage extends TestBase {

	public static WebDriver driver;
	public static By already_register_heading = By.xpath("//h3[contains(text(),'Already registered')]");
	public static By email_textfield = By.id("email");
	public static By password_textfield = By.id("passwd");
	public static By login_button =By.id("SubmitLogin");

	/**
	 * This is the default constructor of the login page
	 * @param driver holds the driver reference of the TestBase class
	 */
	
	public LoginPage(WebDriver driver) {

		LoginPage.driver = driver;
	}

	/**
	 * This function will get the page title of login page and return that title
	 * 
	 * @return Login page title
	 */

	public static String return_login_Page_title() {

		String login_page_title = TestUtil.pageTitle();
		return login_page_title;

	}

	/**
	 * This function will be use to enter the login credentials into the system
	 * 
	 * @param username this variable feed the username to the function
	 * @param Password this variable feed the password to the function
	 * @return the reference of MyAccount page
	 */

	public static MyAccount login(String username, String Password) {

		JavaUtility.wait_for_element_present(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				already_register_heading, driver);

		TestUtil.Entertext(TestUtil.getElement(LoginPage.email_textfield), username);
		TestUtil.Entertext(TestUtil.getElement(LoginPage.password_textfield), Password);
		TestUtil.click(TestUtil.getElement(LoginPage.login_button));
		return new MyAccount(driver);

	}

}
