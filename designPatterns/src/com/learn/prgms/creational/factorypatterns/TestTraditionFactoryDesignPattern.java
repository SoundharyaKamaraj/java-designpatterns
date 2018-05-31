/**
 * 
 */
package com.learn.prgms.creational.factorypatterns;

/**
 * @author Soundharya
 *
 */
public class TestTraditionFactoryDesignPattern {

	/**
	 * @param args
	 */
	public static void getTraditionalFactoryPatternOutput(String bookType) {
		long startTime= System.nanoTime();
		String nameOfTheBook= BookFactory.getBookCategories(bookType).getBookCategory();
		System.err.println("getTraditionalFactoryPatternOutput nameOfTheBook is "+nameOfTheBook);
		long endTime = System.nanoTime();
		System.out.println("\n getTraditionalFactoryPatternOutput Time difference ::: "+(endTime-startTime)+" nano seconds");

	}

}
