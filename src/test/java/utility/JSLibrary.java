package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author Swarnendu
 *
 */
public class JSLibrary {

	/**
	 * This function scrolls the screen and brings the WebElement into view
	 * @param driver driver reference
	 * @param element WebElement
	 */
	public static void scroll_Into_View(WebDriver driver, WebElement element) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

}
