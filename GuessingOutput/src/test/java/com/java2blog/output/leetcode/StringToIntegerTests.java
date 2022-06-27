package com.java2blog.output.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringToIntegerTests {
	private StringToInteger sti = new StringToInteger();

	@Test
	public void myAtoiTest() {
		assertEquals(0, sti.myAtoi("00000-42a1234"));
		assertEquals(1, sti.myAtoi("+1"));
		assertEquals(0, sti.myAtoi("+"));
		assertEquals(2, sti.myAtoi("2"));
		assertEquals(0, sti.myAtoi("+-12"));
		assertEquals(-2147483648, sti.myAtoi("-91283472332"));
//		assertEquals(-42, sti.myAtoi("   -42"));
//		assertEquals(0, sti.myAtoi("words and 987"));
//		assertEquals(42, sti.myAtoi("42"));
//		assertEquals(-42, sti.myAtoi("-42"));
//		assertEquals(4193, sti.myAtoi("4193 with words"));
//		assertEquals(-3, sti.myAtoi("-43+40 this value should."));
//		assertEquals(299, sti.myAtoi("354-64+9s"));
//		assertEquals(-409, sti.myAtoi("-354-64+9s"));
	}
}
