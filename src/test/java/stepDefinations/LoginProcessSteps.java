package stepDefinations;

import static org.testng.Assert.assertEquals;

import base.TestBase;
import cucumber.api.java.en.Given;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccount;

/**
 * 
 * @author Swarnendu
 *
 */
public class LoginProcessSteps extends TestBase{
	
	MyAccount myaccount;
	
	/**
	 * This function verifies the index page and login page titles and perform login operation	
	 * @throws Throwable
	 */
	
	@Given("^user opens the site and logged in$")
	public void user_opens_the_site_and_logged_in() throws Throwable {
	    
		new HomePage(driver);
		String index_page_title = HomePage.return_Landing_Page_Title();
		assertEquals(index_page_title, prop.getProperty("Home_page_expected_title"));
		HomePage.open_Login_Page();
		String login_page_title=LoginPage.return_Login_Page_Title();
		assertEquals(login_page_title,prop.getProperty("login_page_expected_title"));
		myaccount=LoginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));
	    
	}

}
