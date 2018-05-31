/**
 * 
 */
package com.java.programs.examples.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Soundharya
 *
 */
public class HeapPollution {

	@SafeVarargs
	public static <T> void addToList(List<T> listArg, T... elements) {
		for (T x : elements) {
			listArg.add(x);
		}
	}

	@SafeVarargs
	public static void faultyMethod(List<String>... l) {
		
		// This statement can potentially introduce heap pollution. A value that
		// does match the parameterized type of the varargs formal parameter l
		// can be assigned to the variable objectArray, and thus can be assigned
		// to l. However, the compiler does not generate an unchecked warning at
		// this statement. The compiler has already generated a warning when it
		// translated the varargs formal parameter List<String>... l to the
		// formal parameter List[] l. This statement is valid; the variable l
		// has the type List[], which is a subtype of Object[].
		Object[] objectArray = l; // Valid
		System.out.println(objectArray[0]);
		System.out.println(objectArray[1]);
		objectArray[0] = Arrays.asList(42);
		// System.out.println(l[0].get(0));
		// String s = l[0].get(0); // ClassCastException thrown here
	}

	public static void main(String[] args) {

		List<String> stringListA = new ArrayList<String>();
		List<String> stringListB = new ArrayList<String>();

		addToList(stringListA, "Seven", "Eight", "Nine");
		addToList(stringListB, "Ten", "Eleven", "Twelve");
		List<List<String>> listOfStringLists = new ArrayList<List<String>>();
		addToList(listOfStringLists, stringListA, stringListB);
		for (List<String> listObj : listOfStringLists) {
			for (String stringObj : listObj) {
				System.out.println(stringObj);
			}

		}
		HeapPollution.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));
	}

}
