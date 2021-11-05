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

public class CheckoutProcess extends TestBase {

	public static WebDriver driver;
	public static By product_price = By.xpath(
			"//div[contains(@class,'quick-view-wrapper')]//following-sibling::div[contains(@class,'content_price')]/span[contains(@class,'price product-price')]");
	public static By add_to_cart = By.xpath("//span[contains(text(),'Add to cart')]//parent::a");
	public static By proceed_to_checkout = By.xpath("//a[contains(@title,'Proceed to checkout')]");
	public static By product_name_for_checkout = By.xpath("//span[contains(@id,'cart_product_title')]");
	public static By product_price_for_checkout = By.cssSelector("span#layer_cart_product_price");
	public static By total_price_for_checkout = By
			.xpath("//div[contains(@id,'layer_cart')]//span[contains(@class,'ajax_block_cart_total')]");
	public static By checkout_pages_breadcrumb_common = By.xpath("//span[contains(@class,'navigation_page')]");
	public static By shopping_cart_product_display = By.xpath("//td[contains(@class,'cart_description')]/p/a");
	public static By shopping_cart_product_price = By.cssSelector("td#total_product");
	public static By shopping_cart_total_price = By.cssSelector("span#total_price");
	public static By shopping_cart_page_proceed_checkout_button = By
			.xpath("//p[contains(@class,'cart_navigation')]/a[contains(@title,'Proceed to checkout')]");
	public static By checkout_pages_common_proceed_to_checkout = By
			.xpath("//button[contains(@class,'button btn btn-default')]");
	public static By shipping_pages_terms_checkbox_id = By.id("cgv");
	public static By order_summary_heading = By.xpath("//h1[contains(@class,'page-heading')]");
	public static By order_summary_order_total_amount_id = By.id("amount");
	public static By order_confirmation_price = By.xpath("//span[contains(@class,'price')]/strong");
	public static By order_confirmation_text = By.xpath("//div[@class='box']");
	public static By order_history_link = By.xpath("//a[contains(@title,'Back to orders')]");
	public static String product_category_locator_start = "//h1[starts-with(@class,'page-heading')]/span[contains(text(),'";
	public static String product_locator_start = "//a[contains(text(),'";
	public static String payment_method_locator_start = "//a[contains(@class,'";
	public static String locator_end_common = "')]";

	/**
	 * This is the default constructor of the Product_Listing_and_Checkout page
	 * 
	 * @param driver holds the driver reference of the TestBase class
	 */

	public CheckoutProcess(WebDriver driver) {
		CheckoutProcess.driver = driver;
	}

	/**
	 * This function returns the page title of the Product Listing page
	 * 
	 * @return the page title of ProductListing page
	 */

	public static String return_ProductListing_Page_Title() {

		String login_page_title = TestUtil.pageTitle();
		return login_page_title;

	}

	/**
	 * This functions brings the product listing section into visible area
	 * 
	 * @param Product_category holds the product category name
	 */

	public static void scroll_To_Product_Listing_Section(String Product_category) {

		JSLibrary.ScrollintoView(driver, TestUtil.getElementByXpath(CheckoutProcess.product_category_locator_start
				+ Product_category + CheckoutProcess.locator_end_common));

	}

	/**
	 * This function gets the product unit price and returns the same
	 * 
	 * @param Product holds the product name
	 * @return product unit price
	 */

	public static String get_Product_Price(String Product) {

		TestUtil.moveToElement(driver, TestUtil.getElementByXpath(
				CheckoutProcess.product_locator_start + Product + CheckoutProcess.locator_end_common));
		JavaUtility.wait_for_element_clickable(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				CheckoutProcess.add_to_cart, driver);
		String prod_price = TestUtil.Gettext(TestUtil.getElement(CheckoutProcess.product_price));
		return prod_price;

	}

	/**
	 * This function clicks the add to cart button
	 */
	public static void add_Product_To_Cart() {

		TestUtil.click(TestUtil.getElement(CheckoutProcess.add_to_cart));

	}

	/**
	 * This function returns the product name displaying at the popup
	 * 
	 * @return the product name showing at the popup
	 */

	public static String get_Product_Name_For_Checkout() {

		JavaUtility.wait_for_element_clickable(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				CheckoutProcess.proceed_to_checkout, driver);

		String productname = TestUtil.Gettext(TestUtil.getElement(CheckoutProcess.product_name_for_checkout));

		return productname;

	}

	/**
	 * This function returns the product unit price displaying at the popup
	 * 
	 * @return the product unit price showing at the popup
	 */

	public static String get_Product_Price_For_Checkout() {

		JavaUtility.wait_for_element_clickable(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				CheckoutProcess.proceed_to_checkout, driver);

		String productprice = TestUtil.Gettext(TestUtil.getElement(CheckoutProcess.product_price_for_checkout));

		return productprice;

	}

	/**
	 * This function returns the total order price displaying at the popup
	 * 
	 * @return the total order price showing at the popup
	 */

	public static String get_Total_Price_For_Checkout() {

		JavaUtility.wait_for_element_clickable(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				CheckoutProcess.proceed_to_checkout, driver);
		String totalprice = TestUtil.Gettext(TestUtil.getElement(CheckoutProcess.total_price_for_checkout));

		return totalprice;

	}

	/**
	 * This function clicks on the Proceed to check out button at the popup
	 */

	public static void click_Proceed_To_Checkout_Popup() {

		TestUtil.click(TestUtil.getElement(CheckoutProcess.proceed_to_checkout));

	}

	/**
	 * This is a common function called during the checkout process which returns
	 * the breadcrumb text displays at different phases of the checkout
	 * 
	 * @return displayed breadcrumb text
	 */

	public static String get_Checkout_Pages_Breadcrumb_Text() {

		String breadcrumb_text = TestUtil
				.Gettext(TestUtil.getElement(CheckoutProcess.checkout_pages_breadcrumb_common));
		return breadcrumb_text;

	}

	/**
	 * This function returns the product name showing at the shopping cart
	 * 
	 * @return the product name
	 */

	public static String get_Shopping_Cart_Product_Name() {

		JSLibrary.ScrollintoView(driver, TestUtil.getElement(CheckoutProcess.checkout_pages_breadcrumb_common));
		String shopping_cart_product_name = TestUtil
				.Gettext(TestUtil.getElement(CheckoutProcess.shopping_cart_product_display));

		return shopping_cart_product_name;

	}

	/**
	 * This function returns the product unit price showing at the shopping cart
	 * 
	 * @return the product unit price
	 */

	public static String get_Shopping_Cart_Product_Price() {

		String shopping_cart_product_price = TestUtil
				.Gettext(TestUtil.getElement(CheckoutProcess.shopping_cart_product_price));
		return shopping_cart_product_price;

	}

	/**
	 * This function returns the total ordert price showing at the shopping cart
	 * 
	 * @return the total order price
	 */

	public static String get_Shopping_Cart_Total_Price() {

		String shopping_cart_total_price = TestUtil
				.Gettext(TestUtil.getElement(CheckoutProcess.shopping_cart_total_price));
		return shopping_cart_total_price;

	}

	/**
	 * This function clicks on the proceed to checkout button at shopping cart page
	 */

	public static void proceed_To_Checkout_Shopping_Cart_Page() {

		JSLibrary.ScrollintoView(driver,
				TestUtil.getElement(CheckoutProcess.shopping_cart_page_proceed_checkout_button));

		TestUtil.click(TestUtil.getElement(CheckoutProcess.shopping_cart_page_proceed_checkout_button));

	}

	/*
	 * This is a common function calls during the different phases of the checkout
	 * process which clicks on the proceed to checkout button
	 * 
	 */

	public static void proceed_To_Checkout_Common() {

		JSLibrary.ScrollintoView(driver,
				TestUtil.getElement(CheckoutProcess.checkout_pages_common_proceed_to_checkout));

		TestUtil.click(TestUtil.getElement(CheckoutProcess.checkout_pages_common_proceed_to_checkout));

	}

	/**
	 * This function clicks the terms and condition checkbox at the shipping tab
	 */

	public static void click_Terms_Checkbox_Shipping_Tab() {

		JSLibrary.ScrollintoView(driver, TestUtil.getElement(CheckoutProcess.shipping_pages_terms_checkbox_id));

		TestUtil.click(TestUtil.getElement(CheckoutProcess.shipping_pages_terms_checkbox_id));

	}

	/**
	 * This function clicks the desired payment method at the payment tab
	 * 
	 * @param payment_method holds the desired payment method info
	 */

	public static void select_Payment_Method(String payment_method) {

		JSLibrary.ScrollintoView(driver, TestUtil.getElementByXpath(
				CheckoutProcess.payment_method_locator_start + payment_method + CheckoutProcess.locator_end_common));

		TestUtil.click(TestUtil.getElementByXpath(
				CheckoutProcess.payment_method_locator_start + payment_method + CheckoutProcess.locator_end_common));

	}

	/**
	 * This function returns the heading at the Order Summary page
	 * 
	 * @return the heading of Order Summary page
	 */

	public static String get_Order_Summary_Heading() {

		JSLibrary.ScrollintoView(driver, TestUtil.getElement(CheckoutProcess.order_summary_heading));
		String order_summary_heading = TestUtil.Gettext(TestUtil.getElement(CheckoutProcess.order_summary_heading));
		return order_summary_heading;

	}

	/**
	 * This function returns the total order amount at the Order Summary page
	 * 
	 * @return the total order amount
	 */

	public static String get_Order_Summary_Order_Amount() {

		String order_amount = TestUtil
				.Gettext(TestUtil.getElement(CheckoutProcess.order_summary_order_total_amount_id));
		return order_amount;

	}

	/**
	 * This function returns the total order amount at the Order Confirmation page
	 * 
	 * @return the total order amount
	 */

	public static String get_Order_Confirmation_Order_Amount() {

		String order_confirmation_amount = TestUtil
				.Gettext(TestUtil.getElement(CheckoutProcess.order_confirmation_price));
		return order_confirmation_amount;

	}

	/**
	 * This function returns the order Reference Id showing at the Order
	 * Confirmation page
	 * 
	 * @return the order Reference Id
	 */

	public static String get_Order_Confirmation_Reference_Id() {

		String order_confirmation_text = TestUtil.Gettext(TestUtil.getElement(CheckoutProcess.order_confirmation_text));
		int index_reference_text = order_confirmation_text.indexOf("reference");
		String reference_id = order_confirmation_text.substring(index_reference_text + 10, index_reference_text + 19);
		return reference_id;

	}

	/**
	 * This function clicks on the back to order button at the Order Confirmation
	 * page
	 * 
	 * @param reference_id   holds the Order Reference Id
	 * @param order_price    holds the Total Order Amount
	 * @param payment_method holds the Payment Method opted for the order
	 * @param driver         driver reference
	 * @return the reference of Order_History page
	 */

	public static Order_History open_Order_History(String reference_id, String order_price, String payment_method,
			WebDriver driver) {

		TestUtil.click(TestUtil.getElement(CheckoutProcess.order_history_link));
		return new Order_History(reference_id, order_price, payment_method, driver);

	}

}
