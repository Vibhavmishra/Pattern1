package com.avalia.LinkedListDemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculation {
private Calculation a;
	@Before
	public  void setup(){
		 a=new Calculation();
	}

	@Test
	public void test() {
		assertEquals(2, a.sum(1,1));
	}

}
