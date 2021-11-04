package utility;

/**
 * 
 * @author Swarnendu
 *
 */

public class ConfigFileReader {
	
	/**
	 * This function returns the extent config file path
	 * @return
	 */

	public String getReportConfigPath(){
		
		String reportConfigPath=System.getProperty("user.dir")+"/config/extent-config.xml";
		return reportConfigPath;		 
		}

}
