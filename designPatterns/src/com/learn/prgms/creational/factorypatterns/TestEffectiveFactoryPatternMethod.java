/**
 * 
 */
package com.learn.prgms.creational.factorypatterns;

/**
 * @author Soundharya
 *
 */
public class TestEffectiveFactoryPatternMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 String bookType="OTHERS";
		 TestFactoryDesignPattern.getFactoryDesignPatternOutput(bookType);
		 TestTraditionFactoryDesignPattern.getTraditionalFactoryPatternOutput(bookType);
	
		 
	}

}
