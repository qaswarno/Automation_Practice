package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.TestBase;
import utility.JSLibrary;
import utility.JavaUtility;
import utility.TestUtil;

/**
 * 
 * @author Swarnendu
 *
 */
public class MyAccount extends TestBase {

	public static WebDriver driver;
	public static By my_account_heading = By.xpath("//h1[contains(text(),'My account')]");
	public static By header_user_name = By.xpath("//div[contains(@class,'header_user_info')]//span");
	public static By personal_information = By.xpath("//span[contains(text(),'My personal information')]");
	public static By page_breadcrumb = By.xpath("//span[contains(@class,'navigation_page')]");
	public static By firstname_id = By.id("firstname");
	public static By current_password_id = By.id("old_passwd");
	public static By save_personal_info_button = By.xpath("//button[contains(@name,'submitIdentity')]");
	public static By personal_info_update_success_message_block = By.xpath("//p[contains(@class,'alert alert-success')]");
	public static By back_to_my_account_button = By.xpath("//ul[contains(@class,'footer_links')]//a[contains(@href,'my-account')]");

	/**
	 * This is the default constructor of the My Account page
	 * 
	 * @param driver holds the driver reference of the TestBase class
	 */

	public MyAccount(WebDriver driver) {

		MyAccount.driver = driver;
	}

	/**
	 * This function will get the page title of MyAccount page and return that title
	 * 
	 * @return the title of MyAccount page
	 */

	public static String return_MyAccount_Page_title() {
		JavaUtility.wait_for_element_present(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				MyAccount.my_account_heading, driver);
		String myaccount_page_title = TestUtil.pageTitle();
		return myaccount_page_title;

	}

	/**
	 * This function clicks the desired product category from header menu tab
	 * 
	 * @param Product_category holds the desired product category name
	 * @return the reference of Product_Listing_and_Checkout page
	 */

	public static CheckoutProcess selectProductCategory(String Product_category) {

		TestUtil.click(TestUtil.getElementByXpath(
				"//ul[contains(@class,'sf-menu clearfix')]/li/a[contains(text(),'" + Product_category + "')]"));
		return new CheckoutProcess(driver);

	}

	/**
	 * This function clicks the Personal Information button for updating personal
	 * information
	 */
	public static void click_personal_information() {

		TestUtil.click(TestUtil.getElement(MyAccount.personal_information));

	}

	/**
	 * This function get the breadcrumb text of personal information page
	 * 
	 * @return the breadcrumb text of personal information page
	 */
	public static String get_personal_info_breadcrumb_text() {

		String breadcrumb_text = TestUtil.Gettext(TestUtil.getElement(MyAccount.page_breadcrumb));
		return breadcrumb_text;

	}

	/**
	 * This function updates FirstName field value at personal information block and
	 * verifies Updation done successfully
	 * 
	 * @param firstname    holds the info of the updated FirstName
	 * @param old_password holds the info of the current password
	 */

	public static void update_firstname_personal_info(String firstname, String old_password) {

		JSLibrary.ScrollintoView(driver, TestUtil.getElement(MyAccount.firstname_id));

		TestUtil.Entertext(TestUtil.getElement(MyAccount.firstname_id), firstname);
		TestUtil.Entertext(TestUtil.getElement(MyAccount.current_password_id), old_password);
		JSLibrary.ScrollintoView(driver, TestUtil.getElement(MyAccount.save_personal_info_button));
		TestUtil.click(TestUtil.getElement(MyAccount.save_personal_info_button));
		JavaUtility.wait_for_element_present(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				MyAccount.personal_info_update_success_message_block, driver);
		TestUtil.click(TestUtil.getElement(MyAccount.back_to_my_account_button));
		JavaUtility.wait_for_element_present(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				MyAccount.personal_information, driver);

	}

	/**
	 * This functions returns the displayed User's Name from the header
	 * 
	 * @return the User's name displaying at the header
	 */
	public static String get_user_name_from_header() {

		String header_user_name = TestUtil.Gettext(TestUtil.getElement(MyAccount.header_user_name));
		return header_user_name;

	}

}
