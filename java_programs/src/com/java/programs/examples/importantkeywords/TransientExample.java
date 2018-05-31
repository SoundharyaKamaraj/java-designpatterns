/**
 * 
 */
package com.java.programs.examples.importantkeywords;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Soundharya
 *
 */
public class TransientExample {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Student s1 =new Student(101,"soundharya",29);//creating object  
		Student s2 =new Student(102,"saravana",30);
		  //writing object into file  
		  FileOutputStream f=new FileOutputStream("f.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(f);  
		  out.writeObject(s1); 
		  out.writeObject(s2); 
		  out.flush();  
		  
		  out.close();  
		  f.close();  
		  System.out.println("success");  
		 }  

}
