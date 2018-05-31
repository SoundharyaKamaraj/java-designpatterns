/**
 * 
 */
package com.java.programs.examples.generics;

import java.util.Arrays;

/**
 * @author Soundharya
 *
 */
public class TypeErasure {

	private static <T> int count(T[] anArray, T elem) {
		int counter = 0;

		for (T elemList : anArray) {
			if (elemList.equals(elem))
				++counter;
		}

		// Java compiler erases T and replace it with object as its unbounded
		// int count(Object[] anArray, Object elem)
		//for(Object elemList:anArray)
		return counter;

	}
	
	
	private static <T extends Number> int countElement(T[] anArray , T elem){
		
		int counter = 0;

		for (T elemList : anArray) {
			if (elemList.equals(elem))
				++counter;
		}
		// Java compiler erases T and replace it with object as its unbounded
				// int count(Number[] anArray, Object elem)
				//for(Number elemList:anArray)
		return counter;
		
	}
	
	public static <T, E> void main(String[] args){
		
		Object[] arr = new Integer[1];
		arr[0] = 10;
		System.out.println("Element repeated times "+count(arr, 10));
		
	}
	
	
	
	
}
