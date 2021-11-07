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
	public static By product_Price= By.xpath(
			"//div[contains(@class,'quick-view-wrapper')]//following-sibling::div[contains(@class,'content_price')]/span[contains(@class,'price product-price')]");
	public static By add_To_Cart = By.xpath("//span[contains(text(),'Add to cart')]//parent::a");
	public static By proceed_To_Checkout = By.xpath("//a[contains(@title,'Proceed to checkout')]");
	public static By product_Name_For_Checkout = By.xpath("//span[contains(@id,'cart_product_title')]");
	public static By product_Price_For_Checkout = By.cssSelector("span#layer_cart_product_price");
	public static By total_Price_For_Checkout = By
			.xpath("//div[contains(@id,'layer_cart')]//span[contains(@class,'ajax_block_cart_total')]");
	public static By checkout_Pages_Breadcrumb_Common = By.xpath("//span[contains(@class,'navigation_page')]");
	public static By shopping_Cart_Product_Display = By.xpath("//td[contains(@class,'cart_description')]/p/a");
	public static By shopping_Cart_Product_Price = By.cssSelector("td#total_product");
	public static By shopping_Cart_Total_Price = By.cssSelector("span#total_price");
	public static By shopping_Cart_Page_Proceed_Checkout_Button = By
			.xpath("//p[contains(@class,'cart_navigation')]/a[contains(@title,'Proceed to checkout')]");
	public static By checkout_Pages_Common_Proceed_To_Checkout = By
			.xpath("//button[contains(@class,'button btn btn-default')]");
	public static By shipping_Pages_Terms_Checkbox_Id = By.id("cgv");
	public static By order_Summary_Heading = By.xpath("//h1[contains(@class,'page-heading')]");
	public static By order_Summary_Order_Total_Amount_Id = By.id("amount");
	public static By order_Confirmation_Price = By.xpath("//span[contains(@class,'price')]/strong");
	public static By order_Confirmation_Text = By.xpath("//div[@class='box']");
	public static By order_History_Link = By.xpath("//a[contains(@title,'Back to orders')]");
	public static String product_Category_Locator_Start = "//h1[starts-with(@class,'page-heading')]/span[contains(text(),'";
	public static String product_Locator_Start = "//a[contains(text(),'";
	public static String payment_Method_Locator_Start = "//a[contains(@class,'";
	public static String locator_End_Common = "')]";
	public static String product_Name = null;
	public static String var_Product_Price = null;
	public static String total_Price = null;
	public static String order_Reference_Id = null;

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

		JSLibrary.scroll_Into_View(driver, TestUtil.getElementByXpath(CheckoutProcess.product_Category_Locator_Start
				+ Product_category + CheckoutProcess.locator_End_Common));

	}

	/**
	 * This function gets the product unit price and returns the same
	 * 
	 * @param Product holds the product name
	 * @return product unit price
	 */

	public static String get_Product_Price(String Product) {

		TestUtil.moveToElement(driver, TestUtil.getElementByXpath(
				CheckoutProcess.product_Locator_Start + Product + CheckoutProcess.locator_End_Common));
		JavaUtility.wait_For_Element_Clickable(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				CheckoutProcess.add_To_Cart, driver);
		String prod_price = TestUtil.gettext(TestUtil.getElement(CheckoutProcess.product_Price));
		return prod_price;

	}

	/**
	 * This function clicks the add to cart button
	 */
	public static void add_Product_To_Cart() {

		TestUtil.click(TestUtil.getElement(CheckoutProcess.add_To_Cart));

	}

	/**
	 * This function returns the product name displaying at the popup
	 * 
	 * @return the product name showing at the popup
	 */

	public static String get_Product_Name_For_Checkout() {

		JavaUtility.wait_For_Element_Clickable(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				CheckoutProcess.proceed_To_Checkout, driver);

		String productname = TestUtil.gettext(TestUtil.getElement(CheckoutProcess.product_Name_For_Checkout));

		return productname;

	}

	/**
	 * This function returns the product unit price displaying at the popup
	 * 
	 * @return the product unit price showing at the popup
	 */

	public static String get_Product_Price_For_Checkout() {

		JavaUtility.wait_For_Element_Clickable(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				CheckoutProcess.proceed_To_Checkout, driver);

		String productprice = TestUtil.gettext(TestUtil.getElement(CheckoutProcess.product_Price_For_Checkout));

		return productprice;

	}

	/**
	 * This function returns the total order price displaying at the popup
	 * 
	 * @return the total order price showing at the popup
	 */

	public static String get_Total_Price_For_Checkout() {

		JavaUtility.wait_For_Element_Clickable(Long.parseLong(prop.getProperty("CommonExplicitWaitTime")),
				CheckoutProcess.proceed_To_Checkout, driver);
		String totalprice = TestUtil.gettext(TestUtil.getElement(CheckoutProcess.total_Price_For_Checkout));

		return totalprice;

	}

	/**
	 * This function clicks on the Proceed to check out button at the popup
	 */

	public static void click_Proceed_To_Checkout_Popup() {

		TestUtil.click(TestUtil.getElement(CheckoutProcess.proceed_To_Checkout));

	}

	/**
	 * This is a common function called during the checkout process which returns
	 * the breadcrumb text displays at different phases of the checkout
	 * 
	 * @return displayed breadcrumb text
	 */

	public static String get_Checkout_Pages_Breadcrumb_Text() {

		String breadcrumb_text = TestUtil
				.gettext(TestUtil.getElement(CheckoutProcess.checkout_Pages_Breadcrumb_Common));
		return breadcrumb_text;

	}

	/**
	 * This function returns the product name showing at the shopping cart
	 * 
	 * @return the product name
	 */

	public static String get_Shopping_Cart_Product_Name() {

		JSLibrary.scroll_Into_View(driver, TestUtil.getElement(CheckoutProcess.checkout_Pages_Breadcrumb_Common));
		String shopping_cart_product_name = TestUtil
				.gettext(TestUtil.getElement(CheckoutProcess.shopping_Cart_Product_Display));

		return shopping_cart_product_name;

	}

	/**
	 * This function returns the product unit price showing at the shopping cart
	 * 
	 * @return the product unit price
	 */

	public static String get_Shopping_Cart_Product_Price() {

		String shopping_cart_product_price = TestUtil
				.gettext(TestUtil.getElement(CheckoutProcess.shopping_Cart_Product_Price));
		return shopping_cart_product_price;

	}

	/**
	 * This function returns the total ordert price showing at the shopping cart
	 * 
	 * @return the total order price
	 */

	public static String get_Shopping_Cart_Total_Price() {

		String shopping_cart_total_price = TestUtil
				.gettext(TestUtil.getElement(CheckoutProcess.shopping_Cart_Total_Price));
		return shopping_cart_total_price;

	}

	/**
	 * This function clicks on the proceed to checkout button at shopping cart page
	 */

	public static void proceed_To_Checkout_Shopping_Cart_Page() {

		JSLibrary.scroll_Into_View(driver,
				TestUtil.getElement(CheckoutProcess.shopping_Cart_Page_Proceed_Checkout_Button));

		TestUtil.click(TestUtil.getElement(CheckoutProcess.shopping_Cart_Page_Proceed_Checkout_Button));

	}

	/*
	 * This is a common function calls during the different phases of the checkout
	 * process which clicks on the proceed to checkout button
	 * 
	 */

	public static void proceed_To_Checkout_Common() {

		JSLibrary.scroll_Into_View(driver,
				TestUtil.getElement(CheckoutProcess.checkout_Pages_Common_Proceed_To_Checkout));

		TestUtil.click(TestUtil.getElement(CheckoutProcess.checkout_Pages_Common_Proceed_To_Checkout));

	}

	/**
	 * This function clicks the terms and condition checkbox at the shipping tab
	 */

	public static void click_Terms_Checkbox_Shipping_Tab() {

		JSLibrary.scroll_Into_View(driver, TestUtil.getElement(CheckoutProcess.shipping_Pages_Terms_Checkbox_Id));

		TestUtil.click(TestUtil.getElement(CheckoutProcess.shipping_Pages_Terms_Checkbox_Id));

	}

	/**
	 * This function clicks the desired payment method at the payment tab
	 * 
	 * @param payment_method holds the desired payment method info
	 */

	public static void select_Payment_Method(String payment_method) {

		JSLibrary.scroll_Into_View(driver, TestUtil.getElementByXpath(
				CheckoutProcess.payment_Method_Locator_Start + payment_method + CheckoutProcess.locator_End_Common));

		TestUtil.click(TestUtil.getElementByXpath(
				CheckoutProcess.payment_Method_Locator_Start + payment_method + CheckoutProcess.locator_End_Common));

	}

	/**
	 * This function returns the heading at the Order Summary page
	 * 
	 * @return the heading of Order Summary page
	 */

	public static String get_Order_Summary_Heading() {

		JSLibrary.scroll_Into_View(driver, TestUtil.getElement(CheckoutProcess.order_Summary_Heading));
		String order_summary_heading = TestUtil.gettext(TestUtil.getElement(CheckoutProcess.order_Summary_Heading));
		return order_summary_heading;

	}

	/**
	 * This function returns the total order amount at the Order Summary page
	 * 
	 * @return the total order amount
	 */

	public static String get_Order_Summary_Order_Amount() {

		String order_amount = TestUtil
				.gettext(TestUtil.getElement(CheckoutProcess.order_Summary_Order_Total_Amount_Id));
		return order_amount;

	}

	/**
	 * This function returns the total order amount at the Order Confirmation page
	 * 
	 * @return the total order amount
	 */

	public static String get_Order_Confirmation_Order_Amount() {

		String order_confirmation_amount = TestUtil
				.gettext(TestUtil.getElement(CheckoutProcess.order_Confirmation_Price));
		return order_confirmation_amount;

	}

	/**
	 * This function returns the order Reference Id showing at the Order
	 * Confirmation page
	 * 
	 * @return the order Reference Id
	 */

	public static String get_Order_Confirmation_Reference_Id() {

		String order_confirmation_text = TestUtil.gettext(TestUtil.getElement(CheckoutProcess.order_Confirmation_Text));
		int index_reference_text = order_confirmation_text.indexOf("reference");
		String reference_id = order_confirmation_text.substring(index_reference_text + 10, index_reference_text + 19);
		return reference_id;

	}

	/**
	 * * This function clicks on the back to order button at the Order Confirmation
	 * page
	 * 
	* @return the reference of Order_History page
	 */

	public static Order_History open_Order_History() {

		TestUtil.click(TestUtil.getElement(CheckoutProcess.order_History_Link));
		return new Order_History(driver);

	}
	
	/**
	 * This function will return the Product Name displaying in order
	 * @return product_Name
	 */
	
	public static String get_Product_Name() {
		
		return product_Name;
	}
	
	/**
	 * This function will return the Product Unit Price displaying in order
	 * @return var_Product_Price
	 */
	
	public static String get_Product_Price() {
		
		return var_Product_Price;
	}
	
	/**
	 * This function will return the total Order Price displaying in order
	 * @return total_Price
	 */
	
	public static String get_Order_Price() {
		
		return total_Price;
	}
	
	/**
	 * This function will return the order Reference Id displaying in order
	 * @return order_Reference_Id
	 */
	
	public static String get_order_Reference_Id() {
		
		return order_Reference_Id;
	}



}
