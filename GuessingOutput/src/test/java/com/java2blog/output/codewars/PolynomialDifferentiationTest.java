package com.java2blog.output.codewars;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class PolynomialDifferentiationTest {
	@Test
	public void sampleTests() {
		assertEquals(new BigInteger("12"), PolynomialDifferentiation.differentiate("12x+2", 3));
		assertEquals(new BigInteger("5"), PolynomialDifferentiation.differentiate("x^2-x", 3));
		assertEquals(new BigInteger("-20"), PolynomialDifferentiation.differentiate("-5x^2+10x+4", 3));
	}
}
