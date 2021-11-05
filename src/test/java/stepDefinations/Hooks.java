package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.cucumber.listener.Reporter;

import base.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase {

	static int execution = 0;

	/**
	 * This function deletes the previous execution screenshots
	 * @throws Exception
	 */
	@Before(order = 1)
	public void beforeScenarioStart() throws Exception {

		TestBase.initialization();
		if (Hooks.execution == 0) {
			FileUtils
					.cleanDirectory(new File(System.getProperty("user.dir") + prop.getProperty("ScreenshotDirectory")));
		}
		Hooks.execution++;

	}

	/**
	 * This function take the screenshot of the screen on failure
	 * @param scenario this the scenario name
	 * @throws Exception
	 */
	
	@After(order = 1)
	public void take_Screenshot_AfterScenarioFinish(Scenario scenario) throws Exception {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				// This takes a screenshot from the driver at save it to the specified location
				final byte[] sourcePathbyte = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

				// Building up the destination path for the screenshot to save
				// Also make sure to create a folder 'screenshots' with in the cucumber-report
				// folder
				File destinationPath = new File(System.getProperty("user.dir") + prop.getProperty("ScreenshotDirectory")
						+ "/" + screenshotName + ".png");

				// Copy taken screenshot from source location to destination location
				FileUtils.copyFile(sourcePath, destinationPath);

				// This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
				scenario.embed(sourcePathbyte, "image/png");

			} catch (IOException e) {
			}
		}
	}

	/**
	 * This function closes the browser sessions
	 * @throws Exception
	 */
	@After(order = 0)
	public void afterScenarioFinish() throws Exception {
		driver.close();
		Thread.sleep(5000);
		driver.quit();
	}
}
