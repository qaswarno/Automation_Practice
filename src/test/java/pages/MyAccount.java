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
	public static By my_Account_Heading = By.xpath("//h1[contains(text(),'My account')]");
	public static By header_User_Name = By.xpath("//div[contains(@class,'header_user_info')]//span");
	public static By personal_Information = By.xpath("//span[contains(text(),'My personal information')]");
	public static By page_Breadcrumb = By.xpath("//span[contains(@class,'navigation_page')]");
	public static By firstname_Id = By.id("firstname");
	public static By current_Password_Id = By.id("old_passwd");
	public static By save_Personal_Info_Button = By.xpath("//button[contains(@name,'submitIdentity')]");
	public static By personal_Info_Update_Success_Message_Block = By
			.xpath("//p[contains(@class,'alert alert-success')]");
	public static By back_To_My_Account_Button = By
			.xpath("//ul[contains(@class,'footer_links')]//a[contains(@href,'my-account')]");

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
		JavaUtility.wait_For_Element_Present(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				MyAccount.my_Account_Heading, driver);
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
	public static void click_Personal_Information() {

		TestUtil.click(TestUtil.getElement(MyAccount.personal_Information));

	}

	/**
	 * This function get the breadcrumb text of personal information page
	 * 
	 * @return the breadcrumb text of personal information page
	 */
	public static String get_Personal_Info_Breadcrumb_Text() {

		String breadcrumb_text = TestUtil.gettext(TestUtil.getElement(MyAccount.page_Breadcrumb));
		return breadcrumb_text;

	}

	/**
	 * This function updates FirstName field value at personal information block and
	 * verifies Updation done successfully
	 * 
	 * @param firstname    holds the info of the updated FirstName
	 * @param old_password holds the info of the current password
	 */

	public static void update_Firstname_Personal_Info(String firstname, String old_password) {

		JSLibrary.scroll_Into_View(driver, TestUtil.getElement(MyAccount.firstname_Id));

		TestUtil.entertext(TestUtil.getElement(MyAccount.firstname_Id), firstname);
		TestUtil.entertext(TestUtil.getElement(MyAccount.current_Password_Id), old_password);
		JSLibrary.scroll_Into_View(driver, TestUtil.getElement(MyAccount.save_Personal_Info_Button));
		TestUtil.click(TestUtil.getElement(MyAccount.save_Personal_Info_Button));
		JavaUtility.wait_For_Element_Present(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				MyAccount.personal_Info_Update_Success_Message_Block, driver);
		TestUtil.click(TestUtil.getElement(MyAccount.back_To_My_Account_Button));
		JavaUtility.wait_For_Element_Present(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				MyAccount.personal_Information, driver);

	}

	/**
	 * This functions returns the displayed User's Name from the header
	 * 
	 * @return the User's name displaying at the header
	 */
	public static String get_User_Name_From_Header() {

		String header_user_name = TestUtil.gettext(TestUtil.getElement(MyAccount.header_User_Name));
		return header_user_name;

	}

}
