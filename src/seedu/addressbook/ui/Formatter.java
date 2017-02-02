package seedu.addressbook.ui;

public class Formatter {
    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    private static final String DIVIDER = "===================================================";
    
    public String getLinePrefix() {
    	return LINE_PREFIX;
    }
    
    public String getLineSeparator() {
    	return LS;
    }
    
    public String getDivider() {
    	return DIVIDER;
    }
}
