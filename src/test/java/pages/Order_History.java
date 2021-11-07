package pages;

import org.openqa.selenium.By;
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

	public static By order_History_Breadcrumb_Text = By.xpath("//span[contains(@class,'navigation_page')]");
	public static By order_Reference = By.xpath("//tr[contains(@class,'first_item')]//a[@class='color-myaccount']");
	public static By order_Price = By.xpath("//tr[contains(@class,'first_item')]//span[@class='price']");
	public static By payment_Method = By.xpath("//tr[contains(@class,'first_item')]//td[@class='history_method']");

	/**
	 * This is the default constructor of the Order_History page
	 * 
	 * @param driver holds the driver reference of the TestBase class
	 */

	public Order_History(WebDriver driver) {
		Order_History.driver = driver;
	}

	/**
	 * This function returns the breadcrumb text displaying at the Order History
	 * page
	 * 
	 * @return the breadcrumb text of Order History
	 */
	public static String get_Breadcrumb_Text() {

		String breadcrumb_text = TestUtil.gettext(TestUtil.getElement(Order_History.order_History_Breadcrumb_Text));
		return breadcrumb_text;

	}

	/**
	 * This function returns the order Reference Id displaying at first row of the
	 * order history
	 * 
	 * @return the order Reference id displaying the first row
	 */

	public static String get_Order_Reference_Id() {

		String orderreference = TestUtil.gettext(TestUtil.getElement(Order_History.order_Reference));
		return orderreference;

	}

	/**
	 * This function returns the Total order Amount displaying at first row of the
	 * order history
	 * 
	 * @return the Total order Amount displaying the first row
	 */

	public static String get_Order_Price() {

		String orderprice = TestUtil.gettext(TestUtil.getElement(Order_History.order_Price));
		return orderprice;

	}

	/**
	 * This function returns the Order Payment Method displaying at first row of the
	 * order history
	 * 
	 * @return the Payment Method displaying the first row
	 */

	public static String get_Payment_Method() {

		String payment_method = TestUtil.gettext(TestUtil.getElement(Order_History.payment_Method));
		return payment_method;

	}
}
