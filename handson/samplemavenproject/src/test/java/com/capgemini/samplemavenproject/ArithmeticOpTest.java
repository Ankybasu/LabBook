package com.capgemini.samplemavenproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArithmeticOpTest {
	ArithmeticOp ob=new ArithmeticOp();
	@Test
	public void multTest() {
		assertEquals(12,ob.mult(3, 4));
	}
	@Test
	public void divTest() {
		assertEquals(6,ob.div(12, 2));
	}
	@Test
	public void addTest() {
		assertEquals(7,ob.add(3, 4));
	}
	@Test
	public void subTest() {
		assertEquals(4,ob.sub(8, 4));
	}
}
