package com.java2blog.output.string;

public class InternTest {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = str1.intern();
		if(str1 == str2)
		System.out.println(str1 + " " + str2);
	}

}
