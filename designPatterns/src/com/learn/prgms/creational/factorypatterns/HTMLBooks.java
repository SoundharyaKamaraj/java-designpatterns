/**
 * 
 */
package com.learn.prgms.creational.factorypatterns;

/**
 * @author Soundharya
 *
 */
public class HTMLBooks implements Books {

	/* (non-Javadoc)
	 * @see com.learn.prgms.factorypatterns.Books#getBookCategory()
	 */
	@Override
	public String getBookCategory() {
		return "HMTL book is returned";
	}

}
