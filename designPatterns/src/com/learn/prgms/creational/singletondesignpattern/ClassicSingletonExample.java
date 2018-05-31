/**
 * 
 */
package com.learn.prgms.creational.singletondesignpattern;

/**
 * @author Soundharya
 *
 */
public class ClassicSingletonExample {
	
	private static ClassicSingletonExample instance = null;
	
	 // Exists only to defeat instantiation.
	//If the constructor is protected,constructors can be called by subclasses 
	//and by other classes in the same package.so carete singleton in a different package or make it private
	private ClassicSingletonExample(){
		
	}
	

	public static ClassicSingletonExample getInstance() {
		
		if(instance==null){
			instance = new ClassicSingletonExample();
		}
		return instance;
	} 

}
