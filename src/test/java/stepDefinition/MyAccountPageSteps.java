package stepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MyAccount;


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
	public void verify_My_Account_Page() throws Throwable {
		String myaccount_page_title = MyAccount.return_MyAccount_Page_title();
		assertEquals(myaccount_page_title, prop.getProperty("myaccount_page_expected_title"));
	}

	/**
	 * This function clicks the My Personal Information button
	 * 
	 */

	@Given("^user clicks on My Personal Information button$")
	public void click_Personal_Information_Button() throws Throwable {
		MyAccount.click_Personal_Information();

	}

	/**
	 * This function verifies that the expected breadcrumb text is showing for the
	 * Personal Information page
	 * 
	 */

	@When("^landed on the Personal information page$")
	public void verify_Personal_Information_Page() throws Throwable {

		String personal_info_breadcrumb = MyAccount.get_Personal_Info_Breadcrumb_Text();
		assertTrue(personal_info_breadcrumb.contains(prop.getProperty("personal_information_contains")));

	}

	/**
	 * This function updates the FirstName field value at personal information
	 * 
	 */

	@Then("^user enters updated FirstName and clicks on save button$")
	public void update_Firstname_And_Save() throws Throwable {
		MyAccount.update_Firstname_Personal_Info(prop.getProperty("updated_firstname"), prop.getProperty("Password"));
	}

	/**
	 * This function verifies the updated FirstName is displaying or not
	 * 
	 */

	@And("^verifies updated FirstName at the header$")
	public void verify_Firstname() throws Throwable {

		String header_user_name = MyAccount.get_User_Name_From_Header();
		assertTrue(header_user_name.contains(prop.getProperty("updated_firstname")));

	}

}
