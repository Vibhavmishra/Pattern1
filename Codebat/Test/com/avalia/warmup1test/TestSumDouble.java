package com.avalia.warmup1test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.avalia.warmup1.sumDouble;

public class TestSumDouble {
private sumDouble obj1;
@Before
public  void setup(){
	 obj1=new sumDouble();
}
	@Test
	public void test() {
		assertEquals(48,obj1.sumDouble(12, 12));
		assertEquals(13,obj1.sumDouble(7, 6));
		assertEquals(24,obj1.sumDouble(6, 6));
		assertEquals(7,obj1.sumDouble(4, 3));
	}

}
