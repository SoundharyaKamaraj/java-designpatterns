/**
 * 
 */
package com.learn.prgms.creational.factorypatterns;

/**
 * @author Soundharya
 *
 */
public class BookFactory {

	public static Books getBookCategories(String bookType) {

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
