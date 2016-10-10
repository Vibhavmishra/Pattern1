package com.avalia.polymorphism;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPolymorphism {
	private child obj;
	private Child2 obj1;

	@Before
	public void setup() {
		obj = new child();
		obj1 = new Child2();
	}

	@Test
	public void test() {
		assertEquals(obj.add(), "xyz");
		assertEquals(obj1.add(), "String");
	}

}
