/**
 * 
 */
package com.java.programs.examples.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Soundharya
 *
 */
public class LowerBoundGenericExample {

	// Say you want to write a method that puts Integer objects into a list. To
	// maximize flexibility, you would like the method to work on List<Integer>,
	// List<Number>, and List<Object> — anything that can hold Integer values.

	// To write the method that works on lists of Integer and the supertypes of
	// Integer, such as Integer, Number, and Object, you would specify List<?
	// super Integer>. The term List<Integer> is more restrictive than List<?
	// super Integer> because the former matches a list of type Integer only,
	// whereas the latter matches a list of any type that is a supertype of
	// Integer.

	public static <T> void sumOfNumber(List<? super Integer> numberList) {
		for (int i = 0; i <= 10; i++) {
			numberList.add(i);
			System.out.println("i value is "+i);
		}
	}

	public static void main(String[] args) {
		System.out.println("******------List<Number> which is super for Integer--------******");
		sumOfNumber(new ArrayList<Number>());
		System.out.println("******------List<Object> which is super for Integer--------******");
		sumOfNumber(new ArrayList<Object>());
		String s = "abc";
		System.out.println(s instanceof String);
		List<String> list = new ArrayList<>();
		System.out.println(list instanceof StringList);
	}
	
	private static class StringList extends ArrayList<String> {
	}

}
