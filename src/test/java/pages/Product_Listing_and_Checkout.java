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

public class Product_Listing_and_Checkout extends TestBase {

	public static WebDriver driver;
	public static String product_listing_heading_start = "//h1[starts-with(@class,'page-heading')]/span[contains(text(),'";
	public static String product_listing_heading_end = "')]";
	public static String product_name_start = "//a[contains(text(),'";
	public static String product_name_end = "')]";
	public static String product_price = "//div[contains(@class,'quick-view-wrapper')]//following-sibling::div[contains(@class,'content_price')]/span[contains(@class,'price product-price')]";
	public static String add_to_cart = "//span[contains(text(),'Add to cart')]//parent::a";
	public static String proceed_to_checkout = "//a[contains(@title,'Proceed to checkout')]";
	public static String product_name_for_checkout = "//span[contains(@id,'cart_product_title')]";
	public static String product_price_for_checkout = "span#layer_cart_product_price";
	public static String total_price_for_checkout = "//div[contains(@id,'layer_cart')]//span[contains(@class,'ajax_block_cart_total')]";
	public static String checkout_pages_breadcrumb_common = "//span[contains(@class,'navigation_page')]";
	public static String shopping_cart_product_display = "//td[contains(@class,'cart_description')]/p/a";
	public static String shopping_cart_product_price = "td#total_product";
	public static String shopping_cart_total_price = "span#total_price";
	public static String shopping_cart_page_proceed_checkout_button = "//p[contains(@class,'cart_navigation')]/a[contains(@title,'Proceed to checkout')]";
	public static String checkout_pages_common_proceed_to_checkout = "//button[contains(@class,'button btn btn-default')]";
	public static String shipping_pages_terms_checkbox_id = "cgv";
	public static String payment_method_selection_start = "//a[contains(@class,'";
	public static String payment_method_selection_end = "')]";
	public static String order_summary_heading = "//h1[contains(@class,'page-heading')]";
	public static String order_summary_order_total_amount_id = "amount";
	public static String order_confirmation_price = "//span[contains(@class,'price')]/strong";
	public static String order_confirmation_text = "//div[@class='box']";
	public static String order_history_link = "//a[contains(@title,'Back to orders')]";

	/**
	 * This is the default constructor of the Product_Listing_and_Checkout page
	 * 
	 * @param driver holds the driver reference of the TestBase class
	 */

	public Product_Listing_and_Checkout(WebDriver driver) {
		Product_Listing_and_Checkout.driver = driver;
	}

	/**
	 * This function returns the page title of the Product Listing page
	 * 
	 * @return the page title of ProductListing page
	 */

	public static String return_ProductListing_Page_title() {

		String login_page_title = TestUtil.pageTitle();
		return login_page_title;

	}

	/**
	 * This functions brings the product listing section into visible area
	 * 
	 * @param Product_category holds the product category name
	 */

	public static void scroll_to_product_listing_section(String Product_category) {

		JSLibrary.ScrollintoView(driver,
				TestUtil.getElementByXpath(Product_Listing_and_Checkout.product_listing_heading_start + Product_category
						+ Product_Listing_and_Checkout.product_listing_heading_end));

	}

	/**
	 * This function gets the product unit price and returns the same
	 * 
	 * @param Product holds the product name
	 * @return product unit price
	 */

	public static String get_product_price(String Product) {

		TestUtil.moveToElement(driver, TestUtil.getElementByXpath(Product_Listing_and_Checkout.product_name_start
				+ Product + Product_Listing_and_Checkout.product_name_end));
		ExplicitWait.wait_for_element_clickable(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				By.xpath(Product_Listing_and_Checkout.add_to_cart), driver);
		String prod_price = TestUtil.Gettext(TestUtil.getElementByXpath(Product_Listing_and_Checkout.product_price));
		return prod_price;

	}

	/**
	 * This function clicks the add to cart button
	 */
	public static void add_product_to_cart() {

		TestUtil.click(TestUtil.getElementByXpath(Product_Listing_and_Checkout.add_to_cart));

	}

	/**
	 * This function returns the product name displaying at the popup
	 * 
	 * @return the product name showing at the popup
	 */

	public static String get_product_name_for_checkout() {

		ExplicitWait.wait_for_element_clickable(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				By.xpath(Product_Listing_and_Checkout.proceed_to_checkout), driver);

		String productname = TestUtil
				.Gettext(TestUtil.getElementByXpath(Product_Listing_and_Checkout.product_name_for_checkout));

		return productname;

	}

	/**
	 * This function returns the product unit price displaying at the popup
	 * 
	 * @return the product unit price showing at the popup
	 */

	public static String get_product_price_for_checkout() {

		ExplicitWait.wait_for_element_clickable(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				By.xpath(Product_Listing_and_Checkout.proceed_to_checkout), driver);

		String productprice = TestUtil
				.Gettext(TestUtil.getElementByCssSelector(Product_Listing_and_Checkout.product_price_for_checkout));

		return productprice;

	}

	/**
	 * This function returns the total order price displaying at the popup
	 * 
	 * @return the total order price showing at the popup
	 */

	public static String get_total_price_for_checkout() {

		ExplicitWait.wait_for_element_clickable(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				By.xpath(Product_Listing_and_Checkout.proceed_to_checkout), driver);
		String totalprice = TestUtil
				.Gettext(TestUtil.getElementByXpath(Product_Listing_and_Checkout.total_price_for_checkout));

		return totalprice;

	}

	/**
	 * This function clicks on the Proceed to check out button at the popup
	 */

	public static void click_proceed_to_checkout_popup() {

		TestUtil.click(TestUtil.getElementByXpath(Product_Listing_and_Checkout.proceed_to_checkout));

	}

	/**
	 * This is a common function called during the checkout process which returns
	 * the breadcrumb text displays at different phases of the checkout
	 * 
	 * @return displayed breadcrumb text
	 */

	public static String get_checkout_pages_breadcrumb_text() {

		String breadcrumb_text = TestUtil
				.Gettext(TestUtil.getElementByXpath(Product_Listing_and_Checkout.checkout_pages_breadcrumb_common));
		return breadcrumb_text;

	}

	/**
	 * This function returns the product name showing at the shopping cart
	 * 
	 * @return the product name
	 */

	public static String get_shopping_cart_product_name() {

		JSLibrary.ScrollintoView(driver,
				TestUtil.getElementByXpath(Product_Listing_and_Checkout.checkout_pages_breadcrumb_common));
		String shopping_cart_product_name = TestUtil
				.Gettext(TestUtil.getElementByXpath(Product_Listing_and_Checkout.shopping_cart_product_display));

		return shopping_cart_product_name;

	}

	/**
	 * This function returns the product unit price showing at the shopping cart
	 * 
	 * @return the product unit price
	 */

	public static String get_shopping_cart_product_price() {

		String shopping_cart_product_price = TestUtil
				.Gettext(TestUtil.getElementByCssSelector(Product_Listing_and_Checkout.shopping_cart_product_price));
		return shopping_cart_product_price;

	}

	/**
	 * This function returns the total ordert price showing at the shopping cart
	 * 
	 * @return the total order price
	 */

	public static String get_shopping_cart_total_price() {

		String shopping_cart_total_price = TestUtil
				.Gettext(TestUtil.getElementByCssSelector(Product_Listing_and_Checkout.shopping_cart_total_price));
		return shopping_cart_total_price;

	}

	/**
	 * This function clicks on the proceed to checkout button at shopping cart page
	 */

	public static void proceed_to_checkout_shopping_cart_page() {

		JSLibrary.ScrollintoView(driver,
				TestUtil.getElementByXpath(Product_Listing_and_Checkout.shopping_cart_page_proceed_checkout_button));

		TestUtil.click(
				TestUtil.getElementByXpath(Product_Listing_and_Checkout.shopping_cart_page_proceed_checkout_button));

	}

	/*
	 * This is a common function calls during the different phases of the checkout
	 * process which clicks on the proceed to checkout button
	 * 
	 */

	public static void proceed_to_checkout_common() {

		JSLibrary.ScrollintoView(driver,
				TestUtil.getElementByXpath(Product_Listing_and_Checkout.checkout_pages_common_proceed_to_checkout));

		TestUtil.click(
				TestUtil.getElementByXpath(Product_Listing_and_Checkout.checkout_pages_common_proceed_to_checkout));

	}

	/**
	 * This function clicks the terms and condition checkbox at the shipping tab
	 */

	public static void click_terms_checkbox_shipping_tab() {

		JSLibrary.ScrollintoView(driver,
				TestUtil.getElementById(Product_Listing_and_Checkout.shipping_pages_terms_checkbox_id));

		TestUtil.click(TestUtil.getElementById(Product_Listing_and_Checkout.shipping_pages_terms_checkbox_id));

	}

	/**
	 * This function clicks the desired payment method at the payment tab
	 * 
	 * @param payment_method holds the desired payment method info
	 */

	public static void select_payment_method(String payment_method) {

		JSLibrary.ScrollintoView(driver,
				TestUtil.getElementByXpath(Product_Listing_and_Checkout.payment_method_selection_start + payment_method
						+ Product_Listing_and_Checkout.payment_method_selection_end));

		TestUtil.click(TestUtil.getElementByXpath(Product_Listing_and_Checkout.payment_method_selection_start
				+ payment_method + Product_Listing_and_Checkout.payment_method_selection_end));

	}

	/**
	 * This function returns the heading at the Order Summary page
	 * 
	 * @return the heading of Order Summary page
	 */

	public static String get_order_summary_heading() {

		JSLibrary.ScrollintoView(driver,
				TestUtil.getElementByXpath(Product_Listing_and_Checkout.order_summary_heading));
		String order_summary_heading = TestUtil
				.Gettext(TestUtil.getElementByXpath(Product_Listing_and_Checkout.order_summary_heading));
		return order_summary_heading;

	}

	/**
	 * This function returns the total order amount at the Order Summary page
	 * 
	 * @return the total order amount
	 */

	public static String get_order_summary_order_amount() {

		String order_amount = TestUtil
				.Gettext(TestUtil.getElementById(Product_Listing_and_Checkout.order_summary_order_total_amount_id));
		return order_amount;

	}

	/**
	 * This function returns the total order amount at the Order Confirmation page
	 * 
	 * @return the total order amount
	 */

	public static String get_order_confirmation_order_amount() {

		String order_confirmation_amount = TestUtil
				.Gettext(TestUtil.getElementByXpath(Product_Listing_and_Checkout.order_confirmation_price));
		return order_confirmation_amount;

	}

	/**
	 * This function returns the order Reference Id showing at the Order
	 * Confirmation page
	 * 
	 * @return the order Reference Id
	 */

	public static String get_order_confirmation_reference_id() {

		String order_confirmation_text = TestUtil
				.Gettext(TestUtil.getElementByXpath(Product_Listing_and_Checkout.order_confirmation_text));
		int index_reference_text = order_confirmation_text.indexOf("reference");
		String reference_id = order_confirmation_text.substring(index_reference_text + 10, index_reference_text + 19);
		return reference_id;

	}
	
	/**
	 * This function clicks on the back to order button at the Order Confirmation page
	 * @param reference_id holds the Order Reference Id
	 * @param order_price holds the Total Order Amount
	 * @param payment_method holds the Payment Method opted for the order
	 * @param driver driver reference
	 * @return the reference of Order_History page 
	 */

	public static Order_History open_order_history(String reference_id, String order_price, String payment_method,
			WebDriver driver) {

		TestUtil.click(TestUtil.getElementByXpath(Product_Listing_and_Checkout.order_history_link));
		return new Order_History(reference_id, order_price, payment_method, driver);

	}

}
