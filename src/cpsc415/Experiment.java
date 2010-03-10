package cpsc415;

public class Experiment {	
	public static String EXP_BASE = "/cpsc415";	
	public static String EXP_HOME = EXP_BASE + "/index.html";

	/**
	 * Returns a String representing an HTML link for ths home
	 * page for this web application.
	 * @param linkName the text name of the link
	 * @return the HTML link as a string
	 */
	public static String linkToHome(String linkName) {
		return "<a href=\"" + EXP_HOME + "\">" + linkName +"</a>";
	}
}
