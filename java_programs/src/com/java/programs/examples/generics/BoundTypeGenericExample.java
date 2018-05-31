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
public class BoundTypeGenericExample {


	public static void main(String[] args) {

		// Although Integer is a subtype of Number, List<Integer> is not a
		// subtype of List<Number> and, in fact, these two types are not
		// related. The common parent of List<Number> and List<Integer> is
		// List<?>.
		
		//The below code will show comile error
		//List<Integer> intList = new ArrayList<>();
		//List<Number> numList = intList;
		
		
		List<? extends Integer> integerList = new ArrayList<>();
		List<? extends Number> numberList = integerList;
		

	}
}
