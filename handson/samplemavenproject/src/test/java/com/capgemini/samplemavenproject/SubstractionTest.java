package com.capgemini.samplemavenproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubstractionTest {
	Substraction sb=new Substraction();
	@Test
	public void subTest() {
		assertEquals(5,sb.sub(15, 10));
	}

}
