package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author Swarnendu
 *
 */

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	/**
	 * This is a default constructor for TestBase
	 * @throws IOException 
	 */
	
	public TestBase() {
		try {
			prop = new Properties();
			File file = new File(System.getProperty("user.dir") + "/src/test/java/configuration/global.properties");
			FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
		} catch (IOException exp) {

			exp.getMessage();
		}

	}
	
	/**
	 * This function opens site in the desired browser in full screen mode
	 */
	
	public static void initialization() {

		if (prop.getProperty("browser").equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.silentOutput", "true");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}


}
