package seedu.addressbook.data.person;

public class PostalCode {

	/** 
	 * Represents a Person's postal code in address
	 */
	
	private String postalCodeNumber;
	
	public PostalCode(String postalCode) {
		this.postalCodeNumber = postalCode;
	}
	
	public String getPostalCodeNumber() {
		return postalCodeNumber;
	}
}
