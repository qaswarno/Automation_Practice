package stepDefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.LoginPage;
import pages.Order_History;
import pages.Product_Listing_and_Checkout;
import utility.JavaUtility;

/**
 * 
 * @author Swarnendu
 *
 */
public class Product_Listing_and_checkout_PageSteps extends TestBase {

	public static String productname = null;
	public static String productprice = null;
	public static String totalprice = null;
	public static String order_reference_id = null;
	Order_History orderhistory;

	/**
	 * This function verifies the expected page title is showing for the product
	 * category page
	 * 
	 * @param product_category holds the desired product category name
	 * 
	 */
	@And("^verify \"(.*)\" product category page opened$")
	public void verify_product_page_opened(String product_category) throws Throwable {

		String product_listing_page_title = Product_Listing_and_Checkout.return_ProductListing_Page_title();
		assertTrue(product_listing_page_title.contains(product_category));

	}

	/**
	 * This function brings the product listing section into display area
	 * 
	 * @param product_category holds the desired product category name
	 * 
	 */

	@Then("^user scroll to \"(.*)\" product listing section$")
	public void user_scroll_to_product_listing_section(String product_category) throws Throwable {

		Product_Listing_and_Checkout.scroll_to_product_listing_section(product_category);

	}

	/**
	 * This function clicks the add to cart button for the desired product
	 * 
	 * @param product holds the desired product name
	 * 
	 */

	@And("^click Add To Cart button for \"(.*)\"$")
	public void added_into_cart(String product) throws Throwable {

		productname = product;
		productprice = Product_Listing_and_Checkout.get_product_price(product);
		Product_Listing_and_Checkout.add_product_to_cart();
		totalprice = Product_Listing_and_Checkout.get_total_price_for_checkout();

	}

	/**
	 * This function verifies that the expected product name and product unit price
	 * is showing at the popup
	 */

	@And("^verify the desired Product and correct price is showing for checkout$")
	public void verify_the_desired_Product_showing_for_checkout() throws Throwable {

		String product_name = Product_Listing_and_Checkout.get_product_name_for_checkout();
		assertEquals(product_name, productname);
		String product_price = Product_Listing_and_Checkout.get_product_price_for_checkout();
		assertEquals(productprice, product_price);
	}

	/**
	 * This function clicks on the proceed to checkout button at the popup
	 */

	@Then("^user clicks on proceed to checkout button from popup$")
	public void proceed_to_checkout_popup() throws Throwable {

		Product_Listing_and_Checkout.click_proceed_to_checkout_popup();

	}

	/**
	 * This function verifies that the expected breadcrumb text is showing at the
	 * Shopping Cart page *
	 *
	 */

	@And("^user redirect to shopping cart page$")
	public void user_redirect_to_shopping_cart_page() throws Throwable {

		String shopping_cart_breadcrumb = Product_Listing_and_Checkout.get_checkout_pages_breadcrumb_text();
		assertTrue(
				shopping_cart_breadcrumb.contains(prop.getProperty("shopping_cart_page_expected_breadcrumb_contains")));

	}

	/**
	 * This function verifies the expected product name ,product unit price and
	 * total order price displaying at the shopping cart
	 * 
	 */

	@Then("^user verifies the product and price$")
	public void user_verifies_the_shopping_cart_product_and_price() throws Throwable {

		String cart_product_name = Product_Listing_and_Checkout.get_shopping_cart_product_name();
		assertEquals(cart_product_name, productname);
		String cart_product_price = Product_Listing_and_Checkout.get_shopping_cart_product_price();
		assertEquals(cart_product_price, productprice);
		String cart_total_price = Product_Listing_and_Checkout.get_shopping_cart_total_price();
		assertEquals(cart_total_price, totalprice);
	}

	/**
	 * This function clicks the proceed to checkout button at shopping cart page
	 * 
	 */

	@Then("^user clicks on proceed to checkout button from shopping cart page$")
	public void user_clicks_on_proceed_to_checkout_button_from_shopping_cart_page() throws Throwable {

		Product_Listing_and_Checkout.proceed_to_checkout_shopping_cart_page();
	}

	/**
	 * This function verifies the actual breadcrumb text showing at the Address tab
	 * with the expected text
	 * 
	 */

	@And("^landed on the Addresses tab$")
	public void landed_on_the_Addresses_tab() throws Throwable {

		String address_breadcrumb = Product_Listing_and_Checkout.get_checkout_pages_breadcrumb_text();
		assertTrue(address_breadcrumb.contains(prop.getProperty("address_tab_expected_breadcrumb_contains")));

	}

	/**
	 * This is common function which clicks on the proceed to checkout button in the
	 * different phases of the checkout process
	 * 
	 */

	@Then("^user clicks on proceed to checkout button$")
	public void user_clicks_on_proceed_to_checkout_button() throws Throwable {

		Product_Listing_and_Checkout.proceed_to_checkout_common();

	}

	/**
	 * This function verifies the actual breadcrumb text showing at the Shipping tab
	 * with the expected text
	 * 
	 */

	@And("^landed on the shipping tab$")
	public void landed_on_the_shipping_tab() throws Throwable {

		String shipping_breadcrumb = Product_Listing_and_Checkout.get_checkout_pages_breadcrumb_text();
		assertTrue(shipping_breadcrumb.contains(prop.getProperty("shipping_tab_expected_breadcrumb_contains")));

	}

	/**
	 * This function clicks the terms and condition check box at the Shipping tab
	 */

	@Then("^user accept the terms and condition$")
	public void user_accept_the_terms_and_condition() throws Throwable {

		Product_Listing_and_Checkout.click_terms_checkbox_shipping_tab();
	}

	/**
	 * This function verifies the actual breadcrumb text showing at the Payment tab
	 * with the expected text
	 */

	@Then("^user landed on payment tab$")
	public void user_landed_on_payment_tab() throws Throwable {

		String payment_breadcrumb = Product_Listing_and_Checkout.get_checkout_pages_breadcrumb_text();
		assertTrue(payment_breadcrumb.contains(prop.getProperty("payment_tab_expected_breadcrumb_contains")));
	}

	/**
	 * This function clicks the desired payment method at Payment tab
	 */

	@And("^user selects the payment method$")
	public void user_selects_the_payment_method() throws Throwable {

		Product_Listing_and_Checkout
				.select_payment_method(JavaUtility.remove_dash_from_text(prop.getProperty("payment_method")));

	}

	/**
	 * This function verifies the actual breadcrumb text showing at the Order
	 * Summary tab with the expected text
	 */

	@Then("^user landed on the order summary tab$")
	public void user_landed_on_the_order_summary_tab() throws Throwable {

		String order_summary_heading = Product_Listing_and_Checkout.get_order_summary_heading();
		assertEquals(order_summary_heading, prop.getProperty("order_summary_tab_heading").toUpperCase());

	}

	/**
	 * This function verifies total order amount and payment method displaying at
	 * the order summary tab with the expected one
	 */

	@And("^user verifies the payment method and order amount$")
	public void user_verifies_the_payment_method_and_order_amount() throws Throwable {

		String payment_method_breadcrumb = Product_Listing_and_Checkout.get_checkout_pages_breadcrumb_text();
		assertTrue(payment_method_breadcrumb.contains(prop.getProperty("payment_method")));

		String order_amount = Product_Listing_and_Checkout.get_order_summary_order_amount();
		assertEquals(order_amount, totalprice);

	}

	/**
	 * This function clicks the Confirm Order button at the Order Summary tab
	 */

	@Then("^user clicks on confirm order button$")
	public void user_clicks_on_confirm_order_button() throws Throwable {
		Product_Listing_and_Checkout.proceed_to_checkout_common();
	}

	/**
	 * This function verifies the actual breadcrumb text showing at the Order
	 * Confirmation tab with the expected text
	 */

	@And("^user landed on order confirmation page$")
	public void user_landed_on_order_confirmation_page() throws Throwable {

		String order_confirmation_breadcrumb = Product_Listing_and_Checkout.get_checkout_pages_breadcrumb_text();
		assertTrue(order_confirmation_breadcrumb
				.contains(prop.getProperty("order_confirmation_tab_expected_breadcrumb_contains")));

	}

	/**
	 * This function verifies total order amount displaying at the order summary tab
	 * with the expected one
	 */

	@Then("^user verifies the order price at order confirmation page$")
	public void user_verifies_the_order_price_at_order_confirmation_page() throws Throwable {

		String order_confirmation_order_amount = Product_Listing_and_Checkout.get_order_confirmation_order_amount();
		assertEquals(order_confirmation_order_amount, totalprice);
	}

	/**
	 * This function get the Order Reference Id from the Order Confirmation text
	 */

	@And("^get the order reference id for future reference$")
	public void get_order_reference_id() throws Throwable {

		order_reference_id = Product_Listing_and_Checkout.get_order_confirmation_reference_id();

	}

	/**
	 * This function clicks the back to order link from the Order Confirmation tab
	 */

	@Then("^user clicks on back to order link$")
	public void user_clicks_on_back_to_order_link() throws Throwable {

		orderhistory = Product_Listing_and_Checkout.open_order_history(order_reference_id, totalprice,
				prop.getProperty("payment_method"), driver);

	}

}
