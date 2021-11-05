package stepDefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.CheckoutProcess;
import pages.MyAccount;
import pages.Order_History;
import utility.JavaUtility;

/**
 * 
 * @author Swarnendu
 *
 */
public class CheckoutSteps extends TestBase {

	public static String productname = null;
	public static String productprice = null;
	public static String totalprice = null;
	public static String order_reference_id = null;
	Order_History orderhistory;

	/**
	 * This function clicks the desired product category
	 * 
	 * @param product_category holds the desired product category name
	 * 
	 */

	@Given("^user clicks on the \"(.*)\" product category link$")
	public void user_clicks_on_the_product_link(String product_category) throws Throwable {
		MyAccount.selectProductCategory(product_category);
		String product_listing_page_title = CheckoutProcess.return_ProductListing_Page_Title();
		assertTrue(product_listing_page_title.contains(product_category));
		CheckoutProcess.scroll_To_Product_Listing_Section(product_category);
	}

	/**
	 * This function selects the product and start the checkout process
	 * 
	 * @param product holds the desired product name
	 * @throws Throwable
	 */

	@And("^choose \"(.*)\" product for purchase$")
	public void choose_product_for_purchase(String product) throws Throwable {

		productname = product;
		productprice = CheckoutProcess.get_Product_Price(product);
		CheckoutProcess.add_Product_To_Cart();
		totalprice = CheckoutProcess.get_Total_Price_For_Checkout();
		String product_name = CheckoutProcess.get_Product_Name_For_Checkout();
		assertEquals(product_name, productname);
		String product_price = CheckoutProcess.get_Product_Price_For_Checkout();
		assertEquals(productprice, product_price);
		CheckoutProcess.click_Proceed_To_Checkout_Popup();

	}

	/**
	 * This function verifies the product name, unit price, order price throughout
	 * the checkout proceess
	 * 
	 * @throws Throwable
	 */

	@Then("^proceed through the checkout process$")
	public void proceed_through_the_checkout_process() throws Throwable {

		String shopping_cart_breadcrumb = CheckoutProcess.get_Checkout_Pages_Breadcrumb_Text();
		assertTrue(
				shopping_cart_breadcrumb.contains(prop.getProperty("shopping_cart_page_expected_breadcrumb_contains")));

		String cart_product_name = CheckoutProcess.get_Shopping_Cart_Product_Name();
		assertEquals(cart_product_name, productname);
		String cart_product_price = CheckoutProcess.get_Shopping_Cart_Product_Price();
		assertEquals(cart_product_price, productprice);
		String cart_total_price = CheckoutProcess.get_Shopping_Cart_Total_Price();
		assertEquals(cart_total_price, totalprice);

		CheckoutProcess.proceed_To_Checkout_Shopping_Cart_Page();

		String address_breadcrumb = CheckoutProcess.get_Checkout_Pages_Breadcrumb_Text();
		assertTrue(address_breadcrumb.contains(prop.getProperty("address_tab_expected_breadcrumb_contains")));
		CheckoutProcess.proceed_To_Checkout_Common();

		String shipping_breadcrumb = CheckoutProcess.get_Checkout_Pages_Breadcrumb_Text();
		assertTrue(shipping_breadcrumb.contains(prop.getProperty("shipping_tab_expected_breadcrumb_contains")));
		CheckoutProcess.click_Terms_Checkbox_Shipping_Tab();
		CheckoutProcess.proceed_To_Checkout_Common();

		String payment_breadcrumb = CheckoutProcess.get_Checkout_Pages_Breadcrumb_Text();
		assertTrue(payment_breadcrumb.contains(prop.getProperty("payment_tab_expected_breadcrumb_contains")));
		CheckoutProcess.select_Payment_Method(JavaUtility.remove_dash_from_text(prop.getProperty("payment_method")));

		String order_summary_heading = CheckoutProcess.get_Order_Summary_Heading();
		assertEquals(order_summary_heading, prop.getProperty("order_summary_tab_heading").toUpperCase());
		String payment_method_breadcrumb = CheckoutProcess.get_Checkout_Pages_Breadcrumb_Text();
		assertTrue(payment_method_breadcrumb.contains(prop.getProperty("payment_method")));
		String order_amount = CheckoutProcess.get_Order_Summary_Order_Amount();
		assertEquals(order_amount, totalprice);
		CheckoutProcess.proceed_To_Checkout_Common();

		String order_confirmation_breadcrumb = CheckoutProcess.get_Checkout_Pages_Breadcrumb_Text();
		assertTrue(order_confirmation_breadcrumb
				.contains(prop.getProperty("order_confirmation_tab_expected_breadcrumb_contains")));
		String order_confirmation_order_amount = CheckoutProcess.get_Order_Confirmation_Order_Amount();
		assertEquals(order_confirmation_order_amount, totalprice);

	}

	/**
	 * This function get the Order Reference Id from the Order Confirmation text
	 */

	@And("^get the order reference id from Order Confirmation page for future reference$")
	public void get_order_reference_id() throws Throwable {

		order_reference_id = CheckoutProcess.get_Order_Confirmation_Reference_Id();

	}

	/**
	 * This function clicks the back to order link from the Order Confirmation tab
	 */

	@Then("^user clicks on back to order link$")
	public void user_clicks_on_back_to_order_link() throws Throwable {

		orderhistory = CheckoutProcess.open_Order_History(order_reference_id, totalprice,
				prop.getProperty("payment_method"), driver);

	}

}
