package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street, some unit, some postal code";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses to be entered as block, street, unit, postal code";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";
    
    public static final int BLOCK_NUMBER_INDEX = 1;
    public static final int STREET_NAME_INDEX = 2;
    public static final int UNIT_NUMBER_INDEX = 3;
    public static final int POSTAL_CODE_INDEX = 4;
    
    public final String trimmedAddress;
    private boolean isPrivate;
    
    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        String[] separatedAddress = separateAddress();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        } else {
            Block blockNumber = new Block(separatedAddress[BLOCK_NUMBER_INDEX].trim());
            Street streetName = new Street(separatedAddress[STREET_NAME_INDEX].trim());
            Unit unitNumber = new Unit(separatedAddress[UNIT_NUMBER_INDEX].trim());
            PostalCode postalCodeNumber = new PostalCode(separatedAddress[POSTAL_CODE_INDEX].trim());
        }
        this.trimmedAddress = trimmedAddress;
    }
    
    private String[] separateAddress() {
        String[] addressArray = trimmedAddress.split(",");
        return addressArray;
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
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
