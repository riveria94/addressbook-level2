package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

/**
 * @author user
 * This class represent each tagging relation for every person and his tags.
 */
public class Tagging {
	
	private Person person;
	private Tag tag;
	private boolean isAdd; 
	
	/**
	 * Construct a Tagging class when adding a tag to a person
	 */
	public Tagging(Person person, Tag tag, boolean isAdd){
		this.person = person;
		this.tag = tag;
		this.isAdd = isAdd;
	}
	
	/**
	 * Deletes the tag of a person
	 */
	public void deleteTag(){
		this.isAdd = false;
	}
	
	/* 
	 * format the tagging relation
	 */
	@Override 
	public String toString(){
		String returnStr="";
		returnStr += isAdd ? "+" : "-";
		returnStr += " [" + person.getName() + "]" + tag.tagName;
		return returnStr;
	}
}