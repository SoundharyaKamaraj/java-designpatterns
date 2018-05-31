package com.java.programs.examples.generics;

import java.util.ArrayList;
import java.util.List;

public class UtilConsumer {
	
	public static void main(String[] args) {
		String str = Util.concatenateMe(null,null);
		Integer integer = Util.concatenate(null, null);
		
		List<String> list = new ArrayList<>();
		String str1 = list.get(0);
	}

}
