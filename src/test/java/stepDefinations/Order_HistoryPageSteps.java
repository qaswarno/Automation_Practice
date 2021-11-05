package stepDefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.Order_History;
import utility.JavaUtility;

/**
 * 
 * @author Swarnendu
 *
 */

public class Order_HistoryPageSteps extends TestBase {
	
	/**
	 * This function verifies the expected breadcrumb text is showing for the Order History page
	 * 
	 */
	

	@And("^landed on order history page$")
	public void user_landed_on_order_history_page() throws Throwable {
		String breadcumb_text=Order_History.get_breadcrumb_text();
		assertTrue(breadcumb_text.contains(prop.getProperty("order_history_expected_breadcrumb_contains")));
	}
	
	/**
	 * This function verifies the Order ReferenceId,Order Amount and Payment Method at Order History 
	 * 
	 */

	@Then("^user verifies the order reference payment method and order price$")
	public void user_verifies_the_order_reference_payment_method_and_order_price() throws Throwable {
		
		String ord_ref=Order_History.get_order_reference_id();
		assertEquals(ord_ref,Order_History.reference_id);
		String ord_price=Order_History.get_order_price();
		assertEquals(ord_price,Order_History.order_price);
		String ord_payment_method=Order_History.get_payment_method();
		assertEquals(ord_payment_method,JavaUtility.replace_dash_with_space(Order_History.payment_method));
	   
	}

}
