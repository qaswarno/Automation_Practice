package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Swarnendu
 *
 */

public class ExplicitWait {

	public static WebDriverWait wait;

	/**
	 * This function wait for an element to be present in the dom for a given period of time
	 * @param time maximum wait time
	 * @param by locator value
	 * @param driver reference of driver
	 */
	public static void wait_for_element_present(long time, By by, WebDriver driver) {

		wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	/**
	 * This function wait for an element to be clickable for a given period of time
	 * @param time maximum wait time
	 * @param by locator value
	 * @param driver reference of driver
	 */

	public static void wait_for_element_clickable(long time, By by, WebDriver driver) {

		wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	/**
	 * This function wait for an element to be clickable for a given period of time
	 * @param time maximum wait time
	 * @param ele WebElement 
	 * @param driver reference of driver
	 */

	public static void wait_for_element_clickable(long time, WebElement ele, WebDriver driver) {

		wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));

	}

}
