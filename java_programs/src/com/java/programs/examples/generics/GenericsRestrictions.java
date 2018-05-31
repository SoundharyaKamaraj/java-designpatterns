/**
 * 
 */
package com.java.programs.examples.generics;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Soundharya
 *
 */
public class GenericsRestrictions {
	
	
	//Cannot Instantiate Generic Types with Primitive Types
	private void primitveGenericRest(){
		//Pair<int, char> p = new Pair<>(8, 'a');  // compile-time error
		PairClass<Integer, Character> p = new PairClass<>(8, 'a');
		
		Collection<?> c = new ArrayList<String>();
		//c.add("efef");
		c.add(null);
	}
	public static <E> void append(List<E> list) {
	    //E elem = new E();  // compile-time error
	   // list.add(elem);
	    
	    
	}
	
	//Cannot Create Instances of Type Parameters
	public static <E> void appendlist(List<E> list, Class<E> cls) throws InstantiationException, IllegalAccessException{
		   E elem = cls.newInstance();   // OK
	    list.add(elem);
	    
	}
	
	
	//Cannot Declare Static Fields Whose Types are Type Parameters
	public class MobileDevice<T> {
	    //private static T os;

	    // ...
	}
	
	//Cannot Overload a Method Where the Formal Parameter Types of Each Overload Erase to the Same Raw Type
	public class Example {
	   // public void print(Set<String> strSet) { }
	    //public void print(Set<Integer> intSet) { }
	}
	
	
	//Cannot Use Casts or instanceof with Parameterized Types
	public static <E> void rtti(List<?> list) {
	   /* if (list instanceof ArrayList<Integer>) {  // compile-time error
	        // ...
	    }*/
	    
	    if (list instanceof ArrayList<?>) {  // OK; instanceof requires a reifiable type
	        // ...
	    }
	}
	
	//Cannot Create Arrays of Parameterized Types
	private void arrayREstrictions(){
		//List<Integer>[] arrayOfLists = new List<Integer>[2];  // compile-time error
		/*Object[] stringLists = new List<String>[];  // compiler error, but pretend it's allowed
		stringLists[0] = new ArrayList<String>();   // OK
		stringLists[1] = new ArrayList<Integer>();*/
	}
	
	//Cannot Create, Catch, or Throw Objects of Parameterized Types
	class Parser<T extends Exception> {
	    public void parse(File file) throws T {     // OK
	        // ...
	    }
	}
	

}
