package com.avalia.warmup1test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.avalia.warmup1.diff21;

public class TestDiff21 {
private diff21 obj;
@Before
public void setup(){
	obj=new diff21();
}
	@Test
	public void test() {
		assertEquals(9,obj.diff21(12));
		assertEquals(14,obj.diff21(7));
		assertEquals(4,obj.diff21(23));
		assertEquals(17,obj.diff21(4));
	}
	

}
