/**
 * 
 */
package com.java.programs.examples.generics;

import java.util.Collections;
import java.util.List;

/**
 * @author Soundharya
 *
 */
public class TargetTypeExample {

	static void processStringList(List<String> stringList) {
		if (!stringList.isEmpty()) {
			for (String listObject : stringList) {
				System.out.println("String Value is" + listObject);
			}
		} else {
			System.out.println("List is empty");
		}
	}

	public static void main(String[] args) {

		// This statement is expecting an instance of List<String>; this data
		// type is the target type. Because the method emptyList returns a value
		// of type List<T>, the compiler infers that the type argument T must be
		// the value String. This works in both Java SE 7 and 8. Alternatively,
		// you could use a type witness and specify the value of T as follows:
		List<String> listOne = Collections.emptyList();

		List<String> listTwo = Collections.<String>emptyList();

		// The notion of what is a target type has been expanded to include
		// method arguments, such as the argument to the method
		// processStringList. In this case, processStringList requires an
		// argument of type List<String>. The method Collections.emptyList
		// returns a value of List<T>, so using the target type of List<String>,
		// the compiler infers that the type argument T has a value of String.
		// Thus, in Java SE 8, the following statement compiles:

		processStringList(listOne);

		// In java 7 we have to give as below,
		processStringList(listTwo);

	}

}
