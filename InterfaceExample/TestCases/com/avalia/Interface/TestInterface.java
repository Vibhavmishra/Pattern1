package com.avalia.Interface;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestInterface {
	private Child case1;
	private Main case2;

	@Before
	public void setup() {
		case1 = new Child();
		case2=new Main();
	}

	@Test
	public void test() {
		assertEquals(case1.getName("vibhav"), "vibhav");
		assertEquals(case2.getName(), "vibhav");
		assertEquals(case2.getRollNo(), 123);
	}

}
