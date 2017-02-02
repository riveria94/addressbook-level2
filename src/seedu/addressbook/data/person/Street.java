package seedu.addressbook.data.person;

public class Street {

	/**
	 * Represents a Person's street in address
	 */
	
	public static final String STREET_VALIDATION_REGEX ="\\w+";
	private String streetName;
	
	public Street(String street) {
		this.streetName = street;
	}
	
	public String getStreetName() {
		return streetName;
	}
	public boolean isValidStreet(Street test) {
		return test.getStreetName().matches(STREET_VALIDATION_REGEX);
	}
}
