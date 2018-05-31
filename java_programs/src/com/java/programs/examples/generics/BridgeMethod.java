/**
 * 
 */
package com.java.programs.examples.generics;

/**
 * @author Soundharya
 *
 */
public class BridgeMethod {

public static void main(String[] args){
	
	MyNode mn = new MyNode(10);
	Node n = mn;            // A raw type - compiler throws an unchecked warning
	n.setData("Hello");     
	Integer x = mn.data; 
	
	//After type erasure, this code becomes:
/*	MyNode mn = new MyNode(5);
   Node n = (MyNode)mn;         // A raw type - compiler throws an unchecked warning
	n.setData("Hello");
	Integer x = (String)mn.data; // Causes a ClassCastException to be thrown.
	Here is what happens as the code is executed:*/
}
}
