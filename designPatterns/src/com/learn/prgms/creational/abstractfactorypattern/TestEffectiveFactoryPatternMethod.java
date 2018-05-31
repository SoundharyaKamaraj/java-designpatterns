/**
 * 
 */
package com.learn.prgms.creational.abstractfactorypattern;

/**
 * @author Soundharya
 *
 */
public class TestEffectiveFactoryPatternMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String bookType = "JAVA";
		String bookCategory = "TECHNICAL";
		TestTraditionFactoryDesignPattern.getTraditionalFactoryPatternOutput(bookType, bookCategory);
		TestFactoryDesignPattern.getFactoryDesignPatternOutput(bookType, bookCategory);
	}

}
