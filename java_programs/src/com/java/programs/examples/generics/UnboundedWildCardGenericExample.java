/**
 * 
 */
package com.java.programs.examples.generics;

import java.util.Arrays;
import java.util.List;

/**
 * @author Soundharya
 *
 */
public class UnboundedWildCardGenericExample {

	public static void printListObject(List<Object> list) {
		for (Object elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}

	// The goal of printListObject is to print a list of any type, but it fails
	// to
	// achieve that goal — it prints only a list of Object instances; it cannot
	// print List<Integer>, List<String>, List<Double>, and so on, because they
	// are not subtypes of List<Object>. To write a generic printList method,
	// use List<?>:
	public static void printListSubTypes(List<?> list) {
		for (Object elem : list)
			System.out.print(elem + " ");
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// It's important to note that List<Object> and List<?> are not the
		// same. You can insert an Object, or any subtype of Object, into a
		// List<Object>. But you can only insert null into a List<?>.
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String> ls = Arrays.asList("one", "two", "three");
		/*List<Integer> liObj = Arrays.asList(1, 2, 3);
		List<String> lsObj = Arrays.asList("one", "two", "three");
		System.out.println("It'll show compile time error");
		System.out.println("-------------------*****-----------------------");
		printListObject(liObj);
		printListObject(lsObj);*/
		System.out.println("Print list only prints List values below");
		System.out.println("-------------------*****-----------------------");
		printListSubTypes(li);
		printListSubTypes(ls);

	}

}
