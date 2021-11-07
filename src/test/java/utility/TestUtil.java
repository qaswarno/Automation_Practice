package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import base.TestBase;

/**
 * 
 * @author Swarnendu
 *
 */

public class TestUtil extends TestBase {

	/**
	 * This function returns the page title of a page
	 * 
	 * @return PageTitle
	 */

	public static String pageTitle() {
		String pageTitle = null;
		try {
			pageTitle = driver.getTitle();
		} catch (Exception e) {
			e.getMessage();
		}
		return pageTitle;
	}

	/**
	 * This function clears default text from the text field
	 * 
	 * @param ele
	 */

	public static void clear(WebElement ele) {

		try {
			ele.clear();
		} catch (Exception e) {
			e.getMessage();
		}

	}

	/**
	 * This function enters the input into the text field
	 * 
	 * @param ele   WebElement
	 * @param value desired input
	 */

	public static void entertext(WebElement ele, String value) {

		try {
			ele.clear();
			ele.sendKeys(value);
		} catch (Exception e) {
			e.getMessage();
		}

	}

	/**
	 * This function clicks an Element
	 * 
	 * @param ele WebElement
	 */

	public static void click(WebElement ele) {

		try {
			ele.click();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	/**
	 * This function return the text from the dom
	 * 
	 * @param ele WebElement
	 * @return String
	 */

	public static String gettext(WebElement ele) {
		String text = null;
		try {
			String text_raw = ele.getText();
			text = text_raw.trim();

		} catch (Exception e) {
			e.getMessage();
		}
		return text;
	}

	/**
	 * This function mimics the mouse over action on a given element
	 * 
	 * @param driver driver reference
	 * @param ele    WebElement
	 */

	public static void moveToElement(WebDriver driver, WebElement ele) {

		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(ele).build().perform();
		} catch (Exception e) {
			e.getMessage();
		}
	}


	/**
	 * This function finds the element by Id
	 * 
	 * @param locator locator
	 * @return WebElement
	 */

	public static WebElement getElementByXpath(String locator) {
		WebElement element = null;
		try {
			element = driver.findElement(By.xpath(locator));
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}


	
	/**
	 * This function finds the element and return that element
	 * 
	 * @param locator locator
	 * @return WebElement
	 */

	public static WebElement getElement(By by) {
		WebElement element = null;
		try {
			element = driver.findElement(by);
		} catch (Exception e) {
			e.getMessage();
		}
		return element;
	}

	
}
