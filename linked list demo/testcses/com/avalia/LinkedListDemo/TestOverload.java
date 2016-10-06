package com.avalia.LinkedListDemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestOverload {
protected Overload obj;
	@Before
	public void setup(){
		 obj=new Overload();
	}

	@Test
	public void test() {
		assertEquals(12, obj.demo(12));
	}

}
