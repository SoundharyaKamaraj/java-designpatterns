/**
 * 
 */
package com.learn.prgms.creational.abstractfactorypattern;

/**
 * @author Soundharya
 *
 */
public class TechnicalBookFactory extends BookFactory {
	
	@Override
	public  Books getBookCategories(String bookType) {

		if (bookType == "JAVA") {
			return new JAVABooks();
		} 
		else if (bookType.trim().equals("HTML")) {
			return new HTMLBooks();
		} 
		else if (bookType.trim().equals("OTHERS")) {
			return new OtherBooks();
		}

		return null;
	}

}
