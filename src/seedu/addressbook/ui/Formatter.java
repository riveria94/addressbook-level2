package seedu.addressbook.ui;

public class Formatter {
    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    private static final String DIVIDER = "===================================================";
    
    public static String getLinePrefix() {
    	return LINE_PREFIX;
    }
    
    public static String getLineSeparator() {
    	return LS;
    }
    
    public static String getDivider() {
    	return DIVIDER;
    }
}
