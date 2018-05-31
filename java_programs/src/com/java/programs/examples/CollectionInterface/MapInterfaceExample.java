/**
 * 
 */
package com.java.programs.examples.CollectionInterface;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Soundharya
 *
 */
public class MapInterfaceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] myString={"if","it","is", "to", "be" ,"it", "is", "up", "to","me","to","delegate"};
		Map<String, Integer> m = new HashMap<String, Integer>();

        // Initialize frequency table from command line
        for (String a : myString) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);

	}

}
