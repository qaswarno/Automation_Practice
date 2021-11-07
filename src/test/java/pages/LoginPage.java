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
	public static By already_Register_Heading = By.xpath("//h3[contains(text(),'Already registered')]");
	public static By email_Textfield = By.id("email");
	public static By password_Textfield = By.id("passwd");
	public static By login_Button =By.id("SubmitLogin");

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

	public static String return_Login_Page_Title() {

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

		JavaUtility.wait_For_Element_Present(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				already_Register_Heading, driver);

		TestUtil.entertext(TestUtil.getElement(LoginPage.email_Textfield), username);
		TestUtil.entertext(TestUtil.getElement(LoginPage.password_Textfield), Password);
		TestUtil.click(TestUtil.getElement(LoginPage.login_Button));
		return new MyAccount(driver);

	}

}
