package seedu.addressbook.data.person;

public class Block {
	
	/**
	 * Represents a Person's block in the address
	 */
	
	private String blockNumber;
	
	public Block(String block) {
		this.blockNumber = block;
	}
	
	public String getBlockNumber() {
		return blockNumber;
	}
	
}
