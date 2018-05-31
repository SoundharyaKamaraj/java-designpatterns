/**
 * 
 */
package com.java.programs.examples.generics;

/**
 * @author Soundharya
 *
 */
public class ExampleForStatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicycle one = new Bicycle(1, 2, 3);
		System.out.println(one.getID());
		System.out.println(one.getNumberOfBicycles());
		Bicycle two = new Bicycle(1, 2, 3);
		System.out.println(two.getID());
		Bicycle three = new Bicycle(1, 2, 3);
		System.out.println(three.getID());
		Bicycle four = new Bicycle(1, 2, 3);
		System.out.println(four.getID());
		System.out.println(four.getNumberOfBicycles());
		
		int noOfObjectsCreated = Bicycle.getNumberOfBicycles();
		System.out.println("Number of Objects created"+noOfObjectsCreated);
	}

}
