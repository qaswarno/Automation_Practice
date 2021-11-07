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

public class JavaUtility {

	
	
	public static WebDriverWait wait;

	/**
	 * This function wait for an element to be present in the dom for a given period of time
	 * @param time maximum wait time
	 * @param by locator value
	 * @param driver reference of driver
	 */
	public static void wait_For_Element_Present(long time, By by, WebDriver driver) {

		wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	/**
	 * This function wait for an element to be clickable for a given period of time
	 * @param time maximum wait time
	 * @param by locator value
	 * @param driver reference of driver
	 */

	public static void wait_For_Element_Clickable(long time, By by, WebDriver driver) {

		wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	/**
	 * This function wait for an element to be clickable for a given period of time
	 * @param time maximum wait time
	 * @param ele WebElement 
	 * @param driver reference of driver
	 */

	public static void wait_For_Element_Clickable(long time, WebElement ele, WebDriver driver) {

		wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));

	}
	
	
	
	/**
	 *  This function accepts a String and removes the - from the String
	 * @param text input String
	 * @return output String
	 */
	
	public static String remove_Dash_From_Text(String text) {

		String modified_text = text.replace("-", "").toLowerCase();
		return modified_text;
	}
	
	/**
	 * This function accepts a String and replaces the - from the String with blank space
	  * @param text input String
	 * @return output String
	 */
	
	public static String replace_Dash_With_Space(String text) {

		String modified_text = text.replace("-", " ");
		return modified_text;
	}

}
