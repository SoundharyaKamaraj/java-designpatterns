/**
 * 
 */
package com.learn.prgms.creational.abstractfactorypattern;

/**
 * @author Soundharya
 *
 */
public class NonTechBookFactory extends BookFactory {

	@Override
	public  Books getBookCategories(String bookType) {

		if (bookType == "FICTION") {
			return new FictionBooks();
		} 

		return null;
	}
}
