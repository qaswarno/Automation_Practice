package utility;


/**
 * 
 * @author Swarnendu
 *
 */

public class JavaUtility {

	/**
	 *  This function accepts a String and removes the - from the String
	 * @param text input String
	 * @return output String
	 */
	
	public static String remove_dash_from_text(String text) {

		String modified_text = text.replace("-", "").toLowerCase();
		return modified_text;
	}
	
	/**
	 * This function accepts a String and replaces the - from the String with blank space
	  * @param text input String
	 * @return output String
	 */
	
	public static String replace_dash_with_space(String text) {

		String modified_text = text.replace("-", " ");
		return modified_text;
	}

}
