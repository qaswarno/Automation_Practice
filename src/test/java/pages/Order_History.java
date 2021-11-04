package pages;

import org.openqa.selenium.WebDriver;

import base.TestBase;
import utility.TestUtil;

/**
 * 
 * @author Swarnendu
 *
 */
public class Order_History extends TestBase {

	public static WebDriver driver;
	public static String reference_id;
	public static String order_price;
	public static String payment_method;

	public static String order_history_breadcrumb_text = "//span[contains(@class,'navigation_page')]";
	public static String order_reference = "//tr[contains(@class,'first_item')]//a[@class='color-myaccount']";
	public static String orderprice = "//tr[contains(@class,'first_item')]//span[@class='price']";
	public static String paymentmethod = "//tr[contains(@class,'first_item')]//td[@class='history_method']";

	/**
	 * This is the default constructor of the Order_History page
	 * 
	 * @param driver holds the driver reference of the TestBase class
	 */

	public Order_History(WebDriver driver) {
		Order_History.driver = driver;
	}

	/**
	 * This constructor loads the order Reference Id,Order total amount,payment
	 * method and driver reference
	 * 
	 * @param driver holds the driver reference of the TestBase class
	 */

	public Order_History(String reference_id, String order_price, String payment_method, WebDriver driver) {
		Order_History.driver = driver;
		Order_History.reference_id = reference_id;
		Order_History.order_price = order_price;
		Order_History.payment_method = payment_method;
	}

	/**
	 * This function returns the breadcrumb text displaying at the Order History
	 * page
	 * 
	 * @return the breadcrumb text of Order History
	 */
	public static String get_breadcrumb_text() {

		String breadcrumb_text = TestUtil
				.Gettext(TestUtil.getElementByXpath(Order_History.order_history_breadcrumb_text));
		return breadcrumb_text;

	}

	/**
	 * This function returns the order Reference Id displaying at first row of the
	 * order history
	 * 
	 * @return the order Reference id displaying the first row
	 */

	public static String get_order_reference_id() {

		String orderreference = TestUtil.Gettext(TestUtil.getElementByXpath(Order_History.order_reference));
		return orderreference;

	}

	/**
	 * This function returns the Total order Amount displaying at first row of the
	 * order history
	 * 
	 * @return the Total order Amount displaying the first row
	 */

	public static String get_order_price() {

		String orderprice = TestUtil.Gettext(TestUtil.getElementByXpath(Order_History.orderprice));
		return orderprice;

	}

	/**
	 * This function returns the Order Payment Method displaying at first row of the
	 * order history
	 * 
	 * @return the Payment Method displaying the first row
	 */

	public static String get_payment_method() {

		String payment_method = TestUtil.Gettext(TestUtil.getElementByXpath(Order_History.paymentmethod));
		return payment_method;

	}
}
