package seedu.addressbook.data.person;

public class Block {
	
	/**
	 * Represents a Person's block in the address
	 */
	
	public static final String BLOCK_VALIDATION_REGEX = "\\d+";
	private String blockNumber;
	
	public Block(String block) {
		this.blockNumber = block;
	}
	
	public String getBlockNumber() {
		return blockNumber;
	}
	
	public boolean isValidBlock(String test) {
		return test.matches(BLOCK_VALIDATION_REGEX);
	}
	
}
