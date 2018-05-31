package com.java.programs.examples.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardCapture {

	// When this type of error occurs it typically means that the compiler
	// believes that you are assigning the wrong type to a variable. Generics
	// were added to the Java language for this reason — to enforce type safety
	// at compile time.
	/*
	 * void foo(List<?> i) { i.set(0, i.get(0)); }
	 */

	// THE ABOVE METHOD SHOULD BE REPLACED AS FOLLOW to avoid WILDCARD ERROR

	void foo(List<?> i) {
		fooHelper(i);
	}
	

	private static <T> void fooHelper(List<T> i) {
		// TODO Auto-generated method stub
		i.set(0, i.get(0));
	}

	static void swapFirst(List<? extends Number> l1, List<? extends Number> l2) {
		/*
		 * While List<Integer> and List<Double> both fulfill the criteria of
		 * List<? extends Number>, it is clearly incorrect to take an item from
		 * a list of Integer values and attempt to place it into a list of
		 * Double values.
		 * 
		 * Number temp = l1.get(0); l1.set(0, l1.get(0)); // expected a CAP#1
		 * extends Number, // got a CAP#2 extends Number; // same bound, but
		 * different types
		 * 
		 * l2.set(0, temp); // expected a CAP#1 extends Number, // got a Number
		 * There is NO HELPER METHOD as code is fundamentally wrong
		 *
		 */
	}

	class NaturalNumber {

		private int i;

		public NaturalNumber(int i) {
			this.i = i;
		}
		// ...
	}

	class EvenNumber extends NaturalNumber {

		public EvenNumber(int i) {
			super(i);
		}
		// ...
	}

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<Double> ld = Arrays.asList(10.10, 20.20, 30.30);
		swapFirst(li, ld);
		List<EvenNumber> le = new ArrayList<>();
		List<? extends NaturalNumber> ln = le;
		// Because List<EvenNumber> is a subtype of List<? extends
		// NaturalNumber>, you can assign le to ln. But you cannot use ln to add
		// a natural number to a list of even numbers.
		//ln.add(new NaturalNumber(35)); // compile time error
		ln.add(null);
		ln.clear();
		fooHelper(ln);
		
	}

}
