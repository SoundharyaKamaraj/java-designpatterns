/**
 * 
 */
package com.learn.prgms.creational.abstractfactorypattern;

/**
 * @author Soundharya
 *
 */
public class HTMLBooks implements Books {

	/* (non-Javadoc)
	 * @see com.learn.prgms.factorypatterns.Books#getBookCategory()
	 */
	@Override
	public String getBookType() {
		return "HMTL book is returned";
	}

}
