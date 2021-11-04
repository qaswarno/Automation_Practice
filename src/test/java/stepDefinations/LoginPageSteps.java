package stepDefinations;

import static org.testng.Assert.assertEquals;

import base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.LoginPage;
import pages.MyAccount;

/**
 * 
 * @author Swarnendu
 *
 */
public class LoginPageSteps extends TestBase{
	
	MyAccount myaccount;
	
	/**
	 * This function assert the expected page title showing for login page
	 * 
	 */
	
	@And("^verify Sign in page opens$")
	public void sign_in_page_opens() throws Throwable {
		String login_page_title=LoginPage.return_login_Page_title();
		assertEquals(login_page_title,prop.getProperty("login_page_expected_title"));
		
	}
    
	/**
	 * This function performs the login operation
	 * 
	 */
	
	@Then("^user logged in to the site$")
	public void user_logged_in_to_the_site() throws Throwable {
		myaccount=LoginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));
		
	
	}

}
