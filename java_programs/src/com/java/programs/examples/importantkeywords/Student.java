/**
 * 
 */
package com.java.programs.examples.importantkeywords;

/**
 * @author Soundharya
 *
 */
import java.io.Serializable;  
public class Student implements Serializable{  
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient int id;  
 transient final String name;  
 transient int age;//Now it will not be serialized  
 public Student(int id, final String name,int age) {  
  this.id = id;  
  this.name = name;  
  this.age=age;  
 }  
} 
