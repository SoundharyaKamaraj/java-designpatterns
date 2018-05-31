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
public class UpperBoundGenericExample {
	
	//z
	
	public static <T>  double sumOfNumber(List<? extends Number> numberList){
		double s= 0.0;
		for(Number n : numberList){
			  s += n.doubleValue();	
		}
		return s;
	}
	
	public static void main(String[] args) {
		// The following code, using a list of Integer objects, prints sum =
		// 6.0:

		List<Integer> li = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfNumber(li));
		// A list of Double values can use the same sumOfList method. The
		// following code prints sum = 7.0:

		List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("sum = " + sumOfNumber(ld));
	}
	

}
