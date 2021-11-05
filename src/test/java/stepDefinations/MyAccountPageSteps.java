package stepDefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.MyAccount;
import pages.CheckoutProcess;

/**
 * 
 * @author Swarnendu
 *
 */
public class MyAccountPageSteps extends TestBase {

	/**
	 * This function verifies the expected page title showing at the MyAccount page
	 * 
	 */

	@And("^verify MyAccount page opens$")
	public void myaccount_page_opens() throws Throwable {
		String myaccount_page_title = MyAccount.return_MyAccount_Page_title();
		assertEquals(myaccount_page_title, prop.getProperty("myaccount_page_expected_title"));
	}

	/**
	 * This function clicks the My Personal Information button
	 * 
	 */

	@Then("^user clicks on My Personal Information button$")
	public void user_clicks_on_My_Personal_Information_button() throws Throwable {
		MyAccount.click_personal_information();

	}

	/**
	 * This function verifies that the expected breadcrumb text is showing for the
	 * Personal Information page
	 * 
	 */

	@And("^landed on the Personal information page$")
	public void landed_on_the_Personal_information_page() throws Throwable {

		String personal_info_breadcrumb = MyAccount.get_personal_info_breadcrumb_text();
		assertTrue(personal_info_breadcrumb.contains(prop.getProperty("personal_information_contains")));

	}

	/**
	 * This function updates the FirstName field value at personal information
	 * 
	 */

	@Then("^user enters updated FirstName and clicks on save button$")
	public void user_enters_updated_FirstName_and_clicks_on_save_button() throws Throwable {
		MyAccount.update_firstname_personal_info(prop.getProperty("updated_firstname"), prop.getProperty("Password"));
	}

	/**
	 * This function verifies the updated FirstName is displaying or not
	 * 
	 */

	@And("^varifies updated FirstName at the header$")
	public void varifies_updated_FirstName_at_the_header() throws Throwable {

		String header_user_name = MyAccount.get_user_name_from_header();
		assertTrue(header_user_name.contains(prop.getProperty("updated_firstname")));

	}

}
