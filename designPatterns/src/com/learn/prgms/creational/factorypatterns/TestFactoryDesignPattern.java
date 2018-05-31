/**
 * 
 */
package com.learn.prgms.creational.factorypatterns;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Soundharya
 *
 */
public class TestFactoryDesignPattern {

	static Map<String, BookType> typeMap = new HashMap<String, BookType>();

	static {
		typeMap.put("JAVA", BookType.JAVA);
		typeMap.put("HTML", BookType.HTML);
		typeMap.put("OTHERS", BookType.OTHERS);
	}

	/**
	 * @param args
	 */
	public static void getFactoryDesignPatternOutput(String bookType) {
		// TODO Auto-generated method stub

		long startTime = System.nanoTime();
		String nameOfTheBook = typeMap.get(bookType).getBookCategories().getBookCategory();
		System.err.println("getFactoryDesignPatternOutput nameOfTheBook is" + nameOfTheBook);
		long endTime = System.nanoTime();
		System.out.println("getFactoryDesignPatternOutput Time difference ::: " + (endTime - startTime) + " nano seconds");

	}

	/*
	 * There is no direct way to do this - Java has no Map literals (yet - I
	 * think they were proposed for Java 8).
	 * 
	 * Some people like this:
	 * 
	 * Map<String,String> test = new HashMap<String, String>(){{
	 * put("test","test"); put("test","test");}}; This creates an anonymous
	 * subclass of HashMap, whose instance initializer puts these values. (By
	 * the way, a map can't contain twice the same value, your second put will
	 * overwrite the first one. I'll use different values for the next
	 * examples.)
	 * 
	 * The normal way would be this (for a local variable):
	 * 
	 * Map<String,String> test = new HashMap<String, String>();
	 * test.put("test","test"); test.put("test1","test2"); If your test map is
	 * an instance variable, put the initialization in a constructor or instance
	 * initializer:
	 * 
	 * Map<String,String> test = new HashMap<String, String>(); {
	 * test.put("test","test"); test.put("test1","test2"); } If your test map is
	 * a class variable, put the initialization in a static initializer:
	 * 
	 * static Map<String,String> test = new HashMap<String, String>(); static {
	 * test.put("test","test"); test.put("test1","test2"); } If you want your
	 * map to never change, you should after the initialization wrap your map by
	 * Collections.unmodifiableMap(...). You can do this in a static initializer
	 * too:
	 * 
	 * static Map<String,String> test; { Map<String,String> temp = new
	 * HashMap<String, String>(); temp.put("test","test");
	 * temp.put("test1","test2"); test = Collections.unmodifiableMap(temp); }
	 */
}
