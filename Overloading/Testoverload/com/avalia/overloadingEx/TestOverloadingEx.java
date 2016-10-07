package com.avalia.overloadingEx;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.avalia.overoadingEx.Overloading1;

public class TestOverloadingEx {
	private Overloading1 case1;
@Before
public void setup(){
	case1=new Overloading1();
}
	@Test
	public void test() {
		assertEquals(case1.add(1, 4),5);
		assertEquals(case1.add(5),10);
	}

}
