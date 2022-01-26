package com.java2blog.output.codewars;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {
	public static String[] wave(String str) {
		List<String> result = new ArrayList<>(str.length());
		char array[] = str.toCharArray();
		StringBuilder sb = new StringBuilder(str);
		for(int i=0; i< array.length; i++) {
			if(array[i] != ' ') {
				sb.setCharAt(i, (char)(array[i]-32));
				result.add(sb.toString());
				sb.delete(0, str.length());
				sb.append(str);
			}
			
		}
		return result.toArray(String[]::new);
	}

}
