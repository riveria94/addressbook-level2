package seedu.addressbook.data.person;

public class PostalCode {

	/** 
	 * Represents a Person's postal code in address
	 */
	
	public static final String POSTALCODE_VALIDATION_REGEX = "\\d+";
	private String postalCodeNumber;
	
	public PostalCode(String postalCode) {
		this.postalCodeNumber = postalCode;
	}
	
	public String getPostalCodeNumber() {
		return postalCodeNumber;
	}
	public boolean isValidPostalCode(String test) {
		return test.matches(POSTALCODE_VALIDATION_REGEX);
	}
}
