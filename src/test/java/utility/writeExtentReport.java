package utility;

import org.junit.AfterClass;
import java.io.File;


import com.cucumber.listener.Reporter;

/**
 * 
 * @author Swarnendu
 *
 */
public class writeExtentReport {

	/**
	 * This function writes the details into the Extent Report
	 */
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    Reporter.setSystemInfo("Machine", System.getProperty("os.name"));
	    Reporter.setSystemInfo("Selenium", "3.141.59");
	    Reporter.setSystemInfo("Maven", "3.5.2");
	    Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}
	
	
	
	
}
