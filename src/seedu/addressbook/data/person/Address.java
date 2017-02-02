package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street, some unit, some postal code";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses to be entered as 123, Pasir Ris Drive 4, #12-12, 123123";
    
    public static final int BLOCK_NUMBER_INDEX = 0;
    public static final int STREET_NAME_INDEX = 1;
    public static final int UNIT_NUMBER_INDEX = 2;
    public static final int POSTAL_CODE_INDEX = 3;
    
    public final String value;
    private boolean isPrivate;
    
    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
    	String trimmedAddress = address.trim();
        String[] separatedAddress = separateAddress(address);
        Block blockNumber = new Block(separatedAddress[BLOCK_NUMBER_INDEX]);
        Street streetName = new Street(separatedAddress[STREET_NAME_INDEX]);
        Unit unitNumber = new Unit(separatedAddress[UNIT_NUMBER_INDEX]);
        PostalCode postalCodeNumber = new PostalCode(separatedAddress[POSTAL_CODE_INDEX]);
        this.isPrivate = isPrivate;
        if (!isValidAddress(blockNumber, streetName, unitNumber, postalCodeNumber)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        } 
        this.value = trimmedAddress;
    }
    
    private String[] separateAddress(String address) {
        String[] addressArray = address.split(",");
        for (int i=0; i<4; i++) {
        	addressArray[i].trim();
        }
        return addressArray;
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(Block blockTest, Street streetTest, Unit unitTest, PostalCode postalCodeTest) {
        boolean isValidAddress = false;
        if (blockTest.isValidBlock(blockTest) && streetTest.isValidStreet(streetTest)
        		&& unitTest.isValidUnit(unitTest) && postalCodeTest.isValidPostalCode(postalCodeTest)) {
        	return true;
        }
        return isValidAddress;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instance of handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
    
}
