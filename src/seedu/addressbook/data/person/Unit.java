package seedu.addressbook.data.person;

public class Unit {

	/**
	 * Represents a Person's unit in address
	 */
	
	public static final String UNIT_VALIDATION_REGEX = "[#\\d{2}-?\\d+]";
	private String unitNumber;
	
	public Unit(String unit) {
		this.unitNumber = unit;
	}
	
	public String getUnitNumber() {
		return unitNumber;
	}
	public boolean isValidUnit(String test) {
		return test.matches(UNIT_VALIDATION_REGEX);
	}
}
