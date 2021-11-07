package stepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.CheckoutProcess;
import pages.Order_History;
import utility.JavaUtility;

/**
 * 
 * @author Swarnendu
 *
 */

public class Order_HistoryPageSteps extends TestBase {
	
	Order_History orderhistory;
	
	/**
	 * This function clicks the back to order button and verifies the expected breadcrumb text is showing for the Order History page
	 * 
	 */
		
	@And("^user clicks on back to order link and landed on Order History Page$")
	public void click_Back_To_Order_History_And_Verify() throws Throwable {
		
		CheckoutProcess.open_Order_History();
		
		String breadcumb_text=Order_History.get_Breadcrumb_Text();
		assertTrue(breadcumb_text.contains(prop.getProperty("order_history_expected_breadcrumb_contains")));
	}

	
	
	
	/**
	 * This function verifies the Order ReferenceId,Order Amount and Payment Method at Order History 
	 * 
	 */

	@Then("^user verifies the order reference payment method and order price$")
	public void verify_Order() throws Throwable {
		
		String ord_ref=Order_History.get_Order_Reference_Id();
		assertEquals(ord_ref,CheckoutProcess.get_order_Reference_Id());
		String ord_price=Order_History.get_Order_Price();
		assertEquals(ord_price,CheckoutProcess.get_Order_Price());
		String ord_payment_method=Order_History.get_Payment_Method();
		assertEquals(ord_payment_method,JavaUtility.replace_Dash_With_Space(prop.getProperty("payment_method")));
	   
	}

}
