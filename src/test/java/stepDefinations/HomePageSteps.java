package stepDefinations;

import static org.testng.Assert.assertEquals;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.HomePage;

public class HomePageSteps extends TestBase {

	/**
	 * This Function assert that the expected page title is showing for the index
	 * page	
	 */

	@Given("^user is at the index page$")
	public void user_is_at_the_index_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		TestBase.initialization();
		new HomePage(driver);
		String index_page_title = HomePage.return_Landing_Page_title();
		assertEquals(index_page_title, prop.getProperty("Home_page_expected_title"));
	}
	
	/**
	 * This Function clicks the sign in link
	*/

	
	@When("^user clicks on the Sign in link$")
	public void user_clicks_on_the_Sign_in_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomePage.open_Login_Page();
	}

}
