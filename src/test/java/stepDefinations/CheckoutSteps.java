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
	 * @param product_category holds the desired product category name
	 * 
	 */
	
	@Given("^user clicks on the \"(.*)\" product category link$")
	public void user_clicks_on_the_product_link(String product_category) throws Throwable {
		MyAccount.selectProductCategory(product_category);
		String product_listing_page_title = CheckoutProcess.return_ProductListing_Page_title();
		assertTrue(product_listing_page_title.contains(product_category));
		CheckoutProcess.scroll_to_product_listing_section(product_category);
	}
	
	/**
	 * This function selects the product and start the checkout process
	 * @param product holds the desired product name
	 * @throws Throwable
	 */
	
	
	@And("^choose \"(.*)\" product for purchase$")
	public void choose_product_for_purchase(String product) throws Throwable {
		
		productname = product;
		productprice = CheckoutProcess.get_product_price(product);
		CheckoutProcess.add_product_to_cart();
		totalprice = CheckoutProcess.get_total_price_for_checkout();
		String product_name = CheckoutProcess.get_product_name_for_checkout();
		assertEquals(product_name, productname);
		String product_price = CheckoutProcess.get_product_price_for_checkout();
		assertEquals(productprice, product_price);
		CheckoutProcess.click_proceed_to_checkout_popup();
	   
		
	}
	
	/**
	 * This function verifies the product name, unit price, order price throughout the checkout proceess
	 * 
	 * @throws Throwable
	 */
	
	
	@Then("^proceed through the checkout process$")
	public void proceed_through_the_checkout_process() throws Throwable {
	   
		String shopping_cart_breadcrumb = CheckoutProcess.get_checkout_pages_breadcrumb_text();
		assertTrue(
				shopping_cart_breadcrumb.contains(prop.getProperty("shopping_cart_page_expected_breadcrumb_contains")));
		
		String cart_product_name = CheckoutProcess.get_shopping_cart_product_name();
		assertEquals(cart_product_name, productname);
		String cart_product_price = CheckoutProcess.get_shopping_cart_product_price();
		assertEquals(cart_product_price, productprice);
		String cart_total_price = CheckoutProcess.get_shopping_cart_total_price();
		assertEquals(cart_total_price, totalprice);
		
		CheckoutProcess.proceed_to_checkout_shopping_cart_page();
		
		String address_breadcrumb = CheckoutProcess.get_checkout_pages_breadcrumb_text();
		assertTrue(address_breadcrumb.contains(prop.getProperty("address_tab_expected_breadcrumb_contains")));
		CheckoutProcess.proceed_to_checkout_common();
		
		String shipping_breadcrumb = CheckoutProcess.get_checkout_pages_breadcrumb_text();
		assertTrue(shipping_breadcrumb.contains(prop.getProperty("shipping_tab_expected_breadcrumb_contains")));
		CheckoutProcess.click_terms_checkbox_shipping_tab();
		CheckoutProcess.proceed_to_checkout_common();
		
		String payment_breadcrumb = CheckoutProcess.get_checkout_pages_breadcrumb_text();
		assertTrue(payment_breadcrumb.contains(prop.getProperty("payment_tab_expected_breadcrumb_contains")));
		CheckoutProcess
		.select_payment_method(JavaUtility.remove_dash_from_text(prop.getProperty("payment_method")));
		
		String order_summary_heading = CheckoutProcess.get_order_summary_heading();
		assertEquals(order_summary_heading, prop.getProperty("order_summary_tab_heading").toUpperCase());
		String payment_method_breadcrumb = CheckoutProcess.get_checkout_pages_breadcrumb_text();
		assertTrue(payment_method_breadcrumb.contains(prop.getProperty("payment_method")));
		String order_amount = CheckoutProcess.get_order_summary_order_amount();
		assertEquals(order_amount, totalprice);
		CheckoutProcess.proceed_to_checkout_common();
		
		String order_confirmation_breadcrumb = CheckoutProcess.get_checkout_pages_breadcrumb_text();
		assertTrue(order_confirmation_breadcrumb
				.contains(prop.getProperty("order_confirmation_tab_expected_breadcrumb_contains")));
		String order_confirmation_order_amount = CheckoutProcess.get_order_confirmation_order_amount();
		assertEquals(order_confirmation_order_amount, totalprice);
		

	}




	/**
	 * This function get the Order Reference Id from the Order Confirmation text
	 */

	@And("^get the order reference id from Order Confirmation page for future reference$")
	public void get_order_reference_id() throws Throwable {

		order_reference_id = CheckoutProcess.get_order_confirmation_reference_id();

	}

	/**
	 * This function clicks the back to order link from the Order Confirmation tab
	 */

	@Then("^user clicks on back to order link$")
	public void user_clicks_on_back_to_order_link() throws Throwable {

		orderhistory = CheckoutProcess.open_order_history(order_reference_id, totalprice,
				prop.getProperty("payment_method"), driver);

	}

}
