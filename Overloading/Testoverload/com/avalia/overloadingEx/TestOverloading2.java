package com.avalia.overloadingEx;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.avalia.overoadingEx.Overloading2;


public class TestOverloading2 {

	private Overloading2 case2;
	@Before
	public void setup(){
		case2=new Overloading2();
	}
		@Test
		public void test() {
			assertEquals(case2.add(1, 4f),5.0);
			assertEquals(case2.add(5f,6),11.00);
		}

}
