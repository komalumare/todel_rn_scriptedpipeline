package com.komal.calci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void additionDone() {
		Calculator mycalc = new Calculator();
		assertEquals(100, mycalc.addtion(50, 50));
	}

}
