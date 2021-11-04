package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.TestBase;
import utility.ExplicitWait;
import utility.JSLibrary;
import utility.TestUtil;

/**
 * 
 * @author Swarnendu
 *
 */
public class MyAccount extends TestBase {

	public static WebDriver driver;
	public static String my_account_heading = "//h1[contains(text(),'My account')]";
	public static String product_link_start = "//ul[contains(@class,'sf-menu clearfix')]/li/a[contains(text(),'";
	public static String product_link_end = "')]";
	public static String header_user_name = "//div[contains(@class,'header_user_info')]//span";
	public static String personal_information = "//span[contains(text(),'My personal information')]";
	public static String page_breadcrumb = "//span[contains(@class,'navigation_page')]";
	public static String firstname_id = "firstname";
	public static String current_password_id = "old_passwd";
	public static String save_personal_info_button = "//button[contains(@name,'submitIdentity')]";
	public static String personal_info_update_success_message_block="//p[contains(@class,'alert alert-success')]";
	public static String back_to_my_account_button="//ul[contains(@class,'footer_links')]//a[contains(@href,'my-account')]";

	/**
	 * This is the default constructor of the My Account page
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
		ExplicitWait.wait_for_element_present(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				By.xpath(MyAccount.my_account_heading), driver);
		String myaccount_page_title = TestUtil.pageTitle();
		return myaccount_page_title;

	}
	
	/**
	 * This function clicks the desired product category from header menu tab
	 * @param Product_category holds the desired product category name
	 * @return the reference of Product_Listing_and_Checkout page
	 */

	public static Product_Listing_and_Checkout selectProductCategory(String Product_category) {

		TestUtil.click(TestUtil
				.getElementByXpath(MyAccount.product_link_start + Product_category + MyAccount.product_link_end));
		return new Product_Listing_and_Checkout(driver);

	}

	/**
	 * This function clicks the Personal Information button for updating personal information
	 */
	public static void click_personal_information() {

		TestUtil.click(TestUtil.getElementByXpath(MyAccount.personal_information));

	}

	/**
	 * This function get the breadcrumb text of personal information page
	 * @return the breadcrumb text of personal information page
	 */
	public static String get_personal_info_breadcrumb_text() {

		String breadcrumb_text = TestUtil.Gettext(TestUtil.getElementByXpath(MyAccount.page_breadcrumb));
		return breadcrumb_text;

	}
	
	/**
	 * This function updates FirstName field value at personal information block and verifies Updation done successfully
	 * @param firstname holds the info of the updated FirstName 
	 * @param old_password holds the info of the current password
	 */

	public static void update_firstname_personal_info(String firstname,String old_password) {

		JSLibrary.ScrollintoView(driver, TestUtil.getElementById(MyAccount.firstname_id));

		TestUtil.Entertext(TestUtil.getElementById(MyAccount.firstname_id), firstname);
		TestUtil.Entertext(TestUtil.getElementById(MyAccount.current_password_id), old_password);
		JSLibrary.ScrollintoView(driver,TestUtil.getElementByXpath(MyAccount.save_personal_info_button));
		TestUtil.click(TestUtil.getElementByXpath(MyAccount.save_personal_info_button));
		ExplicitWait.wait_for_element_present(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				By.xpath(MyAccount.personal_info_update_success_message_block), driver);
		TestUtil.click(TestUtil.getElementByXpath(MyAccount.back_to_my_account_button));
		ExplicitWait.wait_for_element_present(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				By.xpath(MyAccount.personal_information), driver);
		

	}
	
	/**
	 * This functions returns the displayed User's Name from the header 
	 * @return the User's name displaying at the header
	 */
	public static String get_user_name_from_header() {

		String header_user_name = TestUtil.Gettext(TestUtil.getElementByXpath(MyAccount.header_user_name));
		return header_user_name;

	}

}
