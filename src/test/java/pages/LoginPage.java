package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.TestBase;
import utility.ExplicitWait;
import utility.TestUtil;

/**
 * @author Swarnendu
 *
 */
public class LoginPage extends TestBase {

	public static WebDriver driver;
	public static String already_register_heading = "//h3[contains(text(),'Already registered')]";
	public static String email_textfield = "email";
	public static String password_textfield = "passwd";
	public static String login_button = "SubmitLogin";

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

		ExplicitWait.wait_for_element_present(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				By.xpath(LoginPage.already_register_heading), driver);

		TestUtil.Entertext(TestUtil.getElementById(LoginPage.email_textfield), username);
		TestUtil.Entertext(TestUtil.getElementById(LoginPage.password_textfield), Password);
		TestUtil.click(TestUtil.getElementById(LoginPage.login_button));
		return new MyAccount(driver);

	}

}
