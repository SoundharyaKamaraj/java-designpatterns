/**
 * 
 */
package com.learn.prgms.creational.abstractfactorypattern;

import java.util.Optional;

/**
 * @author Soundharya
 *
 */
public class TestTraditionFactoryDesignPattern {

	/**
	 * @param args
	 */
	public static void getTraditionalFactoryPatternOutput(String bookType, String bookCategory) {
		long startTime = System.nanoTime();

		// JAva 8 feature OPTIONAL
		Optional<BookFactory> bookCategories = Optional.ofNullable(BookFactoryProducer.getBookCategories(bookCategory));
		if (bookCategories.isPresent()) {
			Optional<Books> bookType1 = Optional.ofNullable(bookCategories.get().getBookCategories(bookType));
			if (bookType1.isPresent()) {
				Optional<String> nameOfTheBook = Optional.ofNullable(bookType1.get().getBookType());
				// String nameOfTheBook = BookFactory.
				System.err.println("TraditionalApproach NameOfTheBook is " + nameOfTheBook.get().toUpperCase()
						+ "from category:" + bookCategory.toUpperCase());
				long endTime = System.nanoTime();
				System.out.println(
						"\nTraditionalApproach Time difference ::: " + (endTime - startTime) + " nano seconds");
			}
			else {
				System.err.println("TraditionalApproach:No book with name: " + bookType.toUpperCase() + " is available under category:"
						+ bookCategory);
			}
		}
		else {
			System.err.println("TraditionalApproach:No such category Exists");
		}
	}

}
